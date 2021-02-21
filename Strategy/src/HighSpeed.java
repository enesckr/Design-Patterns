public class HighSpeed extends Behaviour {
    @Override
    public void setState() {
        state = 1;
    }

    @Override
    public void setColor() {
        color = "Orange";
    }

    @Override
    public void setAccCoef() {
        acc_coefficient = 2;
    }

    @Override
    public void setMaxSpeed() {
        max_speed = 400;
    }

    @Override
    public void setNitro() {
        nitro = false;
    }
}
