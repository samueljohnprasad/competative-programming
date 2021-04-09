package _7Trees.sums; 
import java.util.Arrays;

public class demo {

    public static void main(String args[]){

        int[][] array= {
            {1, 5,3},
            {13, 1,5},
            {12, 100,4},
            {12, 85,7} 
        };
        Arrays.sort(array, (a, b) -> Integer.compare(a[1], b[1]));


        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                System.out.print(array[i][j]+" ");

            }
            System.out.println();
            
        }

    }

}
