
public class Collection {
	private Person[] collection;
	private static int MAX_SIZE = 200;
	private int size;

	public Collection(int max) {
		collection = new Person[max];
		size = 0;
	}

	public Collection() {
		this(MAX_SIZE);
	}

	public Person[] getCollection() {
		return collection;
	}

	public int getSize() {
		return size;
	}

	public void addPerson(String fname, String lname, int age) {
		collection[size++] = new Person(fname, lname, age);
	}

	public int maxAgeLinear() {
		// TODO use a loop
		
		return 0;
	}
	
	public int maxAgeRecursive() {
		// TODO use maxAgeRecursive method
		
		return 0;
	}

	private int maxAgeRecursive(int currentAge, int idx) {
		// Base case

		// Recursive case

		// dummy output
		return 0;
	}

}
