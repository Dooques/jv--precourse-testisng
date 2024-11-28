package test.TestObjects;

public class FrenchStudent {
    public String prénom;
    public int age;
    public String location;

    public FrenchStudent(String prénom, int age, String location){
        this.prénom = prénom;
        this.age = age;
        this.location = location;
    }

    @Override
    public String toString() {
        return "test.TestObjects.FrenchStudent[prénom=" + prénom + ", age=" + age + ", location=" + location + "]";
    }
}
