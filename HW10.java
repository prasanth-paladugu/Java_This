//HW10 ON POZO CLASS
public class HW10													//MAIN METHOD
{
	public static void main(String[]args)
	{
		PROD p1=new PROD(1,"MAGGIE",10,5);							//CREATING AN OBJECT AND ASSIGNING A REFERENCE TO OBJECT
		System.out.println("Sno"+"\t\t"+"Name"+"\t\t"+"Quant"+"\t\t"+"Cost");
		System.out.println(p1.getSno()+"\t\t"+p1.getName()+"\t\t"+p1.getQuant()+"\t\t"+p1.getCost());
		p1.setQuant(15);
		System.out.println(p1.getSno()+"\t\t"+p1.getName()+"\t\t"+p1.getQuant()+"\t\t"+p1.getCost());
	}
}