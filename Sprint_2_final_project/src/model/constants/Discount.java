package model.constants;
import model.Food;

public class Discount {

    Food[] array = new Food[3];

    //инизиализирую массив существующих объектов, чтобы в дальнейшем посчитать скидку
    public Discount(Food[] newArray){
        this.array = newArray;
    }

    public Discount(){    }

    //создается массив, в котором будут храниться скидки в рублях по каждой позиции
    double[] discountArray = new double [3];
    public void fillingDiscountArray(){
        for(int i = 0; i < array.length; i ++){
            discountArray[i] = array[i].getAmount() * array[i].getPrice() / 100 * array[i].getDiscount();
        }
    }
    //печатает общую сумму скидки
    public void printTotalDiscount(){
        double sumOfDiscount = 0.0;
        for(int i = 0; i < array.length; i++){
            sumOfDiscount += discountArray[i];
        }
        System.out.println(sumOfDiscount);
    }

}
