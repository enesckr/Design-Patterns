public class Light implements ITheme{
    @Override
    public String createTheme() {
        System.out.println(" --> Light Theme");
        return "Light";
    }
}
