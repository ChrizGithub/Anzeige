import java.awt.Checkbox;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemEvent;

public class Login extends JFrame
implements Runnable{

	private JFrame frameLogin;
	private JTextField tfBenutzername;
	private JTextField tfPasswort;
	private JCheckBox CheckBox;

	private boolean running = true;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frameLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		t = new Thread(this);
		t.start();
		
	}
	
	Thread t = new Thread(new Runnable() {

		@Override
		public void run() {
			
			while(running) {
				
				try {
					
					Thread.sleep(500);
					CheckBox.setBorder(new LineBorder(Color.GREEN));
					Thread.sleep(500);
					CheckBox.setBorder((new LineBorder(Color.WHITE)));
					
				} catch (Exception e) {
					
				}
			}
			
			
		}
		
		
	});
	public void run() {
		
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		t.start();
		
		frameLogin = new JFrame();
		frameLogin.getContentPane().setBackground(Color.BLACK);
		frameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameLogin.setBounds(100, 100, 300, 142);
		frameLogin.setLocationRelativeTo(null);
		frameLogin.setResizable(false);
		frameLogin.getContentPane().setLayout(null);
		Image Rahmen = new ImageIcon(this.getClass().getResource("/Basketball-PNG-HD.png")).getImage();
		frameLogin.setIconImage(Rahmen);
		frameLogin.setFocusable(true);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(195, 81, 89, 23);
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBackground(Color.DARK_GRAY);
		btnLogin.setBorder(new LineBorder(Color.WHITE));
		frameLogin.getContentPane().add(btnLogin);
		frameLogin.getContentPane().add(btnLogin);
		
		JLabel lblBenutzername = new JLabel("Benutzername");
		lblBenutzername.setForeground(Color.WHITE);
		lblBenutzername.setBounds(10, 11, 114, 14);
		frameLogin.getContentPane().add(lblBenutzername);
		
		tfBenutzername = new JTextField();
		tfBenutzername.setBounds(134, 8, 150, 20);
		frameLogin.getContentPane().add(tfBenutzername);
		tfBenutzername.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Passwort");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 36, 114, 14);
		frameLogin.getContentPane().add(lblNewLabel);
		
		tfPasswort = new JTextField();
		tfPasswort.setColumns(10);
		tfPasswort.setBounds(134, 33, 150, 20);
		frameLogin.getContentPane().add(tfPasswort);
		
		JCheckBox CheckBox = new JCheckBox("Autofill");
		CheckBox.setForeground(Color.WHITE);
		CheckBox.setBackground(Color.BLACK);
		CheckBox.setBorder(new LineBorder(Color.WHITE));
		CheckBox.setBounds(6, 81, 97, 23);
		frameLogin.getContentPane().add(CheckBox);
		
		this.CheckBox = CheckBox;
		
		frameLogin.addKeyListener(new KeyListener() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				
				int keyCode = e.getKeyCode();
				
				switch (keyCode) {
				
				case KeyEvent.VK_ENTER: btnLogin.doClick(); break;
				
				}
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
			}
			
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
		});
		
		CheckBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				if(e.getStateChange() == ItemEvent.SELECTED) {
					
					tfBenutzername.setText("Admin");
					tfPasswort.setText("Basketball");
					
				} else {
					
					tfBenutzername.setText("");
					tfPasswort.setText("");
					
				}
				
			}
			
			
		});
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Benutzername = tfBenutzername.getText();
				String Passwort = tfPasswort.getText();
				
				if (Benutzername.equals("Admin") && Passwort.equals("Basketball")) {
					
					JOptionPane.showMessageDialog(null, "Login erfolgreich", "Login erfolgreich!", JOptionPane.INFORMATION_MESSAGE);
					
					Anzeige anzeige = new Anzeige();
					anzeige.AnzeigeWindow(null);
					anzeige.setLocationRelativeTo(frameLogin);
					frameLogin.dispose();
					
				} else if (Benutzername.equals("") && Passwort.equals("")){
					
					JOptionPane.showMessageDialog(null, "Login fehlgeschlagen. Kein Benutzername und kein Passwort eingegeben.", "Login fehlgeschlagen!", JOptionPane.ERROR_MESSAGE);
					
				} else if (Benutzername.equals("Admin") && Passwort.equals("")){
					
					JOptionPane.showMessageDialog(null, "Login fehlgeschlagen. Kein Passwort eingegeben.", "Login fehlgeschlagen!", JOptionPane.ERROR_MESSAGE);
					
				} else if (Benutzername.equals("") && Passwort.equals("Basketball")){
					
					JOptionPane.showMessageDialog(null, "Login fehlgeschlagen. Kein Benutzername eingegeben.", "Login fehlgeschlagen!", JOptionPane.ERROR_MESSAGE);
					
				} else if (Passwort.equals("Basketball")){
					
					JOptionPane.showMessageDialog(null, "Login fehlgeschlagen. Benutzername falsch.", "Login fehlgeschlagen!", JOptionPane.ERROR_MESSAGE);
					
				} else if (Benutzername.equals("Admin")){
					
					JOptionPane.showMessageDialog(null, "Login fehlgeschlagen. Passwort falsch.", "Login fehlgeschlagen!", JOptionPane.ERROR_MESSAGE);
					
				} else {
					
					JOptionPane.showMessageDialog(null, "Login fehlgeschlagen. Benutzername und Passwort falsch.", "Login fehlgeschlagen!", JOptionPane.ERROR_MESSAGE);
					
				}
			}
			
			});
		
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnLogin.setBackground(Color.GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnLogin.setBackground(Color.DARK_GRAY);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				btnLogin.setBackground(Color.GRAY);
			}
		});
	}
}
