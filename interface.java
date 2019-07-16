interface A
{
static int a=0;//sharable
public void display();//dynamic binding becouse functionality of a function can be chanfed by diff classes
}
class B implements A
{
public int b;
public B()
{
b=20;
}
public void display()
{
System.out.println("Interface method called");
}
public void show(int b)
{
display();
System.out.println("The value of the parameter"+b);
System.out.println(this.b);
}
}
class Runb
{
public static void main(String args[])
{
B obj=new B();
obj.show(10);
}
}