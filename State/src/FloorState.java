public class FloorState implements IState {

    DroneWork droneWork;

    public FloorState(DroneWork droneWork) {
        this.droneWork = droneWork;
    }

    @Override
    public void stop() {
        System.out.println("The drone is stopped.");
        droneWork.setState(droneWork.closedState);
        //State changed
    }

    @Override
    public void raise() {
        System.out.println("The drone is rising ...");
        droneWork.setState(droneWork.airState);
        //State changed
    }

    @Override
    public void onFloor() {
        System.out.println("The drone is already working on the floor.");
    }
}
