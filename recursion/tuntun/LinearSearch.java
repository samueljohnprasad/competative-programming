package recursion.tuntun;

public class LinearSearch {
    static int x=-1;
    static int i=-1;
    static int j=-1;
    static int k=-1;
    static int[] output=new int[100];
    public static void main(String aa[]){
        int[] arr={1,7,7,3,7,8,7,5,0};
        int key=7;

       System.out.println("last "+LastOccurence(arr,key,arr.length-1));
       System.out.println("first "+firstOccurence(arr,key,arr.length-1));
       System.out.println("first "+fOccurence(arr,key,arr.length-1));
       System.out.print("all occurences of "+key+" => ");   allOccurence(arr,key,arr.length-1);
       System.out.println();
       System.out.println("length of occurence array "+storeOccurence(arr,key,arr.length-1,output,0));
       for (int i : output) { 
           if(i!='\0')
           System.out.print(i+",");
       }
      


    }

    public static int LastOccurence(int[] arr,int key,int size){

        if(key==arr[size])
           return size;  

         if(size==0)
          return -1;

         return LastOccurence(arr,key,size-1);

    }
    //moving from last index and upding the static variable(index) util reaches last 0th index
    // and returning static variable
    public static int firstOccurence(int[] arr,int key,int size){

        if(key==arr[size])
           x=size;  

         if(size==0)
          return x;

         return firstOccurence(arr,key,size-1);

    }

    //moving from 0th index using static variable
    public static int fOccurence(int[] arr,int key,int size){
            
            i++;
        if(key==arr[i])
           return i;  

          if(i==size)
          return -1;
          return fOccurence(arr,key,size);

    }

    public static void allOccurence(int[] arr,int key,int size){
            
        j++;
    if(key==arr[j])
       System.out.print(j+",");  

      if(j==size)
      return;

     allOccurence(arr,key,size);

}

public static int storeOccurence(int [] arr,int key,int size,int[] output,int index){

    if(k==size)
    return index;
    k++;

    if(arr[k]==key){
    output[index]=k;
    return storeOccurence(arr, key, size, output, index+1);
    }
    return  storeOccurence(arr, key, size, output, index);


   

}
    
}
