public class Request {

    enum Type {
        GET, POST, DELETE
    }

    private String ip;
    private Type type;

    public Request(String ip, Type type) {
        setType(type);
        setIp(ip);
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
