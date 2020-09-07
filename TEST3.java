//TEST3 CLASS FOR DEMO3 ON THIS METHOD CALLING
public class TEST3								//USER DEFINED CLASS
{
	public TEST3()								//CONSTRUCTER 1
	{
		System.out.println("TEST3()");
		m1();									//WE CAN CALL A METHOD FROM OBJECT
	}
	public TEST3(String s)						//CONSTRUCTER 2
	{
		System.out.println("TEST3(String st)");
	}
	public void m1()							//METHOD 1
	{
		/*this("PP");*/							//WE CANNNOT CALL A OBJECT FROM A METHOD
		System.out.println("M1");
	}
}
