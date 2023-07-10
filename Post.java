import java.util.*;
public class Post
{
	private String content;
	private int numOfLikes;
	private Date date;
	private User u;
	private ArrayList<Comment> comments;

	public Post(User u, String content)
	{
		this.u = u;
		this.content = content;
		this.date = new Date();
		this.comments = new ArrayList<>();
	}
	public void addComment(Comment c)
	{
		comments.add(c);
	}
	public void removeComment(Comment c)
	{
		comments.remove(c);
	}
	public void like()
	{
		numOfLikes++;
	}
	public void removeLike()
	{
		numOfLikes--;
	}
	public User getUser()
	{
		return this.u;
	}
	//getters and setters;
	@Override
	public String toString()
	{
		String s = "Posted by: " + this.getUser().getName() + "\t Date: " + this.date + "\n";
		s += ("Likes: " + this.numOfLikes + "\n");
		s += "Comments\n";
		for(Comment c: comments)
			s += c.toString();
		return s;
	}  

}