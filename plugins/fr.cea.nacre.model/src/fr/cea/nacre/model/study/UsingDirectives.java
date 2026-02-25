package fr.cea.nacre.model.study;

public class UsingDirectives {
	String iidm;
	String filter;
	
	public UsingDirectives() {
	}

	public String getIidm() {
		return iidm;
	}

	public void setIidm(String iidm) {
		this.iidm = iidm;
	}

	public String getFilter() {
		return filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}

	@Override
	public String toString() {
		return "Using {\n iidm=" + iidm + "\nfilter=" + filter + "\n}";
	}
	
}
