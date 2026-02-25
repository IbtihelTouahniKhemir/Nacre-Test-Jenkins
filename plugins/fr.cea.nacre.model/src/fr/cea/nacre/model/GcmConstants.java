package fr.cea.nacre.model;

public class GcmConstants {

//	public enum EParameter {
////		NEW_NAME("NewName"),
////		NEW_INDEX("NewIndex"),
////		NEW_PMAX("NewPmax"),
////		NEW_PMIN("NewPmin"),
////		NEW_BRANCH("NewBranch"),
////		NEW_END("NewEnd"),
////		NEW_SIDE("NewSide"),
////		NEW_IST("NewIst"),
//
//		NEW_GCM_DATA("NewGcmData");
//
//		private String param;
//
//		private EParameter(String param) {
//			this.param = param;
//		}
//
//		@Override
//		public String toString() {
//			return this.param;
//		}
//	}

	public class Parameter {
		public static final String NEW_GCM_DATA = "NewGcmData";

		private Parameter() {
		}
	}


	public enum Element {
		CFA  ("cfa"  , "CFA"  ),
		CRA  ("cra"  , "CRA"  ),
		CRAS ("cras" , "CRAS" ),
		CFRA ("cfra" , "CFRA" ),
		CFRAS("cfras", "CFRAS"),

		COMMUNICATION_MEDIAS("communicationMedias", "CommunicationMedias"),
		COMPUTING_RESSOURCES("computingResources" , "ComputingResources" ),
		SOFTWARE_RESSOURCES ("softwareResources"  , "SoftwareResources"  ),
		CONTROLLERS         ("controllers"        , "Controllers"        );

		private String gcm;
		private String label;

		private Element(String gcm, String label) {
			this.gcm   = gcm;
			this.label = label;
		}

		public String gcm() {
			return this.gcm;
		}

		public String label() {
			return this.label;
		}
	}


//	public enum EComputingResourcePrefix {
//		CR_SUBSTATION_EQUIPMENTS("CR_equipments_"),
//		CR_SUBSTATION_GENERATORS("CR_generators_");
//
//		private String prefix;
//
//		private EComputingResourcePrefix(String prefix) {
//			this.prefix = prefix;
//		}
//
//		@Override
//		public String toString() {
//			return this.prefix;
//		}
//	}

	public class ComputingResourcePrefix {
		public static final String CR_SUBSTATION_EQUIPMENTS = "CR_equipments_";

		public static final String CR_SUBSTATION_GENERATORS = "CR_generators_";

		private ComputingResourcePrefix(String prefix) {
		}
	}


	private GcmConstants() {
	}


}
