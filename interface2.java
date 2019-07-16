interface A
{
static int a=0;//sharable
public void display();//dynamic binding becouse functionality of a function can be chanfed by diff classes
}
class b
{
public void show()
{
System.out.println("show");
}
}
class c extends b implements A
{
public void display()
{
System.out.println("In class c");
}

public void show()
{
System.out.println("show in c");
}
}
class c1
{
public static void main(String args[])
{
c c2 = new c();
c2.display();
c2.show();
}
}

