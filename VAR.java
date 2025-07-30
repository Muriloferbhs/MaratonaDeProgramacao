import java.util.Scanner;

public class VAR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if(8 >= x && x >= -8 && 8 >= y && y >= 0) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }


        sc.close();
    }
}