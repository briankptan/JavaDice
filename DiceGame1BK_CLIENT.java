
public class DiceGame1BK_CLIENT
{
    //C
    static void play(DicePairYI dicePair, int[] score)
    {
        int n = 0;
        int goal = 0;
        while (n < 20)
        {
            dicePair.roll();
            //D
            score[n] = dicePair.getTotal();
            if (n == 0) // very first roll
            {
                if (score[n] == 7 || score[n] == 11)
                {
                    System.out.print("You win: ");
                    n = 20;
                }
                else if (score[n] == 2 || score[n] == 3 || score[n] == 12)
                {
                    System.out.print("You lose: ");
                    n = 20;
                }
                else
                {
                    goal = score[n];
                }
            }
            else
            {
                if (score[n] == 7)
                {
                    System.out.print("You lose: ");
                    n = 20;
                }
                else if (score[n] == goal)
                {
                    System.out.print("You win: ");
                    n = 20;
                }
                else if (n == 19)
                {
                    System.out.print("You lose: ");
                    n = 20;
                }
            }
            n++;
        }
    }
    
    //E
    static void printArray(int[] score)
    {
        for (int i = 0; i < 20; i++)
        {
            if (i == 5 || i == 10 || i == 15)
            {
                System.out.print("- ");
            }
            System.out.print(score[i] + " ");
        }
    }
    
    public static void main(String[] args)
    {
        //A
        DicePairYI dicePair = new DicePairYI();
        //B
        int[] score = new int[20];
        
        for (int i = 0; i < 20; i++)
        {
            score[i] = 0;
        }
        
        play(dicePair, score);
        printArray(score);
        
        // DiceYI game1 = new DiceYI(5);
        // System.out.println("GET VALUE: " + game1.getValue()); // 5
        // game1.setValue(2);
        // System.out.println("GET VALUE: " + game1.getValue()); // 2
        // game1.roll();
        // game1.printMe();
        
        // DicePairYI dicePair1 = new DicePairYI();
        // DicePairYI dicePair2 = new DicePairYI();
        // System.out.println("GET VALUE D1 1 of 2: " + dicePair1.getValue1());
        // System.out.println("GET VALUE D1 2 of 2: " + dicePair1.getValue2());
        
        // System.out.println("GET VALUE D2 1 of 2: " + dicePair2.getValue1());
        // System.out.println("GET VALUE D2 2 of 2: " + dicePair2.getValue2());
        
        // System.out.println("GET TOTAL FOR D1: " + dicePair1.getTotal());
        
        // dicePair1.roll();
        // dicePair2.roll();
        
        // System.out.println("D1 Pairs: " + dicePair1.toString());
        // System.out.println("D2 Pairs: " + dicePair2.toString());
        
        // System.out.println(dicePair1.equals(dicePair2.getValue1(), dicePair2.getValue2()));
        
        // dicePair1.printMe();
        // dicePair2.printMe();
        
        
    }
    
    
    
    
}


