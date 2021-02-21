import java.time.LocalDateTime;

public abstract class Behaviour {
    protected int state = 0;
    protected String color = "White";
    protected int acc_coefficient = 1;
    protected int max_speed = 200;
    protected boolean nitro = false;

    public abstract void setState();

    public abstract void setColor();

    public abstract void setAccCoef();

    public abstract void setMaxSpeed();

    public abstract void setNitro();

    public void display() {
        System.out.println(LocalDateTime.now());
        System.out.println(
                "state=" + state +
                        ", color='" + color + '\'' +
                        ", acc_coefficient=" + acc_coefficient +
                        ", max_speed=" + max_speed +
                        ", nitro=" + nitro);
    }
}
