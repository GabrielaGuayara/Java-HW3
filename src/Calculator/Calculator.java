package Calculator;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	 
	Scanner inp = new Scanner(System.in);
	
	System.out.println("Menu: ");
	System.out.println("1. Add  ");
	System.out.println("2. Subtract  ");
	System.out.println("3. Multiply  ");
	System.out.println("4. Divide  ");
	System.out.println("5. Exit  ");
	System.out.println("Please, enter a number to choose an operation from the menu: ");
	int userinp = inp.nextInt();
	

	
	if(userinp == 1 || userinp == 2 || userinp == 3 || userinp== 4)

	{
		System.out.println("Please, enter a number: ");
		int num1 = inp.nextInt();
		System.out.println("Please, enter another number: "); 
		int num2 = inp.nextInt();
		switch(userinp)
		{
		case 1:
			System.out.println(add(num1, num2));
			break;
		case 2:
		System.out.println(sub(num1, num2));
		break;
		case 3:
			System.out.println(mult(num1, num2));
			break;
		case 4:
			System.out.println(div(num1, num2));
			break;
		case 5:
			System.out.println("Program exit");
			break;
		default:
			System.out.println("Invalid Choice, Try Again");
			break;
		}
	}
	else if(userinp==5){
			System.out.println("Program exit!");
		}
	else {
		System.out.println("Invalid Choice");
	}
	inp.close();
	}
	
	 static int add(int n1, int n2) {
		 int sum=0;
		 sum= n1+n2;
		 return sum;
	 }
	 static int sub(int n1, int n2) {
		 int subs=0;
		 subs= n1-n2;
		 return subs;
	 }
	 static int mult(int n1, int n2) {
		 
		 int m= n1*n2;
		 return m;
	 }
	 static int div(int n1, int n2) {
		 int d = n1/n2;
		 return d;
	 }
}
