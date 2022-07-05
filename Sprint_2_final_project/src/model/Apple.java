package model;


import model.constants.Colour;

public class Apple extends Food {

    public String discColour;
    Colour colour = new Colour();

    // конструктор класса Apple
    public Apple(int newAmount, double newPrice, String newColour){
        amount = newAmount;
        price = newPrice;
        isVegetarian = true;
        this.discColour = newColour;

    }

    //реализация интерфейса Discountable
    @Override
    public double getDiscount(){
        if(this.discColour == colour.RED){
            return 60.00;
        } else {
            return 0.0;
        }
    }

}
