package hocjava;

public class Student {
    public  int age;
    public String name;
    public  float height;

    public  static  String universityName = "Hieu dep trai vl";
    public static  int total = 0;

    public  Student(String name, int age , float height) {
        this.name = name;
        this.age = age;
        this.height = height;
        total +=1;
    }
}
