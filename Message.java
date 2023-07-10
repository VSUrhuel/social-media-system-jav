import java.util.*;
public class Message
{
	private String content;
	public Date date;

	public Message(String content)
	{
		this.content = content;
		this.date = new Date();
	}

	@Override
	public String toString()
	{
		return "Content: " + this.content + "| Date Posted: " + this.date.toString() + "\n";
	} 
}