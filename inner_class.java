class outer
{
	private String outer_dm;
	outer()
	{
		outer_dm="outer class";

	}
	public void show_outer()
	{
		System.out.println(outer_dm);
	}
	class inner
	{
		private String inner_dm;
		inner()
		{
			inner_dm="inner class";
		}
		public void show_inner()
		{
			System.out.println(inner_dm);
		}
	}
}
class RunOuter
{
	public static void main(String args[])
	{
		outer out=new outer();//inner calss will not get memory in this line unlike nested class
		out.show_outer();
		outer.inner in=obj.new inner();
		in.show_inner();

	}
}