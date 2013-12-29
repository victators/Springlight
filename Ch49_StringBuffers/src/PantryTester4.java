class PantryTester4 {
	public static void main(String[] args) {
		Jam goose = new Jam("Gooseberry", "7/4/86", 4);
		Jam apple = new Jam("Crab Apple", "9/30/99", 1);
		Jam rhub = new Jam("Rhubarb", "10/31/99", 2);

		Pantry hubbard = new Pantry(goose, apple, rhub);
		hubbard.print();

		hubbard.select(1);
		hubbard.spread(2);
		hubbard.print();
		hubbard.mixedFruit();
		hubbard.print();

	}
}
