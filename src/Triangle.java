import java.util.Scanner;

class Triangle{

	public static void main(String[]args)
	{
	
		int length,breadth,height;
		double totalarea,volume;
		
		System.out.println("Enter Three Sides of Cubiod ");
		
		Scanner sc=new Scanner(System.in);
		length=sc.nextInt();
		breadth=sc.nextInt();
		height=sc.nextInt();
		
		totalarea=2*(length*breadth+breadth*height+length*height);
		
		volume=length*breadth*height;
		
		System.out.println("Total Area is "+totalarea);
		System.out.println("Volume is "+volume);
	}
}