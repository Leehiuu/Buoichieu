package hocjava;

import java.sql.Struct;

public class Main {
    public static void main(String[] args) {
        Student a = new Student("Hieu",25,1.7f);
        System.out.println("University (from calss): "+ Student.universityName);
        System.out.println("University (from instance): "+ a.universityName);

        System.out.println("Total (from class): "+ Student.total);
        Student b = new Student("Quynh", 24,1.6f);
        System.out.println("Total (from instance): "+ b.total);


    }
}
