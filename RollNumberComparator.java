package pack;

import java.util.Comparator;

//Comparator class to compare students by roll number
public class RollNumberComparator implements Comparator<Student> {
 @Override
 public int compare(Student s1, Student s2) {
     return Integer.compare(s1.getrollNumber(), s2.getrollNumber());
 }
}

