package videoswing;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;
import javax.swing.JCheckBox;

public class frm1 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField kullaniciadigir;
    private JTextField kullaniciadi;
    private JTextField sifre;
    private JPasswordField sifregir;
    
    private void button_girisActionPerformed(java.awt.event.ActionEvent evt) {
    	String kadi = "admin";
    	String pass =  "2468";
    	if(kullaniciadigir.getText().equals(kadi) && sifregir.getText().equals(pass)) {
    		openNewFrame();
    	}
    	else {
    		JOptionPane.showMessageDialog(null, "Kullanıcı adı veya şifre hatalı...");
    	}
    }
    
    private void openNewFrame() {
    	EventQueue.invokeLater(new Runnable() {
            public void run() {
            	try {
            		anasayfa anasayfa = new anasayfa();
            		anasayfa.setVisible(true);
            		dispose();
            		
            	}
            	
            	catch(Exception e){
            		e.printStackTrace();
            	}
            }});
    	
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm1 frame = new frm1();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm1() {
        setTitle("ADMİN GİRİŞ SAYFASI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 650, 300);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(253, 201, 226));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton ilkbutton = new JButton("Giriş Yap");
        ilkbutton.setBounds(24, 159, 111, 33);
        contentPane.add(ilkbutton);
        ilkbutton.setBackground(new  Color(234,81,39));
        ilkbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                button_girisActionPerformed(evt);
            }
        });

        kullaniciadigir = new JTextField();
        kullaniciadigir.setBounds(147, 38, 169, 23);
        contentPane.add(kullaniciadigir);
        kullaniciadigir.setColumns(10);
       
        
        kullaniciadi = new JTextField("kullanıcı adı: ");
        kullaniciadi.setBackground(new Color(253, 201, 226));
        kullaniciadi.setForeground(new Color(0, 0, 0));
        kullaniciadi.setBounds(6, 38, 129, 23);
        contentPane.add(kullaniciadi);
        kullaniciadi.setColumns(10);
        kullaniciadi.setEditable(false);
      
        
        sifre = new JTextField("şifre :");
        sifre.setBackground(new Color(253, 201, 226));
        sifre.setBounds(6, 75, 129, 27);
        sifre.setEditable(false); 
        contentPane.add(sifre);
        sifre.setColumns(10);
        
        JButton btnNewButton = new JButton("Yeniden Dene");
        btnNewButton.setBounds(164, 159, 111, 33);
        contentPane.add(btnNewButton);
        
        sifregir = new JPasswordField();
        sifregir.setBounds(147, 79, 169, 23);
        contentPane.add(sifregir);
        
        JCheckBox NewCheckBox = new JCheckBox("Kullanıcı adımı ve şifremi hatırla");
        NewCheckBox.setBounds(24, 124, 280, 23);
        contentPane.add(NewCheckBox);
        
        
        
       
        
    }
}

