//PROD CLASS FOR HW10 ON POZO CLASS
public class PROD											//USER DEFINED CLASS
{
	private int Sno;										//DECLARING VARIABLES PRIVATELY
	private String Name;
	private double Quant,Cost;
	public PROD(int Sno,String Name,double Quant,double Cost)//PARAMETERIZED CONSTRUCTER WITH 4 ARGUMENTS
	{
		this.Sno=Sno;
		this.Name=Name;
		this.Quant=Quant;
		this.Cost=Cost;
	}
	public PROD(int Sno,String Name,double Cost)//PARAMETERIZED CONSTRUCTER WITH 4 ARGUMENTS
	{
		this(Sno,Name,0.0,Cost);
	}
	public void setSno(int Sno)								//METHOD FOR SETTING DATA
	{
		this.Sno=Sno;
	}
	public void setName(String Name)						//METHOD FOR SETTING DATA
	{
		this.Name=Name;
	}
	public void setQuant(double Quant)						//METHOD FOR SETTING DATA
	{
		this.Quant=Quant;
	}
	public void setCost(double Cost)						//METHOD FOR SETTING DATA
	{
		this.Cost=Cost;
	}
	public int getSno()										//METHOD FOR GETING DATA
	{
		return this.Sno;
	}
	public String getName()									//METHOD FOR GETING DATA
	{
		return this.Name;
	}
	public double getQuant()								//METHOD FOR GETING DATA
	{
		return this.Quant;
	}
	public double getCost()									//METHOD FOR GETING DATA
	{
		return this.Cost;
	}

}