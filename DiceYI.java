import java.util.Random;
public class DiceYI
{
    
    private int value;
    
    //A
    DiceYI(int initialValue)
    {
        if (initialValue < 1 || initialValue > 6)
        {
            System.out.println("Value Error!");
        }
        else
        {
            value = initialValue;
        }
        
    }
    
    //B
    public int getValue()
    {
        return value;
    }
    
    //C
    public void setValue(int data)
    {
        if (data < 1 || data > 6)
        {
            System.out.println("Value Error!");
        }
        else
        {
            value = data;
        }
    }
    
    //D
    public void roll()
    {
        Random rand = new Random();
        int randomInt = rand.nextInt(6 - 1) + 1;
        value = randomInt;
    }
    
    //E
    public String toString()
    {
        return Integer.toString(value);
    }
    
    public void printMe()
    {
        System.out.println(toString());
    }
    
    
    
}








