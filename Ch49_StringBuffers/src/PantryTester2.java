class PantryTester2 {
	public static void main(String[] args) {
		Jam goose = new Jam("Gooseberry", "7/4/86", 12);
		Jam apple = new Jam("Crab Apple", "9/30/99", 8);

		Pantry hubbard = new Pantry(goose, apple);
		hubbard.print();

		if (hubbard.select(1))
			hubbard.spread(2);
		else
			System.out.println("Selection not available");
		hubbard.print();

		if (hubbard.select(3))
			hubbard.spread(2);
		else
			System.out.println("Selection not available");
		hubbard.print();

	}
}