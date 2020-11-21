/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looptemperatura;
import java.util.Scanner;
/**
 *
 * @author Naja
 */
public class Looptemperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double c, f, a;
        int i;
        System.out.print("digite a temperatura em celsius:");
        c = leitor.nextDouble();
        f = (c*1.8+32);
        System.out.println("O valor da conversão em fahreint é:"+f);
        i = 10;
        while(i<=100){
        a = f+i;
        System.out.println(a);
        i = i+10;
        }
   
    }
    
}
