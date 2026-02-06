import java.util.Scanner;

class Student {
    String name;
    int roll_no;
    Student(String name, int roll_no){
        this.name = name;
        this.roll_no = roll_no;
    }

    void getstudent(){
        System.out.println("Name: "+name+" Roll: "+roll_no);
    }
}

public class StudentClass {
    public static void main(String[] args) {        
       Scanner sc = new Scanner(System.in);
       String name1 = sc.nextLine();
       int num1 =  sc.nextInt();
       sc.nextLine();
       Student s1 = new Student(name1,num1);
       String name2 = sc.nextLine();
       int num2 =  sc.nextInt();
       Student s2 = new Student(name2,num2);
       s1.getstudent();
       s2.getstudent();
    }
}
