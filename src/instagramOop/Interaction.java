package instagramOop;

public class Interaction {
	private int id;
	private User user;

	public Interaction() {
		super();
	}

	public Interaction(int id, User user) {
		super();
		this.id = id;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
