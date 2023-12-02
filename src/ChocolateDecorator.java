public class ChocolateDecorator extends AddOnDecorator {
    public ChocolateDecorator(Beverage b) {
        super(b);
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + " with Chocolate";
    }

    @Override
    public double cost() {
        return beverage.cost() + 39;
    }

}
