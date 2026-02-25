/*****************************************************************************
 * Copyright (c) 2019 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Ansgar Radermacher, CEA LIST - Initial API and implementation
 *
 *****************************************************************************/

package fr.cea.nacre.ui.plus.wizards;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.papyrus.infra.architecture.ArchitectureDomainManager;
import org.eclipse.papyrus.infra.core.architecture.merged.MergedArchitectureContext;
import org.eclipse.papyrus.infra.core.architecture.merged.MergedArchitectureViewpoint;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Layout;

/**
 * Select a viewpoint, taking into account that some viewpoints are rather mutual exclusive, while others
 * are optional (specific for robotics)
 */
public class SelectViewPointPage extends WizardPage {

	// disable safety button, as it might confuse users
	// keep code for the moment, until this is finally decided.
	public static final boolean ENABLE_SAFETY = false;

	/** The Constant PAGE_ID. */
	public static final String PAGE_ID = "SelectViewPointPage"; //$NON-NLS-1$
    // Initialize the  selectedId to connect the model to the AAS viewpoint by default
	protected String selectedId="fr.cea.nacre.viewpoint" ;

	protected Button safetyButton;

	protected Composite comp;

	public SelectViewPointPage() {
		super("Select NACRE model kind"); //$NON-NLS-1$
		setDescription("Select the NACRE model that you want to create"); //$NON-NLS-1$
	}

	/**
	 * Return the viewpoint ID of the main objective of the associated model
	 */
	public String getSelectedID() {
		return selectedId;
	}

	/**
	 * Set the selected viewpoint from the outside (used by dashboard)
	 */
	public void setSelectedID(String selectedId) {
		for (Control unC : comp.getChildren()) {
			if (unC instanceof Button) {
				Button unB = (Button) unC;
				MergedArchitectureContext context = ArchitectureDomainManager.getInstance().getArchitectureContextById(WizardConstants.AAS_CONTEXT);
				MergedArchitectureViewpoint viewpoint = getViewpointById(context, selectedId);

				if (viewpoint.getId().equals(unB.getData())) {
					setPageComplete(true);
					this.selectedId = (String) unB.getData();
					unB.setSelection(true);
				}
			}
		}
	}

	/**
	 * return the list of selected viewpoint IDs, including optional ones
	 * Add Assertions viewpoint in component definition and system configuration
	 * viewpoint.
	 */
	public String[] getSelectedIDs() {
		List<String> viewPoints = new ArrayList<String>();
		viewPoints.add(selectedId);
		return viewPoints.toArray(new String[0]);
	}

	/**
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 *
	 * @param parent
	 */

	  @Override
	  public void createControl(Composite parent) {
	  comp = createComposite(parent, 1, 1, GridData.FILL_BOTH, 0, 0);
	  ((GridData) comp.getLayoutData()).widthHint = 300;
	  setControl(comp);
	  Label label = new Label(comp, SWT.NONE);
	  label.setText("Main objective"); //$NON-NLS-1$
	  createVerticalSpacer(comp, 1);


	  MergedArchitectureContext context = ArchitectureDomainManager.getInstance().getArchitectureContextById(WizardConstants.AAS_CONTEXT);

	  SelectionListener sl = new SelectionListener() {

	  @Override
	  public void widgetDefaultSelected(SelectionEvent arg0) {
	  }

	  @Override
	  public void widgetSelected(SelectionEvent se) {
	  setPageComplete(true);
	  Button button = (Button) se.getSource();
	  selectedId = (String) button.getData();
	  }

	  };
	  String[] tier3_ids = {
	  WizardConstants.AAS_VIEWPOINT,
	  };
	  addButtons(context, comp, sl, tier3_ids);

	  setPageComplete(false);
	  }

	  protected static void addButtons(MergedArchitectureContext context, Composite comp, SelectionListener sl, String[] ids) {
	  for (String id : ids) {
	  MergedArchitectureViewpoint viewpoint = getViewpointById(context, id);
	  if (viewpoint != null) {
	  Button radio = new Button(comp, SWT.RADIO);
	  radio.setText(viewpoint.getDescription());
	  radio.setData(viewpoint.getId());
	  radio.addSelectionListener(sl);
	  }
	  }

	  }


	protected static MergedArchitectureViewpoint getViewpointById(MergedArchitectureContext context, String id) {
		for (MergedArchitectureViewpoint viewpoint : context.getViewpoints()) {
			if (viewpoint.getId().endsWith(id)) {
				return viewpoint;
			}
		}
		return null;
	}

	private static Composite createComposite(Composite parent, int columns, int hspan, int fill, int marginwidth, int marginheight) {
		Composite g = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout(columns, false);
		layout.marginWidth = marginwidth;
		layout.marginHeight = marginheight;
		g.setLayout(layout);
		g.setFont(parent.getFont());
		GridData gd = new GridData(fill);
		gd.horizontalSpan = hspan;
		g.setLayoutData(gd);
		return g;
	}

	private static void createVerticalSpacer(Composite parent, int numlines) {
		Label lbl = new Label(parent, SWT.NONE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		Layout layout = parent.getLayout();
		if (layout instanceof GridLayout) {
			gd.horizontalSpan = ((GridLayout) parent.getLayout()).numColumns;
		}
		gd.heightHint = numlines;
		lbl.setLayoutData(gd);
	}

}
