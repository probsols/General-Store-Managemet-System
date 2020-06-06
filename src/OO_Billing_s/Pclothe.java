/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OO_Billing_s;

import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Rehman
 */
public class Pclothe {
      public double Fries;
    public double PPENTS;
    public double Icecream;
    public double Chicken_salad;
    public double Onion_rings;
    public double Zinger_Burger;
    public double Coke;
    public double socks;
    public double shalwar;
    public double pent_coat;
    public double sweater;
    public double partydress;
    public double casual_coat;
    public double party_sandals;
    public double cTax;
    
    public double PENTS = 1000;
    public double SHIRTS=1000;
    public double TROUSER=700;
    public double KURTA=1300;
    public double SHOES=1900;
    public double SANDALS=1700;
    public double POLISH=100;
    public double psocks=100;
    public double pshalwar=500;
    public double ppent_coat=15000;
    public double psweater=2000;
    public double ppartydress=8000;
    public double pcasual_coat=5000;
    public double pparty_sandals=3000;
    //public double pCrunch_Chicken=200;
    //public double pCheese_Burger=300;
    //public double pButter_Burger=30;
    public double pTax=0.90;
    
    
      
       public double itemCost;
       
       public double GetAmount(){
           itemCost=Fries+PPENTS+Icecream+Chicken_salad+Onion_rings+Zinger_Burger+Coke+socks+shalwar+pent_coat+sweater+partydress+casual_coat+party_sandals;
           return( itemCost);
       } 
       public double cFindTax(double cAmount){
       double FindTax=cAmount - (cAmount * cTax );
        return( FindTax);
       }
    
   private JFrame frame;
   
   public void iExitSystem(){
   frame=new JFrame("Exit");
   if(javax.swing.JOptionPane.showConfirmDialog(frame,"Confirm if u want to exit","Billing System",
          javax.swing.JOptionPane.YES_NO_OPTION) == javax.swing.JOptionPane.YES_NO_OPTION){
   System.exit(0);
   }
   }
   
   public void NumbersOnly(java.awt.event.KeyEvent evt){
       char iNumber = evt.getKeyChar();
   if(!(Character.isDigit(iNumber)) 
           ||(iNumber==KeyEvent.VK_BACK_SPACE)
           ||(iNumber==KeyEvent.VK_DELETE))
               {
               evt.consume();
               };
               
   
   
   }
    
}
