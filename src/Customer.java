
public class Customer 
{
	String name;
	int age;
	String student;
	
	public Customer()
	{
		this.setName("No Name");
		this.setAge(0);
		this.setStudent("No");
	}
	
	public Customer(String  name, int age, String student)
	{
		this.setName(name);
		this.setAge(age);
		this.setStudent(student);
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setStudent(String student)
	{
		this.student = student;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public String getStudent()
	{
		return this.student;
	}

}
