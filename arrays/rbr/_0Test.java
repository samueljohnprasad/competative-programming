package arrays.rbr;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here

					  Scanner sc=new Scanner(System.in);
					  int n=sc.nextInt();

					  int arr[]=new int[n];

					  for(int k=0;k<arr.length;k++){
						  arr[k]=sc.nextInt();
					  }

					  
						 Arrays.sort(arr);
						// int [] temp;
						for(int i=arr.length/2;i>=0;i--){
							int temp=arr[arr.length-1-i];
							arr[arr.length-1-i]= arr[i];
							arr[i]=temp;
						}
					
					  

						
					  long sum=0;
					  for(int i=0;i<arr.length-1;i++){
						  sum+=arr[i];
						  // System.out.println(arr[i]);
					
					  }

					  System.out.println(sum);


	}
}