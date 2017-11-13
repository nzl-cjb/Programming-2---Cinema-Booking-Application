

public class Ticket 
{
	Film aFilm = new Film();
	Customer aCustomer = new Customer();
	
	public double setPrice(int age, String student)
	{
		double price = 0, discount = 0;
		if (age < 18)
		{
			price = 7;
		}
		if(age > 17 && age < 65)
		{
			if(student.equals("Yes"))
			{
				discount = 0.1;
				price = 10;
			}
			else
			{
				price = 10;
			}
		}
		if(age > 64)
		{
			if(student.equals("Yes"))
			{
				discount = 0.1;
				price = 10;
			}
			else
			{
				discount = 0.07;
				price = 10;
			}
		}
		if(age > 10 && age < 25 && student.equals("Yes"))
		{
			discount = 0.15;
		}
		if(age > 25 && student.equals("Yes"))
		{
			discount = 0.10;
		}
		price = price * (1 - discount);
		
		return price;
	}
	
	public Ticket(Customer aCustomer, Film aFilm)
	{
		this.aFilm = aFilm;
		this.aCustomer = aCustomer;
	}
	
	public String toString()
	{
		return String.format("Your ticket is ready to be collected!\n------------------------------------------------------------\nFILM TICKET for: "+this.aFilm+"\nCUSTOMER DETAILS: "+aCustomer.name+" Age: "+aCustomer.age+" Student? "+aCustomer.student+"\nTOTAL COST: $"+String.format("%, 1.2f", setPrice(aCustomer.getAge(), aCustomer.getStudent())))+"\n------------------------------------------------------------";
	}
}
