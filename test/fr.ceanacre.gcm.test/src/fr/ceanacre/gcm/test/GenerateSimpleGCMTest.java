package fr.ceanacre.gcm.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.junit.framework.classification.tests.AbstractPapyrusTest;
import org.eclipse.papyrus.junit.utils.rules.ModelSetFixture;
import org.eclipse.papyrus.junit.utils.rules.PluginResource;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;
import org.junit.Rule;
import org.junit.Test;

import fr.cea.nacre.model.UMLtoMM.UMLtoNacreMMJob;
import fr.cea.nacre.model.factory.GCMFactory2;
import fr.cea.nacre.ui.plus.handlers.GenerateJSONHandler2;



public class GenerateSimpleGCMTest extends AbstractGCMGeneration {
	/** The model set fixture. */
	@Rule
	public final ModelSetFixture modelSetFixture = new ModelSetFixture();

	@Test
	@PluginResource("model/emptyModel/NACRE_EMPTY.uml")
	public void emptyModelTest() {
		Package root= modelSetFixture.getModel();
		Package CFAPackage= (Package)root.getMember("CFA");
		assertNotNull(CFAPackage);
		Class UML_mainGrid = (Class) CFAPackage.getMember("MainGrid");
		assertNotNull(UML_mainGrid);
		UMLtoNacreMMJob transformer = new UMLtoNacreMMJob("fr.ceanacre.gcm.test", UML_mainGrid);
		EObject result=transformer.construct();
		assertNotNull(result);
		//test JSON
		GCMFactory2 gcmFactory=new GCMFactory2();
		String jsonResult=GenerateJSONHandler2.generateJSON(gcmFactory, transformer, UML_mainGrid, null);
		assertNotNull(jsonResult);
		String input = getResourceFileContent("model/emptyModel/GCM_NACRE_EMPTY.json");
		assertEquals("Json is different",input,jsonResult);
	}
	
	@Test
	@PluginResource("model/simpleHazard/SimpleHazard.uml")
	public void simpleHazardTest() {
		Package root= modelSetFixture.getModel();
		Package CFAPackage= (Package)root.getMember("CFA");
		assertNotNull(CFAPackage);
		Class UML_mainGrid = (Class) CFAPackage.getMember("MainGrid");
		assertNotNull(UML_mainGrid);
		UMLtoNacreMMJob transformer = new UMLtoNacreMMJob("fr.ceanacre.gcm.test", UML_mainGrid);
		EObject result=transformer.construct();
		assertNotNull(result);
		//test JSON
		GCMFactory2 gcmFactory=new GCMFactory2();
		String jsonResult=GenerateJSONHandler2.generateJSON(gcmFactory, transformer, UML_mainGrid, null);
		assertNotNull(jsonResult);
		String input = getResourceFileContent("model/simpleHazard/GCM_SimpleHazard.json");
		assertEquals("Json is different",input,jsonResult);
	}
	
	@Test
	@PluginResource("model/HazardWithCOM/HazardWithCOM.uml")
	public void hazardWithCOMTest() {
		Package root= modelSetFixture.getModel();
		Package CFAPackage= (Package)root.getMember("CFA");
		assertNotNull(CFAPackage);
		Class UML_mainGrid = (Class) CFAPackage.getMember("MainGrid");
		assertNotNull(UML_mainGrid);
		UMLtoNacreMMJob transformer = new UMLtoNacreMMJob("fr.ceanacre.gcm.test", UML_mainGrid);
		EObject result=transformer.construct();
		assertNotNull(result);
		//test JSON
		GCMFactory2 gcmFactory=new GCMFactory2();
		String jsonResult=GenerateJSONHandler2.generateJSON(gcmFactory, transformer, UML_mainGrid, null);
		assertNotNull(jsonResult);
		String input = getResourceFileContent("model/HazardWithCOM/GCM_HazardWithCOM.json");
		assertEquals("Json is different",input,jsonResult);
	}
}
