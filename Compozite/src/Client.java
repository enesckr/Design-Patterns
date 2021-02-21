public class Client {

    public static void main(String[] args) {

        Designer designer = new Designer(3535,"Designano");
        Designer designer2 = new Designer(3559,"Designanter");
        HumanResources hrDesigner = new HumanResources();
        hrDesigner.addStaff(designer);
        hrDesigner.addStaff(designer2);

        Manager manager = new Manager(1907,"Manageno");
        Manager manager2 = new Manager(6126,"Managenanter");
        HumanResources hrManager = new HumanResources();
        hrManager.addStaff(manager);
        hrManager.addStaff(manager2);

        HumanResources hrRoot = new HumanResources();
        hrRoot.addStaff(hrDesigner);
        hrRoot.addStaff(hrManager);
        hrRoot.displayInfo();

    }
}
