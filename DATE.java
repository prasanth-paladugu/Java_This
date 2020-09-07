//DATE CLASS FOR DEOM11 ON COPY CONSTRUCTER FOR INTILIZING ONE CLASS OBJECT WITH ANOTHER CLASS OBJECT
public class DATE											//USER DEFINED CLASS
{
	private int D,Y;										//DECLARING VARIABLES PRIVATELY
	private String M;
	public DATE(int D,String M,int Y)						//PARAMETERIZED CONSTRUCTER
	{
		this.D=D;
		this.M=M;
		this.Y=Y;
	}
	public void setD(int D)									//METHOD
	{
		this.D=D;
	}
	public void setM(String M)								//METHOD
	{
		this.M=M;
	}
	public void setY(int Y)									//METHOD
	{
		this.Y=Y;
	}
	public String getDate()									//METHOD FOR GETTING DATE AS STRING
	{
		return D+"-"+M+"-"+Y;
	}
}