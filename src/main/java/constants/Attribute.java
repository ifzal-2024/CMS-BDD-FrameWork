package constants;

public enum Attribute {
	// We will write below constant before creating all below methods
	// MAX_LENGTH is a Constant, Inside the parentheses, it represents the actual
	// attribute

	MAX_LENGTH("maxlength"), 
	INNER_HTML("innerHTML");

	String attribute;

	// parameterized Constructor
	// Constructor inside Enum are always private type
	private Attribute(String attribute) {
		this.attribute = attribute;
	}

	// Create getter method by variable, no need of setter
	// why getter method here?
	// When Enum call the Constant Key, actually it call the getter method ---
	// Important Information
	// https://issac88.medium.com/java-enum-fields-methods-constructors-3a19256f58b
	public String getTheAttribute() {
		return attribute;
	}

	// override from Object class
	// as Enum inherited from object class too, it can override method of Object
	// class
	// but we are not using it. WE WILL JUST USE THE getAttribute METHOD.
	@Override
	public String toString() {
		return attribute;
	}

}
