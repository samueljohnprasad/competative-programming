package arrays.rbr;
import java.util.Arrays;
import java.util.Queue;

public class _10FindMaxMultipleOf3 {

    public static void main(String aa[]){

        int arr[] ={3,3,6,1,1,1,2};
        max(arr);

        // que q=new que(5);
        // q.insert(1);
        // q.insert(2);
        // q.insert(3);
        // q.insert(4);
        // q.insert(5);


        // q.remove();
        // q.remove();

        // q.print();
        
        

      


    }

    public static void max(int arr[]){
        Arrays.sort(arr);
        int n=arr.length;
        que q0=new que(arr.length);
        que q1=new que(arr.length);
        que q2=new que(arr.length);

        int sum=0,i;
        for(i=0;i<n;i++){
            sum+=arr[i];
            if((arr[i]%3==0)){
                q0.insert(arr[i]);
            }else if(arr[i]%3==1){
                q1.insert(arr[i]);

            }else{
                q2.insert(arr[i]);
            }

        }
           
        // for(int k=0;k<q1.size();k++){
        //    System.out.print(q1.remove());
        // }
        //q1.print();
        
        

        if((sum%3==1)){
            if(!q1.isEmpty()){
                q1.remove();

            }else{
                if(!q2.isEmpty()){
                    q2.remove();
                }else{
                    return;
                }

                if(!q2.isEmpty()){
                    q2.remove();
                }else{
                    return;
                }

            }
        } else if((sum %3==0)){
            if(!q2.isEmpty()){
                q2.remove();
            }
        }else{
            if(!q1.isEmpty()){
                q1.remove();
            }else{
                return;
            }

            if(!q1.isEmpty()){
                q1.remove();
            }else{
                return;
            }
        }
       // q1.print();
      //  q0.print();



        int [] temp=new int[n];
       maketemp(temp,q0,q1,q2);
    //    for(int k=0;k<temp.length;k++){
    //            System.out.print(temp[k]);
    //     }
        Arrays.sort(temp);
        for(int k=0;k<temp.length/2;k++){
            int c=temp[temp.length-1-k];
            temp[temp.length-1-k]=temp[k];
            temp[k]=c;
        }

        for(int k=0;k<temp.length;k++){
           System.out.print(temp[k]);
        }





       


    }

    public static void maketemp(int [] temp,que a,que b,que c){
        int n=a.size();
         int j=-1;
        for(int i=0;i<n;i++){
            //System.err.println(a.remove());
            temp[++j]=a.remove();
            // System.err.println(temp[j]);
        }
        
         int m=b.size();
        for(int i=0;i<m;i++){
             temp[++j]=b.remove();
           // System.err.println(temp[j]);
        }
        //c.print();
        int p=c.size();
        for(int i=0;i<p;i++){
            temp[++j]=c.remove();
            //System.err.println(temp[j]);
        }
      

    }
    
}

class que{
    int rear=-1;
    int front=0;
    int size;
    int capacity;
    int  queArr[];

     
    que(int capacity){
        this.capacity=capacity;
        this.queArr=new int[capacity];
    }

    
    public void insert(int data){
        if(isFull()){
            return;
        }

        rear=(rear+1)%capacity;
        queArr[rear]=data;
        size++;

    }

    public int  remove(){
        if(isEmpty()){
            return -1;
        }
       int x=queArr[front];
       front =(front+1)%capacity;
       size--;
       
       //queArr[front]=0;
       //front++;
     //  rear++;
     return x;
    }

    public void print(){
        int i=front;
        if(isEmpty()){
            return;
        }

        while(i!=rear){
            System.out.println(queArr[i]+" "+i+" "+size);
            i=(i+1)% capacity;

        }
        System.out.println(queArr[rear]+" "+i);
    }



    public boolean isFull(){
        return (size==capacity);
    }

    public boolean isEmpty(){
        return size==0;
    }

    int size(){
        return size;
    }


}
