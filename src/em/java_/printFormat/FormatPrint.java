package em.java_.printFormat;

import java.io.File;
import java.util.Date;

public class FormatPrint {
	
	/*
     * pr creer un exe => javac FormatPrint.java pr executer un exe => java
     * FormatPrint
     */
    /**
     * @param args
     */
    public static void main(String[] args) {
        int num = 25;
        int dem = 11;
        String msg = String.format("[%d/%d]", num, dem);

        System.out.println(msg);
        System.out.println("[ " + num + " / " + dem + " ]");
        System.out.printf("[ %d / %d ]\n", num, dem); // formattage de l'affichage
        System.out.printf("[%d ]\n", num); // formattage de l'affichage

       System.out.println( "------------- type entier ------------------------------");
        System.out.printf(">%5d<\n", num); // affiche la var num sur 5 xre et retour a la ligne, les 3 1er st vides
        System.out.printf(">%05d<\n", num); // affiche 25 sur 5 xre et retour a la ligne, les 3 premiers xre st 000
        
        System.out.printf(">%,d<\n", 5000000); // affiche avec le separateur de millier
        
        System.out.printf(">%d %o %x<\n", num, num, num); // representation decimal, octale, hexadecimale
        System.out.printf(">%08x<\n", num); // representation hexadecimale sur 8 xre

        System.out.println( "------------- type flottant ------------------------------");
        System.out.println(Math.PI);
        System.out.printf(">%f<\n", Math.PI);
        System.out.printf(">%07.2f<\n", Math.PI); // PI sur 7 xre, 2 xre apres la virgule, les autre rempli par zero
        float nb = (float) (81.0000000000+19.5555555555);
        System.out.printf(">%07.4f<\n", nb); // PI sur 7 xre, 2 xre apres la virgule, les autre rempli par zero
        System.out.printf(">%,11.2f<\n", 10000.2556); // sur 11 xre, 2 xre apres la virgule, les autre rempli par zero
        System.out.printf(">%e<\n", 10000.2556); // affiche avec l'exposant

        System.out.println( "------------- type char et String ------------------------------");
        System.out.printf("%c - %s\n", 'z', "zorro");
        System.out.printf("%10s\n", "Chou"); // Chou sur 10 xre, les autre xre st rempli par des espaces vides a gauche
        System.out.printf("%-10s\n", "Chou"); // Chou sur 10 xre, les autre xre st rempli par espaces vides a droite
        System.out.printf(">%tF | %tT<\n", new Date(), new Date());

        System.out.println("+------------+------------+----------+------------------------------------------------+");
        System.out.println("+  size (ko) +     Date   +   time   +                        name                    +");
        System.out.println("+------------+------------+----------+------------------------------------------------+");
        File[] files = new File(".").listFiles();
        for (File file : files) {
            long sizeKo = file.length() / 1024;
            Date lastModified = new Date(file.lastModified());
            String name = file.getName();

            System.out.printf("| %,10d | %tF | %tT | %-20s \n", sizeKo, lastModified, lastModified, name);
        }
        System.out.println( " ");
        System.out.println( "------------- convert String to int ------------------------------");
        String value1 = "777";
        int intValue1 = Integer.parseInt(value1);
        
        String value2 = "39.456789";
        double doubleValue2 = Double.parseDouble(value2);
        
        System.out.println("Value1 = " + intValue1 + " et value2 = " + doubleValue2);
        
        System.out.println( "------------- convert int to String  ------------------------------");
        
        String finalString = intValue1 + "";
        finalString += " ";
        finalString += Double.toString(doubleValue2);
        System.out.println(finalString);
        
        System.out.println( "------------- format String  ------------------------------");
        String strFinal2 = String.format("%05d %f", intValue1, doubleValue2);
        
        System.out.println(strFinal2);
        
    }

}
