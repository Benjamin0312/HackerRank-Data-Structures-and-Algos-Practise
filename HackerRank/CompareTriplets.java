package HackerRank;

/*  Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.

The rating for Alice's challenge is the triplet a = (a[0], a[1], a[2]), and the rating for Bob's challenge is the triplet b = (b[0], b[1], b[2]).

The task is to calculate their comparison points by comparing each category:
If a[i] > b[i], then Alice is awarded 1 point.
If a[i] < b[i], then Bob is awarded 1 point.
If a[i] = b[i], then neither person receives a point. {
   */ 
import java.util.*;

public class CompareTriplets{

  public static List<Integer> compareScores(List<Integer> a,List<Integer> b){
     
     int alice=0;
     int bob=0;
     
     ArrayList<Integer> scores=new ArrayList<>(); 
     
      for(int i=0;i<3;i++){
    
        if(a.get(i)>b.get(i)){
             alice++;
           }
         else if(a.get(i)<b.get(i)){
           bob++;
        }
    
        }
        
      scores.add(alice);
      scores.add(bob);
 
     
     return scores; 
  }

   public static void main(String[] args){
     Random random=new Random();
     
     ArrayList<Integer> a=new ArrayList<>();
     
     ArrayList<Integer> b=new ArrayList<>();
     
      while(a.size()!=3 || b.size()!=3){
          a.add(random.nextInt(0,9));
          b.add(random.nextInt(0,9));
          
      }
     
     
     System.out.println("Alice: "+a);
     System.out.println("Bob: "+b);
     
     System.out.println("Alice, Bob: "+compareScores(a,b));
    

   }
    
}


