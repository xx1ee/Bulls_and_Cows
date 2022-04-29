package bullscows;

import java.util.*;

class Game {

    public String random(int n, int p) {
        Random rand = new Random();
        String secret = new String();
        StringBuilder elements = new StringBuilder().append("0123456789abcdefghijklmnopqrstuvwxyz");
        elements = new StringBuilder(elements.substring(0, p));
        System.out.println("z");
        for (int i = 0 ; i < n ; i++)
        {
            while (true)
            {
                char r = elements.charAt(rand.nextInt(elements.length()));
                if (!secret.contains(Character.toString(r))) {
                    secret+=r;
                    break;
                }
            }
        }
        return secret;
    }
    public int Game(String secret, String answer, int n) {
        int bulls = 0;
        int cows = 0;
        for (int i = 0 ; i < secret.length() ; i++)
        {
            if (secret.charAt(i) == answer.charAt(i)) {
                bulls++;
            } else if (secret.contains(String.valueOf(answer.charAt(i)))) {
                cows++;
            }
        }
        System.out.println("Grade: " + (bulls == 0 && cows == 0 ? "None" : "") + (bulls > 0 ? bulls
                + " bulls" : "") + (bulls > 0 && cows > 0 ? " and " : "") + (cows > 0 ? cows + " cows" : ""));
        if (bulls == n){
            System.out.println("Congratulations! You guessed the secret code.");
        }
        return bulls;
    }
    public void Play() {
        Scanner sc = new Scanner(System.in);
        int k = 0;
        System.out.println("Please, enter the secret code's length:");
        try {
            int n = sc.nextInt();
            System.out.println("Input the number of possible symbols in the code:");
            int p = sc.nextInt();
            if (n > 36 || n < 1 || p > 36 || (n > p))
            {
                System.out.println("Error");
            } else {
                Scanner sc2 = new Scanner(System.in);
                String zvezda = "";
                for (int i = 0 ; i < n ; i++)
                {
                    zvezda +="*";
                }
                System.out.printf("The secret is prepared: %s (0-9, a-f).\n", zvezda);
                System.out.println("Okay, let's start a game!\n");
                String secret = random(n, p);
                while (true) {
                    k++;
                    System.out.printf("Turn %d:\n", k);
                    String answer = sc2.nextLine();
                    if (answer.length() == secret.length()) {
                        int bulls = Game(secret, answer, n);
                        if (bulls == n){
                            break;
                        }
                    } else System.out.println("Error");
                }
            }
        } catch (Exception e) {
            System.out.println("Error");
        }

    }
}
public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.Play();
    }
}
