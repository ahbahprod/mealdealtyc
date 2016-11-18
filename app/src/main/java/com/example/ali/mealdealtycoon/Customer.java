package com.example.ali.mealdealtycoon;

/**
 * Created by Owen on 18/11/2016.
 */

public class Customer {
    //declarations
    String cusType;
    boolean isVegi;
    boolean isVegan;
    boolean noGluten;
    float[] drinkPref;
    float[] mainPref;
    float[] sidePref;

    //getmethods;
    public String getCusType() {return cusType; }
    public boolean areVegan()
    {
        return isVegan;
    }
    public boolean areVegi()
    {
        return isVegi;
    }
    public boolean areNoGluten()
    {
        return noGluten;
    }
    //gets preference amount as float based on id and type
    public float getPref( String type, int id ) {
        switch (type) {
            case "drink":
                return drinkPref[id - 1];
            case "main":
                return mainPref[id - 1];
            case "side":
                return sidePref[id - 1];
            default:
                return 0;
        }
    }
    //end getmethods

    //set methods
    public void setCustType(String typeCust)
    {
        cusType = typeCust;
    }
    public void setVegan(boolean vegan)
    {
        isVegan = vegan;
    }
    public void setVegi(boolean vegi)
    {
        isVegi = vegi;
    }
    public void setGlutenFree(boolean isGlutenFree)
    {
        noGluten = isGlutenFree;
    }
    //sets pref based on type and id
    public void setPref (String type, int id, float pref){
        switch (type) {
            case "drink":
                drinkPref[id-1] = pref;
                break;
            case "main":
                mainPref[id-1] = pref;
                break;
            case "side":
                sidePref[id-1] = pref;
                break;
        }
    }
    //end setmethods
}
