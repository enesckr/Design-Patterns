public class WinUI extends UI {

    ITheme theme;

    public WinUI(ITheme theme) {
        this.theme = theme;
    }

    @Override
    public void createUI() {
        String themeParam = theme.createTheme();
        System.out.println("Created WinUI with " + themeParam);
    }
}
