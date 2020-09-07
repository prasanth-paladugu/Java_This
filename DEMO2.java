//EXAMPLE ON CALLING ANOTHER METHOD OF CURRENT CALLING OBJECT
public class DEMO2								//MAIN CLASS
{
	public static void main(String[]args)
	{
		new TEST1().m1();						//CALLING ANOTHER METHOD OF CURRENT CALLING OBJECT
		new TEST1().m2();
	}
}