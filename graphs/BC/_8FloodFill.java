package graphs.BC;

import java.util.*;

public class _8FloodFill {

    static int dx[] = { -1, 0, 1, 0 };
    static int dy[] = { 0, -1, 0, 1 };

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char[][] input = new char[15][30];
        for (int i = 0; i < input.length; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < input[0].length; j++) {
                input[i][j] = str.charAt(j);

            }
        }   

        print(input);
        floodfill(input,8,13,'.','*');

       
        print(input);

        floodfill(input,0,1,'.',')');
       
        print(input);

         

         
    }

    public static void floodfill(char[][] input, int i, int j, char ch, char color) {
        // base case
        if (i < 0 || j < 0 || i >= input.length || j >= input[0].length) {
            return;
        }

        // pic boundary conditions

        if (input[i][j] != ch) {
            return;
        }
        input[i][j] = color;
        print(input);
        

        for (int k = 0; k < 4; k++) {
            floodfill(input, i + dx[k], j + dy[k], ch, color);
        }

    }


    public static void print(char[][]input){

        for(int i=0;i<input.length;i++){
            for(int j=0;j<input[0].length;j++){
                System.out.print(input[i][j]);
            }
            System.out.println();
        }

        System.out.println();


    }

}

/*
..............................
.............#####............
.............#...#............
.....#########...#######......
....###................###....
...##....................##...
..##......................#...
..##.....................##...
..###...................##....
....###................###....
......###.............###.....
........###.........###.......
..........###########.........
..............................
............A.P.P.L.E.........

*/
