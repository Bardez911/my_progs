package test1;

import java.util.Scanner;

public class Angry_prof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,i,j;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		//System.out.println("n is: "+n);
		String [] arr=new String[n];
		for( i=0;i<n;i++)
		{
		//	System.out.println("i is: "+i);
			int m,k,fl=0;
			m=sc.nextInt();
		//	System.out.println("m is: "+m);
			k=sc.nextInt();
			//System.out.println("k is: "+k);
			for(j=0;j<m;j++)
			{
				int t=sc.nextInt();
				if(t<=0)
				{
					fl++;
				}
			}
			if(fl<k)
			{
				arr[i]="YES";
				//System.out.println("NO");
			}
			else arr[i]="NO"; 
				//System.out.println("YES");	
		}
		for( i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}	
	}
}