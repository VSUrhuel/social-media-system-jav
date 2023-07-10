import java.util.*;
public class Comment
{
	private String subject;
	private Date dateCommented;

	public Comment(String subject)
	{
		this.subject = subject;
		this.dateCommented = new Date();
	}
	@Override
	public String toString()
	{
		return "Content: " + this.subject + "\t Date Posted: " + this.dateCommented.toString() + "\n";
	}
}