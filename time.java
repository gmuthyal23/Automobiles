package weekdays;

import java.util.Scanner;

public class time extends common{

	int hours,mins,sec;
	
	void  input(){
		//int[] a= new int[3];
		
		Scanner sc= new Scanner(System.in);
		//for(int i=1;i<3;i++)
		
		hours=sc.nextInt();
		mins=sc.nextInt();
		sec=sc.nextInt();
	}
	
	void display(){
		if(sec>60){
			mins=mins+1;
			sec=sec-60;
		}
		if(mins>60){
			hours=hours+1;
			mins=mins-60;
		}
		System.out.println(hours + ":" + mins  + ":" + sec);
	}	
}
