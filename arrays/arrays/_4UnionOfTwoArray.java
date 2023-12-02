import java.util.*;

public class _4UnionOfTwoArray {
  

  public static void main(String [] args){
      int[] union=  UnionOfArray(new int[]{1,2,4,3}, new int[]{4,3,5});
      for(int i: union){
        System.out.println(i);
      }
  }
  public static int[] UnionOfArray(int[] a, int[]b){

    Set<Integer> set = new HashSet<>();
        
        int first=0;
        int second=0;
        int n=a.length;
        int m=b.length;
        while(first<n || second<m){
            
            if(first<n){
                set.add(a[first]);
            }
            
             if(second<m){
                set.add(b[second]);
            }  
            first++;
            second++;
        }
      
       
  // set.stream().mapToInt(Integer::intValue).toArray();
  //set.stream().mapToInt(Integer::intValue).toArray();
        return  set.stream().mapToInt(Integer::intValue).toArray();

  }
}


