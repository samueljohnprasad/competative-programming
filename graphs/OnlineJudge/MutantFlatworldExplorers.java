package graphs.OnlineJudge;
import java.util.*;
import java.io.*;



 class robot{


    public static void main(String args[]) throws IOException{

          char [][] turn =new char[128][128];  // 128 bz capital letter are within range of 128
          int  []moveX = new int[128];
          int []moveY= new int[128];

          //boundaryMatrix
          boolean matrixMap[][]= new boolean [51][51];

          // to turn directions of the robot
         turn['N']['L']='W';
         turn['S']['L']='E';
         turn['E']['L']='N';
         turn['W']['L']='S';

         turn['N']['R']='E';
         turn['S']['R']='W';
         turn['W']['R']='N';
         turn['E']['R']='S';

         moveY['N']=1;   //(0,0) is at botton left
         moveY['S']=-1;  //y cordinates are north

         moveX['E']=1;
         moveX['W']=-1;



         

       // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       Scanner sc= new Scanner(System.in);
        StringTokenizer st= new StringTokenizer(sc.nextLine());
        int maxX= Integer.parseInt(st.nextToken());   //size of the matrix
        int maxY= Integer.parseInt(st.nextToken());

        String s;
        int t=sc.nextInt();
        sc.nextLine();
       
        while(t-->0){
               
             
              s=sc.nextLine();
           
           
            if(s==null || s.isEmpty()){
               break;
            }

            st=new StringTokenizer(s);

            //postion and face of the robot
            int currX= Integer.parseInt(st.nextToken());
            int currY=Integer.parseInt(st.nextToken());
            char face= st.nextToken().charAt(0);
              String in =sc.nextLine();
            char [] instr= in.toCharArray();
            //System.out.println(in+" fuc");
            boolean lost=false;

            for(int i=0;i<instr.length;i++){

                   if( (instr[i]=='L') || (instr[i]=='R')){
                      face=turn[face][instr[i]];
                   }else if(instr[i]=='F'){

                     // takes a step
                     int newX=currX+moveX[face];
                     int newY=currY+moveY[face];

                     if(newX<0 || newY<0 || newX>maxX|| newY> maxY){
                            //if newX and newY are out of matrix then mark currX n currY as lost area 
                            if(!matrixMap[currX][currY]){
                              matrixMap[currX][currY]=true;
                              lost=true;
                              break;

                            }


                     }else{
                        ///updating the current position
                        currX=newX;
                        currY=newY;
                     }




                   }
            }


            if(lost){
               System.out.println(currX+" "+currY+" "+face+" Lost");
                 }else{
                  System.out.println(currX+" "+currY+" "+face+" out");
                    }

      

         
        }

       
        
       
      }

     
   
 }

 /*
5 3
3
1 1 E
RFRFRFRF
3 2 N
FRRFLLFFRRFLL
0 3 W
LLFFFLFLFL


//ans
1 1 E
3 3 N LOST
2 3 S
*/

// import java.util.Scanner;
 
// public class Main{
 
//     private static char[] instructions;
//     private static int R, C;
//     private static int posC, posR;
//     // N , E, S, W
//     private static int[] dr = { 1, 0, -1, 0 };
//     private static int[] dc = { 0, 1, 0, -1 };
//     private static char[] dirs = { 'N', 'E', 'S', 'W' };
 
//     private static void get() {
//         Scanner scan = new Scanner(System.in);
//         int N = 0, E = 1, S = 2, W = 3;
//         C = scan.nextInt();
//         R = scan.nextInt();
//         char[][] grid = new char[51][51];
//         while (scan.hasNext()) {
//             posC = scan.nextInt();
//             posR = scan.nextInt();
//             char dir = scan.next().charAt(0), last = 0;
//             int dirIndex = N;
//             if (dir == 'S')
//                 dirIndex = S;
//             else if (dir == 'W')
//                 dirIndex = W;
//             else if (dir == 'E')
//                 dirIndex = E;
 
//             instructions = scan.next().toCharArray();
//             boolean lost = false;
//             for (int i = 0; i < instructions.length; i++) {
//                 if (lost)
//                     break;
//                 if (instructions[i] == 'F') {
//                     posC += dc[dirIndex];
//                     posR += dr[dirIndex];
//                     if (posC < 0 || posC > C || posR < 0 || posR > R) {
//                         posC -= dc[dirIndex];
//                         posR -= dr[dirIndex];
//                         lost = grid[R - posR][C - posC] == 0;
//                         grid[R - posR][C - posC] = 1;
//                     }
//                 } else if (instructions[i] == 'L') {
//                     if (dirIndex == 0) {
//                         dirIndex = 3;
//                     } else
//                         dirIndex = (dirIndex - 1) % 4;
//                 } else if (instructions[i] == 'R') {
//                     dirIndex = (dirIndex + 1) % 4;
//                 }
//                 last = dirs[dirIndex];
//             }
//             if (lost) {
//                 System.out.println(posC + " " + posR + " " + last + " LOST");
//             } else {
//                 System.out.println(posC + " " + posR + " " + last);
//             }
//         }
//     }
 
//     public static void main(String[] args) {
//         get();
//     }
 
// }