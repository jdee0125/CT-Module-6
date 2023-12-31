package pack;

import java.util.ArrayList;
import java.util.Comparator;

//SelectionSort class for sorting an ArrayList using selection sort
public class SelectionSort {
 public static <T> void selectionSort(ArrayList<T> arr, Comparator<T> comparator) {
     int n = arr.size();
     for (int i = 0; i < n - 1; i++) {
         int minIndex = i;
         for (int j = i + 1; j < n; j++) {
             if (comparator.compare(arr.get(j), arr.get(minIndex)) < 0) {
                 minIndex = j;
             }
         }
         if (minIndex != i) {
             swap(arr, i, minIndex);
         }
     }
 }

 private static <T> void swap(ArrayList<T> arr, int i, int j) {
     T temp = arr.get(i);
     arr.set(i, arr.get(j));
     arr.set(j, temp);
 }
}


