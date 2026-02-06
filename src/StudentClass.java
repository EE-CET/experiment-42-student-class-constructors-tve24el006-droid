import java.util.Scanner;

class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void printDetails() {
        System.out.println("Name: " + name + " Roll: " + rollNo);
    }
}

public class StudentClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name1 = sc.nextLine();
        int rollNo1 = sc.nextInt();
        sc.nextLine();
        
        String name2 = sc.nextLine();
        int rollNo2 = sc.nextInt();

        Student s1 = new Student(name1, rollNo1);
        Student s2 = new Student(name2, rollNo2);

        s1.printDetails();
        s2.printDetails();
    }
}