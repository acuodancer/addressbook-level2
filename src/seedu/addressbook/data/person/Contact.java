package seedu.addressbook.data.person;

public class Contact {
	
	public static boolean isValid(String testContact, String regex) {
		return testContact.matches(regex);
	}
	
}
