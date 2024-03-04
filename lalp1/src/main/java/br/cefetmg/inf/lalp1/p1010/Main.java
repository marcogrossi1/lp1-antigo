package br.cefetmg.inf.lalp1.p1010;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault( Locale.US);
        Scanner input = new Scanner(System.in);
        
        int codigo1, numPecas1, codigo2, numPecas2;
        double valorPeca1, valorPeca2, valorTotal;
        
        numPecas1 = input.nextInt();
        valorPeca1 = input.nextDouble();
        
        numPecas2 = input.nextInt();
        valorPeca2 = input.nextDouble();
        
        valorTotal = numPecas1 * valorPeca1 + numPecas2 * valorPeca2;
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);
    }   
}