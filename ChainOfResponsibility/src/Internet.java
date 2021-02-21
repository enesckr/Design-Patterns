public class Internet extends Service {
    @Override
    public void implement(Request request) {

        int firstIp = ResolveIp.get(request.getIp());

        if (firstIp < 255 && firstIp > 200) {
            System.out.println(request.getType() + " request was made to the " + request.getIp() + " address on the Internet network");
        } else {
            if (getNext() != null) {
                getNext().implement(request);
            }
        }
    }
}
