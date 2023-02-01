import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        int n;
        do{
            System.out.println("1. Add User");
            System.out.println("2. Catalog");
            System.out.println("3. Make a purchase");
            System.out.println("4. Profile");
            System.out.println("5. Exit");
            n = scanner.nextInt();
            switch (n) {
                case 1 -> market.add_user();
                case 2 -> market.show_catalog();
                case 3 -> market.purchase();
                case 4 -> market.user_info();
                default -> {
                }
            }

        }while(n!=5);
    }
}