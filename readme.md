# Social Media

This repository  provides a set of classes for simulating a basic chat application. It includes classes for managing users, posts, comments, group chats, and messages. This serves as a foundation for building chat-based applications.

## Classes
The library includes the following classes:

### Comment
Represents a comment made on a post.

Methods:
- `toString()`: Returns a string representation of the comment.

### Message
Represents a message sent by a user.

Methods:
- `toString()`: Returns a string representation of the message.

### Post
Represents a post made by a user, including comments and likes.

Methods:
- `addComment(Comment c)`: Adds a comment to the post.
- `removeComment(Comment c)`: Removes a comment from the post.
- `like()`: Increases the number of likes for the post.
- `removeLike()`: Decreases the number of likes for the post.
- `getUser()`: Returns the user who posted the post.
- `toString()`: Returns a string representation of the post.

### GroupChat
Represents a group chat with multiple users.

Methods:
- `addUser(User u)`: Adds a user to the group chat.
- `removeUser(User u)`: Removes a user from the group chat.
- `addMessage(User u, Message m)`: Adds a message to the group chat.
- `removeMessage(User u, Message m)`: Removes a message from the group chat.
- `toString()`: Returns a string representation of the group chat.

### User
Represents a user in the chat application.

Methods:
- `hasLike(Post p)`: Likes a post.
- `unLike(Post p)`: Removes a like from a post.
- `comment(Post p, Comment c)`: Adds a comment to a post.
- `deleteComment(Post p, Comment c)`: Removes a comment from a post.
- `addMemberToGroupChat(User u, GroupChat g)`: Adds a member to a group chat.
- `removeMemberToGroupChat(User u, GroupChat g)`: Removes a member from a group chat.
- `sendMessage(User u, Message m)`: Sends a message to another user.
- `removeMessage(User u, Message m)`: Removes a message from the user's chat box.
- `getChatBox()`: Returns the user's chat box.
- `setAge(int age)`: Sets the user's age.
- `setSex(Sex s)`: Sets the user's sex.
- `getAge()`: Returns the user's age.
- `getSex()`: Returns the user's sex.
- `getName()`: Returns the user's name.
- `toString()`: Returns a string representation of the user.

### ChatBox
Represents the chat box of a user, containing messages.

Methods:
- `addMessageToChatBox(User u, Message m)`: Adds a message to the chat box.
- `removeMessageToChatBox(User u, Message m)`: Removes a message from the chat box.
- `toString()`: Returns a string representation of the chat box.

### Sex (Enum)
Represents the sex of a user.

Enum Values:
- `MALE`
- `FEMALE`

## How to Use
To use this in your project, follow these steps:

1. Clone the repository or download the source code files.
2. Import the necessary classes into your project.
3. Create instances of the classes and use their methods to interact with the chat functionality.
4. Build your application around the provided classes or extend them to suit your specific requirements.

Please note that this code provides a basic implementation and may require additional modifications to meet your specific needs. Feel free to customize and extend the code to suit your application requirements.

## How to Contribute
Contributions to this project are welcome. If you would like to contribute, please follow these guidelines:

1. Fork the repository.
2. Make your changes or additions in your forked repository.
3. Test your changes thoroughly.
4. Create a pull request, explaining the purpose and details of your contribution.

Your contribution can include bug fixes, new features, improvements to existing features, or documentation enhancements.

## Credits
The problem were introduced by Sir Jomari Joseph Barera. I acknowledge his valuable contribution to the development of this project.
