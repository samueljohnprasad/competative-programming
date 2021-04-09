package recursion;

public class FindSumNum {
    public static void main(String args[]){
        int aa[]={2,3,4,53};
        System.out.println(sumNum(aa,aa.length-1));
    }

        public static int sumNum(int []aa,int size){
        if(size==-1)
         return 0;
         
         return aa[size]+sumNum(aa,size-1);
        }

    
}

// public static void main(String args[]){
//     int aa[]={2,3,4,53};
//     System.out.println(sumNum(aa,0,aa.length));
// }

//     public static int sumNum(int []aa,int a,int size){
//     if(a==size)
//      return 0;
     
//      return aa[a]+sumNum(aa,a+1,size);

//      
//     }

