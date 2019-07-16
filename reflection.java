package collection;
public class reflection
{
	private int age;
	private String name;
	public reflection(int age,String name)
	{
	this.age=age;
	this.name=name;

	}
	public String printval()
	{
	return "age" +age+ "name" + name;
	}
	public static void main(String args[])throws ClassNotFoundException
	{   try{
		reflection s=new reflection(34,"shreya");//using reflection to nake object at runtime whenever you need it.
		Class c=s.getClass();
		System.out.println(c);
		Class obj=Class.forName("collection.reflection");//Always spectify package.classname
		System.out.println(obj.isInterface());
		Class obj1=Class.forName("collection.reflection_interface");//Always specify package.Interface
		System.out.println(obj1.isInterface());
	}
	catch(ClassNotFoundException e)
	{
		System.out.println(e.getMessage());
	}
	}
}

