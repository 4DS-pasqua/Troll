import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float hp, dmg;
        String name;
        Scanner input = new Scanner(System.in);
        boolean error;

        do {
            try {
                System.out.print("Inserisci il nome del primo Troll: ");
                name = input.nextLine();
                input = new Scanner(System.in);
                System.out.print("\nInserisci i punti vita del primo Troll: ");
                hp = input.nextFloat();
                System.out.print("\nInserisci i punti danno del primo Troll: ");
                dmg = input.nextFloat();
                Troll troll1 = new Troll(hp, dmg, name);
                error = false;
            } catch (Exception e) {
                System.out.print(e.getMessage());
                error = true;
            }
        } while(error);
    }
}