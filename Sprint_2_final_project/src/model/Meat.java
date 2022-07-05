package model;

public class Meat extends Food{

    //конструктор класса Meat
    public Meat(int newAmount, double newPrice){
        isVegetarian = false;
        price = newPrice;
        amount = newAmount;
    }

    //реализация интерфейса Discountable
    @Override
    public double getDiscount(){
        return 0;
    }



}
