import java.util.Scanner;
public class Java4 {
	public static void main(String[] args) {
		
		
		int id = 1;
		String name;
		String surname;
		int age;
		String address;
		String country;
		String nationality ;
		String faculty ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name: ");
		name = sc.nextLine();
		
	
		System.out.println("Enter your Surname: ");
		surname = sc.nextLine();
		
		
		System.out.println("Enter your Address: ");
		address = sc.nextLine();
		
			
		System.out.println("Enter your Country: ");
		country = sc.nextLine();
		
		
		System.out.println("Enter your Nationality: ");
		nationality = sc.nextLine();
		
		
		System.out.println("Enter your Faculty: ");
		faculty = sc.nextLine();
		
		
		System.out.println("Enter your Age: ");
		age = sc.nextInt();
		
		sc.close();
		
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Surname: " + surname);
		System.out.println("Ages: " + age);
		System.out.println("Address: " + address);
		System.out.println("Country: " + country);
		System.out.println("Nationality: " + nationality);
		System.out.println("Faculty: " + faculty);
	}
}