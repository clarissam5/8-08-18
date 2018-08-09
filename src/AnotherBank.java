
public class AnotherBank {
	//create three arrays
	private static int account[] = {1001, 1002, 1003, 1004};
	private static String name[] = {"Anna", "Chrissy","Cooper", "John"};
	private static double balance[] = {1200.00, 1435.12, 2000.00, 30000.02}; 
	
	//constructors
	//default
	
	public static void main(String args[]) {
		
		System.out.println("ACCNO" + "\t" + "CUSTOMER" +
                "\t" + "BALANCE");
		
		try {
			   for (int i = 0; i < 5 ; i++)
	            {
	                System.out.println(account[i] + "\t" + name[i] + "\t" + balance[i]);
	             
	                }     
	            }
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index is Out of Bounds");
			}
	}
}
