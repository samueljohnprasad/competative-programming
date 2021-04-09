package arrays.rbr;
public class _9MaxContigiousSubArray {
 // for 3 elements
    public static void main(String aa[]){
 
        int arr[] = {15,9,4,17,18,12,6,26,27,16,1,12,14,21,35,38};
        subArrayMax(arr, 4);

    //     DoublyList d=new DoublyList();
    //     d.addFirst(1);
    //     d.addLast(2);
    //     d.addLast(3);
    //   //  System.out.println(d.peekFirst() +" "+d.peekLast());

    //  //   System.out.println(d.isListEmpty());
    //  d.removeFirst();
    //  d.removelast();
    //     d.printList();

    }

    public static void subArrayMax(int arr[],int k){
         int c=0;
        int n=arr.length;
        DoublyList d=new DoublyList();
        

        d.addFirst(0);
        for(int i=1;i<k;i++){
            while(!d.isListEmpty() && arr[i]>=arr[d.peekLast()]){
                d.removelast();
            }
            d.addLast(i);

            
            }

            for(int i=k;i<n;i++){
                System.out.println(arr[d.peekFirst()]);
                if(d.peekFirst()==(i-k)){
                    d.removeFirst();
                }

                while(!d.isListEmpty() && arr[i]>=arr[d.peekLast()]){
                    d.removelast();
                    
                }
                d.addLast(i);
            }

            System.out.print(arr[d.peekFirst()]);
        
                


        
        }






    
    
    
}


class DoublyList{

    Node head;
    Node tail;

    public boolean isListEmpty(){
        if(head==null) return true;
        else return false;

    }

    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;

        }else{
            newNode.right=head;
            head.left= newNode;
            head=newNode;

        }
    }

    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.x+" ");
            temp=temp.right;
        }
    }

    public void addLast(int data){
          Node newNode= new Node(data);
          if(head==null){
              head=tail=newNode;
          }else{
              tail.right=newNode;
              newNode.left=tail;
              tail=newNode;
            }
    }

    public int  removeFirst(){
        int firstData=head.x;
        if(head==tail){
            head=tail=null;
        }else{
            head=head.right;
            head.left=null;
        }
        return firstData;
    }

    public int removelast(){
        int lastData=tail.x;

        if(head==tail){
            head=tail=null;
        }else{
            tail=tail.left;
            tail.right=null;

        }
        return lastData;
    }

    public int peekFirst(){
        return (head.x);
    }

    public int peekLast(){
        return (tail.x);
    }

}

class Node{
    int x;
     Node right;
     Node left;
     Node(int x){
         this.x=x;
     }
}
