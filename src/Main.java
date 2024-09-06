public class Main {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    private static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        // while number is greater than 0.
        while (number > 0) {
            // get the last digit with mod store in variable.
            int LastDigit = number % 10;
            // check if its even.  % 2
            if (LastDigit % 2 == 0){
            // if even add to sum.
                sum += LastDigit;
            }
            // number divide equals 10.
            number /= 10;
        }

        return sum;


    }
}