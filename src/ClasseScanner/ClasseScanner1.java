/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasseScanner;

import java.util.Scanner;

/**
 *
 * @author c165921
 */
public class ClasseScanner1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Nome completo é: " + nomeCompleto);
    }
}
