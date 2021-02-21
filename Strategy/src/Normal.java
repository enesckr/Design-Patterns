public class Normal extends Behaviour {
    @Override
    public void setState() {
        state = 0;
    }

    @Override
    public void setColor() {
        color = "Yellow";
    }

    @Override
    public void setAccCoef() {
        acc_coefficient = 1;
    }

    @Override
    public void setMaxSpeed() {
        max_speed = 200;
    }

    @Override
    public void setNitro() {
        nitro = false;
    }
}
