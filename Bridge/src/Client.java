public class Client {
    public static void main(String[] args) {

        ITheme theme = new Dark();
        UI ui = new WinUI(theme);
        ui.createUI();

        theme = new Light();
        ui = new LinuxUI(theme);
        ui.createUI();

    }
}
