import java.util.Random;

public class DicePairYI extends DiceYI
{
    private int[] arr = new int[2];

    //A
    DicePairYI()
    {
        super(3);
        super.roll();
        arr[0] = super.getValue();
        super.roll();
        arr[1] = super.getValue();
    }
    
    //B
    DicePairYI(int data)
    {
        super(data);
        if (data < 1 || data > 6)
        {
            System.out.println("Value Error!");
        }
        else
        {
            arr[0] = data;
            arr[1] = data;
        }
    }
    
    //C
    public int getValue1()
    {
        return arr[0];
    }
    
    public int getValue2()
    {
        return arr[1];
    }
    
    //D
    public int getTotal()
    {
        return arr[0] + arr[1];
    }
    
    //E
    public void setValue1(int data)
    {
        super.setValue(data);
        arr[0] = super.getValue();
    }
    
    public void setValue2(int data)
    {
        super.setValue(data);
        arr[1] = super.getValue();
    }
    
    //F
    public void roll()
    {
        Random rand = new Random();
        int rand_num1 = rand.nextInt(6 - 1) + 1;
        int rand_num2 = rand.nextInt(6 - 1) + 1;
        arr[0] = rand_num1;
        arr[1] = rand_num2;
    }
    
    
    //G
    public String toString()
    {
        String num1 = Integer.toString(arr[0]);
        String num2 = Integer.toString(arr[1]);
        
        return num1 + ", " + num2;
    }
    
    
    //H
    public boolean equals(int face1, int face2)
    {
        if ((face1 == arr[0] && face2 == arr[1]) || (face1 == arr[1] && face2 == arr[0]))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    //I
    public void printMe()
    {
        System.out.print("\n" + toString());
    }
    
}
