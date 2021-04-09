package _7Trees.sums; 

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DeliveySongs {
    public static void main(String args[]){
        int arr[]={100,90,160,150};
        int k=280;
        List<Integer> l= songs(arr,k);
        for(int i=0;i<l.size();i++){
            System.out.print(l.get(i)+" ");
        }
    }
    public static List<Integer> songs(int arr[],int k){
                k=k-30;
         List<Integer> list=new LinkedList<>();
         List<Integer> list2=new LinkedList<>();
        Map<Integer,Integer> map=new HashMap<>();
        int max=0;
        int maxOut=0;
        for(int i=0;i<arr.length;i++){
              int temp=k-arr[i];
              if(map.containsKey(temp)){
                  int x=map.get(temp);
                     map.put(arr[i],i);
                     max=Math.max(temp,arr[i]);
                     if(max>maxOut){
                         maxOut=max;
                          list=new LinkedList<>();
                         list.add(temp);
                         list.add(arr[i]);
                     }
                  }else{
                  map.put(arr[i],i);
                }
            }

            if(list.size()!=0){
                list2.add(map.get(list.get(0)));
                list2.add(map.get(list.get(1)));
                return list2;

            }
           list.add(-1);
           list.add(-1);
        return list;

    }
    
}


// package sums;

// import java.util.HashMap;
// import java.util.Map;

// public class DeliveySongs {
//     public static void main(String args[]){
//         int arr[]={1,10,25,35,60};
//         int k=90;
//         songs(arr,k);

//     }

//     public static void songs(int arr[],int k){
//         k=k-30;

//         Map<Integer,Integer> map=new HashMap<>();

//         for(int i=0;i<arr.length;i++){
//               int temp=k-arr[i];
             
//               if(map.containsKey(temp)){

//                      int x=map.get(temp);
//                      System.out.println(x+" "+i);
//                      return;

//               }else{
//                   map.put(arr[i],i);
//                  // System.err.println("A");

//               }

//         }

//     }
    
// }
