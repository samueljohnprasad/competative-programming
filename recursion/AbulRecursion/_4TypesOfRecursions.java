package recursion.AbulRecursion;


public class _4TypesOfRecursions {
    public static void main(String aa[]){
        TailRec(3);
        System.out.println();
        HeadRec(3);
        System.out.println();
        LinearRecursion(3);
        System.out.println();
        TreeRecursion(3);
        System.out.println();
        indirectRecursionA(20);
        System.out.println();
        System.out.println(nestedRecursion(95));



    }

    public static int TailRec(int num){
        //recusrive methodnshould be the last one. all the opearations are perforemed 
        //at the calling time only time and fun will be performing any operations at
        //returning time. return fun(n-1)+n ---> not tail recursion
        if(num>0){
            System.out.print(num+" ");
            return TailRec(num-1);
        }

        return 0;
    }
   

      public static void HeadRec(int num){
          //recursive method should be the first call in the method
        
        if(num >0){
            HeadRec(num-1);
            System.out.print(num+" ");

        }
        
    }

    public static void LinearRecursion(int num){
        if(num >0){
            System.out.print(num+" ");
            LinearRecursion(num-1);
            System.out.print(num+" ");

        }

    }

    public static void TreeRecursion(int num){
        //can be multiple recusive calls
        if(num >0){
            System.out.print(num+" ");
            TreeRecursion(num-1);
            TreeRecursion(num-1);
            

        }

    }

    // A calls B... B calls A.
    public static void indirectRecursionA(int num){
        if(num>0){
            System.out.print(num+" ");
            indirectRecursionB(num-1);

        }
    }
    public static void indirectRecursionB(int num){
        if(num>1){
            System.out.print(num+" ");
            indirectRecursionA(num/2);

        }

    }

    public static int nestedRecursion(int num){
        if(num>100){
            return num-10;
        }
        else{
            return nestedRecursion(nestedRecursion(num+11));
        }
    }
    
}
