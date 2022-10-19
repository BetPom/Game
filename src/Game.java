import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int i = 1;
        int los;
        int odp;

        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Let's play a game. I will choose number from 1 to 10. Guess which one I think of.");
        los = rnd.nextInt(10) + 1;
        odp = scanner.nextInt();


        while (odp != los) {
            i++;
            System.out.println("Bad shot. ");
            if (odp>los){
                System.out.println("My number is lower");
            }
            else{
                System.out.println("My number is bigger");
            }
            odp = scanner.nextInt();
        }
        System.out.println("good, you guess by " + i + " time");
    }
}
