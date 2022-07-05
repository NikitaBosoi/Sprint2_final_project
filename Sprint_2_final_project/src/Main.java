import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Discount;
import service.ShoppingCart;

public class Main {

    public static void main(String[] args) {

        //основная инициализация массива
        Food[] arrOfFoods = {
                new Meat(5, 100),
                new Apple(10, 50, "red"),
                new Apple(8, 60, "green")
        };

        ShoppingCart cart = new ShoppingCart(arrOfFoods);
        Discount disc = new Discount(arrOfFoods);

        disc.fillingDiscountArray();
        cart.totalSumOfProduct();
        cart.totalSumWithDiscount();
        disc.printTotalDiscount();
        cart.totalSumOfVeganProduct();

    }


}
