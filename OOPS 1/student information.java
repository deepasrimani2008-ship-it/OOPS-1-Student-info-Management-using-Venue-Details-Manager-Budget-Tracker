        import java.util.*;
class Student {
    int id;
    String name;
    int age;
    String branch;
    String email;
    long phoneNumber;  
    String address;
    double cgpa;
    Student(int id, String name, int age, String branch, String email, long phoneNumber, String address, double cgpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.branch = branch;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.cgpa = cgpa;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        sc.nextLine(); 

        Student students[] = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of student " + (i + 1));
            System.out.println("id,name,age,branch,email,phoneNumber,address,cgpa");
            String input = sc.nextLine();
            String arr[] = input.split(",");

            int id = Integer.parseInt(arr[0]);
            String name = arr[1];
            int age = Integer.parseInt(arr[2]);
            String branch = arr[3];
            String email = arr[4];
            long phoneNumber = Long.parseLong(arr[5]); 
            String address = arr[6];
            double cgpa = Double.parseDouble(arr[7]);

            students[i] = new Student(id, name, age, branch, email, phoneNumber, address, cgpa);
        }

        System.out.println("Student Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("ID: " + students[i].id);
            System.out.println("Name: " + students[i].name);
            System.out.println("Age: " + students[i].age);
            System.out.println("Branch: " + students[i].branch);
            System.out.println("Email: " + students[i].email);
            System.out.println("Phone Number: " + students[i].phoneNumber);
            System.out.println("Address: " + students[i].address);
            System.out.println("GPA: " + students[i].cgpa);
            
        }
    }
}
