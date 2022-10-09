package es.mcg;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vocales {
    public static void main(String[] args) {
        int as=0, es=0, is=0, os=0, us=0;
        int n = 0, tots = 0;
        BufferedReader entrada = null;
        InputStreamReader reader = null;
        FileInputStream file = null;
        try {
            reader = new InputStreamReader(System.in);
            entrada = new BufferedReader(reader);
            System.out.println("Digame la ruta del archivo");
            String ruta = entrada.readLine();
            file = new FileInputStream(ruta);
            while(n != -1)
            {
                tots++;
                n = file.read();
                switch(n)
                {
                    case 97: as+=1; break;
                    case 101: es+=1; break;
                    case 105: is+=1; break;
                    case 111: os+=1; break;
                    case 117: us+=1; break;
                }
            }
            tots = (as+es+is+os+us);
            System.out.println("Resumen de vocales");
            System.out.println("El fichero contiene");
            System.out.println("A: "+as+" vocales");
            System.out.println("E: "+es+" vocales");
            System.out.println("I: "+is+" vocales");
            System.out.println("O: "+os+" vocales");
            System.out.println("U: "+us+" vocales");
            System.out.println("Numero de vocales: "+tots);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
