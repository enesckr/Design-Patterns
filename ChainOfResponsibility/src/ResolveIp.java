public class ResolveIp {

    public static int get(String ip) {
        String[] sections = ip.split("\\.");
        if (sections.length > 0) {
            return Integer.parseInt(sections[0]);
        }
        return 300;
    }

}
