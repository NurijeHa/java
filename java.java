import java.util.Scanner;
public class Java{
	public static void main(String[] args) {
	
	int num1, num2, suma, zb, pj, sh;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number first: ");
	num1 = sc.nextInt();
	
	System.out.println("Enter number second: ");
	num2 = sc.nextInt();
	sc.close();
	
	
	suma = num1 + num2;
	zb = num1 - num2;
	pj = num1 / num2;
	sh = num1 * num2;
	
	System.out.println("Suma is: "+ suma);
	System.out.println("Zb is: " + '/n'  + zb);
	System.out.println("Pj is" + pj);
	System.out.println("Sh is" + sh);

	}
	
}