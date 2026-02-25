package nacre;
public interface INACREStereotype {
/** Qualified name of the stereotype MainGrid */
public static final String MAINGRID_STEREOTYPE = "nacre::MainGrid";
/**  name of property base_Class of the stereotype MainGrid */
public static final String MAINGRID_BASE_CLASS_ATT = "base_Class";
/**  name of property zone of the stereotype MainGrid */
public static final String MAINGRID_ZONE_ATT = "zone";
/**  name of property centralcontroler of the stereotype MainGrid */
public static final String MAINGRID_CENTRALCONTROLER_ATT = "centralcontroler";
/**  name of property substation of the stereotype MainGrid */
public static final String MAINGRID_SUBSTATION_ATT = "substation";
/**  name of property lines of the stereotype MainGrid */
public static final String MAINGRID_LINES_ATT = "lines";
/** Qualified name of the stereotype Zone */
public static final String ZONE_STEREOTYPE = "nacre::Zone";
/**  name of property base_Class of the stereotype Zone */
public static final String ZONE_BASE_CLASS_ATT = "base_Class";
/**  name of property base_Property of the stereotype Zone */
public static final String ZONE_BASE_PROPERTY_ATT = "base_Property";
/**  name of property maingrid of the stereotype Zone */
public static final String ZONE_MAINGRID_ATT = "maingrid";
/**  name of property substation of the stereotype Zone */
public static final String ZONE_SUBSTATION_ATT = "substation";
/**  name of property zonalcontroller of the stereotype Zone */
public static final String ZONE_ZONALCONTROLLER_ATT = "zonalcontroller";
/**  name of property lines of the stereotype Zone */
public static final String ZONE_LINES_ATT = "lines";
/** Qualified name of the stereotype Substation */
public static final String SUBSTATION_STEREOTYPE = "nacre::Substation";
/**  name of property base_Class of the stereotype Substation */
public static final String SUBSTATION_BASE_CLASS_ATT = "base_Class";
/**  name of property base_Property of the stereotype Substation */
public static final String SUBSTATION_BASE_PROPERTY_ATT = "base_Property";
/**  name of property zone of the stereotype Substation */
public static final String SUBSTATION_ZONE_ATT = "zone";
/**  name of property bus of the stereotype Substation */
public static final String SUBSTATION_BUS_ATT = "bus";
/**  name of property maingrid of the stereotype Substation */
public static final String SUBSTATION_MAINGRID_ATT = "maingrid";
/** Qualified name of the stereotype Bus */
public static final String BUS_STEREOTYPE = "nacre::Bus";
/**  name of property base_Class of the stereotype Bus */
public static final String BUS_BASE_CLASS_ATT = "base_Class";
/**  name of property base_Property of the stereotype Bus */
public static final String BUS_BASE_PROPERTY_ATT = "base_Property";
/**  name of property substation of the stereotype Bus */
public static final String BUS_SUBSTATION_ATT = "substation";
/**  name of property nominalLevel of the stereotype Bus */
public static final String BUS_NOMINALLEVEL_ATT = "nominalLevel";
/**  name of property connected of the stereotype Bus */
public static final String BUS_CONNECTED_ATT = "connected";
/**  name of property equipement of the stereotype Bus */
public static final String BUS_EQUIPEMENT_ATT = "equipement";
/** Qualified name of the stereotype Equipement */
public static final String EQUIPEMENT_STEREOTYPE = "nacre::Equipement";
/**  name of property base_Class of the stereotype Equipement */
public static final String EQUIPEMENT_BASE_CLASS_ATT = "base_Class";
/**  name of property base_Property of the stereotype Equipement */
public static final String EQUIPEMENT_BASE_PROPERTY_ATT = "base_Property";
/**  name of property connected of the stereotype Equipement */
public static final String EQUIPEMENT_CONNECTED_ATT = "connected";
/**  name of property activable of the stereotype Equipement */
public static final String EQUIPEMENT_ACTIVABLE_ATT = "activable";
/**  name of property p of the stereotype Equipement */
public static final String EQUIPEMENT_P_ATT = "p";
/**  name of property q of the stereotype Equipement */
public static final String EQUIPEMENT_Q_ATT = "q";
/**  name of property base_Port of the stereotype Equipement */
public static final String EQUIPEMENT_BASE_PORT_ATT = "base_Port";
/**  name of property bus of the stereotype Equipement */
public static final String EQUIPEMENT_BUS_ATT = "bus";
/**  name of property localcontroller of the stereotype Equipement */
public static final String EQUIPEMENT_LOCALCONTROLLER_ATT = "localcontroller";
/** Qualified name of the stereotype Generator */
public static final String GENERATOR_STEREOTYPE = "nacre::Generator";
/**  name of property v of the stereotype Generator */
public static final String GENERATOR_V_ATT = "v";
/**  name of property maxPowerGeneration of the stereotype Generator */
public static final String GENERATOR_MAXPOWERGENERATION_ATT = "maxPowerGeneration";
/**  name of property producedEnergy of the stereotype Generator */
public static final String GENERATOR_PRODUCEDENERGY_ATT = "producedEnergy";
/**  name of property minPowerGeneration of the stereotype Generator */
public static final String GENERATOR_MINPOWERGENERATION_ATT = "minPowerGeneration";
/** Qualified name of the stereotype RTE_Installation */
public static final String RTE_INSTALLATION_STEREOTYPE = "nacre::RTE_Installation";
/**  name of property v of the stereotype RTE_Installation */
public static final String RTE_INSTALLATION_V_ATT = "v";
/**  name of property end of the stereotype RTE_Installation */
public static final String RTE_INSTALLATION_END_ATT = "end";
/**  name of property branch of the stereotype RTE_Installation */
public static final String RTE_INSTALLATION_BRANCH_ATT = "branch";
/**  name of property side of the stereotype RTE_Installation */
public static final String RTE_INSTALLATION_SIDE_ATT = "side";
/**  name of property ist of the stereotype RTE_Installation */
public static final String RTE_INSTALLATION_IST_ATT = "ist";
/**  name of property line of the stereotype RTE_Installation */
public static final String RTE_INSTALLATION_LINE_ATT = "line";
/** Qualified name of the stereotype Battery */
public static final String BATTERY_STEREOTYPE = "nacre::Battery";
/**  name of property maxPowerInjection of the stereotype Battery */
public static final String BATTERY_MAXPOWERINJECTION_ATT = "maxPowerInjection";
/**  name of property capacity of the stereotype Battery */
public static final String BATTERY_CAPACITY_ATT = "capacity";
/**  name of property producedEnergy of the stereotype Battery */
public static final String BATTERY_PRODUCEDENERGY_ATT = "producedEnergy";
/**  name of property consumedEnergy of the stereotype Battery */
public static final String BATTERY_CONSUMEDENERGY_ATT = "consumedEnergy";
/**  name of property minPowerInjection of the stereotype Battery */
public static final String BATTERY_MINPOWERINJECTION_ATT = "minPowerInjection";
/**  name of literal 63 of the Enumeration VoltageLevel */
public static final String VOLTAGELEVEL_63_ENUM = "63";
/**  name of literal 20 of the Enumeration VoltageLevel */
public static final String VOLTAGELEVEL_20_ENUM = "20";
/**  name of literal 42 of the Enumeration VoltageLevel */
public static final String VOLTAGELEVEL_42_ENUM = "42";
/**  name of literal 90 of the Enumeration VoltageLevel */
public static final String VOLTAGELEVEL_90_ENUM = "90";
/**  name of literal 150 of the Enumeration VoltageLevel */
public static final String VOLTAGELEVEL_150_ENUM = "150";
/**  name of literal 225 of the Enumeration VoltageLevel */
public static final String VOLTAGELEVEL_225_ENUM = "225";
/**  name of literal 380 of the Enumeration VoltageLevel */
public static final String VOLTAGELEVEL_380_ENUM = "380";
/**  name of literal DefaultControl of the Enumeration ControlType */
public static final String CONTROLTYPE_DEFAULTCONTROL_ENUM = "DefaultControl";
/**  name of literal ApproximateLinearMPC of the Enumeration ControlType */
public static final String CONTROLTYPE_APPROXIMATELINEARMPC_ENUM = "ApproximateLinearMPC";
/**  name of literal MixedLogicalDynamicalMPC of the Enumeration ControlType */
public static final String CONTROLTYPE_MIXEDLOGICALDYNAMICALMPC_ENUM = "MixedLogicalDynamicalMPC";
/**  name of literal MPCRte of the Enumeration ControlType */
public static final String CONTROLTYPE_MPCRTE_ENUM = "MPCRte";
/**  name of literal Limiter of the Enumeration ControlType */
public static final String CONTROLTYPE_LIMITER_ENUM = "Limiter";
/**  name of literal Release_all of the Enumeration ControlType */
public static final String CONTROLTYPE_RELEASE_ALL_ENUM = "Release_all";
/** Qualified name of the stereotype CentralController */
public static final String CENTRALCONTROLLER_STEREOTYPE = "nacre::CentralController";
/**  name of property maingrid of the stereotype CentralController */
public static final String CENTRALCONTROLLER_MAINGRID_ATT = "maingrid";
/**  name of property base_Class of the stereotype CentralController */
public static final String CENTRALCONTROLLER_BASE_CLASS_ATT = "base_Class";
/**  name of property base_Property of the stereotype CentralController */
public static final String CENTRALCONTROLLER_BASE_PROPERTY_ATT = "base_Property";
/** Qualified name of the stereotype ZonalController */
public static final String ZONALCONTROLLER_STEREOTYPE = "nacre::ZonalController";
/**  name of property zone of the stereotype ZonalController */
public static final String ZONALCONTROLLER_ZONE_ATT = "zone";
/**  name of property base_Class of the stereotype ZonalController */
public static final String ZONALCONTROLLER_BASE_CLASS_ATT = "base_Class";
/**  name of property base_Property of the stereotype ZonalController */
public static final String ZONALCONTROLLER_BASE_PROPERTY_ATT = "base_Property";
/** Qualified name of the stereotype LocalController */
public static final String LOCALCONTROLLER_STEREOTYPE = "nacre::LocalController";
/**  name of property base_Class of the stereotype LocalController */
public static final String LOCALCONTROLLER_BASE_CLASS_ATT = "base_Class";
/**  name of property base_Property of the stereotype LocalController */
public static final String LOCALCONTROLLER_BASE_PROPERTY_ATT = "base_Property";
/**  name of property equipement of the stereotype LocalController */
public static final String LOCALCONTROLLER_EQUIPEMENT_ATT = "equipement";
/**  name of literal V of the Enumeration VoltageUnitKind */
public static final String VOLTAGEUNITKIND_V_ENUM = "V";
/**  name of literal KV of the Enumeration VoltageUnitKind */
public static final String VOLTAGEUNITKIND_KV_ENUM = "KV";
/**  name of literal MV of the Enumeration VoltageUnitKind */
public static final String VOLTAGEUNITKIND_MV_ENUM = "MV";
/**  name of literal J of the Enumeration EnergyUnitKind */
public static final String ENERGYUNITKIND_J_ENUM = "J";
/**  name of literal KJ of the Enumeration EnergyUnitKind */
public static final String ENERGYUNITKIND_KJ_ENUM = "KJ";
/**  name of literal Wh of the Enumeration EnergyUnitKind */
public static final String ENERGYUNITKIND_WH_ENUM = "Wh";
/**  name of literal KWh of the Enumeration EnergyUnitKind */
public static final String ENERGYUNITKIND_KWH_ENUM = "KWh";
/**  name of literal MWh of the Enumeration EnergyUnitKind */
public static final String ENERGYUNITKIND_MWH_ENUM = "MWh";
/**  name of literal VAR of the Enumeration ReactivePowerUnitKind */
public static final String REACTIVEPOWERUNITKIND_VAR_ENUM = "VAR";
/**  name of literal KVAR of the Enumeration ReactivePowerUnitKind */
public static final String REACTIVEPOWERUNITKIND_KVAR_ENUM = "KVAR";
/**  name of literal MVAR of the Enumeration ReactivePowerUnitKind */
public static final String REACTIVEPOWERUNITKIND_MVAR_ENUM = "MVAR";
/**  name of literal MW of the Enumeration PowerUnitKind */
public static final String POWERUNITKIND_MW_ENUM = "MW";
/**  name of literal KW of the Enumeration PowerUnitKind */
public static final String POWERUNITKIND_KW_ENUM = "KW";
/**  name of literal W of the Enumeration PowerUnitKind */
public static final String POWERUNITKIND_W_ENUM = "W";
/** Qualified name of the stereotype Connect */
public static final String CONNECT_STEREOTYPE = "nacre::Connect";
/**  name of property base_Abstraction of the stereotype Connect */
public static final String CONNECT_BASE_ABSTRACTION_ATT = "base_Abstraction";
/** Qualified name of the stereotype Control */
public static final String CONTROL_STEREOTYPE = "nacre::Control";
/**  name of property base_Abstraction of the stereotype Control */
public static final String CONTROL_BASE_ABSTRACTION_ATT = "base_Abstraction";
/** Qualified name of the stereotype Link */
public static final String LINK_STEREOTYPE = "nacre::Link";
/**  name of property base_Abstraction of the stereotype Link */
public static final String LINK_BASE_ABSTRACTION_ATT = "base_Abstraction";
/** Qualified name of the stereotype CFA */
public static final String CFA_STEREOTYPE = "nacre::CFA";
/**  name of property base_Package of the stereotype CFA */
public static final String CFA_BASE_PACKAGE_ATT = "base_Package";
/** Qualified name of the stereotype CRA */
public static final String CRA_STEREOTYPE = "nacre::CRA";
/**  name of property base_Package of the stereotype CRA */
public static final String CRA_BASE_PACKAGE_ATT = "base_Package";
/** Qualified name of the stereotype CFRA */
public static final String CFRA_STEREOTYPE = "nacre::CFRA";
/**  name of property cra of the stereotype CFRA */
public static final String CFRA_CRA_ATT = "cra";
/**  name of property base_Package of the stereotype CFRA */
public static final String CFRA_BASE_PACKAGE_ATT = "base_Package";
/** Qualified name of the stereotype Controllers */
public static final String CONTROLLERS_STEREOTYPE = "nacre::Controllers";
/**  name of property base_Package of the stereotype Controllers */
public static final String CONTROLLERS_BASE_PACKAGE_ATT = "base_Package";
/** Qualified name of the stereotype CommunicationMedias */
public static final String COMMUNICATIONMEDIAS_STEREOTYPE = "nacre::CommunicationMedias";
/**  name of property base_Package of the stereotype CommunicationMedias */
public static final String COMMUNICATIONMEDIAS_BASE_PACKAGE_ATT = "base_Package";
/** Qualified name of the stereotype ComputingResources */
public static final String COMPUTINGRESOURCES_STEREOTYPE = "nacre::ComputingResources";
/**  name of property base_Package of the stereotype ComputingResources */
public static final String COMPUTINGRESOURCES_BASE_PACKAGE_ATT = "base_Package";
/** Qualified name of the stereotype SoftwareResources */
public static final String SOFTWARERESOURCES_STEREOTYPE = "nacre::SoftwareResources";
/**  name of property base_Package of the stereotype SoftwareResources */
public static final String SOFTWARERESOURCES_BASE_PACKAGE_ATT = "base_Package";
/** Qualified name of the stereotype CRAS */
public static final String CRAS_STEREOTYPE = "nacre::CRAS";
/**  name of property base_Package of the stereotype CRAS */
public static final String CRAS_BASE_PACKAGE_ATT = "base_Package";
/** Qualified name of the stereotype CFRAS */
public static final String CFRAS_STEREOTYPE = "nacre::CFRAS";
/**  name of property base_Package of the stereotype CFRAS */
public static final String CFRAS_BASE_PACKAGE_ATT = "base_Package";
/**  name of literal A of the Enumeration IstUnitKind */
public static final String ISTUNITKIND_A_ENUM = "A";
/**  name of literal MW of the Enumeration IstUnitKind */
public static final String ISTUNITKIND_MW_ENUM = "MW";
/** Qualified name of the stereotype Controller */
public static final String CONTROLLER_STEREOTYPE = "nacre::Controller";
/**  name of property controlBehavior of the stereotype Controller */
public static final String CONTROLLER_CONTROLBEHAVIOR_ATT = "controlBehavior";
/** Qualified name of the stereotype RedundancyCluster */
public static final String REDUNDANCYCLUSTER_STEREOTYPE = "nacre::RedundancyCluster";
/**  name of property runtime of the stereotype RedundancyCluster */
public static final String REDUNDANCYCLUSTER_RUNTIME_ATT = "runtime";
/**  name of property base_Class of the stereotype RedundancyCluster */
public static final String REDUNDANCYCLUSTER_BASE_CLASS_ATT = "base_Class";
/**  name of property active of the stereotype RedundancyCluster */
public static final String REDUNDANCYCLUSTER_ACTIVE_ATT = "active";
/**  name of property passive of the stereotype RedundancyCluster */
public static final String REDUNDANCYCLUSTER_PASSIVE_ATT = "passive";
/**  name of property hypervisor of the stereotype RedundancyCluster */
public static final String REDUNDANCYCLUSTER_HYPERVISOR_ATT = "hypervisor";
/**  name of literal consensus of the Enumeration RedundancyKind */
public static final String REDUNDANCYKIND_CONSENSUS_ENUM = "consensus";
/**  name of literal hypervisor of the Enumeration RedundancyKind */
public static final String REDUNDANCYKIND_HYPERVISOR_ENUM = "hypervisor";
/**  name of literal active_standby of the Enumeration RedundancyKind */
public static final String REDUNDANCYKIND_ACTIVE_STANDBY_ENUM = "active_standby";
/** Qualified name of the stereotype Line */
public static final String LINE_STEREOTYPE = "nacre::Line";
/**  name of property base_Class of the stereotype Line */
public static final String LINE_BASE_CLASS_ATT = "base_Class";
}