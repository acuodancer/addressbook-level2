package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.*;

public class Tagging {
	
	private static final String ADD_PREFIX = "+";
	private static final String REMOVE_PREFIX = "-";

	private enum TagType {ADD, REMOVE};
	
	private TagType type;
	private Person person;
	private Tag tag;
	
	public Tagging(boolean isAdd, Person person, Tag tag) {
		if (isAdd) {
			type = TagType.ADD;
		} else {
			type = TagType.REMOVE;
		}
		this.person = person;
		this.tag = tag;
	}
	
	public TagType getType() {
		return type;
	}
	public Person getPerson() {
		return person;
	}
	public Tag getTag() {
		return tag;
	}
	public void setType(TagType type) {
		this.type = type;
	}
	public void setName(Person person) {
		this.person = person;
	}
	public void setTag(Tag tag) {
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
		builder.append(" " + person.getName() + " [" + tag.tagName + "]");
		return builder.toString();
	}
}
