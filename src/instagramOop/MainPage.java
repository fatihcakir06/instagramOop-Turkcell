package instagramOop;

public class MainPage extends Page{

	private String[] posts;
	private String[] storys;
	
	
	
	public MainPage() {
		super();
	}



	public MainPage(String[] posts, String[] storys) {
		super();
		this.posts = posts;
		this.storys = storys;
	}



	public String[] getPosts() {
		return posts;
	}



	public void setPosts(String[] posts) {
		this.posts = posts;
	}



	public String[] getStorys() {
		return storys;
	}



	public void setStorys(String[] storys) {
		this.storys = storys;
	}
	
	
	
	
}
