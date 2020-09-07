//CREATING A EMPLOYE CLASS FOR DEMO11 ON COPY CONSTRUCTER
public class EMPLOYE						//USER DEFINED CLASS
{
	private int Id;							//DECLARING VARIABES PRIVATELY
	private String Name,Disg;
	private double Sal;
	private String Dob,Doh;
	public EMPLOYE(int Id,String Name,String Disg,double Sal,String Dob,String Doh)
	{
		this.Id=Id;
		this.Name=Name;
		this.Disg=Disg;
		this.Sal=Sal;
		this.Dob=Dob;
		this.Doh=Doh;
	}
	public void setId(int Id)				//METHODS FOR SETTING DATA OF EACH VARIABLE INDIVIDUALLY
	{
		this.Id=Id;
	}
	public void setName(String Name)
	{
		this.Name=Name;
	}
	public void setDisg(String Disg)
	{
		this.Disg=Disg;
	}
	public void setSal(double Sal)
	{
		this.Sal=Sal;
	}
	public void setDob(String Dob)
	{
		this.Dob=Dob;
	}
	public void setDoh(String Doh)
	{
		this.Doh=Doh;
	}
	public void getDetails()				//METHODS FOR GETTING DATA
	{
		System.out.println("ID"+"\tNAME"+"\tDESIGNATION"+"\tSALERY"+"\t\tDATEOFBIRTH"+"\tD O HIRE");
		System.out.println(this.Id+"\t"+this.Name+"\t"+this.Disg+"\t"+this.Sal+"\t"+this.Dob+"\t"+this.Doh);
	}
}