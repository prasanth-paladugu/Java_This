//EXAMPLE ON COMPARING OBJECTS
public class DEMO9								//MAIN CLASS
{
	public static void main(String[]args)
	{
		NUMBE n1=new NUMBE();					//OBJECT CREATION AND ASSIGNING A OBJECT
		NUMBE n2=new NUMBE();					//OBJECT CREATION AND ASSIGNING A OBJECT
		n1.setData(10,20);						//CALLING A METHOD
		n2.setData(10,20);						//CALLING A METHOD
		System.out.println("N1 DATA"+n1);
		n1.showData();							//CALLING A METHOD
		System.out.println("N2 DATA"+n2);
		n2.showData();							//CALLING A METHOD
		if(n2.dataEquals(n1)==true)
		System.out.println("BOTH ARE SAME");
		else
		System.out.println("BOTH ARE DIFERENT");
		}
}