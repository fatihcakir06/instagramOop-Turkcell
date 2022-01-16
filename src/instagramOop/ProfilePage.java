package instagramOop;

public class ProfilePage extends Page{

	private String profilePicture;
	private String posts;
	private String [] stories;
	
	
	public ProfilePage() {
		super();
	}





	public ProfilePage(int id, String name, String profilePicture, String posts, String[] stories) {
		super(id, name);
		this.profilePicture = profilePicture;
		this.posts = posts;
		this.stories = stories;
	}





	public String getProfilePicture() {
		return profilePicture;
	}


	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}


	public String getPosts() {
		return posts;
	}


	public void setPosts(String posts) {
		this.posts = posts;
	}


	public String[] getStories() {
		return stories;
	}


	public void setStories(String[] stories) {
		this.stories = stories;
	}
	
	
	
}
