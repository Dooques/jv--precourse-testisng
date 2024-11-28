package test.TestObjects;

public class EnglishStudent {

    public String name;
    public int age;
    public String location;

    public EnglishStudent(String name, int age, String location){
        this.name = name;
        this.age = age;
        this.location = location;
    }

    @Override
    public String toString() {
        return "test.TestObjects.EnglishStudent[name=" + name + ", age=" + age + ", location=" + location + "]";
    }
}
