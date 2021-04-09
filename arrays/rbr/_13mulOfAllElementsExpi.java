package arrays.rbr;
public class _13mulOfAllElementsExpi {

    public static void main(String aa[]){

        int arr[]={0,3,4,5,6};
        productAllElements(arr);


    }

    public static void productAllElements(int arr[]){

        int temp=1;
        int product[]=new int[arr.length];
        int index;
        int size=arr.length;

        for(index=0;index<size;index++){

            product[index]=temp;
            temp*=arr[index];
        }

        temp=1;
        for(index=size-1;index>=0;index--){
            product[index]*=temp;
            temp*=arr[index];
        }

        for(index=0;index<size;index++){
            System.out.println(product[index]);
            
        }



    }
    
}


