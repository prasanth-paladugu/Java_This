//NU CLASS FOR DEMO10 COPY CONSTRUCTER
public class NU									//USER DEFINED CLASS
{
	private int x,y;							//DECLARING VARIABLES PRIVATELY
	public NU(int x,int y)						//CONSTRUCTER FOR INTIALIZING DATA
	{
		this.x=x;								//THIS GIVES PREFERENCE TO GLOBAL VARIABLES THAN
		this.y=y;
	}
	public NU(NU temp)							//CONSTRUCTER FOR INTIALIZING ANOTHER CONSTRUCTER
	{
		this.x=temp.x;
		this.y=temp.y;
	}
	public void setX(int x)						//METHOD FOR SETTING DATA
	{
		this.x=x;
	}
	public void setY(int y)						//METHOD FOR SETTING DATA
	{
		this.y=y;
	}
	public int getX()							//METHOD FOR GETTING DATA
	{
		return x;
	}
	public int getY()							//METHOD FOR GETTING DATA
	{
		return y;
	}
}