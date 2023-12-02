public class CaramelDecorator extends AddOnDecorator{
    int ctr = 0;
    public CaramelDecorator(Beverage b) {
        super(b);
        ctr++;
    }
    @Override
    public String getDesc() {
        return beverage.getDesc() + " with Caramel";
    }

    @Override
    public double cost() {
        return beverage.cost() + 29.00;
    }

}
