import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create Users
        User user1 = new User("John", 25, Sex.MALE);
        User user2 = new User("Alice", 30, Sex.FEMALE);

        // Create Posts
        Post post1 = new Post(user1, "Hello, world!");
        Post post2 = new Post(user2, "Goodbye, world!");

        // Create Comments
        Comment comment1 = new Comment("Nice post!");
        Comment comment2 = new Comment("I disagree.");

        // Add comments to posts
        user2.comment(post1, comment1);
        user1.comment(post2, comment2);

        // Like posts
        user1.hasLike(post2);
        user2.hasLike(post2);

        // Create GroupChat
        GroupChat groupChat = new GroupChat(user1);

        // Add users to the GroupChat
        groupChat.addUser(user2);

        // Send messages in GroupChat
        Message message1 = new Message("Hello, everyone!");
        Message message2 = new Message("How are you all doing?");

        user1.sendMessage(user2, message1);
        user2.sendMessage(user1, message2);
        groupChat.addMessage(user1, message1);
        groupChat.addMessage(user2, message2);

        // Print user details and their chats
        //System.out.println(user1.toString());
        //System.out.println(user2.toString());

        // Print posts and comments
        //System.out.println(post1.toString());
        //System.out.println(post2.toString());

        // Print GroupChat details
        System.out.println(groupChat.toString());
        System.out.println(user2.getChatBoxString());
    }
}
