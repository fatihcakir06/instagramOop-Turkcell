package instagramOop;

public class Activity extends Interaction {
	private String[] requests;
	private String like;

	public Activity() {
	}

	public Activity(String[] requests, String like) {
		super();
		this.requests = requests;
		this.like = like;
	}

	public String[] getRequests() {
		return requests;
	}

	public void setRequests(String[] requests) {
		this.requests = requests;
	}

	public String getLike() {
		return like;
	}

	public void setLike(String like) {
		this.like = like;
	}

}
