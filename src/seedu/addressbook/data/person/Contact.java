package seedu.addressbook.data.person;

public class Contact {

	public static String regex = "";
	
	public static boolean isValid(String testContact) {
		return testContact.matches(regex);
	}
	
	public void setRegex(String newRegex) {
		regex = newRegex;
	}
	
}
