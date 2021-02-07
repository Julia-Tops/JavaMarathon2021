package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscription;

    public User(String username) {
        this.username = username;
        this.subscription = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<User> getSubscriptions() {
        return subscription;
    }

    public void setSubscription(List<User> subscription) {
        this.subscription = subscription;
    }

    public void subscribe(User user){
        this.subscription.add(user);
    }

    public boolean isSubscribed(User user){
        for (User currentUser : this.subscription
             ) {
            if(currentUser.getUsername().equals(user.getUsername())){
                return true;
            }
        }
        return false;
    }

    public boolean isFriend(User user) {
    return this.isSubscribed(user) && user.isSubscribed(this);
    }

    public void sendMessage(User user, String text){
        Message message = new Message(this, user, text);
        MessageDatabase.addNewMessage(this,user,text);
    }

    @Override
    public String toString() {
        return  username + "\n";
    }
}
