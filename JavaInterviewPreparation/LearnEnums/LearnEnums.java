package JavaInterviewPreparation.LearnEnums;

public class LearnEnums {
    enum Transport {
        PLANE(600), CAR(100), BUS(50);

        int speed = 0;

        Transport(int s) {
            speed = s;
        }
    }

    public static void main(String[] args) {
        Transport transport = Transport.PLANE;
        if (transport == Transport.PLANE) {
            System.out.println("Plane it is");
        }
        Transport allTransports[] = Transport.values();
        for (Transport t : allTransports) System.out.println(t + " ");
        System.out.println(Transport.CAR.speed);
        Transport t = Transport.CAR;
        System.out.println(t.ordinal());
        if (t.ordinal() < 2) {
            System.out.println("Not a bus");
        }
    }
}