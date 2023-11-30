public class ChocolateDecorator extends AddOnDecorator {
    Beverage beverage;
    int ctr = 0;
    public ChocolateDecorator(Beverage b) {
        this.beverage = b;
        getPumps();
    }

    @Override
    public String getDesc() {
        if(getPumps() != 1) {
            return this.beverage.getDesc() + " with Chocolate";
        } else {
            return this.beverage.getDesc() + "(" + (getPumps()-1) + ")";
        }
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 39.00;
    }

    @Override
    public int getPumps() {
        ctr++;
        return ctr;
    }
}
