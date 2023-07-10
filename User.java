public class User
{
	private String name;
	private int age;
	private Sex s;
	private ChatBox chats;

	public User(String name, int age, Sex s)
	{
		this.name = name;
		this.age = age;
		this.s = s;
		this.chats = new ChatBox(this);
	}
	public void hasLike(Post p)
	{
		p.like();
	}
	public void unLike(Post p)
	{
		p.removeLike();
	}
	public void comment(Post p, Comment c)
	{
		p.addComment(c);
	}
	public void deleteComment(Post p, Comment c)
	{
		p.removeComment(c);
	}
	public boolean addMemberToGroupChat(User u, GroupChat g)
	{
		if(this.name.equals(g.getUsers().get(0).getName()))
		{
			g.addUser(u);
			return true;
		}
		return false;
	}
	public boolean removeMemberToGroupChat(User u, GroupChat g)
	{
		if(this.name.equals(g.getUsers().get(0).getName()))
		{
			g.removeUser(u);
			return true;
		}
		return false;
	}
	public void sendMessage(User u, Message m)
	{
		this.chats.addMessageToChatBox(u, m);
		u.getChatBox().addMessageToChatBox(u, m);
	}
	public void removeMessage(User u, Message m)
	{
		this.chats.removeMessageToChatBox(u, m);
		u.getChatBox().removeMessageToChatBox(u, m);
	}
	public ChatBox getChatBox()
	{
		return this.chats;
	}
	public void setAge(int age)
	{
		this.age = (age > 0) ? age :  0;
	}
	public void setSex(Sex s)
	{
		if(s.equals("MALE") || s.equals("FEMALE"))
		{
			this.s = s;
		}
	}
	public int getAge()
	{
		return this.age;
	}
	public Sex getSex()
	{
		return this.s;
	}
	public String getName()
	{
		return this.name;
	}
	public String getChatBoxString()
	{
		return this.chats.toString();
	}
	@Override
	public String toString()
	{
		String s = "Name: " + this.name + " | Sex: " + this.s.toString() + " | Age: " + this.age + "\n";
		return s;
	} 
}