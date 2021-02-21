public class ClosedState implements IState {

    DroneWork droneWork;

    public ClosedState(DroneWork droneWork) {
        this.droneWork = droneWork;
    }

    @Override
    public void stop() {
        System.out.println("Drone is already closed.");
    }

    @Override
    public void raise() {
        System.out.println("The drone must works on the ground !");
    }

    @Override
    public void onFloor() {
        System.out.println("The drone is working on the floor ...");
        droneWork.setState(droneWork.floorState);
        //State changed
    }
}
