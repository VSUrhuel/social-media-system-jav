import java.util.*;
import java.util.Map.Entry;
public class ChatBox
{
	private User u;
	private Map <User, Message> messages;

	public ChatBox(User u)
	{
		this.u = u;
		this.messages = new HashMap<>();
	}
	public void addMessageToChatBox(User u, Message m)
	{
		this.messages.put(u, m);
	}
	public void removeMessageToChatBox(User u, Message m)
	{
		this.messages.remove(u, m);
	}
	@Override
	public String toString()
	{
		String s = ("Welcome to " + u.getName() + " Chat Box!\n");
		String r = "";
		for(Map.Entry<User, Message> entry : messages.entrySet())
		{
			System.out.println(entry.getKey() + "" + entry.getValue() + "\n");
		};
		return s; 
	}
}