package pack;

import java.util.Comparator;

//Comparator class to compare students by name
public class NameComparator implements Comparator<Student> {
 @Override
 public int compare(Student s1, Student s2) {
     return s1.getName().compareTo(s2.getName());
 }
}

