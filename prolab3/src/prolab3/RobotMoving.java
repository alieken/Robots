
package prolab3;


import java.awt.Graphics;
import java.util.Scanner;
import javax.swing.JComponent;

public class RobotMoving extends JComponent {
    public int robotyery2;
    public int robotyery;
    public int robotyerx2;
    public int robotyerx;
    public int hareket;
    public String yon;
    public int x[];
    public int y[];
    String robotcinsi;
    public int engelgecikmesi=0;
    public int robotHizi;
    public float bitisSuresi=0;
   public void robotyeni()
      {
          Scanner scan3 = new Scanner ( System.in);
          Scanner scan4 = new Scanner ( System.in);
          System.out.println("Saga gitmek icin D");
          System.out.println("Sola gitmek icin A");
          System.out.println("Yukari gitmek icin W");
          System.out.println("Asagi gitmek icin S");
          System.out.println("Cikmak icin 0'i");
          System.out.print("Tuslayiniz.");
          
          for (;;) {
          System.out.print("Yon giriniz:");
           yon =scan3.next();
           if(yon.equals("0")==true)
               break;           
           System.out.print("Kac birim gidilecek:");
           hareket = scan4.nextInt();
           if(yon.equals("w")==true){
               for (int i = 0; i < hareket; i++) {
                   if(carpti(x,y)==0){
                       break;
                   }
                   robotyery2--;
                   bitisSuresi+=10.0/robotHizi;
                   if(robotyery2<1)
                   {
                       bitisSuresi-=10.0/robotHizi;
                       robotyery2=1;
                       break;
                   }
                   
               }
               
           }
           if(yon.equals("s")==true){
               for (int i = 0; i < hareket; i++) {
                   if(carpti(x,y)==0){
                       break;
                   }
                   robotyery2++;
                   bitisSuresi+=10.0/robotHizi;
                    if(robotyery2>20)
                   {
                       bitisSuresi-=10.0/robotHizi;
                       robotyery2=20;
                       break;
                   }
           }
                
           }
           if(yon.equals("a")==true){
               for (int i = 0; i < hareket; i++) {
                   if(carpti(x,y)==0){
                       break;
                   }
                   robotyerx2--;
                   bitisSuresi+=10.0/robotHizi;
                    if(robotyerx2<1)
                   {
                       bitisSuresi-=10.0/robotHizi;
                       robotyerx2=1;
                       break;
                   }
           }
                
           }
           if(yon.equals("d")==true){
               for (int i = 0; i < hareket; i++) {
                   if(carpti(x,y)==0){
                       break;
                   }
                   robotyerx2++;
                   bitisSuresi+=10.0/robotHizi;
                    if(robotyerx2>20)
                   {
                       bitisSuresi-=10.0/robotHizi;
                       robotyerx2=20;
                       break;
                   }
           }
                
           } 
          }
      }
   public int carpti(int x[], int y[]){
       if(yon.equals("w")==true){
           for (int i = 0; i < y.length; i++) {
               if(y[i]==this.robotyery2 && x[i]== this.robotyerx2){
                   if(robotcinsi.equals("spider"))
                   return 0;
                   else {
                       engelgecikmesi++;
                       return 5;
                   }
               }
                   
               
           }
       }
           if(yon.equals("s")==true){
           for (int i = 0; i < y.length; i++) {
               if(y[i]==this.robotyery2 && x[i]== this.robotyerx2)
               {
               if(robotcinsi.equals("spider"))
                   return 0;
                   else {
                       engelgecikmesi++;
                       return 5;
                   }
               }
               
           }
           }
           if(yon.equals("a")==true){
           for (int i = 0; i < x.length; i++) {
               if(x[i]==this.robotyerx2 &&  y[i]== this.robotyery2)
               {
               if(robotcinsi.equals("spider"))
                   return 0;
                   else {
                       engelgecikmesi++;
                       return 5;
                   }
               }
               
           }
           }
           if(yon.equals("d")==true){
           for (int i = 0; i < y.length; i++) {
               if(x[i]==this.robotyerx2 &&  y[i]== this.robotyery2)
               {
               if(robotcinsi.equals("spider"))
                   return 0;
                   else {
                       engelgecikmesi++;
                       return 5;
                   }
               }
               
           }
           
       }
       return -5;
   }
   
   
 
    @Override
    public void paint(Graphics g) {
        //super.paint(g);
   
   g.drawString("R", robotyerx2*30+10 , (robotyery2+1)*30-10);
          
    }   
}

