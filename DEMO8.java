//EXAMPLE ON PERFOMING ARTHEMATIC OPERATIONS ON TWO OOBJECTS AND STORING RESULT IN ONE OF THE OBJECT
public class DEMO8								//MAIN CLASS
{
	public static void main(String[]args)
	{
		NUMB n1=new NUMB();						//OBJECT CREATION AND ASSIGNING A OBJECT
		NUMB n2=new NUMB();						//OBJECT CREATION AND ASSIGNING A OBJECT
		n1.setData(10,20);						//CALLING A METHOD
		n2.setData(1,2);						//CALLING A METHOD
		System.out.println("N1 DATA"+n1);
		n1.showData();							//CALLING A METHOD
		System.out.println("N2 DATA"+n2);
		n2.showData();							//CALLING A METHOD
		n2.addData(n1);							//n2=n1+n2 DATA ADDITION
		System.out.println("N1 DATA"+n1);
		n1.showData();							//CALLING A METHOD
		System.out.println("N2 DATA"+n2);
		n2.showData();							//CALLING A METHOD
	}
}