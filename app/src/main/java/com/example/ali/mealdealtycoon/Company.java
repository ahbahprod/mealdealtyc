package com.example.ali.mealdealtycoon;

/**
 * Created by Ali on 18/11/2016.
 */

public class Company {
    String companyName;
    double money = 500.00;
    int numActiveDeals;
    MealDeal[] activeMealDeals;

    public Company(String name)
    {
        companyName = name;
        numActiveDeals = 0;
    }

    // get Methods
    public double getMoney()
    {
        return money;
    }
    public String getName()
    {
        return companyName;
    }
    public int getNumActive()
    {
        return numActiveDeals;
    }
    public MealDeal[] getActiveMealDeals()
    {
        return activeMealDeals;
    }
    // end get

    // changes money amount     change amount can be positive or negative
    public void changeMoney(double changeAmount)
    {
        money += changeAmount;
    }

    // add meal deal to active array
    public void addMealDeal(Main main, Side side, Drink drink, int qunatity)
    {
        MealDeal mealDeal = new MealDeal(main, side, drink);
        mealDeal.setStock(qunatity);
        changeMoney(mealDeal.getCost() * qunatity);
        activeMealDeals[numActiveDeals] = mealDeal;
    }
}
