public abstract class AddOnDecorator extends Beverage{
    Beverage beverage;
    public AddOnDecorator(Beverage b) {
        this.beverage = b;
    }

}
