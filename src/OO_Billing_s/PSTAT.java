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
public class PSTAT {
    public double Fries;
    public double Crispy_Burger;
    public double Icecream;
    public double Chicken_salad;
    public double Onion_rings;
    public double Zinger_Burger;
    public double Coke;
    public double Crunch_Chicken;
    public double Cheese_Burger;
    public double Butter_Burger;
    public double geometry;
    public double glue;
    public double cTax;
    
    public double PEN = 30;
    public double INK=50;
    public double PENCIL=10;
    public double RASER=10;
    public double SHOP=10;
    public double MARKER=10;
    public double SHEET=8;
    public double REG=150;
    public double NOTE=100;
    public double COVER=30;
    public double pgeometry=100;
    public double pglue=30;
    public double pTax=0.90;
    
    
      
       public double itemCost;
       
       public double GetAmount(){
           itemCost=Fries+Crispy_Burger+Icecream+Chicken_salad+Onion_rings+Zinger_Burger+Coke+Crunch_Chicken+Cheese_Burger+Butter_Burger+glue+geometry;
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
