package JavaInterviewPreparation.GetterSetterExample;

public class GetterSetterExample {
    private String message = "This is GetterSetterExample class";

    protected String getString() {
        return message;
    }

    protected void setString(String newMessage) {
        message = newMessage;
    }

    public static void main(String[] args) {
        GetterSetterExample gse = new GetterSetterExample();
        System.out.println(gse.getString());
        gse.setString("This is modified GetterSetterExample message");
        System.out.println(gse.getString());
    }
}
