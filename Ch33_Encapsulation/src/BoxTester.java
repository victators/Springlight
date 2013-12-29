class BoxTester {
	public static void main(String[] args) {
		Box box = new Box(2.5, 5.0, 6.0);
		System.out.println("Area: " + box.area() + " volume: " + box.volume());
		System.out.println("length: " + box.length() + " height: "
				+ box.height() + " width:  " + box.width());
		Box bigBox = box.biggerBox(box);
		System.out.println("Area: " + bigBox.area() + " volume: "
				+ bigBox.volume());
		System.out.println(box.nests(bigBox));
	}
}
