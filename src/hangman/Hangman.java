package hangman;

import basicvideogames.IGame;
import inputs.EntradaTextos;
import java.util.Arrays;

/**
 *
 * @author casa
 */
public class Hangman implements IGame {

    private String[] word; //BUSCAR PASAR A CHAR
    private String[] progress;
    private String tries;
    private int fails;

    public Hangman() {
    }

    /**
     * Start the game
     */
    public void game() {
        while (consoleOutput.mainMenu()) {
            askWord();
            clear();
            while (!inGame()) {
                printProgress();
                askLetter();
            }
        }
    }

    private boolean inGame() {
        boolean Finished = false;
//        for (int i = 0; i < this.progress.length; i++) {
//            if (this.progress[i].equals(" ")) {
//                unFinished =
//            }
//
//        }
        
        if (fails >3 ){
            Finished = true;
            System.out.println("LOSE");
        }
        if ((!Arrays.asList(progress).contains(" "))) {
            Finished = true;
            System.out.println("WIN");
        } 
        return Finished;
    }

    /**
     * ask for a word
     */
    private void askWord() {
        this.word = (EntradaTextos.inputString("Palabra de esta partida: ").split(""));
        tries = "";
    }

    private void clear() {
        progress = new String[word.length];
        for (int i = 0; i < word.length; i++) {
            progress[i] = " ";
        }
        this.fails=0;
    }

    /**
     * ask the letter
     */
    private void askLetter() {
        String letter;
        String[] checkTry = tries.split("");
        letter = EntradaTextos.inputStringChar("Letra: ");
        while (checkTry(letter)) {
            letter = EntradaTextos.inputStringChar("Letra: ");
        }
        checkLetter(letter);
        this.tries = this.tries + letter;

    }

    /**
     * Check in last tries
     *
     * @param character
     * @return if exist in tries, return true
     */
    private boolean checkTry(String character) {//USAR EL FOREACH
        boolean tried = false;
        if (this.tries.length() > 0) {
            String[] triesArr = tries.split("");
            int pos = 0;
            while (pos < triesArr.length) {
                if (triesArr[pos].equalsIgnoreCase(character)) {
                    tried = true;
                    break;
                }
                pos++;
            }
        }
        return tried;
    }

    private void printProgress() {//USAR EL FOREACH
        String pProgress = "";
        String lines = "";
        for (int i = 0; i < progress.length; i++) {
            pProgress = pProgress + progress[i];
            lines = lines + "-";
        }
        System.out.println(pProgress + "\n"
                + lines);
    }

    /**
     * Check if the letter is correct
     *
     * @param character
     */
    private void checkLetter(String character) {//USAR EL FOREACH //USAR INDEX OF
        boolean fail = true;
        for (int i = 0; i < this.word.length; i++) {
            if (character.equals(this.word[i])) {
                progress[i] = character;
                fail = false;
            }
        }
        if (fail) {
            fails++;
        }
    }

    public String getProgress() { //USAR EL FOREACH
        String chain = "";
        for (int i = 0; i < progress.length; i++) {
            chain = (chain + progress[i]);
        }
        return chain;
    }

}
