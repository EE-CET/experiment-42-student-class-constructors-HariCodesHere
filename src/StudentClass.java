import java.util.Scanner;

class Student {
   

    // TODO: Create a parameterized constructor Student(String name, int rollNo)
    
    // TODO: Create a method or use direct access to print details in the required format
    String name;
    int roll_no;
    Student(String name, int roll_no)
    {
        this.name = name;
        this.roll_no = roll_no;
    }

    void getstudent()
    {
        System.out.println("Name: "+name+" Roll: "+roll_no);
        //System.out.println("");
    }
}

public class StudentClass {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            
            // TODO: Read name1
            // TODO: Read rollNo1
            // Hint: Handle the newline consumption if using nextLine() after nextInt()
            
            // TODO: Read name2
            // TODO: Read rollNo2
            
            // TODO: Create two Student objects
            
            // TODO: Print details for both students
            
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
