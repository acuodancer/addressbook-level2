package seedu.addressbook.data.person;

public class Contact {
	
	public final String value;
	private boolean isPrivate;
	
	public Contact(String value, boolean isPrivate) {
		this.value = value;
		this.isPrivate = isPrivate;		
	}
	
	public static boolean isValid(String testContact, String regex) {
		return testContact.matches(regex);
	}
	
	public boolean isPrivate() {
		return isPrivate;
	}
	
}
