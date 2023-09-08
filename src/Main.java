import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz liczbe silni okok");

        int x = scanner.nextInt();

        int s = 1;

        for(int i = 1;i<=x;i++){
             s = s * i;

        }
        System.out.println("silnia wynosi = " + s);




    }
}