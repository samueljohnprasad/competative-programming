package _7Trees.sums; 
import java.util.*;

public class amazonna {

    public static void main(String[] args) {
        LinkedList<List<Integer>> forwardList = new LinkedList<List<Integer>>();
      forwardList.add(new ArrayList<Integer>(Arrays.asList(1, 2000)));
      forwardList.add(new ArrayList<Integer>(Arrays.asList(2, 4000)));
      forwardList.add(new ArrayList<Integer>(Arrays.asList(3, 6000)));
      
      LinkedList<List<Integer>> returnList = new LinkedList<List<Integer>>();
      returnList.add(new ArrayList<Integer>(Arrays.asList(1, 2000)));
  
      
      System.out.println(calculateOptimalRoute(7000, forwardList, returnList));
    }
    
    public static List<List<Integer>> calculateOptimalRoute(final int capacity, final List<List<Integer>> forwardList, final List<List<Integer>> returnList)
    {
      System.out.println(forwardList);
      System.out.println(returnList);
      
      // sort forward list
      Collections.sort(forwardList, new Comparator<List<Integer>>() {
        @Override
        public int compare(List<Integer> o1, List<Integer> o2) {
          return o1.get(1) - o2.get(1);  
        }
      });
      
      // sort return list
      Collections.sort(returnList, new Comparator<List<Integer>>() {
        public int compare(List<Integer> o1, List<Integer> o2) {
          return o1.get(1) - o2.get(1);
        }
      });
      
      int max = 0;
      int i = 0;
      int j = returnList.size() - 1;
      
      LinkedList<List<Integer>> result = null;
      while(i < forwardList.size() && j >= 0) {
        if (forwardList.get(i).get(1) + returnList.get(j).get(1) > max && 
            forwardList.get(i).get(1) + returnList.get(j).get(1) <= capacity) {
          max = forwardList.get(i).get(1) + returnList.get(j).get(1);
          result = new LinkedList<List<Integer>>();
          result.add(new ArrayList<Integer>(Arrays.asList(forwardList.get(i).get(0), returnList.get(j).get(0))));
          i++;
        } else if(forwardList.get(i).get(1) + returnList.get(j).get(1) == max) {
          // no need to reset result list
          result.add(new ArrayList<Integer>(Arrays.asList(forwardList.get(i).get(0), returnList.get(j).get(0))));
          i++;
        } else {
          j--;
        }
      }   
    return result;
    }	
  }