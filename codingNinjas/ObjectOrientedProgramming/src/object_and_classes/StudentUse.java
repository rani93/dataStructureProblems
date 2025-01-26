package object_and_classes;

import java.util.Scanner;

public class StudentUse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student s1 = new student();
        s1.name = "Rani";
        System.out.println("-----------"+s1+"-----------");
        System.out.println(s1.name);
        System.out.println(s1.age);

    }
}
