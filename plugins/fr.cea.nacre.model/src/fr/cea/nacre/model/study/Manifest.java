package fr.cea.nacre.model.study;

public class Manifest {
	private int version;
	private String description;
	private String service;
	private String type;

	public int getVersion() {
		return version;
	}

	public void setVersion(int i) {
		this.version = i;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Manifest { version=" + version + ", description=" + description 
				+ ", service=" + service + ", type=" + type + "}";
	}
}
