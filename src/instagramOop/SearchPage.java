package instagramOop;


public class SearchPage extends Page{
	
		private String accounts;
		private String  images;
		private String primaries;
		private String [] propesed;
		
		public SearchPage() {}
		
		
		public SearchPage(String accounts, String images, String primaries, String[] propesed) {
			super();
			this.accounts = accounts;
			this.images = images;
			this.primaries = primaries;
			this.propesed = propesed;
		}


		public String getAccounts() {
			return accounts;
		}


		public void setAccounts(String accounts) {
			this.accounts = accounts;
		}


		public String getImages() {
			return images;
		}


		public void setImages(String images) {
			this.images = images;
		}


		public String getPrimaries() {
			return primaries;
		}


		public void setPrimaries(String primaries) {
			this.primaries = primaries;
		}


		public String[] getPropesed() {
			return propesed;
		}


		public void setPropesed(String[] propesed) {
			this.propesed = propesed;
		}
		
		
		
		
}
