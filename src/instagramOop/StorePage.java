package instagramOop;

public class StorePage extends Page{

	private String stores;
	private String videos;
	private String [] products;
	
	
	public StorePage() {
		super();
	}


	public StorePage(String stores, String videos, String[] products) {
		super();
		this.stores = stores;
		this.videos = videos;
		this.products = products;
	}


	public String getStores() {
		return stores;
	}


	public void setStores(String stores) {
		this.stores = stores;
	}


	public String getVideos() {
		return videos;
	}


	public void setVideos(String videos) {
		this.videos = videos;
	}


	public String[] getProducts() {
		return products;
	}


	public void setProducts(String[] products) {
		this.products = products;
	}
	
	
	
}
