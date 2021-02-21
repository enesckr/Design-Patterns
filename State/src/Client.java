public class Client {
    public static void main(String[] args) {

        DroneWork droneWork = new DroneWork();

        droneWork.raise();
        droneWork.stop();
        droneWork.onFloor();
        droneWork.raise();
        droneWork.stop();
        droneWork.onFloor();
        droneWork.stop();

    }
}
