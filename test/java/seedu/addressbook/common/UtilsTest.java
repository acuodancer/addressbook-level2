package seedu.addressbook.common;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class UtilsTest {

	private static final int LIST_LENGTH = 10;
	private Utils utils;
	
	@Before
	public void setup() {
		utils = new Utils();
	}
	
	/**
	 * Test isAnynull method
	 */
	
	// Null input, return false
	@Test
	public void emptyInput_returnsIncorrect() {
		ArrayList listToTest = generateEmptyList();
		Object[] arrayToTest = new Object[listToTest.size()];
		arrayToTest = listToTest.toArray();
		assertEquals(false, utils.isAnyNull(arrayToTest));
	}
	
	// List with null, return true
	@Test
	public void withNullInput_returnsCorrect() {
		ArrayList<Object> listToTest = generateListWithNull();
		Object[] arrayToTest = new Object[listToTest.size()];
		arrayToTest = listToTest.toArray();
		assertEquals(true, Utils.isAnyNull(arrayToTest));
	}	
	
	// List with duplicate but no null, return false
	@Test
	public void withDuplicateInput_returnsIncorrect() {
		ArrayList<Object> listToTest = generateListWithDuplicate();
		Object[] arrayToTest = new Object[listToTest.size()];
		arrayToTest = listToTest.toArray();
		assertEquals(false, utils.isAnyNull(arrayToTest));
	}	
	
	// List with no null no duplicate, return false
	@Test
	public void noNullnoDuplicateInput_returnsIncorrect() {
		ArrayList<Object> listToTest = generateWithNoNullNoDuplicate();
		Object[] arrayToTest = new Object[listToTest.size()];
		arrayToTest = listToTest.toArray();
		assertEquals(false, utils.isAnyNull(arrayToTest));
	}	
	
	
	private static ArrayList<Object> generateEmptyList() {
		ArrayList<Object> emptyList = new ArrayList<Object>();
		return emptyList;
	}
	
	private static ArrayList<Object> generateWithNoNullNoDuplicate() {
		ArrayList<Object> listWithNoNullNoDuplicate = new ArrayList<Object>();
		for (int i = 0; i < LIST_LENGTH; i++) {
			Object o = new Object();
			listWithNoNullNoDuplicate.add(o);
		}
		return listWithNoNullNoDuplicate;
	}
	
	private static ArrayList<Object> generateListWithNull() {
		ArrayList<Object> listWithNull = new ArrayList<Object>();
		for (int i = 0; i < LIST_LENGTH; i++) {
			Object o = new Object();
			listWithNull.add(o);
		}
		Object o = null;
		listWithNull.add(o);
		return listWithNull;
	}
	
	private static ArrayList<Object> generateListWithDuplicate() {
		ArrayList<Object> listWithDuplicate = new ArrayList<Object>();
		for (int i = 0; i < LIST_LENGTH; i++) {
			Object o = new Object();
			listWithDuplicate.add(o);
			if (i == LIST_LENGTH - 1) { // add a duplicate as the last element
				listWithDuplicate.add(o);
			}
		}
		return listWithDuplicate;
	}
	
}
