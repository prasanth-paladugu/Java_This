//HW11 ON COMPARING OBJECTS
public class HW11								//MAIN CLASS
{
	public static void main(String[]args)
	{
		N n1=new N();							//OBJECT CREATION AND ASSIGNING A OBJECT
		N n2=new N();							//OBJECT CREATION AND ASSIGNING A OBJECT
		n1.setData(10,20);						//CALLING A METHOD
		n2.setData(1,2);						//CALLING A METHOD
		System.out.println("N1 DATA"+n1);
		n1.showData();							//CALLING A METHOD
		System.out.println("N2 DATA"+n2);
		n2.showData();							//CALLING A METHOD
		if(n2.dataGreater(n1)==1)
		System.out.println("N2 IS GREATER");
		else
		System.out.println("N1 IS GREATER");
		}
}