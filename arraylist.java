package weekdays;

import java.util.Scanner;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f,k;
		int m,n;
		
		System.out.println("enter your number: AND NUMBERS:");
		Scanner sc= new Scanner(System.in);
		m=sc.nextInt();
		int s[]= new int[m];
		for(int p=0;p<m;p++)
		{
			s[p]=sc.nextInt();
		}
		int max=s[0];
		for( k=1;k<s.length;k++)
		{
			if(s[k]>max)
				max=s[k];
		}
		System.out.println("max number is:" + max);
	}
	
}
