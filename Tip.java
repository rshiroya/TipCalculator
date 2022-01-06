    
/**
 * This class holds data for a tip one would leave at restaurant.
 *
 * @author R. Shiroya
 * @version 01-16-2020
 */
public class Tip
{
    //fields are declared outside of any method.
    private double mealPrice;
    private double percent;
    private double tipAmount;
    
    // this is a constuctor method
    public Tip(double inMealPrice, double inPercent)
    {
        mealPrice = inMealPrice;
        percent = inPercent;
        tipAmount = mealPrice * (percent/100);
    }
    // this is a default constructor.
    public Tip()
    {
        mealPrice = 0;
        percent = 0;
        tipAmount = 0;
    }
    
    //set() methods                 
    public void setMealPrice(double inMealPrice)
    {
       if(inMealPrice >=0)
       {
           mealPrice = inMealPrice;
        }
       tipAmount = mealPrice * (percent/100);
    }
    public void setPercent(double inPercent)
    {
        percent = inPercent;
        tipAmount = mealPrice * (percent/100);
    }
    
    //get() methods
    public double getMealPrice()
    {
        return mealPrice;
    }
    
    public double getPercent()
    {
        return percent;
    }
    
    public double getTipAmount()
    {
        return tipAmount;
    }
    
    
}
