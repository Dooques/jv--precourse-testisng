package test.TestObjects;

public class PersonCity {
    public String name;
    public boolean isDentist;
    public String city;

    public PersonCity(String var1, String var2, boolean var3) {
        this.name = var1;
        this.city = var2;
        this.isDentist = var3;
    }

    public String toString() {
        return "test.TestObjects.Person[name=" + this.name + ", isDentist=" + this.isDentist + ", city=" + this.city + "]";
    }
}