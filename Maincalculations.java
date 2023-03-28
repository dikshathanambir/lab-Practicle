class Calculations
{
	int a=10,b=20;
	void add1()
	{	
		System.out.println("Addition is:"+(a+b));
	}
		void sub1()
	{
		System.out.println("Subtraction is is:"+(a-b));
	}
		void mul1()
	{
		System.out.println("Multiplication is:"+(a*b));
	}
		void div1()
	{
		System.out.println("Division is:"+(a/b));
	}	
}	
class Maincalculations
{	
	public static void main(String args[])
	{	
		Calculations c=new Calculations();
		c.add1();
		c.sub1();
		c.mul1();
		c.div1();
	}
}	