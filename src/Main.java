import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char addon;

        System.out.println("Enter what drink to order (Decaf or Espresso): ");
        String input = sc.nextLine();
        Beverage drink = null;

        switch(input) {
            case "Decaf":
                drink = new Decaf();
                break;
            case "Espresso":
                drink = new Espresso();
                break;
        }

            System.out.println("Would you like to add any add-ons? Y/N: ");
            addon = sc.next().charAt(0);

            if(addon == 'Y') {
                System.out.println("Chocolate or Caramel?");
                sc.nextLine();
                String add = sc.nextLine();

                switch (add) {
                    case "Chocolate":
                        drink = new ChocolateDecorator(drink);
                        break;
                    case "Caramel":
                        drink = new CaramelDecorator(drink);
                        break;
                    default:
                        System.out.println("That add-on does not exist.");
                        break;
                }
            }
        System.out.print("Your drink is " + drink.getDesc() + " it costs " + drink.cost());

    }
}
