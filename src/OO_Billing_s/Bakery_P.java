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
public class Bakery_P {
   
    public double bread;
     public double C_cake;
    public double P_cake;
    public double Brownie;
    public double Cookies;
    public double Bun;
    public double R_toast;
    public double Plane_cake;
    public double Donuts;
    public double Shashlick;
    public double cTax;
    public double C_Roll;
    public double Sandwich;
    
    
    public double pbread=80;
    
    public double pC_cake = 500;
    public double pP_cake=60;
    public double pBrownie=70;
    public double pCookies=8;
    public double pBun=30;
    public double pR_toast=80;
    public double pPlane_cake=300;
    public double pDonuts=55;
    public double pShashlick=300;
    public double pTax=0.90;
    public double pC_Roll=40;
    public double pSandwich=50;
      
       public double itemCost;
       
       public double GetAmount(){
           itemCost=bread+C_cake+P_cake+Brownie+Cookies+Bun+R_toast+Plane_cake+Donuts+Shashlick+C_Roll+Sandwich;
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
