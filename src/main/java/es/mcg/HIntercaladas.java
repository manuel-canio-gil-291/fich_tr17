package es.mcg;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class HIntercaladas {
    public static void main(String[] args) {
        int h = 0, n = 0;
        BufferedReader br = null;
        FileInputStream fis = null;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);
            System.out.println("Ruta del fichero");
            String ruta = br.readLine();
            fis = new FileInputStream(ruta);
            while(n != -1)
            {
                n = fis.read();
                if(n==104)
                {
                    h+=1;
                }
            }
            System.out.println("El fichero contiene "+h+" 'h' intercaladas");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
