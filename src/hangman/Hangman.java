package hangman;

import basicvideogames.IGame;
import inputs.EntradaTextos;

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
        boolean inGame;
        while (consoleOutput.mainMenu()) {
            askWord();
            clearProgress();
            inGame = true;
            while (inGame) {
                printProgress();
                askLetter();
            }
        }
    }

    /**
     * ask for a word
     */
    private void askWord() {
        this.word = (EntradaTextos.inputString("Palabra de esta partida: ").split(""));
        tries = "";
    }

    private void clearProgress() {
        progress = new String[word.length];
        for (int i = 0; i < word.length; i++) {
            progress[i] = " ";
        }
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
            String[] triesArr=tries.split("");
            int pos = 0;
            while(pos<triesArr.length){
                if(triesArr[pos].equalsIgnoreCase(character)){
                    tried=true;
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
                break;
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
