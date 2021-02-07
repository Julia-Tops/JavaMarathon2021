package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Ann");
        User user2 = new User("Misha");
        User user3 = new User("Tima");

        user1.sendMessage(user2, "Hi");
        user1.sendMessage(user2, "How are you?");
        user2.sendMessage(user1, "Hi");
        user2.sendMessage(user1, "Fine");
        user2.sendMessage(user1, "And you?");
        user3.sendMessage(user1, "Hello!");
        user3.sendMessage(user1, "What are you doing?");
        user3.sendMessage(user1, "Help me");
        user1.sendMessage(user3, "Hi");
        user1.sendMessage(user3, "I'm watching TV");
        user1.sendMessage(user3, "What's happened?");
        user3.sendMessage(user1, "I can't remember the apple pie receipt");

        MessageDatabase.showDialog(user1, user3);








    }
}
