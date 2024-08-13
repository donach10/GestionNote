import java.util.Scanner;
public class Moyenne
{
    public static void main (String args[])
    {
        int i, nb, nbSupMoy, nbAdmis, nbRattrap, nbRecal;
        double somme;
        double moyenne;
        double MoyPass = 10.00;
        double MoyRecall = 7;


        Scanner Clavier = new Scanner(System.in);
        System.out.print ("Donnez le nombre "); 
        nb = Clavier.nextInt();
        double notes[] = new double[nb];
        double max = notes[0];
        double min = notes[0];
        for (i= 0 ; i<nb;i++)
        {
            System.out.print ("Donnez la note numero"+(i+1)+":");
            notes[i] = Clavier.nextDouble() ;
        }
        for (i = 0; i < nb; i++) {
            if (notes[i] > max) {
                max = notes[i]; // Mettre à jour la note maximale si une note plus grande est trouvée
            }
        }
            for (i = 0; i < nb; i++) {
            if (notes[i] < min) {
                min = notes[i]; // Mettre à jour la note minimale si une note plus petite est trouvée
            }
        }
        
        System.out.println("La note maximale est : " + max);
        System.out.println("La note minimale est : " + min);
        for (i = 0, somme = 0 ; i<nb;i++) somme += notes[i] ;
        moyenne = somme / nb;
        System.out.println("La moyenne est : " + moyenne);
// Le nombre élèves ayant une note supérieure à la moyenne de la classe
        for (i=0,nbSupMoy=0;i<nb;i++)
        {
            if(notes[i]>= moyenne) nbSupMoy++;

        }
        System.out.println("Le nombre élèves ayant une note supérieure à la moyenne de la classe est:"+nbSupMoy);
 //    Parcours du tableau et affichage du nombre d'admis, pour le rattrapage et recallé 
        for (i=0,nbRecal=nbRattrap=nbAdmis=0;i<nb;i++)
        {
            if(notes[i]>MoyPass) nbAdmis++;
            if(notes[i] >= MoyRecall && notes[i] < MoyPass) nbRattrap++;
            if(notes[i]<MoyRecall) nbRecal++;
        }
        System.out.println(" Le nombre d'élève admis est : "+nbAdmis);
        System.out.println(" Le nombre d'élève qui vont au rattrapage est : "+ nbRattrap);
        System.out.println(" Le nombre d'élève recallé est : "+nbRecal);


    }






    
}