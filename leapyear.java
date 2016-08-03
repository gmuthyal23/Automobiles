package firstproject;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c;
int d=0;
Scanner sc= new Scanner (System.in);
a= sc.nextInt();
b=sc.nextInt();
for (c=a;c<=b;c++)
{
	if (c%400==0 ||(c%4==0 && c%100!= 0))
		System.out.print(" "+ c);
d=d+1;
}
System.out.println();
System.out.print(" total number" + d);
	}

}
