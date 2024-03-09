package main.code;
public class MessageUtil {

    private String message;

    public MessageUtil(){
        this.message = "Default";
    }

    public MessageUtil(String message){
        this.message = message;
    }

    public String printMessage(){
        System.out.println(message);
        return message;
    }

    public String printMessage(String m)
    {
        System.out.println(message);
        return message;
    }
}