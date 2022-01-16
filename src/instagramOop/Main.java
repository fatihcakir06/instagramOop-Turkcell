package instagramOop;

public class Main {

	public static void main(String[] args) {
		
		MainPage mainPage = new MainPage();
		
		
		ProfilePage profilePage= new ProfilePage(1,"fatih","url-bisey-bisey","post1",new String [] {});
		
		System.out.println("Hoþgeldin " +profilePage.getName() );

	}

}
