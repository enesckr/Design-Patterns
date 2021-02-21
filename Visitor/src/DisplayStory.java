public class DisplayStory implements IVisitor {

    @Override
    public void visit(NormalUser normalUser) {
        System.out.println("Displaying stories for normal users.");
    }

    @Override
    public void visit(PremiumUser premiumUser) {
        System.out.println("Displaying stories for premium users.");
    }

    @Override
    public void visit(GoldUser goldUser) {
        System.out.println("Displaying stories for gold users.");
    }

}
