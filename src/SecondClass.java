public class SecondClass {
    public static void main(String[] args) {
        System.out.println("Hello Arda");

        boolean isAlien = true;
        if (isAlien == true) {

            System.out.println("It is not an alien");

        }

        int newValue = 50;

        if (newValue == 50) {
            int topScore = 80;
            if (topScore < 100) {
                System.out.println("You got THE HIGHEST SCORE!!");

            }
            int secondScore = 50;
            if (topScore > secondScore && topScore < 100) {
                System.out.println("Greater than second score, but less than 100!");
            }
            if ((topScore > 90) || (secondScore < 90)) {
                System.out.println("Either or both of conditions are true");
            }

            boolean isCar = false;
            if (!isCar) {
                System.out.println("This is not supposed to happen");
            }

            String makeOfCar = "Volkswagen";
            boolean isdomestic = makeOfCar == "Volkswagen" ? false : true;

            if (isdomestic) {
                System.out.println("This car is ours");
            }
        }
    }
}
