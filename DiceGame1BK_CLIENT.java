
public class DiceGame1BK_CLIENT
{
    public static void main(String[] args)
    {
        // DiceYI game1 = new DiceYI(5);
        // System.out.println("GET VALUE: " + game1.getValue()); // 5
        // game1.setValue(2);
        // System.out.println("GET VALUE: " + game1.getValue()); // 2
        // game1.roll();
        // game1.printMe();
        
        DicePairYI dicePair1 = new DicePairYI();
        DicePairYI dicePair2 = new DicePairYI();
        System.out.println("GET VALUE D1 1 of 2: " + dicePair1.getValue1());
        System.out.println("GET VALUE D1 2 of 2: " + dicePair1.getValue2());
        
        System.out.println("GET VALUE D2 1 of 2: " + dicePair2.getValue1());
        System.out.println("GET VALUE D2 2 of 2: " + dicePair2.getValue2());
        
        System.out.println("GET TOTAL FOR D1: " + dicePair1.getTotal());
        
        dicePair1.roll();
        dicePair2.roll();
        
        System.out.println("D1 Pairs: " + dicePair1.toString());
        System.out.println("D2 Pairs: " + dicePair2.toString());
        
        System.out.println(dicePair1.equals(dicePair2.getValue1(), dicePair2.getValue2()));
        
        dicePair1.printMe();
        dicePair2.printMe();
        
        
    }
}
