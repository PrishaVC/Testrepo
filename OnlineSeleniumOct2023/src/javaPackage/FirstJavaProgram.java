package javaPackage;

public class FirstJavaProgram {

	static
	{
		System.out.println("Static Block1");
		
	}
	
	public void display()
	{
		System.out.println("Display Method");
	}
	
	public static void main(String[] args) 
	{
	
		System.out.println("Java Program11111");
		
		FirstJavaProgram f1=new FirstJavaProgram();
		
		f1.display();
		a();
		
		
		
	}
	
	public static void a()
	{
		System.out.println("a method");
	}

	
}
