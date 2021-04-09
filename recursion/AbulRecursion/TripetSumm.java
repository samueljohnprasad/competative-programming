  package recursion.AbulRecursion;

 

 // A Simple Java program to count triplets with sum smaller 
// than a given value 

import java.util.Arrays; 



class Test 
{ 

    public static void main(String[] args) 
	{ 
        int sum = 4; 
         int arr[] = new int[]{1,3, 2, 5, 9}; 
		System.out.println(countTriplets(arr,arr.length, sum)); 
	} 
	
	
	static int countTriplets(int [] arr,int n, int sum) 
	{  
        Arrays.sort(arr);
		int ans = 0; 
		for (int i = 0; i < n - 2; i++) 
		{ 
			int j = i + 1, k = n - 1;
			while (j < k) 
			{  
                //1 2 3 5 9
                System.out.println(Math.abs(arr[i]-arr[j])+" "+Math.abs(arr[i]-arr[k])+" "+Math.abs(arr[j]-arr[k]));
				if (Math.abs(arr[i]-arr[j]) > sum || Math.abs(arr[i]-arr[k])>sum || Math.abs(arr[j]-arr[k])>sum) {
                    System.out.println(arr[k]);
                    k--; 
                   
                }else
				{ 
                    //System.out.println(ans+"ans "+j+"j "+k+"k ");
					ans += (k - j); 
					j++; 
				} 
			} 
		} 
		return ans; 
	}

} 

// import java.util.Arrays;

// class TripetSumm {

//     public static void main(String aa[]){
//        int [] arr={2,7,4,0,9,5,1,3};
//        int sum=6;
//        triplets(arr,sum);
//     }

//     public static void triplets(int arr[],int sum){
//         Arrays.sort(arr);
//           int count=0;
//         for(int i=0;i<=arr.length-3;i++){
//             int k=sum-arr[i];

//             int low=i+1;
//             int high =arr.length-1;

//             while(low <high){
//                 if(arr[low]+arr[high]<k){
//                     low++;
//                 }

//                 else if(arr[low]+arr[high]>k){
//                     high--;
//                 }else{
//                     // System.out.println("(" + arr[i] + ", " + arr[low] + ", " +
//                     //                     arr[high] + ")");

//                     count++;
//                         low++;
//                         high--;

//                 }
//             }
//         }
//         System.out.println(count);

        
//     }
    
    
// }
