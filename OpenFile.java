package radiobutton;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

public class OpenFile {

//    JFileChooser fileChooser = new JFileChooser();
//    StringBuilder sb = new StringBuilder();

    public String PickMe() throws Exception {
        StringBuilder sb = new StringBuilder();
//       if(fileChooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
        //get file
//           java.io.File file = fileChooser.getSelectedFile();
        File file = new File("C:\\Users\\abc\\Desktop\\P\\bigfivepersonalitytraitscores.csv");
        File file2 = new File("C:\\Users\\abc\\Desktop\\N\\neurogenomicdata.csv");
        //File file3 = new File("C:\\Users\\abc\\Desktop\\Dataset\\mri1.jpg");

        //create a scanner for the file
        Scanner input = new Scanner(file);
        Scanner input2 = new Scanner(file2);
        //Scanner input3 = new Scanner(file3);

        //read text from file
        while (input.hasNext()) {
            sb.append(input.nextLine());
            sb.append("\n");

        }
        input.close();
//       }
//       else{
//           sb.append("No file was selected");
//       }
return sb.toString();
    }

    public String PickMe2() throws Exception {
        StringBuilder sb2 = new StringBuilder();
        File file2 = new File("C:\\Users\\abc\\Desktop\\N\\neurogenomicdata.csv");
        Scanner input2 = new Scanner(file2);
        while (input2.hasNext()) {
            sb2.append(input2.nextLine());
            sb2.append("\n");
        }
        input2.close();
        return sb2.toString();
    }

    public Icon getImage() {
        //File file3 = new File("C:\\Users\\abc\\Desktop\\Dataset\\mri1.jpg");
        Icon icon = new ImageIcon("C:\\Users\\abc\\Desktop\\Dataset\\mri1.jpg");
        return icon;

    }

}
