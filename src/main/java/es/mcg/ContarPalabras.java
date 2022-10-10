package es.mcg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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
            int contadorPalabras = 0;
            String frase = br.readLine();
            while(frase != null)
            {
                StringTokenizer stFrase = new StringTokenizer(frase);
                contadorPalabras = contadorPalabras + stFrase.countTokens();
                frase = br.readLine();
            }
            System.out.println("El fichero contiene "+contadorPalabras+" palabras");
        }
        catch(IOException ioException)
        {
            ioException.printStackTrace();
        }
        finally
        {
            if(br != null)
            {
                try {
                    br.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
            if(fr != null)
            {
                try {
                    fr.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        }
    }
}
