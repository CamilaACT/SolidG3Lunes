package isp;
public class Main {
    public static void main(String[] args) {
        Switchable phone = new Phone();
        Switchable camera = new DisposableCamera();

        phone.turnOn();
        ((Chargeable) phone).charge();

        camera.turnOn();

    }
}
