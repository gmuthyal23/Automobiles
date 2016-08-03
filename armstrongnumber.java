package firstproject;

import java.util.Scanner;

public class armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,c,b,t,s,k;

int pt=0,z,y;



Scanner sc= new Scanner(System.in);
z= sc.nextInt();

for (s=1;s<=z;s++)
{
	double dc=0;
	double sum=0;
	t=a=s;	
 while (a>0)
	 
 {
	// b=a%10;
	 //System.out.println(" "+ b);
	 a/=10;
	dc++; 
 }
//System.out.println("digit count" + dc);

	
	
	while (t>0)
	{
	b=t%10;
	sum=sum+Math.pow(b, dc);
	t=t/10;
	
	}
	
	//System.out.println(" "+ sum);
	
	

	if(sum==s)
		
	{
		System.out.print("  " + s );
	}
	}
	}
}

