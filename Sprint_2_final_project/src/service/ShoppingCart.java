package service;
import model.Apple;
import model.Food;
import model.constants.Discount;

public class ShoppingCart{

    Food[] array = new Food[3];

    //инициализирую массив существующиъ объектов, чтобы можно было посчитать сумму, количество, скидку и тд
    public ShoppingCart(Food[] newArray){
        array = newArray;
    }
    Discount discount = new Discount();

    //считает общее количество всех продуктов в корзине
    public int totalSumOfProduct(){
        int totalAmount = 0;
        for(int i = 0; i < array.length; i++){
            totalAmount += array[i].getAmount();
        }
        System.out.println(totalAmount);
        return totalAmount;
    }
    //считает общее количество только веганский продуктов
    public void totalSumOfVeganProduct(){
        int totalAmount = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i].getIsVegetarian() == false){
                continue;
            }
            totalAmount += array[i].getAmount();
        }
        System.out.println(totalAmount);
    }
    //считает сумму товаров в корзине с учетом скидки
    public double totalSumWithDiscount(){
        double totalPriceWithDiscount = 0.0;
        double notTotalDiscount = 0.0;
        for (int i = 0; i < array.length; i++){
            notTotalDiscount =(array[i].getAmount() * array[i].getPrice() - ((array[i].getAmount() * array[i].getPrice()) / 100 * array[i].getDiscount()));
            totalPriceWithDiscount += notTotalDiscount;
        }
        return totalPriceWithDiscount;
    }




}
