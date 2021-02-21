public class DroneWork {
    public IState closedState;
    public IState floorState;
    public IState airState;

    IState now;

    public DroneWork() {
        closedState = new ClosedState(this);
        floorState = new FloorState(this);
        airState = new AirState(this);
        now = closedState;
    }

    public IState getState() {
        return now;
    }

    public void setState(IState state) {
        now = state;
    }

    public void stop() {
        now.stop();
    }

    public void onFloor() {
        now.onFloor();
    }

    public void raise() {
        now.raise();
    }

}
