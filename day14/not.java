package day14;

abstract class Notification {
    protected String sender;
    protected String receiver;
    protected String message;

    public Notification(String sender, String receiver, String message) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
    }

    public abstract void send();

    public abstract void receive();
}
public class not
{
    public static void main(String[] args)

    {

        Notification sms =new Notification("ნიკა" , "მარიამი", "გამარჯობ") {


            @Override

            public void send()
            {
                System.out.println("გაგზავნა:"+ message +" | გამომგზავნი: "+ sender);
            }
            @Override

            public void receive()
            {
                System.out.println("მიღება: " + message + " | მიმღები: " + receiver);
            }
        };
        sms.send();
        sms.receive();
    }
}
