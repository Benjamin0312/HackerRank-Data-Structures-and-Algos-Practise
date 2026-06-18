package HackerRank;
import java.util.*;

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
