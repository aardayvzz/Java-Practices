package day3;

public class Methods {
    public static void main (String[] args){

//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted=5;
//        int bonus=100;
//
//        int finalscore = score;
//        boolean gameOver=true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus= 100;

//        calculateScore(true,10000,8,200);
//        calculateScore(true,10,2,1);

        //yukarıdaki gibi de yapılır aşağıdaki gibi de, ama aşağıdaki daha temiz duruyor.

        boolean gameover=true;
        int score=800;
        int levelCompleted=5;
        int bonus=100;
        int highScore = calculateScore(gameover,score,levelCompleted,bonus);
        calculateScore(gameover,score,levelCompleted,bonus);
        System.out.println("The Highscore is:" + highScore);

        score=10000;
        levelCompleted=9;
        bonus=200;
        System.out.println("The next Hishscore is:" + 

        calculateScore(gameover,score,levelCompleted,bonus));
    }

    //our new method
    public static int calculateScore(boolean gameOver, int score, int levelCompleted,int bonus ){

        int finalscore = score;
        if (gameOver == true ){
            finalscore += (levelCompleted * bonus);
            finalscore +=1000;

        }
        return finalscore;

    }
}
