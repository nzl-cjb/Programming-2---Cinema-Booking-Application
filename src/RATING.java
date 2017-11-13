
public enum RATING 
{
	G(0), PG(12), M(16);
	
	private int minAge;
	
	private RATING(int minAge)
	{
		this.minAge = minAge;
	}
	
	public int getMinAge()
	{
		return minAge;
	}
	
	public void setMinAge(int minAge)
	{
		this.minAge = minAge;
	}
}
