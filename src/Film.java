
public class Film 
{
	int filmNumber;
	String title;
	private RATING rating;
	
	public void setFilm(int filmNumber, String title, RATING rating)
	{
		this.setFilmNumber(filmNumber);
		this.setTitle(title);
		this.setRating(rating);
	}
	
	public void setFilmNumber(int filmNumber)
	{
		this.filmNumber = filmNumber;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public void setRating(RATING rating)
	{
		this.rating = rating;
	}
	
	public int getFilmNumber()
	{
		return this.filmNumber;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public RATING getRating()
	{
		return rating;
	}
	
	public String toString()
	{
		return (this.filmNumber+" "+this.title+": ("+this.rating+")");
	}
}
