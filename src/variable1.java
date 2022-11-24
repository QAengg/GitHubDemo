

public class variable1 {
	
	static int a=30; //static global variable from same class

	public static void main(String[] args) 
	{
		// static global variable called from same class
	 System.out.println(a); //variablename
	 //System.out.println(staticvariablediffclass.n); //diffclass.variablename
	 m1();
	

	}
	public static void m1() //static method
	{
		System.out.println(a);
	}
	public void m2()  //non static method
	{
		System.out.println(a);
	}
	

}
