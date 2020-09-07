//NUMBER CLASS FOR DEMO6 ON OBJECT ASSIGINING
public class NUMBER							//USER DEFINED CLASS
{
	private int x,y;							//DECLARING VARIABLES PRIVATELY
	public void setData(int x,int y)			//METHOD FOR SETTING DATA
	{
		this.x=x;								//THIS GIVES PREFERENCE TO GLOBAL VARIABLES THAN
		this.y=y;
	}
	public void showData()						//METHOD FOR GETTING DATA
	{
		System.out.println("X VALUE IS :"+x);
		System.out.println("Y VALUE IS :"+y);
	}
}