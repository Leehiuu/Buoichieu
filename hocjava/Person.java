package hocjava;

public class Person {
    public String name;
    public int age;
    public float height;

    public void eat(String foodName) {
        System.out.println(name + " is eating "+ foodName);
    }

    public int getAge() {
        return age;
    }
}
