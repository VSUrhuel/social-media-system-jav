import java.util.*;
public class GroupChat
{
	private ArrayList<User> users;
	private Map<User, Message> messages;

	public GroupChat(User admin)
	{
		this.users = new ArrayList<>();
		this.users.add(admin);
		this.messages = new HashMap<>();
	}
	public ArrayList<User> getUsers()
	{
		return this.users;
	}
	public void addUser(User u)
	{
		users.add(u);
	}
	public void removeUser(User u)
	{
		users.remove(u);
	}
	public void addMessage(User u, Message m)
	{
		messages.put(u, m);
	}
	public void removeMessage(User u, Message m)
	{
		messages.remove(u, m);
	}
	//getters and setters
	@Override
	public String toString()
	{
		String s = "";
		s += "List of Users in this Group \n";
		for(User u : users)
			s += u.toString();
		s += "Messages";
		for(Map.Entry<User, Message> entry : messages.entrySet())
		{
			System.out.println(entry.getKey() +""+ entry.getValue());
		};
		return s;
	}

}