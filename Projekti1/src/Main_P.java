import javax.swing.*;
public class Main_P {
   public static void main (String [] args) {
      
      String Vo_ms="Write velocity-Vo of a automobile";
      String a_ms="Write acceleration-a of a automobile";
      String Vo_title="Velocity Vo";
      String a_title="Acceleration a";
      String gabim1="PLEASE\n";
      String gabim2="\n ONLY WITH NON NEGATIVE NUMBERS";
      String Vo_ms_g=gabim1+Vo_ms+gabim2;
      String a_ms_g=gabim1+a_ms+gabim2;
      
      int ask=JOptionPane.QUESTION_MESSAGE;
      int warning=JOptionPane.WARNING_MESSAGE;
      View_P obj_v= new View_P();      
      Model_P obj_m= new Model_P();    
      Controller_P obj_c= new Controller_P(obj_v,obj_m);   
       
      double Vo = obj_c.s_wrong(Vo_ms,Vo_title,ask,Vo_ms_g,warning);
      double a = obj_c.s_wrong(a_ms,a_title,ask,a_ms_g,warning);
      String d_f = obj_c.distance1(Vo,a);
      obj_c.panel_end(d_f);
   }
}


