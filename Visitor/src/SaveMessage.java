public class SaveMessage implements IVisitor {

    @Override
    public void visit(NormalUser normalUser) {
        System.out.println("Normal users don't have save message feature.");
    }

    @Override
    public void visit(PremiumUser premiumUser) {
        System.out.println("Saving messages for premium users.");
    }

    @Override
    public void visit(GoldUser goldUser) {
        System.out.println("Saving messages for gold users.");
    }

}
