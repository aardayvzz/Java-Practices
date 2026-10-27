package day3;

public class Method {
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

        calculateScore(gameover,score,levelCompleted,bonus);
    }

    //our new method
    public static void calculateScore(boolean gameOver, int score, int levelCompleted,int bonus ){

        int finalscore = score;
        if (gameOver == true ){
            finalscore += (levelCompleted * bonus);
            finalscore +=1000;
            System.out.println("Your final score was "+finalscore);
        }
    }
}
