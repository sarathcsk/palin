/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palino;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Palino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,an=0,a=0,t,i=0,t1;
        
        
        Scanner s2=new Scanner(System.in);
        n=s2.nextInt();
        while(n>0)
        {
            t=n%10;
            a=a*10+(t*t*t);
            n=n/10;
    }
        if(a==n)
        {
            System.out.println("palindrome");
        }
        else
                {
                    System.out.println("not palindrome");  
                }
    
}}
