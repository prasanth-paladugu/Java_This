//EXAMPLE ON COPY CONSTRUCTER
public class DEMO10								//MAIN CLASS
{
	public static void main(String[]args)
	{
		NU n1=new NU(10,20);					//OBJECT CREATION AND ASSIGNING A OBJECT
		NU n2=new NU(n1);						//OBJECT CREATION AND ASSIGNING A OBJECT
		System.out.println("N1.X	:"+n1.getX()+"\t\t"+"N1.Y	:"+n1.getY()+"\n"+"N2.X	:"+n2.getX()+"\t\t"+"N2.Y	:"+n2.getY());
	}
}