
package tic_tac_toe;
import java.awt.event.*;
import java.awt.*;
//import javax.swing.*;
public class TIC_TAC_TOE extends Frame implements ActionListener {
 public Button []b=new Button[9];
  Label l1=new Label();
  Button b3=new Button();
  Label l=new Label("     TIC TAC TOE");
  boolean f=true;
  int x=0;
  int y=100;
  int w=100;
  int h=100;
  int c=0;
  int d=0;
  int k=0;
    TIC_TAC_TOE(String s)
    {
       super(s); 
       Font f=new Font("Forte",Font.BOLD,30);
       setFont(f);
        setLayout(null);
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
               b[k]=new Button(null);
               b[k].setBounds(x,y,w,h);
               add(b[k]);
               k++;
               x+=100;
        }
            x=0;
            y+=100;
        }
         b[0].addActionListener(this);
        b[1].addActionListener(this);
        b[2].addActionListener(this);
        b[3].addActionListener(this);
        b[4].addActionListener(this);
        b[5].addActionListener(this);
        b[6].addActionListener(this);
        b[7].addActionListener(this);
        b[8].addActionListener(this);
         l1.setBounds(8,400,175,50);
         l1.setBackground(null);
         add(l1);
        b3.setBounds(175,400,125,50);
        b3.setLabel("reset");
        b3.setBackground(Color.pink);
        add(b3);
        l.setBounds(10,50,300,50);
        l.setBackground(Color.blue);
        add(l);
       b3.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e)
    { 
      Button b1=(Button)e.getSource(); 
      if(c%2==0&& b1.getLabel()!="reset")
      {
          b1.setLabel("X");
          b1.setEnabled(false);
      }
      else if(c%2!=0&&b1.getLabel()!="reset")

          b1.setLabel("0");
          b1.setEnabled(false);

     // b1.removeActionListener(this);
      c++;
      d++;
      if((b[0].getLabel()=="X"&&b[1].getLabel()=="X"&&b[2].getLabel()=="X")||
          (b[3].getLabel()=="X"&&b[4].getLabel()=="X"&&b[5].getLabel()=="X")||
           (b[6].getLabel()=="X"&&b[7].getLabel()=="X"&&b[8].getLabel()=="X")||
           (b[0].getLabel()=="X"&&b[3].getLabel()=="X"&&b[6].getLabel()=="X")||
          (b[1].getLabel()=="X"&&b[4].getLabel()=="X"&&b[7].getLabel()=="X")||
          (b[2].getLabel()=="X"&&b[5].getLabel()=="X"&&b[8].getLabel()=="X")||
          (b[0].getLabel()=="X"&&b[4].getLabel()=="X"&&b[8].getLabel()=="X")||
          (b[2].getLabel()=="X"&&b[4].getLabel()=="X"&&b[6].getLabel()=="X"))
      {
          l1.setText("X is winner");
          f=false;
          l1.setBackground(Color.red);
           b[0].setEnabled(false); 
        b[1].setEnabled(false); 
        b[2].setEnabled(false); 
        b[3].setEnabled(false); 
        b[4].setEnabled(false); 
        b[5].setEnabled(false); 
        b[6].setEnabled(false); 
        b[7].setEnabled(false); 
        b[8].setEnabled(false); 
           // b2.removeActionListener(this);
      }
      else if((b[0].getLabel()=="0"&&b[1].getLabel()=="0"&&b[2].getLabel()=="0")||
          (b[3].getLabel()=="0"&&b[4].getLabel()=="0"&&b[5].getLabel()=="0")||
           (b[6].getLabel()=="0"&&b[7].getLabel()=="0"&&b[8].getLabel()=="0")||
           (b[0].getLabel()=="0"&&b[3].getLabel()=="0"&&b[6].getLabel()=="0")||
          (b[1].getLabel()=="0"&&b[4].getLabel()=="0"&&b[7].getLabel()=="0")||
          (b[2].getLabel()=="0"&&b[5].getLabel()=="0"&&b[8].getLabel()=="0")||
          (b[0].getLabel()=="0"&&b[4].getLabel()=="0"&&b[8].getLabel()=="0")||
          (b[2].getLabel()=="0"&&b[4].getLabel()=="0"&&b[6].getLabel()=="0"))
      {
                      l1.setText("0 is winner");
                      f=false;
                      l1.setBackground(Color.green);
                            b[0].setEnabled(false); 
        b[1].setEnabled(false); 
        b[2].setEnabled(false); 
        b[3].setEnabled(false); 
        b[4].setEnabled(false); 
        b[5].setEnabled(false); 
        b[6].setEnabled(false); 
        b[7].setEnabled(false); 
        b[8].setEnabled(false); 

      }
        
       if(b[0].getLabel()!=null&&b[1].getLabel()!=null&&b[2].getLabel()!=null&&
          b[3].getLabel()!=null&&b[4].getLabel()!=null&&b[5].getLabel()!=null&&
          b[6].getLabel()!=null&&b[7].getLabel()!=null&&b[8].getLabel()!=null&&f==true)      
      {           l1.setText(" Game tied");
                  l1.setBackground(Color.yellow);

                               // b2.removeActionListener(this);
      }
      if(b1.getLabel()=="reset")
      {
          d=0;
          c=0;
          k=0;
         int a=0;
        b[0].setEnabled(true); 
        b[1].setEnabled(true); 
        b[2].setEnabled(true); 
        b[3].setEnabled(true); 
        b[4].setEnabled(true); 
        b[5].setEnabled(true); 
        b[6].setEnabled(true); 
        b[7].setEnabled(true); 
        b[8].setEnabled(true); 
        b3.setEnabled(true); 
        b[0].setLabel(null); 
        b[1].setLabel(null);
        b[2].setLabel(null);
        b[3].setLabel(null);
        b[4].setLabel(null);
        b[5].setLabel(null);
        b[6].setLabel(null);
        b[7].setLabel(null);
        b[8].setLabel(null);
        l1.setText(null);
        l1.setBackground(null);
        f=true;
      }
    } 


 public static void main(String []args) {
    
    
    TIC_TAC_TOE t=new TIC_TAC_TOE("TIC_TAC_TOE GAME");
      t.setVisible(true);
     t.setSize(300,450);
     t.setResizable(false);
     t.addWindowListener(new WindowAdapter(){
      public void windowClosing(WindowEvent e)
      {
          System.exit(0);
      }
     
 });
    }
}    

