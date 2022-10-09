package es.mcg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;

public class ContarPalabras {
    public static void main(String[] args) {
        File file = null;
        FileReader fr = null;
        BufferedReader br = null;

        try{
            file = new File("frase.txt");
            fr = new FileReader(file);
            br = new BufferedReader(fr);

            String frase = br.readLine();
            StringTokenizer stFrase = new StringTokenizer(frase);

            System.out.println("El fichero contiene "+stFrase.countTokens()+" palabras");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
