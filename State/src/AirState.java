public class AirState implements IState {

    DroneWork droneWork;

    public AirState(DroneWork droneWork) {
        this.droneWork = droneWork;
    }

    @Override
    public void stop() {
        System.out.println("You should lower it to the floor for stop it. ");
    }

    @Override
    public void raise() {
        System.out.println("The drone is already in the air.");
    }

    @Override
    public void onFloor() {
        System.out.println("The drone is lowering ...");
        droneWork.setState(droneWork.floorState);
        //State changed
    }
}
