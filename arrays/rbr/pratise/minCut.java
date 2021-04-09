package arrays.rbr.pratise;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args)throws IOException{
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
		String v[]=rd.readLine().split(" ");
		int n=Integer.parseInt(v[0]);
		int x=Integer.parseInt(v[1]);
		String y[]=rd.readLine().split(" ");
		int a[]=new int[n];
		int maxheight=0;
		for(int i=0;i<n;i++){
			a[i]=Integer.parseInt(y[i]);
			if(a[i]>maxheight)
			maxheight=a[i];
		}

        System.out.println(maxheight+" maxH A");
		
		int start=0,end=maxheight,l=0;
		while(start<=end){
            System.out.println(start+"start "+end+"end B ");
			int mid=(start+end)/2;
            System.out.println(mid+"mid C ");
			int s=0;
           
			for(int i=0;i<n;i++){
                System.out.println(mid+"mid "+a[i]+"arri D");
				if(mid>a[i]){
               
				continue;
                }
				s+=a[i]-mid;
                System.out.println(s+"s E ");
			}
            //6 3
            //4 2 3 6 5 1
			if(s>x){
            System.out.println(s+"s F "+mid);
			start=mid+1;
            }
			else{
			l=mid;
            System.out.println(mid+"mid G");
			end=mid-1;}
		}
		System.out.print(l);
	}
}