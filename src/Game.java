import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int i = 1;
        int los;
        int odp;

        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Zagrajmy w gre. Wylosuję liczbę od 1 do 10, a Ty zgadnij jaka to. Zaczynamy!");
        los = rnd.nextInt(10) + 1;
        odp = scanner.nextInt();


        while (odp != los) {
            i++;
            System.out.println("bad");
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
