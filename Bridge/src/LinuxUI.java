public class LinuxUI extends UI {

    ITheme theme;

    public LinuxUI(ITheme theme) {
        this.theme = theme;
    }

    @Override
    public void createUI() {
        String themeParam = theme.createTheme();
        System.out.println("Created LinuxUI with " + themeParam);
    }
}
