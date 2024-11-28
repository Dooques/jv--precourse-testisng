package test.TestObjects;

public class Person {
    public String name;
    public boolean isDentist;

    public Person(String name, boolean isDentist) {
        this.name = name;
        this.isDentist = isDentist;
    }

    @Override
    public String toString() {
            return "test.TestObjects.Person[name=" + name + ", isDentist=" + isDentist + "]";
        }
}