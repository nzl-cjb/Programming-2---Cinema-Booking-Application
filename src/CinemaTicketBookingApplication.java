import java.util.Scanner;

public class CinemaTicketBookingApplication 
{	
	public static int NUMBEROFFILMS = 4;
	
	static Film[] aFilm = new Film[NUMBEROFFILMS]; 
	public static Scanner KEYBOARD = new Scanner(System.in);
	
	private static Customer customerInputDetails()
	{
		System.out.println("Please enter your name: ");
		String name = KEYBOARD.nextLine();
		
		System.out.println("Please enter your age: ");
		int age = KEYBOARD.nextInt();
		
		System.out.println("Are you a student? (Yes/No)");
		KEYBOARD.nextLine();
		String student = KEYBOARD.nextLine();
		
		Customer aCustomer = new Customer(name, age, student);
		
		return aCustomer;
	}
	
	private static Film filmSelection()
	{
		for (int i = 0; i < NUMBEROFFILMS; i++)
		{
			aFilm[i] = new Film();
		}
		
		aFilm[0].setFilm(1, "Ant-Man", RATING.PG);
		aFilm[1].setFilm(2, "Minions", RATING.PG);
		aFilm[2].setFilm(3, "Jurassic World", RATING.M);
		aFilm[3].setFilm(4, "Inside Out", RATING.G);
		
		System.out.println("Which film would you like to watch? ");
		
		System.out.println(aFilm[0]);
		System.out.println(aFilm[1]);
		System.out.println(aFilm[2]);
		System.out.println(aFilm[3]);
		
		int userChoice = KEYBOARD.nextInt();
		
		return aFilm[(userChoice - 1)];
		
	}
	
	public static Ticket issueTicket(Customer aCustomer, Film aFilm)
	{
		if (aCustomer.age < aFilm.getRating().getMinAge())
		{
			Ticket aTicket = new Ticket(null, null);
			System.out.println("I'm sorry, you're too young to see this movie!");
			return aTicket;
		}
		else
		{
			Ticket aTicket = new Ticket(aCustomer, aFilm);
			System.out.println(aTicket);
			return aTicket;
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Welcome to the Cinema Ticket Purchasing System");
		int x = 0;
		while (x == 0)
		{
			issueTicket(customerInputDetails(), filmSelection());
			
			System.out.println("Do you want to issue another ticket? (Yes/No)");
			KEYBOARD.nextLine();
			String response = KEYBOARD.nextLine();
			
			if(response.equals("Yes"))
			{
				x = 0;
			}
			else
			{
				x = 1;
				System.out.println("Thankyou for using the Cinema Ticket Purchasing System");
			}
		}			
	}
}
