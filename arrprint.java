package weekdays;

import java.util.Scanner;

public class arrprint {

public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] arr=new String[5];
Scanner sc=new Scanner(System.in);
for( int k=0;k<5;k++)
{
	arr[k]=sc.next();
	
}
for(String element:arr )
{
	System.out.println(element);
}
	}

}
