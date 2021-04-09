package arrays.rbr;
public class EqualOneZero {

    public static void main(String args[]){

    }
    public static void oneZero(int arr[]){

        int size=arr.length;
        int [] sumLeft=new int [size];
        for(int index=1;index<size;index++){

            sumLeft[index]=sumLeft[index-1] + ((arr[index]==0)?-1:1);
            


        }

    }
    
}
