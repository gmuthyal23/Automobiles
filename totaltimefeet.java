package weekdays;

import java.util.ArrayList;

public  class totaltimefeet  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<common> data= new ArrayList<common>();
time t1= new time();
t1.input();
timefeet t2= new timefeet();
t2.input();
data.add(t1);
data.add(t2);


for(common x:data)
{
	x.display();
}



	}

}
