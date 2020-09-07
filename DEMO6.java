//EXAMPLE ON OBJECT ASSIGINING USING THIS
public class DEMO6								//MAIN CLASS
{
	public static void main(String[]args)
	{
		NUMBER n1=new NUMBER();					//OBJECT CREATION AND ASSIGNING A OBJECT
		NUMBER n2=new NUMBER();					//OBJECT CREATION AND ASSIGNING A OBJECT
		n1.setData(10,20);						//CALLING A METHOD
		n2.setData(1,2);						//CALLING A METHOD
		System.out.println("N1 DATA"+n1);
		n1.showData();							//CALLING A METHOD
		System.out.println("N2 DATA"+n2);
		n2.showData();							//CALLING A METHOD
		n1=n2;									//DATA ASSIGNING NOT HAPPENS ONLY ADDRESS ASSIGNS
		System.out.println("N1 DATA"+n1);
		n1.showData();							//CALLING A METHOD
		System.out.println("N2 DATA"+n2);
		n2.showData();							//CALLING A METHOD
		/*n1.x=n2.x;*/							//WHEN VARIABLES ARE NOT PRIVATE WE CAN TRANSFER DATA BY USING THIS
	}
}