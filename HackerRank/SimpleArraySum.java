package HackerRank;

import java.util.*;


public class SimpleArraySum{
    
public static int arraySum(ArrayList<Integer> array){
    
 int sum=0;
 ///computing sum
 for(int value:array){
     sum+=value;
     
 }
    return sum;
    
}
    
	public static void main(String[] args) {
		Random random=new Random();
	
     ArrayList<Integer> arr=new ArrayList<>();
	
	  //filling up the list with random values
	  while(arr.size()<5){
	     arr.add(random.nextInt(0,30));
	  }
	  System.out.println("List:"+arr);
	  System.out.println("Sum:"+arraySum(arr));
		
	
	}
}