public class Client {

    public static void main(String[] args) {

        Context context = new Context();

        System.out.println("Vehicle is moving at normal speed");
        context.setBehaviour(new Normal());
        context.run();

        System.out.println("Vehicle is moving at high speed");
        context.setBehaviour(new HighSpeed());
        context.run();

        System.out.println("vehicle is moving at nitro speed");
        context.setBehaviour(new NitroSpeed());
        context.run();


    }

}
