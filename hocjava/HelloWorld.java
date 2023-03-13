package hocjava;

public class HelloWorld {
    public static void main(String[] args) {
        Person a = new Person();
        a.name = "Chau";
        a.age = 21;
        a.height = 1.7f;

        a.eat("Rice");
        int age = a.getAge();
        System.out.println("His age:"+age);
    }
}
