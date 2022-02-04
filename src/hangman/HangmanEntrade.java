/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hangman;

import inputs.EntradaTextos;

/**
 *
 * @author casa
 */
public class HangmanEntrade {

    private String[] word;
    private String[] progress;
    private String tries;

    public HangmanEntrade() {
        game();
    }

    /**
     * Start the game
     */
    private void game() {
        while (Interface.mainMenu()) {
            askWord();
        }
    }

    /**
     * ask for a word
     */
    private void askWord() {
        word = (EntradaTextos.inputString("Palabra de esta partida: ")).split("");
        resetProgress();
    }

    private void askLetter(){
        String letter;
        String[] checkTry=tries.split("");
        letter=EntradaTextos.inputStringChar("Letra: ");
        
        
        
    }
    
    private boolean checkLetter(){
        
    }
    
    public String getProgress() {
        String chain="";
        for (int i = 0; i < progress.length; i++) {
            chain = (chain + progress[i]);
        }
        return chain;
    }

    private void resetProgress() {
        progress = new String[word.length];
        for (int i = 0; i < progress.length; i++) {
            progress[i] = " ";
        }
    }

}
