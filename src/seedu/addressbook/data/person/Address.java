package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.address.*;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, some street, #01-22, 1234567";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses can be in any format";
    public static final String ADDRESS_VALIDATION_REGEX = ".+";

    public final String value;
    private boolean isPrivate;
    
    private Block block;
    private Street street;
    private Unit unit;
    private PostalCode postalCode;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        if (!isValidAddress(address)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        this.value = address;
        this.decodeAddress(address);
    }
    
    /**
     * 
     * @param address
     */
    private void decodeAddress(String address) {
    	// credit use of split to user872858 at http://stackoverflow.com/questions/10631715/how-to-split-a-comma-separated-string
    	String[] addressElements = address.split("\\s*,\\s*");
    	
    	Block newBlock = new Block(addressElements[0]);
    	Street newStreet = new Street(addressElements[1]);
    	Unit newUnit = new Unit(addressElements[2]);
    	PostalCode newPostalCode = new PostalCode(addressElements[3]);
    	
    	this.setBlock(newBlock);
    	this.setStreet(newStreet);
    	this.setUnit(newUnit);
    	this.setPostalCode(newPostalCode);
    }

    /**
     * Returns true if a given string is a valid person email.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.value.equals(((Address) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }

	public Block getBlock() {
		return block;
	}

	public Street getStreet() {
		return street;
	}

	public Unit getUnit() {
		return unit;
	}

	public PostalCode getPostalCode() {
		return postalCode;
	}

	public void setBlock(Block block) {
		this.block = block;
	}

	public void setStreet(Street street) {
		this.street = street;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	public void setPostalCode(PostalCode postalCode) {
		this.postalCode = postalCode;
	}
}