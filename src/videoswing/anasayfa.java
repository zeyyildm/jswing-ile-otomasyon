package videoswing;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class anasayfa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					anasayfa frame = new anasayfa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public anasayfa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(254, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField("Buradan işlemlerinizi yapabilirsiniz.");
		textField.setEditable(false);
		textField.setBounds(99, 6, 245, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton eklebutton = new JButton("Ürün Ekle");
		eklebutton.setBounds(40, 55, 124, 37);
		contentPane.add(eklebutton);
		eklebutton.addActionListener((ActionListener) new ActionListener(){
			public void actionPerformed(ActionEvent evt) {
				openNewFrame();
			}

			 private void openNewFrame() {
			    	EventQueue.invokeLater(new Runnable() {
			            public void run() {
			            	try {
			            		ürünekle ürünekle = new ürünekle();
			            		ürünekle.setVisible(true);
			            		dispose();
			            		
			            	}
			            	
			            	catch(Exception e){
			            		e.printStackTrace();
			            	}
			            }});
			    	
			    }

			
		});
		
		
		JButton cikarbutton = new JButton("Ürün Çıkar");
		cikarbutton.setBounds(40, 119, 124, 37);
		contentPane.add(cikarbutton);
		cikarbutton.addActionListener((ActionListener) new ActionListener(){
			public void actionPerformed(ActionEvent evt) {
				openNewFrame();
			}

			 private void openNewFrame() {
			    	EventQueue.invokeLater(new Runnable() {
			            public void run() {
			            	try {
			            		ürüncikar ürüncikar = new ürüncikar();
			            		ürüncikar.setVisible(true);
			            		dispose();
			            		
			            	}
			            	
			            	catch(Exception e){
			            		e.printStackTrace();
			            	}
			            }});
			    	
			    }

			
		});
		
		JButton listelebutton = new JButton("Ürünleri Listele");
		listelebutton.setBounds(40, 184, 124, 37);
		contentPane.add(listelebutton);
		
		JButton cikisbutton = new JButton("Çıkış Yap");
		cikisbutton.setBounds(327, 223, 117, 29);
		contentPane.add(cikisbutton);
		cikisbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				openNewFrame2();
			}
			
			private void openNewFrame2() {
				EventQueue.invokeLater(new Runnable() {
		            public void run() {
		            	try {
		            		frm1 frm1 = new frm1();
		            		frm1.setVisible(true);
		            		dispose();
		            		
		            	}
		            	
		            	catch(Exception e){
		            		e.printStackTrace();
		            	}
		            }});
			}
		});
		listelebutton.addActionListener((ActionListener) new ActionListener(){
			public void actionPerformed(ActionEvent evt) {
				openNewFrame();
			}

			 private void openNewFrame() {
			    	EventQueue.invokeLater(new Runnable() {
			            public void run() {
			            	try {
			            		ürünlistele ürünlistele = new ürünlistele();
			            		ürünlistele.setVisible(true);
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
