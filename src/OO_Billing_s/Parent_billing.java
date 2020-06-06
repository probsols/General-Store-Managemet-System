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
 * @author Hamza
 */
public class Parent_billing {
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
    public double cTax;
    
    public double pFries = 50;
    public double pCrispy_Burger=150;
    public double pIcecream=90;
    public double pChicken_salad=120;
    public double pOnion_rings=140;
    public double pZinger_Burger=250;
    public double pCoke=80;
    public double pCrunch_Chicken=300;
    public double pCheese_Burger=350;
    public double pButter_Burger=300;
    public double pTax=0.90;
      
       public double itemCost;
       
       public double GetAmount(){
           itemCost=Fries+Crispy_Burger+Icecream+Chicken_salad+Onion_rings+Zinger_Burger+Coke+Crunch_Chicken+Cheese_Burger+Butter_Burger;
           return( itemCost);
       } 
       public double cFindTax(double cAmount){
       double FindTax=cAmount - (cAmount * cTax );
        return( FindTax);
       }
    
   private JFrame frame;
   
   public void iExitSystem(){
   frame=new JFrame("Exit");
   if(JOptionPane.showConfirmDialog(frame,"Confirm if u want to exit","Billing System",
          JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
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
