//TEST2 CLASS FOR DEMO3 ON CONSTRUCTOR CHAINING USING THIS
public class TEST2								//USER DEFINED CLASS
{
	public TEST2()								//CONSTRUCTER 1
	{
		this("PP");								//this("PP")==>TEST2("PP")
		System.out.println("TEST2()");
	}
	public TEST2(int i)							//CONSTRUCTER 2
	{
		System.out.println("TEST2(int i)");
	}
	public TEST2(String s)						//CONSTRUCTER 3
	{
		this(100);								//this(100)==>TEST2(100)
		System.out.println("TEST2(String st)");
	}

}
