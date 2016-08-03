package weekdays;

import java.util.Scanner;

public class timeclas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println("Enter hh:mm:ss");
		time[] bb=new time[3];
		for (int i=0;i<3;i++)
		{
			bb[i]=new time();
			bb[i].input();
		}
		
		for(time element:bb)
		{
			element.display();
		}
		
		
		
		
	}

}
