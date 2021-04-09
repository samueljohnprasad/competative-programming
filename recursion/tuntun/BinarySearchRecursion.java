package recursion.tuntun;

public class BinarySearchRecursion {
    public static void main(String aa[]){
        int [] arr={1,2,3,4,5,7,10,20};

       System.out.println( Bs(arr,8,0,arr.length-1));

    }

    public static boolean Bs(int []arr,int num,int min,int max){
        
        
       if(min<=max){

       
        int middle=(min+max)/2;

        if(arr[middle]==num){
            return true;
        }
        else if (arr[middle]>num){
 
            return Bs(arr,num,min,middle-1);
          
        }else  {
            return Bs(arr,num,middle+1,max);
        }

    }
    return false;

        


    }
    
}
