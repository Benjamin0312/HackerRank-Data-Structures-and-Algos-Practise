package HackerRank;
import java.util.*;

/*
Problem: Counting Sort 1

Given an array of integers where each value is in the range 0 to 99, create a frequency array of size 100. Each index in the frequency array represents a number from 0 to 99, and the value stored at that index represents how many times that number appears in the input array.

For example, if the input array is:

[1, 1, 3, 2, 1]

The output should be:

[0, 3, 1, 1, 0, 0, ..., 0]

because:

* 0 appears 0 times
* 1 appears 3 times
* 2 appears 1 time
* 3 appears 1 time

The task is not to sort the array, but to count the frequency of each value and return the resulting frequency array.

*/

public class CountingSort {

      public static List<Integer> countingSort(List<Integer> arr) {

      List<Integer> count=new ArrayList<>();
      
      for(int i=0;i<100;i++){
        count.add(0);
      }
      
      for(int value:arr){
        count.set(value,count.get(value)+1);
        }
        
        return count;
      }
  
 public static void main(String[] args){

Random random=new Random();
List<Integer> arr=new ArrayList<>();

int n=random.nextInt(0,200);

for(int i=0;i<n;i++){
  arr.add(random.nextInt(0,100));
}

System.out.println(countingSort(arr));
 }


}
