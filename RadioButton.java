package radiobutton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class RadioButton extends JFrame {

    //1. Create the frame.
    JFrame frame = new JFrame("FrameDemo");

//2. Optional: What happens when the frame closes?
    //JRadioButton option1 = new JRadioButton("Linux");
    //JRadioButton option2 = new JRadioButton("Windows");
    //JRadioButton option3 = new JRadioButton("Macintosh");
    final JTextArea textarea = new JTextArea();
    final JRadioButton rb = new JRadioButton();
    final JRadioButton rb2 = new JRadioButton();
    final JRadioButton rb3 = new JRadioButton();
    JLabel label = new JLabel();

    public RadioButton() {
        frame = new JFrame();
        frame.setSize(450, 300);
//        frame.setBounds(100,100,450,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        textarea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        textarea.setForeground(Color.GREEN);
//        textarea.setEditable(false);
        textarea.setAutoscrolls(true);
//        textarea.setBounds(82,34,5000,5000);
        ScrollPane sp = new ScrollPane();
        sp.setBounds(200, 50, 800, 500);//first number of 4 moves the pane left to right
        //sp.add(textarea);
        //sp.add(label);
        
        frame.getContentPane().add(sp);

        rb.setText("P");
        rb.setBounds(0, 50, 100, 30); //2 number of set of 4 here moves the button up or down
        rb2.setText("N");
        rb2.setBounds(0, 70, 200, 30);//2 number of set of 4 here moves the button up or down
        rb3.setText("N");//2 number of set of 4 here moves the button up or down
        rb3.setBounds(0, 90, 200, 30);//2 number of set of 4 here moves the button up or down
        //alt-shft up or down to move line of code
        frame.getContentPane().add(rb); //ctrl-shft up or down to duplicate line of code
        frame.getContentPane().add(rb2); //ctrl-shft up or down to duplicate line of code
        frame.getContentPane().add(rb3); //ctrl-shft up or down to duplicate line of code
//        frame.pack();
        frame.setVisible(true);

        rb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent ae) {
                OpenFile of = new OpenFile();

                try {
                    textarea.setText(of.PickMe());
                    sp.removeAll();
                    sp.add(textarea);

                } catch (Exception e) {
                    e.printStackTrace();
                }

//                JOptionPane.showMessageDialog(null, "Clicked");
            }
        });

        rb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent ae) {
                OpenFile of = new OpenFile();

                try {
                    //of.PickMe();
                    textarea.setText(of.PickMe2());
                    sp.removeAll();
                    sp.add(textarea);
                    

                } catch (Exception e) {
                    e.printStackTrace();
                }
                

//                JOptionPane.showMessageDialog(null, "Clicked");
            }
        });
        rb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent ae) {
                OpenFile of = new OpenFile();
                label.setIcon(of.getImage());
                sp.removeAll();
                sp.add(label);

            }
        });

    }

    /* ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);
        group.add(option3);
 
        setLayout(new FlowLayout());
 
        add(option1);
        add(option2);
        add(option3);
 
        pack(); */
 /*class RadioButtonActionListener  {
		
		public void actionPerformed(ActionEvent event) {
			JRadioButton button = (JRadioButton) event.getSource();
			if (button == option1) {
                            if (button == option1) 
        {
            String path = "/Users/abc/Desktop/P"; // path to the directory to be opened
            File file = new File(path);
            Desktop desktop = Desktop.getDesktop();
            
            try {
    	desktop.open(file);
                } 
            catch (IOException e)
                { 
                }
         } 
				

			} else if (button == option2) {

				

			} else if (button == option3) {

				
			}
		}
	}
     */
    public static void main(String[] args) {

        RadioButton gui = new RadioButton();
    }

}
