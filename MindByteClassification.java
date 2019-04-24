
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
    //text areas ALL THE TIME!
    final JTextArea sequencearea = new JTextArea(10,20);
    
    //scroll bars for text areas all the time!
    



    JPanel pnl = new JPanel();
    JPanel pnltwo = new JPanel();
    
    private JScrollPane vertical;

 
    JButton GENESEQUENCE = new JButton(" ANALYZE GENE SEQUENCE ");
    
    JCheckBox chkDNA = new JCheckBox(" N.I. mindbyte ");
    JCheckBox chkRNA = new JCheckBox(" N.G. mindbyte ");
    JCheckBox chkPROTEIN = new JCheckBox("Personality mindbyte");
    
            
    JLabel lblOutput = new JLabel(" ");
    
    public MindByteClassification()
           {
               
               pnl.setLayout(new GridLayout(4, 1 ,5, 5));
               
               
               
               content.add(sequencearea);
               
              
               this.setVisible(true);

               this.setSize(300,300);
               this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               this.setTitle(" SwingBlast Version 1.1 ");

               content.add(pnl, BorderLayout.NORTH);
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
        
        sequencearea.setText("");
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
 String seqText = sequencearea.getText(); 
 int idx = seqText.indexOf(">"); 
 boolean fastaFormatted = idx != -1; 
 String header = null; int seqLength = 0; 
 String sequence = " " ; 
 String fastaSeq = ""; 
if (fastaFormatted) { int returnldx = seqText.indexOf("\n"); 
header = seqText.substring(0, returnldx); 
fastaSeq = seqText.substring(returnldx + 1, seqText.length()).replaceAll("\\s", "").toLowerCase(); 
fastaSeq = seqText; 
} else { seqText = seqText.replaceAll("\\s", ""); 
fastaSeq = seqText.toLowerCase(); 
header = "> Sequencel"; 
seqLength = seqText.length(); } 
if (!fastaFormatted) { fastaSeq = header + "|" + seqLength + " bp " + "\n" + 
fastaSeq; 
} sequencearea.setText(fastaSeq); 
final Font sf = sequencearea.getFont(); 
Font f = new Font("Monospaced", sf.getStyle(), sf.getSize()); sequencearea.setFont(f); 
}
 
private JCheckBox[] cbDna; 
private JCheckBox[] cbProtein; 
private JComboBox   comboDbs; 
private JComboBox   comboEvalues; 
 
/*private JPanel createProgramPanel() 
{
  JPanel programPanel = new JPanel(); 
  JLabel program = new JLabel("Program");
  program.setPreferredSize(new Dimension(600,600));
  cbDNA
  return -1;
} */
    
    public static void main(String[] args) 
    {
        MindByteClassification gui = new MindByteClassification();
    }
    
}


