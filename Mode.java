import java.util.Arrays;
import java.util.Scanner;

public class Mode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int v = a[0];
		int m = 1;
		int s = 1;
		int fl=1;
		for (int i = 0; i < (n - 1); i++) {
			if (a[i + 1] == a[i]) {
				s++;
				if (s > m) {
					v = a[i];
					m = s;
					fl=0;
				}
				if(s==m){if(a[i]!=a[i+1]){fl=1;}}
			} else {
				s = 1;
			}
		}
		if(fl==0){
		System.out.println("The number is: "+v+" and the mode is: "+m);}
		else System.out.println("No mode.");
	}
}
