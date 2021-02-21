public class Designer implements IStaff {

    private int corpId;
    private String name;

    public Designer(int corpId, String name) {
        setCorpId(corpId);
        setName(name);
    }

    public int getCorpId() {
        return corpId;
    }

    public void setCorpId(int corpId) {
        this.corpId = corpId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void displayInfo() {
        System.out.println(getCorpId() + " - " + getName());
    }
}
