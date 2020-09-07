//EXAMPLE ON THIS FPR SHOWING DIFFERENCE BETWEEN NON STATIC AND LOCAL VARIABLES
public class DEMO1								//MAIN CLASS
{
	public static void main(String[]args)
	{
		NUMBERS n1=new NUMBERS();				//OBJECT CREATION AND ASSIGNING A OBJECT
		n1.setData(10,20);						//CALLING A METHOD
		n1.showData();
	}
}