class Jam {
	// Instance Variables
	String contents; // type of fruit in the jar
	String date; // date of canning
	int capacity; // amount of jam in the jar

	// Constructors
	Jam(String contents, String date, int size) {
		this.contents = contents;
		this.date = date;
		capacity = size;
	}

	// Methods
	public boolean empty() {
		return (capacity == 0);
	}

	public void print() {
		System.out.println(contents + "   " + date + "   " + capacity
				+ " fl. oz.");
	}

	public void spread(int fluidOz) {
		if (!empty()) {
			if (fluidOz <= capacity) {
				System.out.println("Spreading " + fluidOz + " fluid ounces of "
						+ contents);
				capacity = capacity - fluidOz;
			} else {
				System.out.println("Spreading " + capacity
						+ " fluid ounces of " + contents);
				capacity = 0;
			}
		} else
			System.out.println("No jam in the Jar!");
	}

}