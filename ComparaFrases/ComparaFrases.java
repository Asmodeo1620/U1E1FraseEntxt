package package comparafrases;

import java.io.*;

public class ComparaFrases {

    public static void main(String[] args) throws IOException {
        String original = "es parte de crecer timmy";//Aqui cambia la frase ordenada
        String orig[] = original.split(" ");
        String partes[];
        String aux[]=new String[orig.length];
        String ruta = "C:/Users/eduar/OneDrive/Documentos/SeptimoSemestre/Prog_Log_Fun/frase.txt";//Aqui cambia la ruta del txt
        String frase, oracion="", corregida="";
        FileReader fr = new FileReader(ruta);
        BufferedReader br = new BufferedReader(fr);
        
        while((frase=br.readLine())!=null){
            oracion=frase;
        }
        br.close();
        
        partes = oracion.split(" ");
        if(original.length()==oracion.length()){
            for(int i=0; i<partes.length; i++){
                for(int j=0; j<partes.length; j++){
                    if(partes[i].equals(orig[j])){
                        aux[j]=partes[i];                    
                    }
                }    
            }
            for(int i=0; i<aux.length; i++){
                corregida+=aux[i]+" ";
                System.out.println(corregida);
            }
        }else{
            System.out.println("El texto del txt no es el mismo del programa");
        }
        
    }
    
}
comparafrases;

import java.io.*;

public class ComparaFrases {

    public static void main(String[] args) throws IOException {
        String original = "es parte de crecer timmy";//Aqui cambia la frase ordenada
        String orig[] = original.split(" ");
        String partes[];
        String aux[]=new String[orig.length];
        String ruta = "C:/Users/eduar/OneDrive/Documentos/SeptimoSemestre/Prog_Log_Fun/frase.txt";//Aqui cambia la ruta del txt
        String frase, oracion="", corregida="";
        FileReader fr = new FileReader(ruta);
        BufferedReader br = new BufferedReader(fr);
        
        while((frase=br.readLine())!=null){
            oracion=frase;
        }
        br.close();
        
        partes = oracion.split(" ");
        
        for(int i=0; i<partes.length; i++){
            for(int j=0; j<partes.length; j++){
                if(partes[i].equals(orig[j])){
                    aux[j]=partes[i];                    
                }
            }    
        }
        for(int i=0; i<aux.length; i++){
            corregida+=aux[i]+" ";
            System.out.println(corregida);
        }
    }
    
}
