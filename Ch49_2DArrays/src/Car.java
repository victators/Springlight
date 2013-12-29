class Car {
	// instance variables
	double startMiles; // Stating odometer reading
	double endMiles; // Ending odometer reading
	double gallons; // Gallons of gas used between the readings

	// constructor
	Car(double start) {
		startMiles = start;
	}

	// methods
	double calculateMPG() {
		return (endMiles - startMiles) / gallons;
	}
	
	void fillUp (int miles, double gallons)
	{
		startMiles = endMiles;
		endMiles = miles;
		this.gallons = gallons;
	}
	
	boolean gasHog()
	{
		if(this.calculateMPG() < 15.0)
		{
			return true;
		}
		return false;
	}
	
	boolean economyCar()
	{
		if(this.calculateMPG() > 30.0)
		{
			return true;
		}
		return false;
	}

}
