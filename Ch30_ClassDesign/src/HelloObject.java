class HelloObject {
	String greeting;

	HelloObject(String greeting) {
		this.greeting = greeting;
	}

	HelloObject (HelloObject init)
	{
		String g = new String(init.greeting);
		this.greeting = g;
	}
	
	void speak() {
		System.out.println(greeting);
	}
}