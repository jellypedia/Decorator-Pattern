public class CaramelDecorator extends AddOnDecorator{
    Beverage beverage;
    int ctr = 0;
    public CaramelDecorator(Beverage b) {
        this.beverage = b;
        getPumps();
    }
    @Override
    public String getDesc() {
        if(ctr == 1) {
            return this.beverage.getDesc() + " with Caramel";
        } else {
            return this.beverage.getDesc() + " with " + (getPumps()-1) + " pumps of Caramel";
        }
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 29.00;
    }

    @Override
    public int getPumps() {
        ctr++;
        return ctr;
    }
}
