package hangman;

import inputs.EntradaNumeros;

/**
 *
 * @author casa
 */
public class consoleOutput {

    static boolean mainMenu() {
        boolean start = true;
        System.out.println("\nHANGMAN THE GAME\n"
                + "----------------------\n"
                + "1.Start game\t2.Exit");
        if ((EntradaNumeros.numIntBetween("", 1, 2)) != 1) {
            start = false;
        }
        return start;
    }

    static void printProgress(String[] progress, String tries) {
        String pProgress = "";
        String lines = "";
        for (int i = 0; i < progress.length; i++) {
            pProgress = pProgress + progress[i];
            lines = lines + "-";
        }
        System.out.println(pProgress + "\n"
                + lines+ "\n"
                        + tries);
    }

    static void handMan(int fails) {
        switch (fails) {
            case 0:
                System.out.println(""
                        + "|-------\n"
                        + "|     \n"
                        + "|   \n"
                        + "|  \n"
                        + "|   \n"
                        + "|     \n"
                        + "|  \n"
                        + "|     \n"
                        + "|   \n"
                        + "|\n"
                        + "");
                break;
            case 1:
                System.out.println(""
                        + "|-------\n"
                        + "|      |\n"
                        + "|     \n"
                        + "|   \n"
                        + "|    \n"
                        + "|    \n"
                        + "|   \n"
                        + "|      \n"
                        + "|   \n"
                        + "|\n"
                        + "");
                break;
            case 2:
                System.out.println(""
                        + "|-------\n"
                        + "|      |\n"
                        + "|     ---\n"
                        + "|    -   -\n"
                        + "|     ---\n"
                        + "|      |\n"
                        + "|      |\n"
                        + "|      |\n"
                        + "|      |\n"
                        + "|\n"
                        + "");
                break;
            case 3:
                System.out.println("\n\n\n"
                        + "|-------\n"
                        + "|      |\n"
                        + "|     ---\n"
                        + "|    -   -\n"
                        + "|     ---\n"
                        + "|      |\n"
                        + "|   ---|---\n"
                        + "|      |\n"
                        + "|      |\n"
                        + "|\n"
                        + "");
                break;
            default:
                System.out.println(""
                        + "|-------\n"
                        + "|      |\n"
                        + "|     ---\n"
                        + "|    -   -\n"
                        + "|     ---\n"
                        + "|      |\n"
                        + "|   ---|---\n"
                        + "|      |\n"
                        + "|   ---|---\n"
                        + "|\n"
                        + "");
                break;
        }
    }

}
