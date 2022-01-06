
/**
 * This class will create an instance of the Tip class and call its methods to calculate and display dipper tip amounts.
 *
 * @author (R. Shiroya)
 * @version (01-21-2020)
 */
import java.util.Scanner;
public class TipDriver
{
    public static void main(String[] args)
    {
        Scanner in;
        double price;
        double percent;
        char goAgain;
        char choice;
        
        in = new Scanner(System.in);

        Tip myTip;
        
        
        System.out.print("Enter the price of the meal: ");
        price = in.nextDouble();
        System.out.print("Enter the percent of the tip: ");
        percent = in.nextDouble();
        myTip = new Tip(price, percent);
        System.out.println("Here is the ti[ you should leave: " + myTip.getTipAmount());
        
        goAgain = 'y';
        while(goAgain == 'y')
        {
            System.out.print("Enter m if you want to change the meal price or a p if you want to change the percent: ");
            choice = in.next().charAt(0);
            if(choice == 'm')
            {
                
                System.out.print("Enter the new meal price: ");
                price = in.nextDouble();
                myTip.setMealPrice(price);
            }
            else
            {
                System.out.print("Enter the percent: ");
                percent = in.nextDouble();
                myTip.setPercent(percent);
            }
            System.out.println("Here is the ti[ you should leave: " + myTip.getTipAmount());
            System.out.print("Enter a y to change something else: "); 
            goAgain = in.next().charAt(0);
        }
        
        
        
    }
}
