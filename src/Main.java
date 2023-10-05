import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float hp, dmg;
        String name;
        Scanner input = new Scanner(System.in);
        boolean error, endGame = false;
        Troll troll1 = null, troll2 = null;
        int sel = 0;

        do {
            try {
                System.out.print("Inserisci il nome del primo Troll: ");
                name = input.nextLine();
                input = new Scanner(System.in);
                System.out.print("\nInserisci i punti vita del primo Troll: ");
                hp = input.nextFloat();
                System.out.print("\nInserisci i punti danno del primo Troll: ");
                dmg = input.nextFloat();
                troll1 = new Troll(hp, dmg, name);
                error = false;
            } catch (Exception e) {
                System.out.print(e.getMessage());
                error = true;
            }
        } while(error);

        input = new Scanner(System.in);
        do {
            try {
                System.out.print("\nInserisci il nome del secondo Troll: ");
                name = input.nextLine();
                input = new Scanner(System.in);
                System.out.print("\nInserisci i punti vita del secondo Troll: ");
                hp = input.nextFloat();
                System.out.print("\nInserisci i punti danno del secondo Troll: ");
                dmg = input.nextFloat();
                troll2 = new Troll(hp, dmg, name);
                error = false;
            } catch (Exception e) {
                System.out.print(e.getMessage());
                error = true;
            }
        } while(error);

        do {
            do {
                System.out.print("\n0. Esci" +
                                "\n1. Troll 1 attacca" +
                                "\n2. Troll 2 attacca" +
                                "\nSeleziona: ");
                sel = input.nextInt();
            } while(sel < 0 || sel > 2);
            switch (sel) {
                case 1:
                    troll1.attacca(troll2);
                    break;
                case 2:
                    troll2.attacca(troll1);
                    break;
            }
            System.out.print(troll1 + "\n" + troll2);
            if(!troll1.isAlive()) {
                endGame = true;
                System.out.print("\n" + troll1.getName() + " è morto!");
            } else if(!troll2.isAlive()) {
                endGame = true;
                System.out.print("\n" + troll2.getName() + " è morto!");
            }
        } while(sel != 0 && !endGame);
    }
}