//Copyright 2019, Jordan Browning, All rights reserved


package mindbyteclassification;
import javax.swing.BorderFactory;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;



public class MindByteClassification extends JFrame implements FocusListener, ActionListener,ItemListener
        {
Container content = this.getContentPane();
  
    final JTextArea sequencearea = new JTextArea(10,20);
    
  
    



    JPanel pnl = new JPanel();
    JPanel pnltwo = new JPanel();
    
    private JScrollPane vertical;

 
    JButton GENESEQUENCE = new JButton(" Analyze Mind Bytes ");
    
    JCheckBox chkDNA = new JCheckBox(" N.I. mindbyte ");
    JCheckBox chkRNA = new JCheckBox(" N.G. mindbyte ");
    JCheckBox chkPROTEIN = new JCheckBox("Personality mindbyte");
    
            
    JLabel lblOutput = new JLabel(" ");
    
    public MindByteClassification()
           {
               
               pnl.setLayout(new GridLayout(4, 1 ,5, 5));
               
               
               
               content.add(sequencearea);
               
              
               this.setVisible(true);

               this.setSize(600,600);
               this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               this.setTitle(" Neural Network ");

               content.add(pnl, BorderLayout.SOUTH);
               pnl.add(GENESEQUENCE);
               vertical = new JScrollPane(sequencearea);
               vertical.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
               add(vertical);
               
                             
               sequencearea.addFocusListener(this);
               
           
               
               content.add(lblOutput, BorderLayout.NORTH);
               pnl.add(chkDNA);
               pnl.add(chkRNA);
               pnl.add(chkPROTEIN);
               
               chkDNA.addItemListener(this);
               chkRNA.addItemListener(this);
               chkPROTEIN.addItemListener(this);
               
               content.add(pnltwo, BorderLayout.NORTH);
             
           }
    public void actionPerformed(ActionEvent e)
{
        
       
}

public void itemStateChanged(ItemEvent ie)
   {
       JCheckBox chk = (JCheckBox) ie.getSource();
       if(chk == chkDNA)
       {
           if(chk.isSelected())
               lblOutput.setText(" DNA Database Selected ");
       }
       
       else if(chk == chkRNA)
       {
           if(chk.isSelected())
               lblOutput.setText(" RNA Database Selected ");
       }
       else if(chk ==chkPROTEIN)
       {
           if(chk.isSelected())
               lblOutput.setText(" Protein Database Selected ");
       }
       
   }

public void focusGained(FocusEvent e)
{
     
} 

public void focusLost(FocusEvent e)
{
 
}
 


    
    public static void main(String[] args) 
    {
        MindByteClassification gui = new MindByteClassification();
    }
    
}


