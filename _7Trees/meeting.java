package _7Trees;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class meeting {
    public static void main(String args[]){

        int [] s={0,1,3,5,5,8};
        int [] f={6,2,4,7,9,9};
        // Arrays.sort(s);
        // Arrays.sort(f);

        met(s,f);



    }

    public static void met(int s[],int f[]){
         
        // Map<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<s.length;i++){

        //     map.put(s[i],f[i]);
        // }
        //    int min=map.get(s[0]);
         
        
        System.out.println(0);    
        int min=f[0];
        for(int i=1;i<s.length;i++){
             
            if( s[i]>min ){
                min=f[i];
                System.out.println(i+" ");
            }
        }

    }
}
