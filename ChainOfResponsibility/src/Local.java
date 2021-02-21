public class Local extends Service {
    @Override
    public void implement(Request request) {

        int firstIp = ResolveIp.get(request.getIp());

        if (firstIp < 100) {
            System.out.println(request.getType() + " request was made to the " + request.getIp() + " address on the Local network");
        } else {
            if (getNext() != null) {
                getNext().implement(request);
            }
        }

    }
}
