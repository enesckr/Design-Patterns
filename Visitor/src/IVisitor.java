public interface IVisitor {

    void visit(NormalUser normalUser);

    void visit(PremiumUser premiumUser);

    void visit(GoldUser goldUser);

}
