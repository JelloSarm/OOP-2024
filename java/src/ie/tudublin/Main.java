
// Packages must match the folder structure
package ie.tudublin;

public class Main
{
	
	public void helloProcessing()
	{
		String[] a = {"MAIN"};
<<<<<<< HEAD
        processing.core.PApplet.runSketch( a, new MyFirstProcessing());
=======
        processing.core.PApplet.runSketch( a, new BugZap());
>>>>>>> b9649c25ecbd0938c12f5f76e9423f26b767138b
    }

	public void doDogStuff()
	{
		// Create a new Dog called Misty
		// Call the constructor
		Dog misty = new Dog("Misty");
		misty.speak();

        Dog lucy = new Dog("Lucy");
		lucy.speak();
	}

	public void doCatStuff()
	{
		// Put your code here
		System.out.println("cats are from space");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Hello world");
		
		
		Main m = new Main();

		m.doDogStuff();

		m.doCatStuff();

		Dog nuala = new Dog("Nuala");
		nuala.speak();

		Cat atuma = new Cat("Atuma");
		atuma.speak();

		Animal larry = new Dog("Larry");
		larry.speak();

<<<<<<< HEAD
=======

>>>>>>> b9649c25ecbd0938c12f5f76e9423f26b767138b
		larry = new Cat("TopCat");
		larry.speak();

		Animal a = new Dog("A");
<<<<<<< HEAD
		Animal p = new Dog("B");
=======
		Animal b = new Dog("B");
>>>>>>> b9649c25ecbd0938c12f5f76e9423f26b767138b
		Animal c = a;
		a.setName("G");

		System.out.println(a.getName());
<<<<<<< HEAD
		System.out.println(c.getName());
=======
		System.out.println("C: " + c.getName());
		

>>>>>>> b9649c25ecbd0938c12f5f76e9423f26b767138b

		m.helloProcessing();
	}
	
}