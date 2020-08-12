import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import java.awt.Label;
import java.awt.Color;
import javax.swing.SwingConstants;

public class InfoEnglisch {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void InfoWindow(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InfoEnglisch window = new InfoEnglisch();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InfoEnglisch() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 450, 173);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		Image Rahmen = new ImageIcon(this.getClass().getResource("/Basketball-PNG-HD.png")).getImage();
		frame.setIconImage(Rahmen);
		frame.getContentPane().setLayout(null);
		
		Label label = new Label("Developed by Christopher Kochaneck - 2020 \u00A9");
		label.setForeground(Color.WHITE);
		label.setBackground(Color.BLACK);
		label.setAlignment(Label.CENTER);
		label.setBounds(10, 87, 424, 22);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("Program Work in Progress.");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(20, 115, 414, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Hints regarding to the Buttons will be shown below the Controlpanel.");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 11, 424, 14);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
