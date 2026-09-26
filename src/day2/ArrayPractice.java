package day2;

public class ArrayPractice {
    public static void main(String[] args) {
        
      
        int[] scores = {45, 82, 14, 96, 73, 55};
        

        int maxScore = scores[0];
        
        
        int sum = 0;

       
        
        for (int i = 0; i < scores.length; i++) {
            
  
            sum = sum + scores[i];

            
            if (scores[i] > maxScore) {
                
                maxScore = scores[i]; 
            }
        }

        
        double average = (double) sum / scores.length;

        System.out.println("Highest Score: " + maxScore);
        System.out.println("Average Score: " + average);
    }
}