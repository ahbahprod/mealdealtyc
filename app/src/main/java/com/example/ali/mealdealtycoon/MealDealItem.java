package com.example.ali.mealdealtycoon;

/**
 * Created by Ali on 18/11/2016.
 */

public class MealDealItem
{
    int tier;
    String name;
    //image property
    boolean vegan;
    boolean vegi;
    boolean glutenFree;
    int rating;
    double cost;

    // get methods
    public int getTier()
    {
        return tier;
    }
    public String getName()
    {
        return name;
    }
    public boolean isVegan()
    {
        return vegan;
    }
    public boolean isVegi()
    {
        return vegi;
    }
    public boolean isGlutenFree()
    {
        return glutenFree;
    }
    public int getRating()
    {
        return rating;
    }
    public double getCost()
    {
        return cost;
    }
    // end get

    // set
    public void setTier(int inTier)
    {
        tier = inTier;
    }
    public void setName(String inName)
    {
        name = inName;
    }
    public void setVegan(boolean isVegan)
    {
        vegan = isVegan;
    }
    public void setVegi(boolean isVegi)
    {
        vegi = isVegi;
    }
    public void setGlutenFree(boolean isGlutenFree)
    {
        glutenFree = isGlutenFree;
    }
    public void setRating(int inRating)
    {
        rating = inRating;
    }
    public void setCost(double inCost)
    {
        cost = inCost;
    }
    // end set methods
}