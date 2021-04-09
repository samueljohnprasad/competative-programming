package recursion.tuntun;

public class CrossInversion {
    public static void main(String aa[]){
        int [] arr={5,3,6,1,4,5,6,4,6,7,7,4,6,7,4,6,7,7,6,7,7,7,4,5,3,7,7,5};
       System.out.println( crossInversion(arr, 0, arr.length-1));
        // for (int i : arr) {
        //     System.out.print(i+",");
            
        // }

    }

    public static int crossInversion(int [] arr,int start,int end){

        if(start>=end)
        return 0;

        int mid=(start+end)/2;

       int x= crossInversion(arr,start,mid );
       int y= crossInversion(arr, mid+1, end);
       int z= merge(arr,start,end);

        return x+y+z;
    }

    public static int merge(int arr[],int start ,int end){
        int i=start;
        int mid=(start+end)/2;
        int j=mid+1;
        int k=start;
        int [] temp= new int[arr.length];
        int count=0;

        while(i<=mid && j<=end){
            if(arr[i] <arr[j]){

                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
                count+=mid-i+1;
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];

        }
        while(j<=end){
            temp[k++]=arr[j++];

        }

       for(int p=start;p<=end;p++){
           arr[p]=temp[p];
       }

       return count;
    }
    
}
