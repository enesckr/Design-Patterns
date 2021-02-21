public abstract class Service {

    private Service next;

    public Service getNext() {
        return next;
    }

    public void setNext(Service next) {
        this.next = next;
    }

    public abstract void implement(Request request);



//        int firstIp = ResolveIp.get(request.getIp());
//
//        if (firstIp < 100) {
//            System.out.println("Type of Local Network");
//        } else if (firstIp < 200) {
//            System.out.println("Type of Intranet Network");
//        } else if (firstIp < 255) {
//            System.out.println("Type of Internet Network");
//        } else {
//            System.out.println("Error");
//        }

}
