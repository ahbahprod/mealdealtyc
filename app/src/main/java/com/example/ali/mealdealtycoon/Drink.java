package com.example.ali.mealdealtycoon;

/**
 * Created by Ali on 18/11/2016.
 */

public class Drink extends MealDealItem
{
    boolean fizzy;

    //get methods
    public boolean isFizzy()
    {
        return fizzy;
    }
    // end get methods

    // set methods
    public void setFizzy(boolean isFizzy)
    {
        fizzy = isFizzy;
    }
}
