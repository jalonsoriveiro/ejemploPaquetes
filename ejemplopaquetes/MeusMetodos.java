/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package meusmetodos;
package ejemplopaquetes;
import java.util.Scanner;

/**
 *
 * @author jalonsoriveiro
 */
public class MeusMetodos {

    public float validaFloatPositivo(){
        Scanner sc = new Scanner(System.in);
        float valor;
        do{
         valor = sc.nextFloat();        
        }while(valor<=0);
        return valor;
    }
    public static float darValor(){
    Scanner sc = new Scanner(System.in);
        float valor;
        do{
         valor = sc.nextFloat();        
        }while(valor<=0);
        return valor;
    }
    
    
}
