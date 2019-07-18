package MyServlet1;

public class lcm_logic {
	private int x;
	private int y;
	public lcm_logic()
	{
	x=0;
	y=0;
	}
	public int lcm_logic1(int x,int y)
	{int lcm;
	 this.x=x;
	 this.y=y;
	 lcm=((this.x*this.y)/this.y);
	 return lcm;
	}

}
//create table lcm(num1 number(2),num2 number(2),result number(3));
//