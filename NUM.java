//NUM CLASS FOR DEMO7 ON OBJECT ASSIGINING WITH METHOD
public class NUM							//USER DEFINED CLASS
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
	public void copyData(NUM tem)				//METHOD FOR COPYING DATA
	{
		this.x=tem.x;							//==>n2.x=n1.x
		this.y=tem.y;							//==>n2.y=n1.y
	}
}