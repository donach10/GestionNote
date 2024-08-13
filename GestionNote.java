import java.util.Scanner;

public class GestionNote {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez le nombre d'élèves à gérer : ");
        int nbEleves = clavier.nextInt();
        double[] notes = new double[nbEleves];

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double somme = 0;

        for (int i = 0; i < nbEleves; i++) {
            System.out.print("Entrez la note de l'élève " + (i + 1) + " : ");
            notes[i] = clavier.nextDouble();

            // Calcul du maximum et minimum
            max = Math.max(max, notes[i]);
            min = Math.min(min, notes[i]);

            somme += notes[i];
        }

        double moyenne = somme / nbEleves;

        int nbSupMoyenne = 0;
        int nbAdmis = 0;
        int nbRattrapage = 0;
        int nbRecaller = 0;

        for (double note : notes) {
            if (note >= moyenne) {
                nbSupMoyenne++;
            }
            if (note >= 10) {
                nbAdmis++;
            }
            if (note >= 7 && note < 10) {
                nbRattrapage++;
            }
            if (note < 7) {
                nbRecaller++;
            }
        }

        System.out.println("Statistiques :");
        System.out.println("Note maximale : " + max);
        System.out.println("Note minimale : " + min);
        System.out.println("Moyenne de la classe : " + moyenne);
        System.out.println("Nombre d'élèves ayant une note supérieure à la moyenne : " + nbSupMoyenne);
        System.out.println("Nombre d'élèves admis : " + nbAdmis);
        System.out.println("Nombre d'élèves en rattrapage : " + nbRattrapage);
        System.out.println("Nombre d'élèves recalés : " + nbRecaller);
    }
} 
    

