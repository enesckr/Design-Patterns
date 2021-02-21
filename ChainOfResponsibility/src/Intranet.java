public class Intranet extends Service {
    @Override
    public void implement(Request request) {

        int firstIp = ResolveIp.get(request.getIp());

        if (firstIp < 200 && firstIp > 100) {
            System.out.println(request.getType() + " request was made to the " + request.getIp() + " address on the Intranet network");
        } else {
            if (getNext() != null) {
                getNext().implement(request);
            }
        }
    }
}
