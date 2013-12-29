class PhoneBook {
	PhoneEntry[] phoneBook;

	PhoneBook() // constructor
	{
		phoneBook = new PhoneEntry[7];
		phoneBook[0] = new PhoneEntry("James","Barclay", "(418)665-1223");
		phoneBook[1] = new PhoneEntry("Grace", "Dunbar", "(860)399-3044");
		phoneBook[2] = new PhoneEntry("Paul", "Kratides", "(815)439-9271");
		phoneBook[3] = new PhoneEntry("Violet", "Smith", "(312)223-1937");
		phoneBook[4] = new PhoneEntry("John", "Wood", "(913)883-2874");
		phoneBook[5] = new PhoneEntry("John", "Smith", "(812) 339-4916");
		phoneBook[6] = new PhoneEntry("Willoughby", "Smith", "(312) 992-8761");
	}
	
	int getLength()
	{
		return phoneBook.length;
	}

	PhoneEntry search(String firstName, String lastName) {
		for (int j = 0; j < phoneBook.length; j++) {
			if (phoneBook[j].lastName.toUpperCase().equals(lastName.toUpperCase()))
				return phoneBook[j];
		}
		return null;
	}
	
	void search(String targetLast)
	{
		for (int j = 0; j < phoneBook.length; j++) {
			if (phoneBook[j].lastName.toUpperCase().equals(targetLast.toUpperCase()))
				System.out.println(phoneBook[j].firstName + " " + phoneBook[j].lastName + " " + phoneBook[j].phone);
		}
	}
}
