//BOOKS CLASS FOR DEMO5 ON THIS METHOD OVERLOADING
public class BOOKS											//USER DEFINED CLASS
{
	private int Sno;										//DECLARING VARIABLES PRIVATELY
	private String Name,Author;
	private double Cost;
	public BOOKS(int s,String n,String a,double c)			//PARAMETERIZED CONSTRUCTER WITH 4 ARGUMENTS
	{
		Sno=s;
		Name=n;
		Author=a;
		Cost=c;
	}
	public BOOKS(int s,String n,String a)					//PARAMETERIZED CONSTRUCTER WITH 3 ARGUMENTS
	{
		this(s,n,a,0);										//this(s,n,a,0);==>BOOKS(s,n,a,0);
	}
	public BOOKS(int s,String n)							//PARAMETERIZED CONSTRUCTER WITH 2 ARGUMENTS
	{
		this(s,n,"",0);										//this(s,n,"",0);==>BOOKS(s,n,"",0);
	}
	public BOOKS(int s,String a,double c)					//PARAMETERIZED CONSTRUCTER WITH 3 ARGUMENTS
	{
		this(s,"",a,c);										//this(s,"",a,c);==>BOOKS(s,"",a,c);
	}
	public void showData()									//METHOD FOR GETTING DATA
	{
		System.out.println(Sno+"\t\t"+Name+"\t\t"+Author+"\t\t"+Cost);
	}
}