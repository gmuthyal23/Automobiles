package weekdays;

import java.util.Scanner;

public  class timefeet extends common {

	int feet,inches;
		void input()
		{
		System.out.println("enter your feet,inches:");
		
		Scanner sc= new Scanner(System.in);
		feet=sc.nextInt();
		inches=sc.nextInt();
		}
		void display()
		{
			if(inches > 12)
			feet=feet+1;
		    inches=inches-12;
System.out.println("foot:" + feet + "inches" + inches );
	}


}
