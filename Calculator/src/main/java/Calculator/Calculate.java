package Calculator;

import java.util.Scanner;

public class Calculate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.println("Enter any two numbers: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("Choose any operation : ");
		System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
		int operation = sc.nextInt();
		Operations op = new Operations();
		switch(operation) {
			case 1 : System.out.println(op.addition(num1, num2));
					break;
			case 2 : System.out.println(op.subtraction(num1, num2));
					break;
			case 3 : System.out.println(op.multiplication(num1, num2));
					break;
			case 4 : 
					if(num2 == 0) {
						System.out.println("Can't divide with 0. Enter any number other than 0");
					}
					num2 = sc.nextInt();
					System.out.println(op.division(num1, num2));
					
					break;
		}			
	}
}
	
