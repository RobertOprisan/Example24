import java.util.Scanner;
public class Example24 {
    public static void main(String[] args) {
        double fac = 1;
        int number;

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        number = inputValue.nextInt();

        for (int i = 2; i <= number; i++) {
            fac = fac * i;
        }
        System.out.println(fac);
    }
}

