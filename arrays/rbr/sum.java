package arrays.rbr;
public class sum {
    public static void main(String aa[]){

        s(3);

    }
    public static void s(int input_from_question){
        int arr[]=new int [input_from_question];
        for(int i=0;i<input_from_question;i++){
            arr[i]=2;

        }

        int sum=0;
         int count=0;
         int k=0;
        for(int i=0;i<input_from_question-1;i+=2){
            
            k+=arr[i]+arr[i+1];
            count++;
            System.out.println(count+"v");

            if(k==8){
                sum=sum+k;
                k=0;
                count++;
                System.out.println(count+"ifs");
            }
        }
            
        

          if(k<sum){
            count++;
           }
           System.out.println(count);
      

    
}
}
