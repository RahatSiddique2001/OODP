// package MediatorPattern.ChatRoom;

public class ChatRoomDemo {

    public static void main(String[] args) {
        User alim = new User("Alim");
        User john = new User("John");

        alim.sendMessage("Hello! John!");
        john.sendMessage("Hello! Alim!");
    }
    
}
