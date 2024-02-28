package videoswing;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class ürünlistele extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ürünlistele frame = new ürünlistele();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public ürünlistele() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(254, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
contentPane.setLayout(null);
		
		textField = new JTextField("Ürünleri buradan listeleyebilirsiniz.");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setBounds(112, 6, 245, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton geributton = new JButton("geri");
		geributton.setBounds(22, 6, 53, 29);
		contentPane.add(geributton);
		geributton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				openNewFrame();
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
		});
		
	}

}
