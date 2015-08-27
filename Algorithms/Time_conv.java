package test1;

import java.util.Scanner;

public class Time_conv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st,sw;
		Scanner sc=new Scanner(System.in);
		//01:21:30PM
		st=sc.nextLine();
		sw=st.substring(8,10);
		//System.out.println(sw);
		String a="AM";
		if(sw.compareTo(a)!=0)
		{
			String s1=st.substring(0,2);
			//	System.out.println("s1 is: "+s1);
				int c=Integer.parseInt(s1);
			if(c!=12){c=c+12;}
			System.out.println(c+st.substring(2,8));
		}	
		else {
			String s1=st.substring(0,2);
			//	System.out.println("s1 is: "+s1);
				int c=Integer.parseInt(s1);
				if(c>=12){c=c-12;}
			System.out.print("0"+c+st.substring(2, 8));
		}
	}

}
