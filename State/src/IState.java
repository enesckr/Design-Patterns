public interface IState {
    void stop();

    void raise();

    void onFloor();
}
