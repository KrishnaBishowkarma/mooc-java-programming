
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is
        // gradually extended part by part.

        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about
        // the parts you haven't done, but you'll get points for the finished parts.

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        double avg = 0;
        int evenNum = 0;
        int oddNum = 0;

        System.out.println("Give numbers:");

        while (true) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num == -1) {
                break;
            }

            sum += num;
            count++;

            if (num % 2 == 0) {
                evenNum++;
            } else {
                oddNum++;
            }
        }

        avg = (count > 0) ? (double) sum / count : 0;

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + evenNum);
        System.out.println("Odd: " + oddNum);

        scanner.close();
    }
}
