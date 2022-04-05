
public class JavaCalculatorAssignment {
	/*Create a Custom Class:
	 *Create a Java Calculator Class that does the following five commands:
	 *An add method that takes in two integer numbers and adds them together the call to that method would look like this: add(int num1, int num2)
	 *A subtraction method that takes in two integers and subtracts them from one another would look like this: subtract( int num1, int num2)
	 *A multiplication method that takes in two integer numbers and multiplies them together the call to that method would look like this: multiply(int num1, int num2)
	 *A division method that takes in two integer numbers and divides them the call to that method would look like this: divide(int num1, int num2)
	 *A square method that takes in one integer and squares it: square(int num1, int num2)*/

	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public int multiply(int num1, int num2) {
		return num1*num2;
	}
	
	public int subtraction(int num1, int num2) {
		return num1-num2;
	}
	
	public int division(int num1, int num2) {
		return num1/num2;
	}
	
	public int square(int num1, int num2) {
		return (int) Math.pow(num1, num2); //takes in one integer and squares it but
		//it takes in two integers. so confused. Should I set num2 = 2??
	}
	
}
