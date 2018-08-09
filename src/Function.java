/*(1) Main:
 * 	a.Take 2 int numbers as an input from user
 * 	b.Call calculate (send those 2 ints) 
 * 2)Calculate (num 1, num2) 
 * 	a.Ask user if they want to add, subtract, divide or multiply 
 * 	b.switch (user input) 
 * 	c.call appropriate functions inside the switch case 
 * 	d. handle ArithmeticException e in divide switch case 
 * 	
 *  try {
 *  	divide ( ... )
 *  	}
 *  catch {
 *  
 */
import java.util.Scanner;
public class Function {
	static int something;
	
	public static void main(String args[]) {
		
		int num1, num2, answer; 
		String result = "Your result is: ";
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Enter First number: ");
		num1 = keyboard.nextInt();
		System.out.println("Enter Second number: ");
		num2 = keyboard.nextInt();
		System.out.println("Hi! What do you want to do? 1.Add 2. Subtrat 3. Divide 4. Multiply 5. Quit");
				calculate(something = keyboard.nextInt(), num1, num2);
			
	 
	}
	
	static void calculate(int something, int num1, int num2) {
		
		switch(something) {
		
		case 1: 
				
			System.out.println(Add(num1, num2)); 
				break;
			
		case 2: 
			System.out.println(Subract(num1, num2));
				break;
			
		case 3: 	
			try {
				System.out.println(Divide(num1, num2));
			}
			catch (ArithmeticException e){
				System.out.println("Undefined");
			}
			break;
		case 4: 
			System.out.println(Multiple(num1, num2));
				break;	
		}
	}

	static int Add(int a, int b){
			int answer = a + b;
			return answer;
	}
	
	static int Subract(int a, int b) {
			int answer = a - b;
			return answer;
	}
	
	static int Divide(int a, int b) {
			int answer = a/b;
			return answer;
	}
	
	static int Multiple(int a, int b) {
			int
			answer = a*b;
			return answer;
	}
}
