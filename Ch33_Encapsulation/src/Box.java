class Box {
	// Instance Variables
	private double length;
	private double width;
	private double height;

	// Constructors
	Box(double width, double height, double length) {
		this.width = width;
		this.height = height;
		this.length = length;
	}

	Box(double side) {
		width = side;
		height = side;
		length = side;
	}

	Box(Box oldBox) {
		this.width = oldBox.width;
		this.height = oldBox.height;
		this.length = oldBox.length;
	}

	// Methods
	double volume() {
		return width * height * length;
	}

	double area() {
		return 2 * (width * height + width * length + height * length);
	}

	public double width() {
		return width;
	}

	public double height() {
		return height;
	}

	public double length() {
		return length;
	}

	public Box biggerBox(Box oldBox) {
		return new Box(1.25 * oldBox.width, 1.25 * oldBox.height,
				1.25 * oldBox.length);
	}

	public boolean nests(Box outsideBox) {
		return this.width <= outsideBox.width
				&& this.height <= outsideBox.height
				&& this.length <= outsideBox.length;
	}
}
