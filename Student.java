package pack;

//Student class representing a student object
public class Student {
 private int rollNumber;
 private String name;
 private String address;

 // Constructor
 public Student(int rollNumber, String name, String address) {
     this.name = name;
     this.address = address;
     this.rollNumber = rollNumber;
 }

 // Getters
 public String getName() {
     return name;
 }

 public String getAddress() {
     return address;
 }
 
 public int getrollNumber() {
     return rollNumber;
 }
 
 @Override
 public String toString() {
     return "Student Roll Number: " + rollNumber + ", Name: " + name + ", Address: " + address;
 }
}

