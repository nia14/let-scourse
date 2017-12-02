/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author NIA
 */
public class PilihanController implements Initializable {

    @FXML
    private JFXCheckBox a;
    @FXML
    private JFXCheckBox b;
    @FXML
    private JFXCheckBox d;
    @FXML
    private JFXCheckBox e;
    @FXML
    private JFXCheckBox f;
    @FXML
    private JFXButton selesai;
    @FXML
    private JFXCheckBox c;
    @FXML
    private JFXTextArea hasil;
    @FXML
    private JFXTextField nama;
    @FXML
    private JFXRadioButton radio1;
    @FXML
    private JFXRadioButton radio2;
    @FXML
    private JFXButton ps;
    @FXML
    private JFXButton ke;
    @FXML
    private JFXRadioButton hari1;

    @FXML
    private JFXRadioButton hari2;


    
    String paket="";
    String hari="";
    String pemesan, ket;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void proses(ActionEvent event) {
        if (radio1.isSelected()) {
            ket = "14.00-16.00";
        } else if (radio2.isSelected()) {
            ket = "18.00-20.00";
        } else {
            ket = "";
        }
        
         if(hari1.isSelected()){     
            hari += hari1.getText()+" ";
        }
          if(hari2.isSelected()){     
            hari += hari2.getText()+" ";
        }
        
        if(a.isSelected()){     
            paket += a.getText()+" Ilmu Pengetahuan Alam , Matematika ";
        }
          if(b.isSelected()){     
            paket += b.getText()+" Ilmu Pengetahuan Alam , Bahasa Inggris ";
        }
          if(c.isSelected()){     
            paket += c.getText()+" Matematika , Bahasa Inggris ";
        }
          if(d.isSelected()){     
            paket += d.getText()+" Ilmu Pengetahuan Alam ";
        }
          if(e.isSelected()){     
            paket += e.getText()+" Bahasa Inggris";
        }
          if(f.isSelected()){     
            paket += f.getText()+" Matematika ";
        }
        pemesan = nama.getText();
        hasil.setText("Nama: " + pemesan + "\n\n" + "Paket yang Dipilih : "  + paket +"\n\n" + "Hari : "+hari+"\n\n"+ "Jam : " + ket );        
    }

}
