package ie.tudublin;

public class Cat extends Animal{
    public void speak()
    {
        System.out.println("Meow " + name);
    }

    public Cat(String name)
    {
        setName(name);
    }
}
