package graphs;

import java.util.*;
class Main {
    public static void main(String ar[]) {
    //int arr[] = { 1, 2, 5, 3, 6, 2, 0, 1, 7, 0, 6, 0 };
        int arr[] = { 0, 0, 0, 0,0, 0, 0, 0, 1, 1, 1 };

        swapZeros(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
  public static int[] swapZeros(int arr[]) {
        int j = arr.length - 1;
        int count=0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j--;

            }else if(arr[i]==0){
                count++;
            }

        }
        for(int i=0;i<count;i++){
            arr[i]=0;
        }



        return arr;
    }

}
