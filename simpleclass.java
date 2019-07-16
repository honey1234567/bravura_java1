package collection;
public class simpleclass
{
	private int age;
	private String name;
	public simpleclass(int age,String name)
	{
	this.age=age;
	this.name=name;

	}
	public String printval()
	{
	return "age" +age+ "name" + name;
	}
	public static void main(String args[])
	{
		simpleclass s=new simpleclass(34,"shreya");
		Class c=s.getClass();
		System.out.println(c);
	}
}

