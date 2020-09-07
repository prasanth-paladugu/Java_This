//EXAMPLE ON OBJECT ASSIGINING USING THIS
public class DEMO7								//MAIN CLASS
{
	public static void main(String[]args)
	{
		NUM n1=new NUM();						//OBJECT CREATION AND ASSIGNING A OBJECT
		NUM n2=new NUM();						//OBJECT CREATION AND ASSIGNING A OBJECT
		n1.setData(10,20);						//CALLING A METHOD
		n2.setData(1,2);						//CALLING A METHOD
		System.out.println("N1 DATA"+n1);
		n1.showData();							//CALLING A METHOD
		System.out.println("N2 DATA"+n2);
		n2.showData();							//CALLING A METHOD
		n2.copyData(n1);						//n2=n1 DATA TRANSFER
		System.out.println("N1 DATA"+n1);
		n1.showData();							//CALLING A METHOD
		System.out.println("N2 DATA"+n2);
		n2.showData();							//CALLING A METHOD
	}
}