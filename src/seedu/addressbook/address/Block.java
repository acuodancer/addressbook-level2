package seedu.addressbook.address;

public class Block {

	public static final String EXAMPLE = "123";
    public static final String MESSAGE_ADDRESS_BLOCK_CONSTRAINTS = "Person addresses can be in any format";
    
    private String value;
    
    public Block(String value) {
    	this.value = value;
    }
    
    public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	
}
