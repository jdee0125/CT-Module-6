package pack;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList of Student objects
        ArrayList<Student> students = new ArrayList<>();

        // Add 10 student objects to the ArrayList
        students.add(new Student(101, "Eleanor", "210 Oakwood Ave"));
        students.add(new Student(102, "Oliver", "542 Pine Lane"));
        students.add(new Student(103, "Charlotte", "689 Cedar Blvd"));
        students.add(new Student(104, "Vincent", "203 Elm Court"));
        students.add(new Student(105, "Sophia", "307 Birch Street"));
        students.add(new Student(106, "Isaac", "415 Walnut Way"));
        students.add(new Student(107, "Aria", "505 Spruce Lane"));
        students.add(new Student(108, "Maxwell", "612 Maple Court"));
        students.add(new Student(109, "Zara", "707 Fir Lane"));
        students.add(new Student(110, "Nathan", "811 Pineview Road"));

        // Print unsorted list
        System.out.println("Unsorted List:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort by name using NameComparator
        SelectionSort.selectionSort(students, new NameComparator());

        // Print sorted list by name
        System.out.println("\nSorted List by Name:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort by roll number using RollNumberComparator
        SelectionSort.selectionSort(students, new RollNumberComparator());

        // Print sorted list by roll number
        System.out.println("\nSorted List by Roll Number:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

