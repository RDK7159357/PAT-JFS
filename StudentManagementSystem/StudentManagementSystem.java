package StudentManagementSystem;

import java.util.Vector;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private String rollNumber;

    public Student(String name, int age, String rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Roll Number: " + rollNumber;
    }
}

public class StudentManagementSystem {
    private static Vector<Student> studentVector = new Vector<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            
            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    removeStudent(scanner);
                    break;
                case 3:
                    searchStudent(scanner);
                    break;
                case 4:
                    displayStudents();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addStudent(Scanner scanner) {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter student roll number: ");
        String rollNumber = scanner.nextLine();

        Student student = new Student(name, age, rollNumber);
        studentVector.add(student);
        System.out.println("Student added successfully.");
    }

    private static void removeStudent(Scanner scanner) {
        System.out.print("Enter the roll number of the student to remove: ");
        String rollNumber = scanner.nextLine();
        
        for (Student student : studentVector) {
            if (student != null && student.toString().contains(rollNumber)) {
                studentVector.remove(student);
                System.out.println("Student removed successfully.");
                return;
            }
        }
        
        System.out.println("Student not found with the provided roll number.");
    }

    private static void searchStudent(Scanner scanner) {
        System.out.print("Enter the roll number to search for: ");
        String rollNumber = scanner.nextLine();
        
        for (Student student : studentVector) {
            if (student != null && student.toString().contains(rollNumber)) {
                System.out.println("Student found: " + student);
                return;
            }
        }
        
        System.out.println("Student not found with the provided roll number.");
    }

    private static void displayStudents() {
        System.out.println("\nList of Students:");
        /*for (Student student : studentVector) {
            if (student != null) {
                System.out.println(student);
            }
        }*/
    studentVector.stream().forEach(student -> System.out.println(student));
    studentVector.stream().forEach(student ->  {
                                int index=studentVector.indexOf(student);
                                System.out.println(index+". "+student);
                              });
    }
}
