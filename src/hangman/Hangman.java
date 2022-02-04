/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hangman;

import basicvideogames.IGame;
import inputs.EntradaTextos;

/**
 *
 * @author casa
 */
public class Hangman implements IGame{

    private String[] word; //BUSCAR PASAR A CHAR
    private String[] progress; 
    private String tries;
    private int fails; 
    private boolean inGame;

    public Hangman() {
    }

    /**
     * Start the game
     */
    public void game() {
        while (!Interface.mainMenu()) {
            askWord();
            resetProgress();
        }
        this.inGame = true;
        resetProgress();
        while (inGame) {
            printProgress();
            askLetter();
        }
    }

    /**
     * ask for a word
     */
    private void askWord() {
        String[] inputWord;
        inputWord = (EntradaTextos.inputString("Palabra de esta partida: ")).split("");
    }
    
    private void resetProgress() {
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
        while (!checkTry(letter)) {
            letter = EntradaTextos.inputStringChar("Letra: ");
        }
        checkLetter(letter);
        tries = tries + letter;

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
     * Check in last tries
     *
     * @param character
     * @return if exist
     */
    private boolean checkTry(String character) {//USAR EL FOREACH
        boolean exist = true;
        String[] check = tries.split("");
        int pos = 0;
        while (!character.equalsIgnoreCase(check[pos])) {
            exist = false;
            pos++;
            
        }
        return exist;
    }

    /**
     * Check if the letter is correct
     *
     * @param character
     */
    private void checkLetter(String character) {//USAR EL FOREACH //USAR INDEX OF
        boolean fail = true;
        for (int i = 0; i < word.length; i++) {
            if (character.equals(word[i])) {
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