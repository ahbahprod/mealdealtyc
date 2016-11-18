package com.example.ali.mealdealtycoon;

/**
 * Created by Ali on 18/11/2016.
 */

public class MealDeal
{
    Main main;
    Side side;
    Drink drink;
    int rating;
    double totalCost;
    int stock;

    // constuctor
    public MealDeal(Main inMain, Side inSide, Drink inDrink)
    {
        main = inMain;
        side = inSide;
        drink = inDrink;
        rating = (main.getRating() + side.getRating() + drink.getRating()) / 3;
        totalCost = main.getCost() + side.getCost() + drink.getCost();
    }

    //get methods;
    public Main getMain()
    {
        return main;
    }
    public Side getSide()
    {
        return side;
    }
    public Drink getDrink()
    {
        return drink;
    }
    public int getStock()
    {
        return stock;
    }
    public Double getCost()
    {
        return totalCost;
    }
    // end gets

    // set methods
    public void setStock(int num)
    {
        stock = num;
    }
    // end set

    //decrement function
    public void stockDecrement()
    {
        stock--;
    }
}
