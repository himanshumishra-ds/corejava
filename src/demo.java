
// method hiding not over riding
class Test
{
	void display() {
		 System.out.println("Test class display method");
	 }
	
	public static void main(String[] args) {
		
		//System.out.println("Test class main");

		Test t = new Test();
		
		demo d = new demo();
		d.display();

		String s ="mksd ";
		
		int x=-21 ;
		
		
		if(x%3==0 && x%7==0 && x!=0)
		{
			System.out.println("divisible by 3 and 7");
		}
		else if(x%3==0 && x!=0)
			
		{
			System.out.println("divisible by 3 only");
		}
		else if(x%7==0 && x!=0)
		{
			System.out.println("divisible by 7 only");
		}
		else
		{
			System.out.println("not valid");
		}
		
		
		
	}
}



public class demo extends Test {
	void display() {
		 System.out.println("Demo class class display method");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 
		
		System.out.println("lms dc");
		
		
	}

}
