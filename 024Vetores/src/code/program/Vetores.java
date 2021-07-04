package code.program;

import java.util.Arrays;

/**
 *
 * @author bruno
 */
public class Vetores {
    public static void main(String[] args) {
        //Modelo de Vetor / Array
        //Primeira forma de definir e colocar valores
        int ar [] = new int [4];
        ar[0] = 22;
        ar[1] = 02;
        ar[2] = 2003;
        ar[3] = 18;
        
        //Segunda forma de atribuir um vetor e colocar valores
        int n [] = {22,02,2003,18};
        
        //Mostrando os valores | ar.length (pega o tamanho do array)
        System.out.println("USANDO O FOR PARA VER VALORES DO VETOR");
        for (int i=0; i<ar.length; i++){    //FOR para percorrer o array
            System.out.println("Valor do índice "+i+" é igual a "+ar[i]);
        }
        
        //Usando forEach para mostrar os valores, exclusivamente para 
        System.out.println("USANDO O FOREACH PARA VER VALORES DO VETOR");
        for(int val: n){
            System.out.println("Valor = "+val);
        }
        
        //Colocando valores em ordem no array
        int valErr [] = {1,5,2,6,8,4,2,9,3,9,22,12};
        Arrays.sort(valErr);    //Classe do java para ordenar
        for(int valCorr: valErr){
            System.out.println(valCorr);
        }
        //Procurando valor no array
        int procu = Arrays.binarySearch(valErr, 22);
        System.out.println("Valor encontrado na posição: "+procu);
    }
}
