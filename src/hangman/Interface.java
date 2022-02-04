/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hangman;

import inputs.EntradaNumeros;

/**
 *
 * @author casa
 */
public class Interface {

    static boolean mainMenu() {
        boolean start=true;
        System.out.println("\tHANDMAN THE GAME\n"
                + "----------------------\n"
                + "1.Start game\t2.Exit");
        if((EntradaNumeros.numIntBetween("", 1, 2))!=1){
          start=false;  
        }
        return start;
    }
    
    static void handMan(int lenght){
        System.out.println("\n"
                + "\n"
                + "\n"
                + "\n"
                + "\n"
                + "");
    }

}
