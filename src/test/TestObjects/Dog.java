package test.TestObjects;

public class Dog {
    public String name;
    public String breed;
    public String owner;

    public Dog(String name, String breed, String owner){
        this.name = name;
        this.breed = breed;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "test.TestObjects.Dog[name=" + name + ", breed=" + breed + ", owner=" + owner + "]";
    }
}
