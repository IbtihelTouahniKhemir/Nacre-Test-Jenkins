package fr.cea.nacre.model.factory;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.eclipse.emf.ecore.EObject;

import fr.cea.nacre.model.NACREMM.UID.UIDElement;
import fr.cea.nacre.model.NACREMM.cfa.Cfa;
import fr.cea.nacre.model.NACREMM.cfa.Controller;
import fr.cea.nacre.model.NACREMM.cfa.MainGrid;
import fr.cea.nacre.model.NACREMM.cfa.Substation;
import fr.cea.nacre.model.NACREMM.cfa.Zone;
import fr.cea.nacre.model.NACREMM.cra.Cra;
import fr.cea.nacre.model.NACREMM.cra.CommunicationMedia;
import fr.cea.nacre.model.NACREMM.cra.ComputingResource;
import fr.cea.nacre.model.NACREMM.cra.SoftwareResource;
import fr.cea.nacre.model.NACREMM.cfra.Cfra;


/**
 * this factory is used to generate the JSON and it is based on the Ecore MM.
 */
public class GCMFactory2 {

	// Map to link JavaObject to JsonObject
	public  HashMap<Object, String> craMap;
	public  HashMap<Object, Object> compResMap ;
	public  HashMap<Object, Object> swResMap ;
	public  HashMap<Object, Object> cluster;
	public  HashMap<Object, Object> commMediaMap ;
	public  HashMap<Object, Object> cfaMap ;
	public  HashMap<Object, Object> hazardsMap ;

	public HashMap<String, List<org.eclipse.uml2.uml.Abstraction>> UMLdeploiementRegistry;

	public static final String SEPARATOR_CLASSNAME_UID = "_";

	public static HashSet<String> uuidSet;
	public static HashMap<String, String> uidMap;


	public static String shortUUID() {
		int UID_SIZE = 8;
		char[] chars = "abcdefghijklmnopqrstuvwxyzABSDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
		Random r = new Random();
		char[] id = new char[UID_SIZE];
		for (int i = 0;  i < UID_SIZE;  i++) {
			id[i] = chars[r.nextInt(chars.length)];
		}
		return new String(id);
	}

	public static String legacyUID(fr.cea.nacre.model.NACREMM.UID.UIDElement element) {
		String uuid = null;
		while( true ) {
			uuid = shortUUID();
			if( GCMFactory2.uuidSet.contains(uuid) ) {
				System.err.println("Fail to generate a short UUID< " + uuid + " > !");
			}
			else {
				GCMFactory2.uuidSet.add(uuid);
				break;
			}
		}
		return uuid;
	}


	private static Map<String,String> DICO_SHORT_NAME = Map.ofEntries(
	        Map.entry("computingresource", "CR"),
	        Map.entry("softwareresource", "SR"),
	        Map.entry("communicationMedias", "comMedias"),
	        Map.entry("rteinstallation", "tie"),
	        Map.entry("generator", "gen"),
	        Map.entry("substation", "sub"),
	        Map.entry("battery", "bat"),
	        Map.entry("load", "load"),
	        Map.entry("communicationhazard", "comhazard"),
	        Map.entry("linehazard", "linehazard"),
	        Map.entry("generatorhazard", "generatorhazard"),
	        Map.entry("nacrehazard", "nacrehazard"),
	        Map.entry("cfahazard", "cfahazard"),
	        Map.entry("crahazard", "crahazard")
	        // Map.entry("maingrid", "grid")
	    );

//	private static Pattern COMPLIANT_UID_NAME = Pattern.compile("\\p{Alpha}}\\w+");
	private static boolean isUIDCompliant(UIDElement element) {
		final String name = element.getName();

		return (name.length() < 7) && name.matches("\\p{Alpha}\\w+") && (
				(element instanceof Cfa) ||
				(element instanceof Cra) ||
				(element instanceof Cfra) );
	}

