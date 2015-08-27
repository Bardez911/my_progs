package test1;

import java.util.Scanner;

public class Funny_str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<a;i++)
		{
			
		String st=new String();
		st=sc.nextLine();
		int n=st.length();
		int fl=0;
		StringBuffer st1=new StringBuffer(st);
		StringBuffer st2=new StringBuffer(st);
		st2=st2.reverse();
		System.out.println("st2 is:"+st2);
		System.out.println("st1 is:"+st1);
			for(int j=0;j<n-1;j++)
			{
				//for st1
				char c=st1.charAt(j);
				System.out.println("c is:"+c);
				char d=st1.charAt(j+1);
				System.out.println("d is:"+d);
				int x=Math.abs((int)c-d);
				System.out.println("x is:"+x);
				
				char e=st2.charAt(j);
				System.out.println("e is:"+e);
				char f=st2.charAt(j+1);
				System.out.println("f is:"+f);
				int y=Math.abs(e-f);
				System.out.println("y is:"+y);
				
				if(x!=y){fl=1;}
			}
		
			if(fl==0)
			{
				System.out.println("Funny");
			}
			else System.out.println("Not Funny");
		
		}
	}

}
