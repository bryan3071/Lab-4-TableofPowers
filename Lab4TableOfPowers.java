package Lab4TableOfPowers;
import java.util.Scanner;
public class Lab4TableOfPowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
        String goAgain = null;

        do {
            System.out.println("Enter an integer and get some squares and cubes: ");
            int userNum = scnr.nextInt();

            System.out.printf("%20s %20s %20s", "Number", "Squared", "Cubed");
            System.out.println();
            System.out.printf("%20s %20s %20s", "======", "======", "======");
            System.out.println();

            for (int i = 1; i <= userNum; i++) {

                long squared = i * i;
                long cubed = i * i * i;

                System.out.printf("%15s %20s %20s", i, squared, cubed);
                System.out.println();

            }
            System.out.println("Do you want to go again? (y/n)");
            goAgain = scnr.next();
        } while (goAgain.equals("y"));

    }

}