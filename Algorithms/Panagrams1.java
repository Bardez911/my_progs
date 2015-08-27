package test1;

import java.util.Scanner;

public class Panagrams1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st;
		int count=26;
		int[] arr=new int[26];
		for(int i=0;i<26;i++)
		{
			arr[i]=1;
		}
		Scanner sc=new Scanner(System.in);
		st=sc.nextLine();
		st=st.replaceAll(" ", "");
		st=st.toLowerCase();
		int n=st.length();
		for(int i=0;i<n;i++)
		{
			if(count!=0)
			{
			char c=st.charAt(i);
			int c1=c-97;
			if(arr[c1]!=0)
			{
				arr[c1]=0;
				count--;}
			
			}
		}
		if(count==0)
		{
			System.out.println("panagram");
		}
		else System.out.println("not panagram");
	}
}
