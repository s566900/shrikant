
import java.util.Scanner;

public class Movie {

    public static void main(String[] args) {
        int fee = 0, fees = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(" how many members ");
        int no_of_members = sc.nextInt();
        for (int i = 1; i <= no_of_members; i++) {
            System.out.println("please Enter " + i + " menber age");
            int age = sc.nextInt();
            if (age < 3) {
                fee = 0;
            } else if (age >= 3 && age <= 12) {
                fee = 100;
            } else if (age > 12) {
                fee = 150;
            }
            fees += fee;
        }
        System.out.println("No of persons are--------" + no_of_members);
        System.out.println("Total payable amount is :" + fees);

    }
}
