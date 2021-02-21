public class Context {
    Behaviour behaviour;

    public void setBehaviour(Behaviour behaviour) {
        this.behaviour = behaviour;
    }

    public void run() {
        try {
            behaviour.setState();
            behaviour.setAccCoef();
            behaviour.setColor();
            behaviour.setMaxSpeed();
            behaviour.setNitro();
            behaviour.display();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
