import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        System.out.print("Reverse String is ");
        for (int i = string.length() - 1; i >= 0; i--) {
            System.out.print(string.charAt(i));
        }
    }
}