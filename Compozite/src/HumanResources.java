import java.util.ArrayList;
import java.util.List;

public class HumanResources implements IStaff {

    private int corpId;
    private String name;
    private List<IStaff> staffList;

    public HumanResources() {
        staffList = new ArrayList<>();
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

    public void addStaff(IStaff staff) {
        staffList.add(staff);
    }

    public void removeStaff(IStaff staff) {
        staffList.remove(staff);
    }

    @Override
    public void displayInfo() {
        for (IStaff staff: staffList) {
            staff.displayInfo();
        }
    }
}
