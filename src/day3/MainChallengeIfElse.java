package day3;

public class MainChallengeIfElse {
    public static void main (String[] args){

        boolean gameOver = true;
        int score = 800;
        int levelCompleted=5;
        int bonus=100;

        int finalscore = score;

        if (gameOver == true ){
            finalscore += (levelCompleted * bonus);
            finalscore +=1000;
            System.out.println("Your final score was "+finalscore);
        }
//        boolean newgameOver = true;
//        int newscore = 10000;
//        int newlevelCompleted =8;
//        int newbonus =200;
//
//        int newfinalscore = newscore;
//
//        if (newgameOver == true ){
//            newfinalscore += (newlevelCompleted * newbonus);
//            System.out.println("Your final score was "+ newfinalscore);
//        }

         gameOver = true;
         score = 10000;
         levelCompleted=8;
         bonus=200;

         finalscore = score;

        if (gameOver){
            finalscore += (levelCompleted * bonus);
            System.out.println("Your final score was "+finalscore);
        }
    }
}
