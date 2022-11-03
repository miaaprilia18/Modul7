/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul7;

/**
 *
 * @author user
 */
public class latihan3 {
    public static void main (String [] args) {
      
        String [][] entry ={{"Florence","735-1234"," Manila"},{"Joyce","983-3333","Quezon City"},{"Becca","456-3322","Manila"}};
        
        int i=0;
        do {
            System.out.println("name :"+entry [i] [0]);
            System.out.println("tel#\t:"+entry [i] [1]);
            System.out.println("addres\t :"+entry [i][2]);
            i++;
            
        }while(i<3);
       
   
    }

    
}
