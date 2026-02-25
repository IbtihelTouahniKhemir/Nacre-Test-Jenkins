package fr.cea.nacre.model.factory;

import fr.cea.nacre.model.NACREMM.study.Manifest;
import fr.cea.nacre.model.NACREMM.study.Study;
import fr.cea.nacre.model.NACREMM.study.UsingDirectives;

public class JsonResult {

		private JsonResultData data = new JsonResultData();

		public Manifest getManifest() {
			return data.manifest;
		}

		public UsingDirectives getUsing() {
			return data.using;
		}

		public void setUsing(UsingDirectives using) {
			this.data.using = using;
		}

		public void setStudy(Study study) {
			this.data.study = study;
		}

		public Study getStudy() {
			return data.study;
		}

		public void setManifest(Manifest manifest) {
			this.data.manifest = manifest;
		}
		public JsonResultData getData() {
			return data;
		}
	}