import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Jak się nazywasz? ");
        String name = scan.nextLine();
        System.out.print("Ile masz lat? ");
        int age = scan.nextInt();
        System.out.println("Masz na imie " + name + " i masz " + age +" lat ");
        if (age <18){
            System.out.println("Jesteś niepełnoletni");
        }
        else {
            System.out.println("Jesteś pełnoletni");
        }
        Random rand = new Random();
        System.out.println("Losowanie 6 liczb: ");
        for (int i = 0; i < 6; i++){
            System.out.print(rand.nextInt(49)+1 + " ");
        }
    }
}