public class NitroSpeed extends Behaviour {
    @Override
    public void setState() {
        state = 2;
    }

    @Override
    public void setColor() {
        color = "Red";
    }

    @Override
    public void setAccCoef() {
        acc_coefficient = 3;
    }

    @Override
    public void setMaxSpeed() {
        max_speed = 600;
    }

    @Override
    public void setNitro() {
        nitro = true;
    }
}