	public static String containerBasedUID(UIDElement element, String gcmClassId) {
		final EObject container = element.eContainer();
		if( container instanceof UIDElement ) {
			String uid = ((UIDElement) container).getUid()
					+ GCMFactory2.SEPARATOR_CLASSNAME_UID + gcmClassId;

			final String elementValidId =
					element.getName().replaceAll("\\W", "x");

			if( element instanceof Controller ) {
				// Do nothing
			}
			else if( element instanceof MainGrid ) {
				// Do nothing
			}
			else if( element instanceof ComputingResource ) {
				uid = ((UIDElement) container).getUid()
						+ GCMFactory2.SEPARATOR_CLASSNAME_UID  // startsWith "CR"
						+ ( elementValidId.toUpperCase().startsWith(gcmClassId) ? "" :
							(gcmClassId + GCMFactory2.SEPARATOR_CLASSNAME_UID) )
						+ elementValidId;
			}
			else if( element instanceof SoftwareResource ) {
				uid = ((UIDElement) container).getUid()
						+ GCMFactory2.SEPARATOR_CLASSNAME_UID  // startsWith "SR"
						+ ( elementValidId.toUpperCase().startsWith(gcmClassId) ? "" :
							(gcmClassId + GCMFactory2.SEPARATOR_CLASSNAME_UID) )
						+ elementValidId;
			}
			else if( element instanceof Substation ) {
				uid = ((UIDElement) container).getUid()
						+ GCMFactory2.SEPARATOR_CLASSNAME_UID //+ gcmClassId
						+ elementValidId;
			}
			else if( element instanceof Zone ) {
				uid = ((UIDElement) container).getUid()
						+ GCMFactory2.SEPARATOR_CLASSNAME_UID //+ gcmClassId
						+ element.getName();
			}
			else if( element instanceof CommunicationMedia ) {
				uid = ((UIDElement) container).getUid()
						+ GCMFactory2.SEPARATOR_CLASSNAME_UID + gcmClassId
						+ GCMFactory2.SEPARATOR_CLASSNAME_UID + element.getName();
			}
			else {
				// Strictly container-based UID
				int position = container.eContents().size() - 1;
				uid = uid + GCMFactory2.SEPARATOR_CLASSNAME_UID + position;

				// Readable container-based UID
				if( isUIDCompliant(element) ) {
					String readableUid = ((UIDElement) container).getUid()
							+ GCMFactory2.SEPARATOR_CLASSNAME_UID;
					final String elementName = element.getName();
					// Avoid dublication of shortTypeId in final UID
					if( ! elementName.toLowerCase().startsWith(gcmClassId.toLowerCase()) ) {
						readableUid = readableUid + gcmClassId;
					}
					readableUid = readableUid + elementName;

					if( GCMFactory2.uuidSet.contains(readableUid) ) {
						System.err.println("Fail to generate a containerBasedUID< " + readableUid + " > without collision !");
					}
					else {
						uid = readableUid;
					}
				}
			}

			if( GCMFactory2.uuidSet.contains(uid) ) {
				System.err.println("Fail to generate a containerBasedUID< " + uid + " > without collision !");
				return null;
			}
			else {
				GCMFactory2.uuidSet.add(uid);
				return uid;
			}
		}
		else if( element instanceof fr.cea.nacre.model.NACREMM.study.Study ) {
			if( GCMFactory2.uuidSet.contains(gcmClassId) ) {
				System.err.println("Fail to generate a containerBasedUID< " + gcmClassId + " > without collision !");
				return null;
			}
			else {
				GCMFactory2.uuidSet.add(gcmClassId);
				return gcmClassId;
			}
		}
		else {
			return null;
		}
	}


	public static String generateUID(UIDElement element) {
		String gcmClassName = element.getClass().getSimpleName();
		if( gcmClassName.endsWith("Impl") ) {
			gcmClassName = gcmClassName.substring(0, gcmClassName.length() - 4 );
		}
		String gcmClassId = gcmClassName.toLowerCase();
		final String shortId = DICO_SHORT_NAME.get(gcmClassId);
		if( shortId != null ) {
			gcmClassId = shortId;
		}

		if(element.getQualifiedName()==null) {
			System.err.println("ERROR "+ element.getName() +" has no qualified name.");
		}
		String uidKey = gcmClassName + SEPARATOR_CLASSNAME_UID + element.getQualifiedName();
		if (GCMFactory2.uidMap.containsKey(uidKey)) {
			System.err.println("Collision of name key during generation of UID of element < " + uidKey + " > !");
		}

		String uid = containerBasedUID(element, gcmClassId);
		if( uid == null ) {
			uid = gcmClassName + SEPARATOR_CLASSNAME_UID + legacyUID(element);
		}
		GCMFactory2.uidMap.put(uidKey, uid);

//		System.out.println(gcmClassName + " : " + element.getName() + " --> uid : " + uid);

		return uid;
	}


	/**
	 * get the UID from
	 * @param gcmClassName the class name
	 * @param qualifiedName uml qualified name
	 * @return unique UID
	 */
	public static String getUID(String gcmClassName, String qualifiedName) {
		String uid = GCMFactory2.uidMap.get(gcmClassName + SEPARATOR_CLASSNAME_UID + qualifiedName);
		if (uid==null) {
			System.err.println("uid not found for "+ gcmClassName +" "+qualifiedName);
			return "uid<none>";}
		return (uid != null) ? uid : "uid<none>";
	}

	public GCMFactory2()
	{
		craMap = new HashMap<>();
		compResMap = new HashMap<Object, Object>();
		swResMap = new HashMap<Object, Object>();
		cluster= new HashMap<Object, Object>();
		commMediaMap = new HashMap<Object, Object>();
		cfaMap  = new HashMap<Object, Object>();
		hazardsMap = new HashMap<Object,Object>();

		UMLdeploiementRegistry = new HashMap<String, List<org.eclipse.uml2.uml.Abstraction>>();

		GCMFactory2.uuidSet = new HashSet<>();
		GCMFactory2.uidMap  = new HashMap<>();
	}


	public JsonResult getJsonResult() {
		return new JsonResult();
	}



}
