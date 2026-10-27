package day3;

public class KeywordsAndExpressions {
    public static void main (String[] args) {


        double kilometers = (100 * 1.609344);

        int highScore = 50;

        if (highScore > 25) {
            highScore = 1000 + highScore;
        }
        int health = 100; //int health is an expression
        if ((health<250) && (highScore>1000)) { //(health<25) && (highScore>1000) this is an expression
            highScore = highScore -1000; //new highScore result is also an expression.
            System.out.println("Your score is:"+highScore);
        }
    }
}

