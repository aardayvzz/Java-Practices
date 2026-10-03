public class ThirdClass {
    public static void main (String[] args){

        double a = 19.00;
        double b = 80.00;
        double c= 100.00;
        double answer = (b+a)* c;
        System.out.println("answer is = "+answer);

        double remainder = answer% 40.00;
        System.out.println("remainder divided by 40 = "+remainder);
        boolean isTrue = (remainder==0) ? true : false;

        if (!isTrue){
            System.out.println("got some remainder "+remainder);
        }

    }
}
