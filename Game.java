import java.util.Scanner;
public class Game {
    public String hidden;
    public String guess;
    public String hint;
    public String wrong;
    public String almost;
    public static void main(String[] args) {
        Game game = new Game();
        game.run();

    }
        public void run() {
            Scanner kb = new Scanner(System.in);
            System.out.println("Type a hidden word");
            hidden = kb.nextLine();
            System.out.println("Guess a " + hidden.length() + " letter word");
            guess = kb.nextLine();
            hint = "";
            wrong = "*";
            almost = "+";
            while (!hidden.equals(guess)) {

                for (int i = 0; i < hidden.length(); i++) {
                    //"this".equals();
                    if (hidden.substring(i, i + 1).equals(guess.substring(i, i + 1))) {
                        hint += guess.substring(i, i + 1);
                    }
                     else if (guess.substring(i, i + 1).equals(hint)) {
                        hint += almost;
                        }// += -> same as hint = hint +
                     else {
                         hint += wrong;
                    }
                    }
                System.out.println(hint);
                System.out.println("Try another " + hidden.length() + " letter word");
                hint = "";
                guess = kb.nextLine();
                }
            System.out.println("Yay you win!!");

            }

        }

/*for (int i = 0; i <= hidden.length(); i++) {
        //"this".equals();
        if (guess.substring(i, i + 1).equals(hidden.substring(i, i + 1))) {
        hint.substring(i, i + 1) = guess.substring(i, i + 1);
        }
        else if (guess.substring(i, i + 1).equals(hint)) {
        hint.substring(i, i + 1) = almost;
        }
        else {
        hint.substring(i, i + 1) = wrong;
        }
        }
        System.out.println(hint);
        System.out.println("Try another " + hidden.length() + " letter word");
        }*/
