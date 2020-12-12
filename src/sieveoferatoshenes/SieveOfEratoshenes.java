/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sieveoferatoshenes;

/**
 *
 * @author Salah
 */
public class SieveOfEratoshenes {

    /**
     * @param args the command line arguments
     */
    
    public static boolean []prime = new boolean [1000];
    
    public SieveOfEratoshenes()
    {
        for ( int i = 0; i < prime.length; i++)
          
            prime[i] = true;
        
    }
    
    public static void checkPrime()
    { 
        int     sum,
                i,
                j;        
                
        for (  i = 2; i < 1000; i++)
                {
                    sum = i;
                 
                    j=0;
         
                    for ( sum = i; j < 1000; j++ )
                        {
                             sum = sum + i;
                            
                             if ( sum < 1000)
                             {
                                 prime[sum] = false;
                             
                                System.out.printf("%nSum = %dprime[%d] = %b,", sum, sum, prime[sum]);
                             }
                        }
                }
      
    }
    
    
    
   public static void display()
   {
       for (int i = 3; i < prime.length; i++)
       {
           if ( prime[i] == true)
               System.out.printf("%n%d ####prime number", i);
       }
   }
    
    public static void main(String[] args) {
        // TODO code application logic here
    
    
        SieveOfEratoshenes SE = new SieveOfEratoshenes();
        
        SE.checkPrime();
        SE.display();
    
    }
    
}
