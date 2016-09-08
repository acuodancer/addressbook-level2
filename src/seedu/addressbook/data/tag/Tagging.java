package seedu.addressbook.data.tag;

public class Tagging {
	
	private static final String ADD_PREFIX = "+";
	private static final String REMOVE_PREFIX = "-";

	private enum TagType {ADD, REMOVE};
	
	private TagType type;
	private String name;
	private String tag;
	
	public Tagging(boolean isAdd, String name, String tag) {
		if (isAdd) {
			type = TagType.ADD;
		} else {
			type = TagType.REMOVE;
		}
		this.name = name;
		this.tag = tag;
	}
	
	public TagType getType() {
		return type;
	}
	public String getName() {
		return name;
	}
	public String getTag() {
		return tag;
	}
	public void setType(TagType type) {
		this.type = type;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		if (type == TagType.ADD) {
			builder.append(ADD_PREFIX);
		} else {
			builder.append(REMOVE_PREFIX);
		}
		builder.append(" " + name + " [" + tag + "]");
		return builder.toString();
	}
}
