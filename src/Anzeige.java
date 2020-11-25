import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Anzeige extends JFrame 
implements Runnable{

	private JFrame frame;
	private JTextField tfPunkteHeim;
	private JTextField tfPunkteGast;
	private JTextField tfHeimFoul;
	private JTextField tfGastFoul;
	private JTextField tfShotclock;
	private JTextField tfZeit;
	private JPanel pnlAuszeitHeim1;
	private JPanel pnlAuszeitHeim2;
	private JPanel pnlAuszeitHeim3;
	private JPanel pnlAuszeitGast1;
	private JPanel pnlAuszeitGast2;
	private JPanel pnlAuszeitGast3;
	private JButton btnReset;
	private JLabel lblHeim;
	private JLabel lblGast;
	private JLabel lblViertel;
	private JLabel lblHinweis;
	private JButton btnHeimAuszeit;
	private JButton btnGastAuszeit;
	private JButton btnHotkeys;
	private JButton btnDeutsch;
	private JButton btnEnglisch;
	private JButton btnShotclockReset;
	private JButton btnUhrreset;
	private JButton btnShotclock14;
	private JButton btnShotclock24;
	private JButton btnUhrStart;
	private JButton btnUhrStopp;
	private JButton btnHP1;
	private JButton btnHP2;
	private JButton btnHP3;
	private JButton btnHM1;
	private JButton btnHM2;
	private JButton btnHM3;
	private JButton btnGP1;
	private JButton btnGP2;
	private JButton btnGP3;
	private JButton btnGM1;
	private JButton btnGM2;
	private JButton btnGM3;
	private JButton btnHFoul;
	private JButton btnGFoul;
	
	private JPanel pnlViertel1;
	private JPanel pnlViertel2;
	private JPanel pnlViertel3;
	private JPanel pnlViertel4;
	private JButton btnViertel;
	
	private JTextField tfHS1;
	private JTextField tfHS2;
	private JTextField tfHS3;
	private JTextField tfHS4;
	private JTextField tfHS5;
	private JTextField tfHS10;
	private JTextField tfHS9;
	private JTextField tfHS8;
	private JTextField tfHS7;
	private JTextField tfHS6;
	private JTextField tfHS12;
	private JTextField tfHS11;
	
	private JPanel pnlHS1F1;
	private JPanel pnlHS1F2;
	private JPanel pnlHS1F3;
	private JPanel pnlHS1F4;
	private JPanel pnlHS1F5;
	
	private JPanel pnlHS2F1;
	private JPanel pnlHS2F2;
	private JPanel pnlHS2F3;
	private JPanel pnlHS2F4;
	private JPanel pnlHS2F5;
	
	private JPanel pnlHS3F1;
	private JPanel pnlHS3F2;
	private JPanel pnlHS3F3;
	private JPanel pnlHS3F4;
	private JPanel pnlHS3F5;

	private JPanel pnlHS4F1;
	private JPanel pnlHS4F2;
	private JPanel pnlHS4F3;
	private JPanel pnlHS4F4;
	private JPanel pnlHS4F5;
	
	private JPanel pnlHS5F1;
	private JPanel pnlHS5F2;
	private JPanel pnlHS5F3;
	private JPanel pnlHS5F4;
	private JPanel pnlHS5F5;
	
	private JPanel pnlHS6F1;
	private JPanel pnlHS6F2;
	private JPanel pnlHS6F3;
	private JPanel pnlHS6F4;
	private JPanel pnlHS6F5;
	
	private JPanel pnlHS7F1;
	private JPanel pnlHS7F2;
	private JPanel pnlHS7F3;
	private JPanel pnlHS7F4;
	private JPanel pnlHS7F5;

	private JPanel pnlHS8F1;
	private JPanel pnlHS8F2;
	private JPanel pnlHS8F3;
	private JPanel pnlHS8F4;
	private JPanel pnlHS8F5;
	
	private JPanel pnlHS9F1;
	private JPanel pnlHS9F2;
	private JPanel pnlHS9F3;
	private JPanel pnlHS9F4;
	private JPanel pnlHS9F5;

	private JPanel pnlHS10F1;
	private JPanel pnlHS10F2;
	private JPanel pnlHS10F3;
	private JPanel pnlHS10F4;
	private JPanel pnlHS10F5;
	
	private JPanel pnlHS11F1;
	private JPanel pnlHS11F2;
	private JPanel pnlHS11F3;
	private JPanel pnlHS11F4;
	private JPanel pnlHS11F5;
	
	private JPanel pnlHS12F1;
	private JPanel pnlHS12F2;
	private JPanel pnlHS12F3;
	private JPanel pnlHS12F4;
	private JPanel pnlHS12F5;
	
	private JPanel pnlGS1F1;
	private JPanel pnlGS1F2;
	private JPanel pnlGS1F3;
	private JPanel pnlGS1F4;
	private JPanel pnlGS1F5;
	
	private JPanel pnlGS2F1;
	private JPanel pnlGS2F2;
	private JPanel pnlGS2F3;
	private JPanel pnlGS2F4;
	private JPanel pnlGS2F5;
	
	private JPanel pnlGS3F1;
	private JPanel pnlGS3F2;
	private JPanel pnlGS3F3;
	private JPanel pnlGS3F4;
	private JPanel pnlGS3F5;

	private JPanel pnlGS4F1;
	private JPanel pnlGS4F2;
	private JPanel pnlGS4F3;
	private JPanel pnlGS4F4;
	private JPanel pnlGS4F5;
	
	private JPanel pnlGS5F1;
	private JPanel pnlGS5F2;
	private JPanel pnlGS5F3;
	private JPanel pnlGS5F4;
	private JPanel pnlGS5F5;

	private JPanel pnlGS6F1;
	private JPanel pnlGS6F2;
	private JPanel pnlGS6F3;
	private JPanel pnlGS6F4;
	private JPanel pnlGS6F5;

	private JPanel pnlGS7F1;
	private JPanel pnlGS7F2;
	private JPanel pnlGS7F3;
	private JPanel pnlGS7F4;
	private JPanel pnlGS7F5;

	private JPanel pnlGS8F1;
	private JPanel pnlGS8F2;
	private JPanel pnlGS8F3;
	private JPanel pnlGS8F4;
	private JPanel pnlGS8F5;

	private JPanel pnlGS9F1;
	private JPanel pnlGS9F2;
	private JPanel pnlGS9F3;
	private JPanel pnlGS9F4;
	private JPanel pnlGS9F5;

	private JPanel pnlGS10F1;
	private JPanel pnlGS10F2;
	private JPanel pnlGS10F3;
	private JPanel pnlGS10F4;
	private JPanel pnlGS10F5;
	
	private JPanel pnlGS11F1;
	private JPanel pnlGS11F2;
	private JPanel pnlGS11F3;
	private JPanel pnlGS11F4;
	private JPanel pnlGS11F5;
	
	private JPanel pnlGS12F1;
	private JPanel pnlGS12F2;
	private JPanel pnlGS12F3;
	private JPanel pnlGS12F4;
	private JPanel pnlGS12F5;
	
	private JTextField tfGS1;
	private JTextField tfGS2;
	private JTextField tfGS3;
	private JTextField tfGS4;
	private JTextField tfGS5;
	private JTextField tfGS6;
	private JTextField tfGS7;
	private JTextField tfGS8;
	private JTextField tfGS9;
	private JTextField tfGS10;
	private JTextField tfGS11;
	private JTextField tfGS12;
	
	private int iH = 1;
	private int iG = 1;
	private int iL = 0;
	private int iT = 0;
	private int iK = 0;
	private int iV = 1;
	
	private int iHS1 = 0;
	private int iHS2 = 0;
	private int iHS3 = 0;
	private int iHS4 = 0;
	private int iHS5 = 0;
	private int iHS6 = 0;
	private int iHS7 = 0;
	private int iHS8 = 0;
	private int iHS9 = 0;
	private int iHS10 = 0;
	private int iHS11 = 0;
	private int iHS12 = 0;
	
	private int iGS1 = 0;
	private int iGS2 = 0;
	private int iGS3 = 0;
	private int iGS4 = 0;
	private int iGS5 = 0;
	private int iGS6 = 0;
	private int iGS7 = 0;
	private int iGS8 = 0;
	private int iGS9 = 0;
	private int iGS10 = 0;
	private int iGS11 = 0;
	private int iGS12 = 0;

	private boolean running = true;
	private boolean Zeit = false;
	public boolean Zeits = false;
	public boolean Shotclock = false;
	public boolean Shotclocks = false;
	
	private int iZm = 10;
	private int iZs = 0;
	private int iS;
	
	/**
	 * Launch the application.
	 */
	public static void AnzeigeWindow(String[]args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Anzeige window = new Anzeige();
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
	public Anzeige() {
		
		initialize();
		
		v = new Thread(this);
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	@Override
	public void run() {
		
	}
	
	Thread t = new Thread(new Runnable() {
		
		@Override
		public void run() {
		
			Shotclock();
			
		}
			
		
	});
	
	Thread z = new Thread(new Runnable() {
		
		@Override
		public void run() {

			Zeit();
			
		}
		
	});
	
	Thread v = new Thread(new Runnable() {
		
		@Override
		public void run() {
			
			
			Viertelblinken();
			
		}
		
	});
	
	private void initialize() {

		v.start();
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 820, 524);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Punkteanzeige");
		Image Rahmen = new ImageIcon(this.getClass().getResource("/Basketball-PNG-HD.png")).getImage();
		frame.setIconImage(Rahmen);
		frame.setFocusable(true);
	     	     
		tfPunkteHeim = new JTextField();
		tfPunkteHeim.setForeground(Color.YELLOW);
		tfPunkteHeim.setFont(new Font("Arial", Font.PLAIN, 30));
		tfPunkteHeim.setHorizontalAlignment(SwingConstants.CENTER);
		tfPunkteHeim.setEditable(false);
		tfPunkteHeim.setBounds(207, 11, 93, 50);
		frame.getContentPane().add(tfPunkteHeim);
		tfPunkteHeim.setColumns(10);
		tfPunkteHeim.setText("0");
		tfPunkteHeim.setBorder(new LineBorder(Color.black));		
		tfPunkteHeim.setBackground(Color.black);
		tfPunkteHeim.setFocusable(false);
		
		tfPunkteGast = new JTextField();
		tfPunkteGast.setForeground(Color.YELLOW);
		tfPunkteGast.setFont(new Font("Arial", Font.PLAIN, 30));
		tfPunkteGast.setHorizontalAlignment(SwingConstants.CENTER);
		tfPunkteGast.setEditable(false);
		tfPunkteGast.setBounds(514, 11, 93, 50);
		frame.getContentPane().add(tfPunkteGast);
		tfPunkteGast.setColumns(10);
		tfPunkteGast.setText("0");
		tfPunkteGast.setBackground(Color.black);
		tfPunkteGast.setBorder(new LineBorder(Color.black));
		
		JButton btnHP1 = new JButton("+1");
		btnHP1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnHP1.setBounds(170, 237, 50, 50);
		frame.getContentPane().add(btnHP1);
		btnHP1.setBackground(new Color(0, 102, 0));
		btnHP1.setForeground(Color.white);
		btnHP1.setBorder(new LineBorder(Color.WHITE));
		btnHP1.setFocusable(false);
		
		JButton btnHP2 = new JButton("+2");
		btnHP2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnHP2.setBounds(230, 237, 50, 50);
		frame.getContentPane().add(btnHP2);
		btnHP2.setBackground(new Color(0, 102, 0));
		btnHP2.setForeground(Color.white);
		btnHP2.setBorder(new LineBorder(Color.WHITE));	
		btnHP2.setFocusable(false);
		
		JButton btnHP3 = new JButton("+3");
		btnHP3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnHP3.setBounds(290, 237, 50, 50);
		frame.getContentPane().add(btnHP3);
		btnHP3.setBackground(new Color(0, 102, 0));
		btnHP3.setForeground(Color.white);
		btnHP3.setBorder(new LineBorder(Color.WHITE));	
		btnHP3.setFocusable(false);
		
		JButton btnHM1 = new JButton("-1");
		btnHM1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnHM1.setBounds(170, 298, 50, 50);
		frame.getContentPane().add(btnHM1);
		btnHM1.setBackground(new Color(153, 0, 0));
		btnHM1.setForeground(Color.white);
		btnHM1.setBorder(new LineBorder(Color.WHITE));	
		btnHM1.setFocusable(false);
		
		JButton btnHM2 = new JButton("-2");
		btnHM2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnHM2.setBounds(230, 298, 50, 50);
		frame.getContentPane().add(btnHM2);
		btnHM2.setBackground(new Color(153, 0, 0));
		btnHM2.setForeground(Color.white);
		btnHM2.setBorder(new LineBorder(Color.WHITE));	
		btnHM2.setFocusable(false);
		
		JButton btnHM3 = new JButton("-3");
		btnHM3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnHM3.setBounds(290, 298, 50, 50);
		frame.getContentPane().add(btnHM3);
		btnHM3.setBackground(new Color(153, 0, 0));
		btnHM3.setForeground(Color.white);
		btnHM3.setBorder(new LineBorder(Color.WHITE));	
		btnHM3.setFocusable(false);
		
		JButton btnGP1 = new JButton("+1");
		btnGP1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnGP1.setBounds(474, 237, 50, 50);
		frame.getContentPane().add(btnGP1);
		btnGP1.setBackground(new Color(0, 102, 0));
		btnGP1.setForeground(Color.white);
		btnGP1.setBorder(new LineBorder(Color.WHITE));	
		btnGP1.setFocusable(false);
		
		JButton btnGP2 = new JButton("+2");
		btnGP2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnGP2.setBounds(534, 237, 50, 50);
		frame.getContentPane().add(btnGP2);
		btnGP2.setBackground(new Color(0, 102, 0));
		btnGP2.setForeground(Color.white);
		btnGP2.setBorder(new LineBorder(Color.WHITE));	
		btnGP2.setFocusable(false);
		
		JButton btnGP3 = new JButton("+3");
		btnGP3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnGP3.setBounds(594, 237, 50, 50);
		frame.getContentPane().add(btnGP3);
		btnGP3.setBackground(new Color(0, 102, 0));
		btnGP3.setForeground(Color.white);
		btnGP3.setBorder(new LineBorder(Color.WHITE));	
		btnGP3.setFocusable(false);
		
		JButton btnGM1 = new JButton("-1");
		btnGM1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnGM1.setBounds(474, 298, 50, 50);
		frame.getContentPane().add(btnGM1);
		btnGM1.setBackground(new Color(153, 0, 0));
		btnGM1.setForeground(Color.white);
		btnGM1.setBorder(new LineBorder(Color.WHITE));	
		btnGM1.setFocusable(false);
		
		JButton btnGM2 = new JButton("-2");
		btnGM2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnGM2.setBounds(534, 298, 50, 50);
		frame.getContentPane().add(btnGM2);
		btnGM2.setBackground(new Color(153, 0, 0));
		btnGM2.setForeground(Color.white);
		btnGM2.setBorder(new LineBorder(Color.WHITE));
		btnGM2.setFocusable(false);
		
		JButton btnGM3 = new JButton("-3");
		btnGM3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnGM3.setBounds(594, 298, 50, 50);
		frame.getContentPane().add(btnGM3);
		btnGM3.setBackground(new Color(153, 0, 0));
		btnGM3.setForeground(Color.white);
		btnGM3.setBorder(new LineBorder(Color.WHITE));
		btnGM3.setFocusable(false);
		
		JButton btnHFoul = new JButton("Foul");
		btnHFoul.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnHFoul.setForeground(Color.WHITE);
		btnHFoul.setBackground(Color.DARK_GRAY);
		btnHFoul.setBounds(170, 359, 170, 24);
		btnHFoul.setBorder(new LineBorder(Color.WHITE));
		btnHFoul.setFocusable(false);
		frame.getContentPane().add(btnHFoul);
		
		JButton btnGFoul = new JButton("Foul");
		btnGFoul.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnGFoul.setForeground(Color.WHITE);
		btnGFoul.setBackground(Color.DARK_GRAY);
		btnGFoul.setBounds(474, 359, 170, 24);
		btnGFoul.setBorder(new LineBorder(Color.WHITE));
		btnGFoul.setFocusable(false);
		frame.getContentPane().add(btnGFoul);
		
		JButton btnHeimAuszeit = new JButton("Auszeit");
		btnHeimAuszeit.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnHeimAuszeit.setForeground(Color.WHITE);
		btnHeimAuszeit.setBackground(Color.DARK_GRAY);
		btnHeimAuszeit.setBounds(170, 394, 170, 24);
		btnHeimAuszeit.setBorder(new LineBorder(Color.WHITE));
		btnHeimAuszeit.setFocusable(false);
		frame.getContentPane().add(btnHeimAuszeit);
		
		JButton btnGastAuszeit = new JButton("Auszeit");
		btnGastAuszeit.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnGastAuszeit.setForeground(Color.WHITE);
		btnGastAuszeit.setBackground(Color.DARK_GRAY);
		btnGastAuszeit.setBounds(474, 394, 170, 24);
		btnGastAuszeit.setBorder(new LineBorder(Color.WHITE));
		btnGastAuszeit.setFocusable(false);
		frame.getContentPane().add(btnGastAuszeit);
		
		JLabel lblHeim = new JLabel("Heim");
		lblHeim.setFont(new Font("Eras Bold ITC", Font.PLAIN, 25));
		lblHeim.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeim.setForeground(Color.WHITE);
		lblHeim.setBounds(170, 72, 170, 35);
		lblHeim.setFocusable(false);
		frame.getContentPane().add(lblHeim);
		
		JLabel lblGast = new JLabel("Gast");
		lblGast.setFont(new Font("Eras Bold ITC", Font.PLAIN, 25));
		lblGast.setHorizontalAlignment(SwingConstants.CENTER);
		lblGast.setForeground(Color.WHITE);
		lblGast.setBounds(474, 70, 170, 35);
		lblGast.setFocusable(false);
		frame.getContentPane().add(lblGast);
		
		tfHeimFoul = new JTextField();
		tfHeimFoul.setForeground(Color.WHITE);
		tfHeimFoul.setFont(new Font("Arial", Font.PLAIN, 30));
		tfHeimFoul.setHorizontalAlignment(SwingConstants.CENTER);
		tfHeimFoul.setColumns(10);
		tfHeimFoul.setBackground(Color.BLACK);
		tfHeimFoul.setEditable(false);
		tfHeimFoul.setBounds(230, 118, 50, 50);
		tfHeimFoul.setText("0");
		tfHeimFoul.setFocusable(false);
		frame.getContentPane().add(tfHeimFoul);
		
		tfGastFoul = new JTextField();
		tfGastFoul.setForeground(Color.WHITE);
		tfGastFoul.setFont(new Font("Arial", Font.PLAIN, 30));
		tfGastFoul.setHorizontalAlignment(SwingConstants.CENTER);
		tfGastFoul.setBackground(Color.BLACK);
		tfGastFoul.setEditable(false);
		tfGastFoul.setColumns(10);
		tfGastFoul.setBounds(534, 116, 50, 50);
		tfGastFoul.setText("0");
		tfGastFoul.setFocusable(false);
		frame.getContentPane().add(tfGastFoul);
		
		JButton btnShotclock14 = new JButton("14s");
		btnShotclock14.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnShotclock14.setForeground(Color.WHITE);
		btnShotclock14.setBackground(Color.DARK_GRAY);
		btnShotclock14.setBounds(350, 359, 55, 24);
		btnShotclock14.setBorder(new LineBorder(Color.WHITE));
		btnShotclock14.setFocusable(false);
		frame.getContentPane().add(btnShotclock14);
		
		JButton btnShotclock24 = new JButton("24s");
		btnShotclock24.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnShotclock24.setForeground(Color.WHITE);
		btnShotclock24.setBackground(Color.DARK_GRAY);
		btnShotclock24.setBounds(409, 359, 55, 24);
		btnShotclock24.setBorder(new LineBorder(Color.WHITE));
		btnShotclock24.setFocusable(false);
		frame.getContentPane().add(btnShotclock24);
		
		JButton btnUhrStopp = new JButton("Uhr stopp");
		btnUhrStopp.setForeground(Color.WHITE);
		btnUhrStopp.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnUhrStopp.setFocusable(false);
		btnUhrStopp.setBorder(new LineBorder(Color.WHITE));
		btnUhrStopp.setBackground(Color.DARK_GRAY);
		btnUhrStopp.setBounds(350, 395, 55, 24);
		frame.getContentPane().add(btnUhrStopp);
		
		JButton btnUhrStart = new JButton("Uhr start");
		btnUhrStart.setForeground(Color.WHITE);
		btnUhrStart.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnUhrStart.setFocusable(false);
		btnUhrStart.setBorder(new LineBorder(Color.WHITE));
		btnUhrStart.setBackground(Color.DARK_GRAY);
		btnUhrStart.setBounds(409, 395, 55, 24);
		frame.getContentPane().add(btnUhrStart);
		
		JButton btnReset = new JButton("Zur\u00FCcksetzen");		
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnReset.setForeground(Color.WHITE);
		btnReset.setBackground(Color.DARK_GRAY);
		btnReset.setBounds(170, 464, 100, 24);
		btnReset.setBorder(new LineBorder(Color.WHITE));
		btnReset.setFocusable(false);
		frame.getContentPane().add(btnReset);
		
		JPanel pnlAuszeitHeim1 = new JPanel();
		pnlAuszeitHeim1.setBackground(Color.YELLOW);
		pnlAuszeitHeim1.setBounds(290, 118, 10, 10);
		pnlAuszeitHeim1.setVisible(false);
		pnlAuszeitHeim1.setFocusable(false);
		frame.getContentPane().add(pnlAuszeitHeim1);
		
		JPanel pnlAuszeitHeim2 = new JPanel();
		pnlAuszeitHeim2.setBackground(Color.YELLOW);
		pnlAuszeitHeim2.setBounds(290, 138, 10, 10);
		pnlAuszeitHeim2.setVisible(false);
		pnlAuszeitHeim2.setFocusable(false);
		frame.getContentPane().add(pnlAuszeitHeim2);
		
		JPanel pnlAuszeitHeim3 = new JPanel();
		pnlAuszeitHeim3.setBackground(Color.YELLOW);
		pnlAuszeitHeim3.setBounds(290, 158, 10, 10);
		pnlAuszeitHeim3.setVisible(false);
		pnlAuszeitHeim3.setFocusable(false);
		frame.getContentPane().add(pnlAuszeitHeim3);
		
		JPanel pnlAuszeitGast1 = new JPanel();
		pnlAuszeitGast1.setBackground(Color.YELLOW);
		pnlAuszeitGast1.setBounds(514, 116, 10, 10);
		pnlAuszeitGast1.setVisible(false);
		pnlAuszeitGast1.setFocusable(false);
		frame.getContentPane().add(pnlAuszeitGast1);
		
		JPanel pnlAuszeitGast2 = new JPanel();
		pnlAuszeitGast2.setBackground(Color.YELLOW);
		pnlAuszeitGast2.setBounds(514, 138, 10, 10);
		pnlAuszeitGast2.setVisible(false);
		pnlAuszeitGast2.setFocusable(false);
		frame.getContentPane().add(pnlAuszeitGast2);
		
		JPanel pnlAuszeitGast3 = new JPanel();
		pnlAuszeitGast3.setBackground(Color.YELLOW);
		pnlAuszeitGast3.setBounds(514, 158, 10, 10);
		pnlAuszeitGast3.setVisible(false);
		pnlAuszeitGast3.setFocusable(false);
		frame.getContentPane().add(pnlAuszeitGast3);
		
		tfShotclock = new JTextField();
		tfShotclock.setText("0");
		tfShotclock.setHorizontalAlignment(SwingConstants.CENTER);
		tfShotclock.setForeground(Color.RED);
		tfShotclock.setFont(new Font("Arial", Font.PLAIN, 30));
		tfShotclock.setEditable(false);
		tfShotclock.setColumns(10);
		tfShotclock.setBackground(Color.BLACK);
		tfShotclock.setBounds(373, 88, 70, 70);
		tfShotclock.setFocusable(false);
		frame.getContentPane().add(tfShotclock);
		
		tfZeit = new JTextField();
		tfZeit.setText("10 : 00");
		tfZeit.setHorizontalAlignment(SwingConstants.CENTER);
		tfZeit.setForeground(Color.RED);
		tfZeit.setFont(new Font("Arial", Font.PLAIN, 30));
		tfZeit.setFocusable(false);
		tfZeit.setEditable(false);
		tfZeit.setColumns(10);
		tfZeit.setBackground(Color.BLACK);
		tfZeit.setBounds(310, 11, 194, 70);
		frame.getContentPane().add(tfZeit);
		
		JButton btnInfo = new JButton("Info");
		btnInfo.setForeground(Color.WHITE);
		btnInfo.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnInfo.setBorder(new LineBorder(Color.WHITE));
		btnInfo.setBackground(Color.DARK_GRAY);
		btnInfo.setBounds(544, 464, 100, 24);
		btnInfo.setFocusable(false);
		frame.getContentPane().add(btnInfo);
		
		JLabel lblHinweis = new JLabel("New label");
		lblHinweis.setHorizontalAlignment(SwingConstants.CENTER);
		lblHinweis.setForeground(Color.WHITE);
		lblHinweis.setBounds(290, 477, 234, 14);
		lblHinweis.setText("");
		lblHinweis.setFocusable(false);
		frame.getContentPane().add(lblHinweis);
		
		JButton btnHotkeys = new JButton("Tastenbelegung anzeigen");
		btnHotkeys.setBounds(350, 267, 114, 20);
		btnHotkeys.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnHotkeys.setForeground(Color.WHITE);
		btnHotkeys.setBackground(Color.DARK_GRAY);
		btnHotkeys.setBorder(new LineBorder(Color.WHITE));
		btnHotkeys.setFocusable(false);
		frame.getContentPane().add(btnHotkeys);
		
		JButton btnEnglisch = new JButton("Englisch");
		btnEnglisch.setForeground(Color.WHITE);
		btnEnglisch.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnEnglisch.setBorder(new LineBorder(Color.WHITE));
		btnEnglisch.setBackground(Color.DARK_GRAY);
		btnEnglisch.setBounds(350, 237, 55, 24);
		btnEnglisch.setFocusable(false);
		frame.getContentPane().add(btnEnglisch);
		
		JButton btnDeutsch = new JButton("Deutsch");
		btnDeutsch.setForeground(Color.WHITE);
		btnDeutsch.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnDeutsch.setBorder(new LineBorder(Color.WHITE));
		btnDeutsch.setBackground(Color.DARK_GRAY);
		btnDeutsch.setBounds(409, 237, 55, 24);
		btnDeutsch.setFocusable(false);
		frame.getContentPane().add(btnDeutsch);
		
		JButton btnShotclockReset = new JButton("Shotclock zur\u00FCcksetzen");
		btnShotclockReset.setForeground(Color.WHITE);
		btnShotclockReset.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnShotclockReset.setBorder(new LineBorder(Color.WHITE));
		btnShotclockReset.setBackground(Color.DARK_GRAY);
		btnShotclockReset.setBounds(350, 328, 114, 20);
		btnShotclockReset.setFocusable(false);
		frame.getContentPane().add(btnShotclockReset);
		
		JLabel lblViertel = new JLabel("Viertel");
		lblViertel.setHorizontalAlignment(SwingConstants.CENTER);
		lblViertel.setForeground(Color.WHITE);
		lblViertel.setBounds(383, 169, 46, 14);
		lblViertel.setFocusable(false);
		frame.getContentPane().add(lblViertel);
		
		JLabel lblNewLabel = new JLabel("1    2    3    4");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(350, 184, 114, 14);
		lblNewLabel.setFocusable(false);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel pnlViertel1 = new JPanel();
		pnlViertel1.setBackground(Color.RED);
		pnlViertel1.setBounds(360, 209, 10, 10);
		pnlViertel1.setVisible(false);
		pnlViertel1.setFocusable(false);
		frame.getContentPane().add(pnlViertel1);
		
		JPanel pnlViertel2 = new JPanel();
		pnlViertel2.setBackground(Color.RED);
		pnlViertel2.setBounds(388, 209, 10, 10);
		pnlViertel2.setVisible(false);
		pnlViertel2.setFocusable(false);
		frame.getContentPane().add(pnlViertel2);
		
		JPanel pnlViertel3 = new JPanel();
		pnlViertel3.setBackground(Color.RED);
		pnlViertel3.setBounds(416, 209, 10, 10);
		pnlViertel3.setVisible(false);
		pnlViertel3.setFocusable(false);
		frame.getContentPane().add(pnlViertel3);
		
		JPanel pnlViertel4 = new JPanel();
		pnlViertel4.setBackground(Color.RED);
		pnlViertel4.setBounds(443, 209, 10, 10);
		pnlViertel4.setVisible(false);
		pnlViertel4.setFocusable(false);
		frame.getContentPane().add(pnlViertel4);
		
		JButton btnViertel = new JButton("N\u00E4chstes Viertel");
		btnViertel.setForeground(Color.WHITE);
		btnViertel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnViertel.setBorder(new LineBorder(Color.WHITE));
		btnViertel.setBackground(Color.DARK_GRAY);
		btnViertel.setBounds(350, 298, 114, 20);
		btnViertel.setFocusable(false);
		frame.getContentPane().add(btnViertel);
		
		JPanel panelBegrenzung1 = new JPanel();
		panelBegrenzung1.setBounds(155, 0, 5, 500);
		frame.getContentPane().add(panelBegrenzung1);
		
		JPanel panelBegrenzung2 = new JPanel();
		panelBegrenzung2.setBounds(654, 0, 5, 500);
		frame.getContentPane().add(panelBegrenzung2);
		
		tfHS1 = new JTextField();
		tfHS1.setText("33");
		tfHS1.setForeground(Color.WHITE);
		tfHS1.setFont(new Font("Arial", Font.PLAIN, 15));
		tfHS1.setHorizontalAlignment(SwingConstants.CENTER);
		tfHS1.setColumns(10);
		tfHS1.setBackground(Color.BLACK);
		tfHS1.setEditable(false);
		tfHS1.setBounds(10, 11, 35, 35);
		tfHS1.setFocusable(false);
		frame.getContentPane().add(tfHS1);
		tfHS1.setColumns(10);
		
		JPanel pnlHS1F1 = new JPanel();
		pnlHS1F1.setBackground(Color.RED);
		pnlHS1F1.setBounds(55, 24, 10, 10);
		pnlHS1F1.setFocusable(false);
		pnlHS1F1.setVisible(false);
		frame.getContentPane().add(pnlHS1F1);
		
		JPanel pnlHS1F2 = new JPanel();
		pnlHS1F2.setBackground(Color.RED);
		pnlHS1F2.setBounds(75, 24, 10, 10);
		pnlHS1F2.setFocusable(false);
		pnlHS1F2.setVisible(false);
		frame.getContentPane().add(pnlHS1F2);
		
		JPanel pnlHS1F3 = new JPanel();
		pnlHS1F3.setBackground(Color.RED);
		pnlHS1F3.setBounds(95, 24, 10, 10);
		pnlHS1F3.setFocusable(false);
		pnlHS1F3.setVisible(false);
		frame.getContentPane().add(pnlHS1F3);
		
		JPanel pnlHS1F4 = new JPanel();
		pnlHS1F4.setBackground(Color.RED);
		pnlHS1F4.setBounds(115, 24, 10, 10);
		pnlHS1F4.setFocusable(false);
		pnlHS1F4.setVisible(false);
		frame.getContentPane().add(pnlHS1F4);
		
		JPanel pnlHS1F5 = new JPanel();
		pnlHS1F5.setBackground(Color.RED);
		pnlHS1F5.setBounds(135, 24, 10, 10);
		pnlHS1F5.setFocusable(false);
		pnlHS1F5.setVisible(false);
		frame.getContentPane().add(pnlHS1F5);
		
		tfHS2 = new JTextField();
		tfHS2.setText("34");
		tfHS2.setForeground(Color.WHITE);
		tfHS2.setFont(new Font("Arial", Font.PLAIN, 15));
		tfHS2.setHorizontalAlignment(SwingConstants.CENTER);
		tfHS2.setColumns(10);
		tfHS2.setBackground(Color.BLACK);
		tfHS2.setEditable(false);
		tfHS2.setBounds(10, 51, 35, 35);
		tfHS2.setFocusable(false);
		frame.getContentPane().add(tfHS2);
		tfHS2.setColumns(10);
		
		JPanel pnlHS2F1 = new JPanel();
		pnlHS2F1.setBackground(Color.RED);
		pnlHS2F1.setBounds(55, 64, 10, 10);
		pnlHS2F1.setVisible(false);
		pnlHS2F1.setFocusable(false);
		frame.getContentPane().add(pnlHS2F1);
		
		JPanel pnlHS2F2 = new JPanel();
		pnlHS2F2.setBackground(Color.RED);
		pnlHS2F2.setBounds(75, 64, 10, 10);
		pnlHS2F2.setFocusable(false);
		pnlHS2F2.setVisible(false);
		frame.getContentPane().add(pnlHS2F2);
		
		JPanel pnlHS2F3 = new JPanel();
		pnlHS2F3.setBackground(Color.RED);
		pnlHS2F3.setBounds(95, 64, 10, 10);
		pnlHS2F3.setFocusable(false);
		pnlHS2F3.setVisible(false);
		frame.getContentPane().add(pnlHS2F3);
		
		JPanel pnlHS2F4 = new JPanel();
		pnlHS2F4.setBackground(Color.RED);
		pnlHS2F4.setBounds(115, 64, 10, 10);
		pnlHS2F4.setFocusable(false);
		pnlHS2F4.setVisible(false);
		frame.getContentPane().add(pnlHS2F4);
		
		JPanel pnlHS2F5 = new JPanel();
		pnlHS2F5.setBackground(Color.RED);
		pnlHS2F5.setBounds(135, 64, 10, 10);
		pnlHS2F5.setFocusable(false);
		pnlHS2F5.setVisible(false);
		frame.getContentPane().add(pnlHS2F5);
		
		tfHS3 = new JTextField();
		tfHS3.setText("35");
		tfHS3.setForeground(Color.WHITE);
		tfHS3.setFont(new Font("Arial", Font.PLAIN, 15));
		tfHS3.setHorizontalAlignment(SwingConstants.CENTER);
		tfHS3.setColumns(10);
		tfHS3.setBackground(Color.BLACK);
		tfHS3.setEditable(false);
		tfHS3.setBounds(10, 91, 35, 35);
		tfHS3.setFocusable(false);
		frame.getContentPane().add(tfHS3);
		tfHS3.setColumns(10);
		
		JPanel pnlHS3F1 = new JPanel();
		pnlHS3F1.setBackground(Color.RED);
		pnlHS3F1.setBounds(55, 104, 10, 10);
		pnlHS3F1.setFocusable(false);
		pnlHS3F1.setVisible(false);
		frame.getContentPane().add(pnlHS3F1);
		
		JPanel pnlHS3F2 = new JPanel();
		pnlHS3F2.setBackground(Color.RED);
		pnlHS3F2.setBounds(75, 104, 10, 10);
		pnlHS3F2.setFocusable(false);
		pnlHS3F2.setVisible(false);
		frame.getContentPane().add(pnlHS3F2);
		
		JPanel pnlHS3F3 = new JPanel();
		pnlHS3F3.setBackground(Color.RED);
		pnlHS3F3.setBounds(95, 104, 10, 10);
		pnlHS3F3.setFocusable(false);
		pnlHS3F3.setVisible(false);
		frame.getContentPane().add(pnlHS3F3);
		
		JPanel pnlHS3F4 = new JPanel();
		pnlHS3F4.setBackground(Color.RED);
		pnlHS3F4.setBounds(115, 104, 10, 10);
		pnlHS3F4.setFocusable(false);
		pnlHS3F4.setVisible(false);
		frame.getContentPane().add(pnlHS3F4);
		
		JPanel pnlHS3F5 = new JPanel();
		pnlHS3F5.setBackground(Color.RED);
		pnlHS3F5.setBounds(135, 104, 10, 10);
		pnlHS3F5.setFocusable(false);
		pnlHS3F5.setVisible(false);
		frame.getContentPane().add(pnlHS3F5);
		
		tfHS4 = new JTextField();
		tfHS4.setText("36");
		tfHS4.setForeground(Color.WHITE);
		tfHS4.setFont(new Font("Arial", Font.PLAIN, 15));
		tfHS4.setHorizontalAlignment(SwingConstants.CENTER);
		tfHS4.setColumns(10);
		tfHS4.setBackground(Color.BLACK);
		tfHS4.setEditable(false);
		tfHS4.setBounds(10, 131, 35, 35);
		tfHS4.setFocusable(false);
		frame.getContentPane().add(tfHS4);
		tfHS4.setColumns(10);
		
		JPanel pnlHS4F1 = new JPanel();
		pnlHS4F1.setBackground(Color.RED);
		pnlHS4F1.setBounds(55, 144, 10, 10);
		pnlHS4F1.setFocusable(false);
		pnlHS4F1.setVisible(false);
		frame.getContentPane().add(pnlHS4F1);
		
		JPanel pnlHS4F2 = new JPanel();
		pnlHS4F2.setBackground(Color.RED);
		pnlHS4F2.setBounds(75, 144, 10, 10);
		pnlHS4F2.setFocusable(false);
		pnlHS4F2.setVisible(false);
		frame.getContentPane().add(pnlHS4F2);
		
		JPanel pnlHS4F3 = new JPanel();
		pnlHS4F3.setBackground(Color.RED);
		pnlHS4F3.setBounds(95, 144, 10, 10);
		pnlHS4F3.setFocusable(false);
		pnlHS4F3.setVisible(false);
		frame.getContentPane().add(pnlHS4F3);
		
		JPanel pnlHS4F4 = new JPanel();
		pnlHS4F4.setBackground(Color.RED);
		pnlHS4F4.setBounds(115, 144, 10, 10);
		pnlHS4F4.setFocusable(false);
		pnlHS4F4.setVisible(false);
		frame.getContentPane().add(pnlHS4F4);
		
		JPanel pnlHS4F5 = new JPanel();
		pnlHS4F5.setBackground(Color.RED);
		pnlHS4F5.setBounds(135, 144, 10, 10);
		pnlHS4F5.setFocusable(false);
		pnlHS4F5.setVisible(false);
		frame.getContentPane().add(pnlHS4F5);

		tfHS5 = new JTextField();
		tfHS5.setText("37");
		tfHS5.setForeground(Color.WHITE);
		tfHS5.setFont(new Font("Arial", Font.PLAIN, 15));
		tfHS5.setHorizontalAlignment(SwingConstants.CENTER);
		tfHS5.setColumns(10);
		tfHS5.setBackground(Color.BLACK);
		tfHS5.setEditable(false);
		tfHS5.setBounds(10, 171, 35, 35);
		tfHS5.setFocusable(false);
		frame.getContentPane().add(tfHS5);
		tfHS5.setColumns(10);
		
		JPanel pnlHS5F1 = new JPanel();
		pnlHS5F1.setBackground(Color.RED);
		pnlHS5F1.setBounds(55, 184, 10, 10);
		pnlHS5F1.setFocusable(false);
		pnlHS5F1.setVisible(false);
		frame.getContentPane().add(pnlHS5F1);
		
		JPanel pnlHS5F2 = new JPanel();
		pnlHS5F2.setBackground(Color.RED);
		pnlHS5F2.setBounds(75, 184, 10, 10);
		pnlHS5F2.setFocusable(false);
		pnlHS5F2.setVisible(false);
		frame.getContentPane().add(pnlHS5F2);
		
		JPanel pnlHS5F3 = new JPanel();
		pnlHS5F3.setBackground(Color.RED);
		pnlHS5F3.setBounds(95, 184, 10, 10);
		pnlHS5F3.setFocusable(false);
		pnlHS5F3.setVisible(false);
		frame.getContentPane().add(pnlHS5F3);
		
		JPanel pnlHS5F4 = new JPanel();
		pnlHS5F4.setBackground(Color.RED);
		pnlHS5F4.setBounds(115, 184, 10, 10);
		pnlHS5F4.setFocusable(false);
		pnlHS5F4.setVisible(false);
		frame.getContentPane().add(pnlHS5F4);
		
		JPanel pnlHS5F5 = new JPanel();
		pnlHS5F5.setBackground(Color.RED);
		pnlHS5F5.setBounds(135, 184, 10, 10);
		pnlHS5F5.setFocusable(false);
		pnlHS5F5.setVisible(false);
		frame.getContentPane().add(pnlHS5F5);
		
		tfHS6 = new JTextField();
		tfHS6.setText("38");
		tfHS6.setForeground(Color.WHITE);
		tfHS6.setFont(new Font("Arial", Font.PLAIN, 15));
		tfHS6.setHorizontalAlignment(SwingConstants.CENTER);
		tfHS6.setColumns(10);
		tfHS6.setBackground(Color.BLACK);
		tfHS6.setEditable(false);
		tfHS6.setBounds(10, 211, 35, 35);
		tfHS6.setFocusable(false);
		frame.getContentPane().add(tfHS6);
		tfHS6.setColumns(10);
		
		JPanel pnlHS6F1 = new JPanel();
		pnlHS6F1.setBackground(Color.RED);
		pnlHS6F1.setBounds(55, 224, 10, 10);
		pnlHS6F1.setFocusable(false);
		pnlHS6F1.setVisible(false);
		frame.getContentPane().add(pnlHS6F1);
		
		JPanel pnlHS6F2 = new JPanel();
		pnlHS6F2.setBackground(Color.RED);
		pnlHS6F2.setBounds(75, 224, 10, 10);
		pnlHS6F2.setFocusable(false);
		pnlHS6F2.setVisible(false);
		frame.getContentPane().add(pnlHS6F2);
		
		JPanel pnlHS6F3 = new JPanel();
		pnlHS6F3.setBackground(Color.RED);
		pnlHS6F3.setBounds(95, 224, 10, 10);
		pnlHS6F3.setFocusable(false);
		pnlHS6F3.setVisible(false);
		frame.getContentPane().add(pnlHS6F3);
		
		JPanel pnlHS6F4 = new JPanel();
		pnlHS6F4.setBackground(Color.RED);
		pnlHS6F4.setBounds(115, 224, 10, 10);
		pnlHS6F4.setFocusable(false);
		pnlHS6F4.setVisible(false);
		frame.getContentPane().add(pnlHS6F4);
		
		JPanel pnlHS6F5 = new JPanel();
		pnlHS6F5.setBackground(Color.RED);
		pnlHS6F5.setBounds(135, 224, 10, 10);
		pnlHS6F5.setFocusable(false);
		pnlHS6F5.setVisible(false);
		frame.getContentPane().add(pnlHS6F5);
		
		tfHS7 = new JTextField();
		tfHS7.setText("39");
		tfHS7.setForeground(Color.WHITE);
		tfHS7.setFont(new Font("Arial", Font.PLAIN, 15));
		tfHS7.setHorizontalAlignment(SwingConstants.CENTER);
		tfHS7.setColumns(10);
		tfHS7.setBackground(Color.BLACK);
		tfHS7.setEditable(false);
		tfHS7.setBounds(10, 251, 35, 35);
		tfHS7.setFocusable(false);
		frame.getContentPane().add(tfHS7);
		tfHS7.setColumns(10);
		
		JPanel pnlHS7F1 = new JPanel();
		pnlHS7F1.setBackground(Color.RED);
		pnlHS7F1.setBounds(55, 264, 10, 10);
		pnlHS7F1.setFocusable(false);
		pnlHS7F1.setVisible(false);
		frame.getContentPane().add(pnlHS7F1);
		
		JPanel pnlHS7F2 = new JPanel();
		pnlHS7F2.setBackground(Color.RED);
		pnlHS7F2.setBounds(75, 264, 10, 10);
		pnlHS7F2.setFocusable(false);
		pnlHS7F2.setVisible(false);
		frame.getContentPane().add(pnlHS7F2);
		
		JPanel pnlHS7F3 = new JPanel();
		pnlHS7F3.setBackground(Color.RED);
		pnlHS7F3.setBounds(95, 264, 10, 10);
		pnlHS7F3.setFocusable(false);
		pnlHS7F3.setVisible(false);
		frame.getContentPane().add(pnlHS7F3);
		
		JPanel pnlHS7F4 = new JPanel();
		pnlHS7F4.setBackground(Color.RED);
		pnlHS7F4.setBounds(115, 264, 10, 10);
		pnlHS7F4.setFocusable(false);
		pnlHS7F4.setVisible(false);
		frame.getContentPane().add(pnlHS7F4);
		
		JPanel pnlHS7F5 = new JPanel();
		pnlHS7F5.setBackground(Color.RED);
		pnlHS7F5.setBounds(135, 264, 10, 10);
		pnlHS7F5.setFocusable(false);
		pnlHS7F5.setVisible(false);
		frame.getContentPane().add(pnlHS7F5);
		
		tfHS8 = new JTextField();
		tfHS8.setText("40");
		tfHS8.setForeground(Color.WHITE);
		tfHS8.setFont(new Font("Arial", Font.PLAIN, 15));
		tfHS8.setHorizontalAlignment(SwingConstants.CENTER);
		tfHS8.setColumns(10);
		tfHS8.setBackground(Color.BLACK);
		tfHS8.setEditable(false);
		tfHS8.setBounds(10, 291, 35, 35);
		tfHS8.setFocusable(false);
		frame.getContentPane().add(tfHS8);
		tfHS8.setColumns(10);
		
		JPanel pnlHS8F1 = new JPanel();
		pnlHS8F1.setBackground(Color.RED);
		pnlHS8F1.setBounds(55, 304, 10, 10);
		pnlHS8F1.setFocusable(false);
		pnlHS8F1.setVisible(false);
		frame.getContentPane().add(pnlHS8F1);
		
		JPanel pnlHS8F2 = new JPanel();
		pnlHS8F2.setBackground(Color.RED);
		pnlHS8F2.setBounds(75, 304, 10, 10);
		pnlHS8F2.setFocusable(false);
		pnlHS8F2.setVisible(false);
		frame.getContentPane().add(pnlHS8F2);
		
		JPanel pnlHS8F3 = new JPanel();
		pnlHS8F3.setBackground(Color.RED);
		pnlHS8F3.setBounds(95, 304, 10, 10);
		pnlHS8F3.setFocusable(false);
		pnlHS8F3.setVisible(false);
		frame.getContentPane().add(pnlHS8F3);
		
		JPanel pnlHS8F4 = new JPanel();
		pnlHS8F4.setBackground(Color.RED);
		pnlHS8F4.setBounds(115, 304, 10, 10);
		pnlHS8F4.setFocusable(false);
		pnlHS8F4.setVisible(false);
		frame.getContentPane().add(pnlHS8F4);
		
		JPanel pnlHS8F5 = new JPanel();
		pnlHS8F5.setBackground(Color.RED);
		pnlHS8F5.setBounds(135, 304, 10, 10);
		pnlHS8F5.setFocusable(false);
		pnlHS8F5.setVisible(false);
		frame.getContentPane().add(pnlHS8F5);
		
		tfHS9 = new JTextField();
		tfHS9.setText("41");
		tfHS9.setForeground(Color.WHITE);
		tfHS9.setFont(new Font("Arial", Font.PLAIN, 15));
		tfHS9.setHorizontalAlignment(SwingConstants.CENTER);
		tfHS9.setColumns(10);
		tfHS9.setBackground(Color.BLACK);
		tfHS9.setEditable(false);
		tfHS9.setBounds(10, 331, 35, 35);
		tfHS9.setFocusable(false);
		frame.getContentPane().add(tfHS9);
		tfHS9.setColumns(10);
		
		JPanel pnlHS9F1 = new JPanel();
		pnlHS9F1.setBackground(Color.RED);
		pnlHS9F1.setBounds(55, 344, 10, 10);
		pnlHS9F1.setFocusable(false);
		pnlHS9F1.setVisible(false);
		frame.getContentPane().add(pnlHS9F1);
		
		JPanel pnlHS9F2 = new JPanel();
		pnlHS9F2.setBackground(Color.RED);
		pnlHS9F2.setBounds(75, 344, 10, 10);
		pnlHS9F2.setFocusable(false);
		pnlHS9F2.setVisible(false);
		frame.getContentPane().add(pnlHS9F2);
		
		JPanel pnlHS9F3 = new JPanel();
		pnlHS9F3.setBackground(Color.RED);
		pnlHS9F3.setBounds(95, 344, 10, 10);
		pnlHS9F3.setFocusable(false);
		pnlHS9F3.setVisible(false);
		frame.getContentPane().add(pnlHS9F3);
		
		JPanel pnlHS9F4 = new JPanel();
		pnlHS9F4.setBackground(Color.RED);
		pnlHS9F4.setBounds(115, 344, 10, 10);
		pnlHS9F4.setFocusable(false);
		pnlHS9F4.setVisible(false);
		frame.getContentPane().add(pnlHS9F4);
		
		JPanel pnlHS9F5 = new JPanel();
		pnlHS9F5.setBackground(Color.RED);
		pnlHS9F5.setBounds(135, 344, 10, 10);
		pnlHS9F5.setFocusable(false);
		pnlHS9F5.setVisible(false);
		frame.getContentPane().add(pnlHS9F5);
		
		tfHS10 = new JTextField();
		tfHS10.setText("42");
		tfHS10.setForeground(Color.WHITE);
		tfHS10.setFont(new Font("Arial", Font.PLAIN, 15));
		tfHS10.setHorizontalAlignment(SwingConstants.CENTER);
		tfHS10.setColumns(10);
		tfHS10.setBackground(Color.BLACK);
		tfHS10.setEditable(false);
		tfHS10.setBounds(10, 371, 35, 35);
		tfHS10.setFocusable(false);
		frame.getContentPane().add(tfHS10);
		tfHS10.setColumns(10);
		
		JPanel pnlHS10F1 = new JPanel();
		pnlHS10F1.setBackground(Color.RED);
		pnlHS10F1.setBounds(55, 384, 10, 10);
		pnlHS10F1.setFocusable(false);
		pnlHS10F1.setVisible(false);
		frame.getContentPane().add(pnlHS10F1);
		
		JPanel pnlHS10F2 = new JPanel();
		pnlHS10F2.setBackground(Color.RED);
		pnlHS10F2.setBounds(75, 384, 10, 10);
		pnlHS10F2.setFocusable(false);
		pnlHS10F2.setVisible(false);
		frame.getContentPane().add(pnlHS10F2);
		
		JPanel pnlHS10F3 = new JPanel();
		pnlHS10F3.setBackground(Color.RED);
		pnlHS10F3.setBounds(95, 384, 10, 10);
		pnlHS10F3.setFocusable(false);
		pnlHS10F3.setVisible(false);
		frame.getContentPane().add(pnlHS10F3);
		
		JPanel pnlHS10F4 = new JPanel();
		pnlHS10F4.setBackground(Color.RED);
		pnlHS10F4.setBounds(115, 384, 10, 10);
		pnlHS10F4.setFocusable(false);
		pnlHS10F4.setVisible(false);
		frame.getContentPane().add(pnlHS10F4);
		
		JPanel pnlHS10F5 = new JPanel();
		pnlHS10F5.setBackground(Color.RED);
		pnlHS10F5.setBounds(135, 384, 10, 10);
		pnlHS10F5.setFocusable(false);
		pnlHS10F5.setVisible(false);
		frame.getContentPane().add(pnlHS10F5);
		
		tfHS11 = new JTextField();
		tfHS11.setText("43");
		tfHS11.setForeground(Color.WHITE);
		tfHS11.setFont(new Font("Arial", Font.PLAIN, 15));
		tfHS11.setHorizontalAlignment(SwingConstants.CENTER);
		tfHS11.setColumns(10);
		tfHS11.setBackground(Color.BLACK);
		tfHS11.setEditable(false);
		tfHS11.setBounds(10, 411, 35, 35);
		tfHS11.setFocusable(false);
		frame.getContentPane().add(tfHS11);
		tfHS11.setColumns(10);
		
		JPanel pnlHS11F1 = new JPanel();
		pnlHS11F1.setBackground(Color.RED);
		pnlHS11F1.setBounds(55, 424, 10, 10);
		pnlHS11F1.setFocusable(false);
		pnlHS11F1.setVisible(false);
		frame.getContentPane().add(pnlHS11F1);
		
		JPanel pnlHS11F2 = new JPanel();
		pnlHS11F2.setBackground(Color.RED);
		pnlHS11F2.setBounds(75, 424, 10, 10);
		pnlHS11F2.setFocusable(false);
		pnlHS11F2.setVisible(false);
		frame.getContentPane().add(pnlHS11F2);
		
		JPanel pnlHS11F3 = new JPanel();
		pnlHS11F3.setBackground(Color.RED);
		pnlHS11F3.setBounds(95, 424, 10, 10);
		pnlHS11F3.setFocusable(false);
		pnlHS11F3.setVisible(false);
		frame.getContentPane().add(pnlHS11F3);
		
		JPanel pnlHS11F4 = new JPanel();
		pnlHS11F4.setBackground(Color.RED);
		pnlHS11F4.setBounds(115, 424, 10, 10);
		pnlHS11F4.setFocusable(false);
		pnlHS11F4.setVisible(false);
		frame.getContentPane().add(pnlHS11F4);
		
		JPanel pnlHS11F5 = new JPanel();
		pnlHS11F5.setBackground(Color.RED);
		pnlHS11F5.setBounds(135, 424, 10, 10);
		pnlHS11F5.setFocusable(false);
		pnlHS11F5.setVisible(false);
		frame.getContentPane().add(pnlHS11F5);
	
		tfHS12 = new JTextField();
		tfHS12.setText("44");
		tfHS12.setForeground(Color.WHITE);
		tfHS12.setFont(new Font("Arial", Font.PLAIN, 15));
		tfHS12.setHorizontalAlignment(SwingConstants.CENTER);
		tfHS12.setColumns(10);
		tfHS12.setBackground(Color.BLACK);
		tfHS12.setEditable(false);
		tfHS12.setBounds(10, 451, 35, 35);
		tfHS12.setFocusable(false);
		frame.getContentPane().add(tfHS12);
		tfHS12.setColumns(10);
		
		JPanel pnlHS12F1 = new JPanel();
		pnlHS12F1.setBackground(Color.RED);
		pnlHS12F1.setBounds(55, 464, 10, 10);
		pnlHS12F1.setFocusable(false);
		pnlHS12F1.setVisible(false);
		frame.getContentPane().add(pnlHS12F1);
		
		JPanel pnlHS12F2 = new JPanel();
		pnlHS12F2.setBackground(Color.RED);
		pnlHS12F2.setBounds(75, 464, 10, 10);
		pnlHS12F2.setFocusable(false);
		pnlHS12F2.setVisible(false);
		frame.getContentPane().add(pnlHS12F2);
		
		JPanel pnlHS12F3 = new JPanel();
		pnlHS12F3.setBackground(Color.RED);
		pnlHS12F3.setBounds(95, 464, 10, 10);
		pnlHS12F3.setFocusable(false);
		pnlHS12F3.setVisible(false);
		frame.getContentPane().add(pnlHS12F3);
		
		JPanel pnlHS12F4 = new JPanel();
		pnlHS12F4.setBackground(Color.RED);
		pnlHS12F4.setBounds(115, 464, 10, 10);
		pnlHS12F4.setFocusable(false);
		pnlHS12F4.setVisible(false);
		frame.getContentPane().add(pnlHS12F4);
		
		JPanel pnlHS12F5 = new JPanel();
		pnlHS12F5.setBackground(Color.RED);
		pnlHS12F5.setBounds(135, 464, 10, 10);
		pnlHS12F5.setFocusable(false);
		pnlHS12F5.setVisible(false);
		frame.getContentPane().add(pnlHS12F5);
		
		
		tfGS1 = new JTextField();
		tfGS1.setText("55");
		tfGS1.setHorizontalAlignment(SwingConstants.CENTER);
		tfGS1.setForeground(Color.WHITE);
		tfGS1.setFont(new Font("Arial", Font.PLAIN, 15));
		tfGS1.setFocusable(false);
		tfGS1.setEditable(false);
		tfGS1.setColumns(10);
		tfGS1.setBackground(Color.BLACK);
		tfGS1.setBounds(772, 11, 35, 35);
		frame.getContentPane().add(tfGS1);
		
		JPanel pnlGS1F1 = new JPanel();
		pnlGS1F1.setBackground(Color.RED);
		pnlGS1F1.setBounds(752, 24, 10, 10);
		pnlGS1F1.setVisible(false);
		pnlGS1F1.setFocusable(false);
		frame.getContentPane().add(pnlGS1F1);
		
		JPanel pnlGS1F2 = new JPanel();
		pnlGS1F2.setBackground(Color.RED);
		pnlGS1F2.setBounds(732, 24, 10, 10);
		pnlGS1F2.setVisible(false);
		pnlGS1F2.setFocusable(false);
		frame.getContentPane().add(pnlGS1F2);
		
		JPanel pnlGS1F3 = new JPanel();
		pnlGS1F3.setBackground(Color.RED);
		pnlGS1F3.setBounds(712, 24, 10, 10);
		pnlGS1F3.setVisible(false);
		pnlGS1F3.setFocusable(false);
		frame.getContentPane().add(pnlGS1F3);
		
		JPanel pnlGS1F4 = new JPanel();
		pnlGS1F4.setBackground(Color.RED);
		pnlGS1F4.setBounds(692, 24, 10, 10);
		pnlGS1F4.setVisible(false);
		pnlGS1F4.setFocusable(false);
		frame.getContentPane().add(pnlGS1F4);
		
		JPanel pnlGS1F5 = new JPanel();
		pnlGS1F5.setBackground(Color.RED);
		pnlGS1F5.setBounds(672, 24, 10, 10);
		pnlGS1F5.setVisible(false);
		pnlGS1F5.setFocusable(false);
		frame.getContentPane().add(pnlGS1F5);
		
		tfGS2 = new JTextField();
		tfGS2.setText("56");
		tfGS2.setHorizontalAlignment(SwingConstants.CENTER);
		tfGS2.setForeground(Color.WHITE);
		tfGS2.setFont(new Font("Arial", Font.PLAIN, 15));
		tfGS2.setFocusable(false);
		tfGS2.setEditable(false);
		tfGS2.setColumns(10);
		tfGS2.setBackground(Color.BLACK);
		tfGS2.setBounds(772, 51, 35, 35);
		frame.getContentPane().add(tfGS2);
		
		JPanel pnlGS2F1 = new JPanel();
		pnlGS2F1.setBackground(Color.RED);
		pnlGS2F1.setBounds(752, 64, 10, 10);
		pnlGS2F1.setVisible(false);
		pnlGS2F1.setFocusable(false);
		frame.getContentPane().add(pnlGS2F1);
		
		JPanel pnlGS2F2 = new JPanel();
		pnlGS2F2.setBackground(Color.RED);
		pnlGS2F2.setBounds(732, 64, 10, 10);
		pnlGS2F2.setVisible(false);
		pnlGS2F2.setFocusable(false);
		frame.getContentPane().add(pnlGS2F2);
		
		JPanel pnlGS2F3 = new JPanel();
		pnlGS2F3.setBackground(Color.RED);
		pnlGS2F3.setBounds(712, 64, 10, 10);
		pnlGS2F3.setVisible(false);
		pnlGS2F3.setFocusable(false);
		frame.getContentPane().add(pnlGS2F3);
		
		JPanel pnlGS2F4 = new JPanel();
		pnlGS2F4.setBackground(Color.RED);
		pnlGS2F4.setBounds(692, 64, 10, 10);
		pnlGS2F4.setVisible(false);
		pnlGS2F4.setFocusable(false);
		frame.getContentPane().add(pnlGS2F4);
		
		JPanel pnlGS2F5 = new JPanel();
		pnlGS2F5.setBackground(Color.RED);
		pnlGS2F5.setBounds(672, 64, 10, 10);
		pnlGS2F5.setVisible(false);
		pnlGS2F5.setFocusable(false);
		frame.getContentPane().add(pnlGS2F5);
		
		tfGS3 = new JTextField();
		tfGS3.setText("57");
		tfGS3.setHorizontalAlignment(SwingConstants.CENTER);
		tfGS3.setForeground(Color.WHITE);
		tfGS3.setFont(new Font("Arial", Font.PLAIN, 15));
		tfGS3.setFocusable(false);
		tfGS3.setEditable(false);
		tfGS3.setColumns(10);
		tfGS3.setBackground(Color.BLACK);
		tfGS3.setBounds(772, 91, 35, 35);
		frame.getContentPane().add(tfGS3);
		
		JPanel pnlGS3F1 = new JPanel();
		pnlGS3F1.setBackground(Color.RED);
		pnlGS3F1.setBounds(752, 104, 10, 10);
		pnlGS3F1.setVisible(false);
		pnlGS3F1.setFocusable(false);
		frame.getContentPane().add(pnlGS3F1);
		
		JPanel pnlGS3F2 = new JPanel();
		pnlGS3F2.setBackground(Color.RED);
		pnlGS3F2.setBounds(732, 104, 10, 10);
		pnlGS3F2.setVisible(false);
		pnlGS3F2.setFocusable(false);
		frame.getContentPane().add(pnlGS3F2);
		
		JPanel pnlGS3F3 = new JPanel();
		pnlGS3F3.setBackground(Color.RED);
		pnlGS3F3.setBounds(712, 104, 10, 10);
		pnlGS3F3.setVisible(false);
		pnlGS3F3.setFocusable(false);
		frame.getContentPane().add(pnlGS3F3);
		
		JPanel pnlGS3F4 = new JPanel();
		pnlGS3F4.setBackground(Color.RED);
		pnlGS3F4.setBounds(692, 104, 10, 10);
		pnlGS3F4.setVisible(false);
		pnlGS3F4.setFocusable(false);
		frame.getContentPane().add(pnlGS3F4);
		
		JPanel pnlGS3F5 = new JPanel();
		pnlGS3F5.setBackground(Color.RED);
		pnlGS3F5.setBounds(672, 104, 10, 10);
		pnlGS3F5.setVisible(false);
		pnlGS3F5.setFocusable(false);
		frame.getContentPane().add(pnlGS3F5);
		
		tfGS4 = new JTextField();
		tfGS4.setText("58");
		tfGS4.setHorizontalAlignment(SwingConstants.CENTER);
		tfGS4.setForeground(Color.WHITE);
		tfGS4.setFont(new Font("Arial", Font.PLAIN, 15));
		tfGS4.setFocusable(false);
		tfGS4.setEditable(false);
		tfGS4.setColumns(10);
		tfGS4.setBackground(Color.BLACK);
		tfGS4.setBounds(772, 131, 35, 35);
		frame.getContentPane().add(tfGS4);
		
		JPanel pnlGS4F1 = new JPanel();
		pnlGS4F1.setBackground(Color.RED);
		pnlGS4F1.setBounds(752, 144, 10, 10);
		pnlGS4F1.setVisible(false);
		pnlGS4F1.setFocusable(false);
		frame.getContentPane().add(pnlGS4F1);
		
		JPanel pnlGS4F2 = new JPanel();
		pnlGS4F2.setBackground(Color.RED);
		pnlGS4F2.setBounds(732, 144, 10, 10);
		pnlGS4F2.setVisible(false);
		pnlGS4F2.setFocusable(false);
		frame.getContentPane().add(pnlGS4F2);
		
		JPanel pnlGS4F3 = new JPanel();
		pnlGS4F3.setBackground(Color.RED);
		pnlGS4F3.setBounds(712, 144, 10, 10);
		pnlGS4F3.setVisible(false);
		pnlGS4F3.setFocusable(false);
		frame.getContentPane().add(pnlGS4F3);
		
		JPanel pnlGS4F4 = new JPanel();
		pnlGS4F4.setBackground(Color.RED);
		pnlGS4F4.setBounds(692, 144, 10, 10);
		pnlGS4F4.setVisible(false);
		pnlGS4F4.setFocusable(false);
		frame.getContentPane().add(pnlGS4F4);
		
		JPanel pnlGS4F5 = new JPanel();
		pnlGS4F5.setBackground(Color.RED);
		pnlGS4F5.setBounds(672, 144, 10, 10);
		pnlGS4F5.setVisible(false);
		pnlGS4F5.setFocusable(false);
		frame.getContentPane().add(pnlGS4F5);
		
		tfGS5 = new JTextField();
		tfGS5.setText("59");
		tfGS5.setHorizontalAlignment(SwingConstants.CENTER);
		tfGS5.setForeground(Color.WHITE);
		tfGS5.setFont(new Font("Arial", Font.PLAIN, 15));
		tfGS5.setFocusable(false);
		tfGS5.setEditable(false);
		tfGS5.setColumns(10);
		tfGS5.setBackground(Color.BLACK);
		tfGS5.setBounds(772, 171, 35, 35);
		frame.getContentPane().add(tfGS5);
		
		JPanel pnlGS5F1 = new JPanel();
		pnlGS5F1.setBackground(Color.RED);
		pnlGS5F1.setBounds(752, 184, 10, 10);
		pnlGS5F1.setVisible(false);
		pnlGS5F1.setFocusable(false);
		frame.getContentPane().add(pnlGS5F1);
		
		JPanel pnlGS5F2 = new JPanel();
		pnlGS5F2.setBackground(Color.RED);
		pnlGS5F2.setBounds(732, 184, 10, 10);
		pnlGS5F2.setVisible(false);
		pnlGS5F2.setFocusable(false);
		frame.getContentPane().add(pnlGS5F2);
		
		JPanel pnlGS5F3 = new JPanel();
		pnlGS5F3.setBackground(Color.RED);
		pnlGS5F3.setBounds(712, 184, 10, 10);
		pnlGS5F3.setVisible(false);
		pnlGS5F3.setFocusable(false);
		frame.getContentPane().add(pnlGS5F3);
		
		JPanel pnlGS5F4 = new JPanel();
		pnlGS5F4.setBackground(Color.RED);
		pnlGS5F4.setBounds(692, 184, 10, 10);
		pnlGS5F4.setVisible(false);
		pnlGS5F4.setFocusable(false);
		frame.getContentPane().add(pnlGS5F4);
		
		JPanel pnlGS5F5 = new JPanel();
		pnlGS5F5.setBackground(Color.RED);
		pnlGS5F5.setBounds(672, 184, 10, 10);
		pnlGS5F5.setVisible(false);
		pnlGS5F5.setFocusable(false);
		frame.getContentPane().add(pnlGS5F5);
		
		tfGS6 = new JTextField();
		tfGS6.setText("60");
		tfGS6.setHorizontalAlignment(SwingConstants.CENTER);
		tfGS6.setForeground(Color.WHITE);
		tfGS6.setFont(new Font("Arial", Font.PLAIN, 15));
		tfGS6.setFocusable(false);
		tfGS6.setEditable(false);
		tfGS6.setColumns(10);
		tfGS6.setBackground(Color.BLACK);
		tfGS6.setBounds(772, 211, 35, 35);
		frame.getContentPane().add(tfGS6);
		
		JPanel pnlGS6F1 = new JPanel();
		pnlGS6F1.setBackground(Color.RED);
		pnlGS6F1.setBounds(752, 224, 10, 10);
		pnlGS6F1.setVisible(false);
		pnlGS6F1.setFocusable(false);
		frame.getContentPane().add(pnlGS6F1);
		
		JPanel pnlGS6F2 = new JPanel();
		pnlGS6F2.setBackground(Color.RED);
		pnlGS6F2.setBounds(732, 224, 10, 10);
		pnlGS6F2.setVisible(false);
		pnlGS6F2.setFocusable(false);
		frame.getContentPane().add(pnlGS6F2);
		
		JPanel pnlGS6F3 = new JPanel();
		pnlGS6F3.setBackground(Color.RED);
		pnlGS6F3.setBounds(712, 224, 10, 10);
		pnlGS6F3.setVisible(false);
		pnlGS6F3.setFocusable(false);
		frame.getContentPane().add(pnlGS6F3);
		
		JPanel pnlGS6F4 = new JPanel();
		pnlGS6F4.setBackground(Color.RED);
		pnlGS6F4.setBounds(692, 224, 10, 10);
		pnlGS6F4.setVisible(false);
		pnlGS6F4.setFocusable(false);
		frame.getContentPane().add(pnlGS6F4);
		
		JPanel pnlGS6F5 = new JPanel();
		pnlGS6F5.setBackground(Color.RED);
		pnlGS6F5.setBounds(672, 224, 10, 10);
		pnlGS6F5.setVisible(false);
		pnlGS6F5.setFocusable(false);
		frame.getContentPane().add(pnlGS6F5);
		
		tfGS7 = new JTextField();
		tfGS7.setText("61");
		tfGS7.setHorizontalAlignment(SwingConstants.CENTER);
		tfGS7.setForeground(Color.WHITE);
		tfGS7.setFont(new Font("Arial", Font.PLAIN, 15));
		tfGS7.setFocusable(false);
		tfGS7.setEditable(false);
		tfGS7.setColumns(10);
		tfGS7.setBackground(Color.BLACK);
		tfGS7.setBounds(772, 251, 35, 35);
		frame.getContentPane().add(tfGS7);
		
		JPanel pnlGS7F1 = new JPanel();
		pnlGS7F1.setBackground(Color.RED);
		pnlGS7F1.setBounds(752, 264, 10, 10);
		pnlGS7F1.setVisible(false);
		pnlGS7F1.setFocusable(false);
		frame.getContentPane().add(pnlGS7F1);
		
		JPanel pnlGS7F2 = new JPanel();
		pnlGS7F2.setBackground(Color.RED);
		pnlGS7F2.setBounds(732, 264, 10, 10);
		pnlGS7F2.setVisible(false);
		pnlGS7F2.setFocusable(false);
		frame.getContentPane().add(pnlGS7F2);
		
		JPanel pnlGS7F3 = new JPanel();
		pnlGS7F3.setBackground(Color.RED);
		pnlGS7F3.setBounds(712, 264, 10, 10);
		pnlGS7F3.setVisible(false);
		pnlGS7F3.setFocusable(false);
		frame.getContentPane().add(pnlGS7F3);
		
		JPanel pnlGS7F4 = new JPanel();
		pnlGS7F4.setBackground(Color.RED);
		pnlGS7F4.setBounds(692, 264, 10, 10);
		pnlGS7F4.setVisible(false);
		pnlGS7F4.setFocusable(false);
		frame.getContentPane().add(pnlGS7F4);
		
		JPanel pnlGS7F5 = new JPanel();
		pnlGS7F5.setBackground(Color.RED);
		pnlGS7F5.setBounds(672, 264, 10, 10);
		pnlGS7F5.setVisible(false);
		pnlGS7F5.setFocusable(false);
		frame.getContentPane().add(pnlGS7F5);
		
		tfGS8 = new JTextField();
		tfGS8.setText("62");
		tfGS8.setHorizontalAlignment(SwingConstants.CENTER);
		tfGS8.setForeground(Color.WHITE);
		tfGS8.setFont(new Font("Arial", Font.PLAIN, 15));
		tfGS8.setFocusable(false);
		tfGS8.setEditable(false);
		tfGS8.setColumns(10);
		tfGS8.setBackground(Color.BLACK);
		tfGS8.setBounds(772, 291, 35, 35);
		frame.getContentPane().add(tfGS8);
		
		JPanel pnlGS8F1 = new JPanel();
		pnlGS8F1.setBackground(Color.RED);
		pnlGS8F1.setBounds(752, 304, 10, 10);
		pnlGS8F1.setVisible(false);
		pnlGS8F1.setFocusable(false);
		frame.getContentPane().add(pnlGS8F1);
		
		JPanel pnlGS8F2 = new JPanel();
		pnlGS8F2.setBackground(Color.RED);
		pnlGS8F2.setBounds(732, 304, 10, 10);
		pnlGS8F2.setVisible(false);
		pnlGS8F2.setFocusable(false);
		frame.getContentPane().add(pnlGS8F2);
		
		JPanel pnlGS8F3 = new JPanel();
		pnlGS8F3.setBackground(Color.RED);
		pnlGS8F3.setBounds(712, 304, 10, 10);
		pnlGS8F3.setVisible(false);
		pnlGS8F3.setFocusable(false);
		frame.getContentPane().add(pnlGS8F3);
		
		JPanel pnlGS8F4 = new JPanel();
		pnlGS8F4.setBackground(Color.RED);
		pnlGS8F4.setBounds(692, 304, 10, 10);
		pnlGS8F4.setVisible(false);
		pnlGS8F4.setFocusable(false);
		frame.getContentPane().add(pnlGS8F4);
		
		JPanel pnlGS8F5 = new JPanel();
		pnlGS8F5.setBackground(Color.RED);
		pnlGS8F5.setBounds(672, 304, 10, 10);
		pnlGS8F5.setVisible(false);
		pnlGS8F5.setFocusable(false);
		frame.getContentPane().add(pnlGS8F5);
		
		tfGS9 = new JTextField();
		tfGS9.setText("63");
		tfGS9.setHorizontalAlignment(SwingConstants.CENTER);
		tfGS9.setForeground(Color.WHITE);
		tfGS9.setFont(new Font("Arial", Font.PLAIN, 15));
		tfGS9.setFocusable(false);
		tfGS9.setEditable(false);
		tfGS9.setColumns(10);
		tfGS9.setBackground(Color.BLACK);
		tfGS9.setBounds(772, 331, 35, 35);
		frame.getContentPane().add(tfGS9);
		
		JPanel pnlGS9F1 = new JPanel();
		pnlGS9F1.setBackground(Color.RED);
		pnlGS9F1.setBounds(752, 344, 10, 10);
		pnlGS9F1.setVisible(false);
		pnlGS9F1.setFocusable(false);
		frame.getContentPane().add(pnlGS9F1);
		
		JPanel pnlGS9F2 = new JPanel();
		pnlGS9F2.setBackground(Color.RED);
		pnlGS9F2.setBounds(732, 344, 10, 10);
		pnlGS9F2.setVisible(false);
		pnlGS9F2.setFocusable(false);
		frame.getContentPane().add(pnlGS9F2);
		
		JPanel pnlGS9F3 = new JPanel();
		pnlGS9F3.setBackground(Color.RED);
		pnlGS9F3.setBounds(712, 344, 10, 10);
		pnlGS9F3.setVisible(false);
		pnlGS9F3.setFocusable(false);
		frame.getContentPane().add(pnlGS9F3);
		
		JPanel pnlGS9F4 = new JPanel();
		pnlGS9F4.setBackground(Color.RED);
		pnlGS9F4.setBounds(692, 344, 10, 10);
		pnlGS9F4.setVisible(false);
		pnlGS9F4.setFocusable(false);
		frame.getContentPane().add(pnlGS9F4);
		
		JPanel pnlGS9F5 = new JPanel();
		pnlGS9F5.setBackground(Color.RED);
		pnlGS9F5.setBounds(672, 344, 10, 10);
		pnlGS9F5.setVisible(false);
		pnlGS9F5.setFocusable(false);
		frame.getContentPane().add(pnlGS9F5);
		
		tfGS10 = new JTextField();
		tfGS10.setText("64");
		tfGS10.setHorizontalAlignment(SwingConstants.CENTER);
		tfGS10.setForeground(Color.WHITE);
		tfGS10.setFont(new Font("Arial", Font.PLAIN, 15));
		tfGS10.setFocusable(false);
		tfGS10.setEditable(false);
		tfGS10.setColumns(10);
		tfGS10.setBackground(Color.BLACK);
		tfGS10.setBounds(772, 371, 35, 35);
		frame.getContentPane().add(tfGS10);
		
		
		JPanel pnlGS10F1 = new JPanel();
		pnlGS10F1.setBackground(Color.RED);
		pnlGS10F1.setBounds(752, 384, 10, 10);
		pnlGS10F1.setVisible(false);
		pnlGS10F1.setFocusable(false);
		frame.getContentPane().add(pnlGS10F1);
		
		JPanel pnlGS10F2 = new JPanel();
		pnlGS10F2.setBackground(Color.RED);
		pnlGS10F2.setBounds(732, 384, 10, 10);
		pnlGS10F2.setVisible(false);
		pnlGS10F2.setFocusable(false);
		frame.getContentPane().add(pnlGS10F2);
		
		JPanel pnlGS10F3 = new JPanel();
		pnlGS10F3.setBackground(Color.RED);
		pnlGS10F3.setBounds(712, 384, 10, 10);
		pnlGS10F3.setVisible(false);
		pnlGS10F3.setFocusable(false);
		frame.getContentPane().add(pnlGS10F3);
		
		JPanel pnlGS10F4 = new JPanel();
		pnlGS10F4.setBackground(Color.RED);
		pnlGS10F4.setBounds(692, 384, 10, 10);
		pnlGS10F4.setVisible(false);
		pnlGS10F4.setFocusable(false);
		frame.getContentPane().add(pnlGS10F4);
		
		JPanel pnlGS10F5 = new JPanel();
		pnlGS10F5.setBackground(Color.RED);
		pnlGS10F5.setBounds(672, 384, 10, 10);
		pnlGS10F5.setVisible(false);
		pnlGS10F5.setFocusable(false);
		frame.getContentPane().add(pnlGS10F5);
		
		tfGS11 = new JTextField();
		tfGS11.setText("65");
		tfGS11.setHorizontalAlignment(SwingConstants.CENTER);
		tfGS11.setForeground(Color.WHITE);
		tfGS11.setFont(new Font("Arial", Font.PLAIN, 15));
		tfGS11.setFocusable(false);
		tfGS11.setEditable(false);
		tfGS11.setColumns(10);
		tfGS11.setBackground(Color.BLACK);
		tfGS11.setBounds(772, 411, 35, 35);
		frame.getContentPane().add(tfGS11);
		
		JPanel pnlGS11F1 = new JPanel();
		pnlGS11F1.setBackground(Color.RED);
		pnlGS11F1.setBounds(752, 424, 10, 10);
		pnlGS11F1.setVisible(false);
		pnlGS11F1.setFocusable(false);
		frame.getContentPane().add(pnlGS11F1);
		
		JPanel pnlGS11F2 = new JPanel();
		pnlGS11F2.setBackground(Color.RED);
		pnlGS11F2.setBounds(732, 424, 10, 10);
		pnlGS11F2.setVisible(false);
		pnlGS11F2.setFocusable(false);
		frame.getContentPane().add(pnlGS11F2);
		
		JPanel pnlGS11F3 = new JPanel();
		pnlGS11F3.setBackground(Color.RED);
		pnlGS11F3.setBounds(712, 424, 10, 10);
		pnlGS11F3.setVisible(false);
		pnlGS11F3.setFocusable(false);
		frame.getContentPane().add(pnlGS11F3);
		
		JPanel pnlGS11F4 = new JPanel();
		pnlGS11F4.setBackground(Color.RED);
		pnlGS11F4.setBounds(692, 424, 10, 10);
		pnlGS11F4.setVisible(false);
		pnlGS11F4.setFocusable(false);
		frame.getContentPane().add(pnlGS11F4);
		
		JPanel pnlGS11F5 = new JPanel();
		pnlGS11F5.setBackground(Color.RED);
		pnlGS11F5.setBounds(672, 424, 10, 10);
		pnlGS11F5.setVisible(false);
		pnlGS11F5.setFocusable(false);
		frame.getContentPane().add(pnlGS11F5);
		
		tfGS12 = new JTextField();
		tfGS12.setText("66");
		tfGS12.setHorizontalAlignment(SwingConstants.CENTER);
		tfGS12.setForeground(Color.WHITE);
		tfGS12.setFont(new Font("Arial", Font.PLAIN, 15));
		tfGS12.setFocusable(false);
		tfGS12.setEditable(false);
		tfGS12.setColumns(10);
		tfGS12.setBackground(Color.BLACK);
		tfGS12.setBounds(772, 451, 35, 35);
		frame.getContentPane().add(tfGS12);
		
		JPanel pnlGS12F1 = new JPanel();
		pnlGS12F1.setBackground(Color.RED);
		pnlGS12F1.setBounds(752, 464, 10, 10);
		pnlGS12F1.setVisible(false);
		pnlGS12F1.setFocusable(false);
		frame.getContentPane().add(pnlGS12F1);
		
		JPanel pnlGS12F2 = new JPanel();
		pnlGS12F2.setBackground(Color.RED);
		pnlGS12F2.setBounds(732, 464, 10, 10);
		pnlGS12F2.setVisible(false);
		pnlGS12F2.setFocusable(false);
		frame.getContentPane().add(pnlGS12F2);
		
		JPanel pnlGS12F3 = new JPanel();
		pnlGS12F3.setBackground(Color.RED);
		pnlGS12F3.setBounds(712, 464, 10, 10);
		pnlGS12F3.setVisible(false);
		pnlGS12F3.setFocusable(false);
		frame.getContentPane().add(pnlGS12F3);
		
		JPanel pnlGS12F4 = new JPanel();
		pnlGS12F4.setBackground(Color.RED);
		pnlGS12F4.setBounds(692, 464, 10, 10);
		pnlGS12F4.setVisible(false);
		pnlGS12F4.setFocusable(false);
		frame.getContentPane().add(pnlGS12F4);
		
		JPanel pnlGS12F5 = new JPanel();
		pnlGS12F5.setBackground(Color.RED);
		pnlGS12F5.setBounds(672, 464, 10, 10);
		pnlGS12F5.setVisible(false);
		pnlGS12F5.setFocusable(false);
		frame.getContentPane().add(pnlGS12F5);
		
		JButton btnUhrreset = new JButton("Uhr zur\u00FCcksetzen");
		btnUhrreset.setForeground(Color.WHITE);
		btnUhrreset.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnUhrreset.setFocusable(false);
		btnUhrreset.setBorder(new LineBorder(Color.WHITE));
		btnUhrreset.setBackground(Color.DARK_GRAY);
		btnUhrreset.setBounds(170, 429, 100, 24);
		frame.getContentPane().add(btnUhrreset);
		
		
		this.pnlAuszeitHeim1 = pnlAuszeitHeim1;
		this.pnlAuszeitHeim2 = pnlAuszeitHeim2;
		this.pnlAuszeitHeim3 = pnlAuszeitHeim3;
		this.pnlAuszeitGast1 = pnlAuszeitGast1;
		this.pnlAuszeitGast2 = pnlAuszeitGast2;
		this.pnlAuszeitGast3 = pnlAuszeitGast3;
		this.pnlViertel1 = pnlViertel1;
		this.pnlViertel2 = pnlViertel2;
		this.pnlViertel3 = pnlViertel3;
		this.pnlViertel4 = pnlViertel4;
		this.lblViertel = lblViertel;
		this.btnReset = btnReset;
		this.lblHeim = lblHeim;
		this.lblGast = lblGast;
		this.btnHeimAuszeit = btnHeimAuszeit;
		this.btnGastAuszeit = btnGastAuszeit;
		this.btnHotkeys = btnHotkeys;
		this.btnDeutsch = btnDeutsch;
		this.btnEnglisch = btnEnglisch;
		this.tfShotclock = tfShotclock;
		this.tfZeit = tfZeit;
		this.btnShotclockReset = btnShotclockReset;
		this.btnUhrreset = btnUhrreset;
		this.btnShotclock14 = btnShotclock14;
		this.btnShotclock24 = btnShotclock24;
		this.btnUhrStart = btnUhrStart;
		this.btnUhrStopp = btnUhrStopp;
		this.btnHP1 = btnHP1;
		this.btnHP2 = btnHP2;
		this.btnHP3 = btnHP3;
		this.btnHM1 = btnHM1;
		this.btnHM2 = btnHM2;
		this.btnHM3 = btnHM3;
		this.btnGP1 = btnGP1;
		this.btnGP2 = btnGP2;
		this.btnGP3 = btnGP3;
		this.btnGM1 = btnGM1;
		this.btnGM2 = btnGM2;
		this.btnGM3 = btnGM3;
		this.btnHFoul = btnHFoul;
		this.btnGFoul = btnGFoul;
		this.btnHeimAuszeit = btnHeimAuszeit;
		this.btnGastAuszeit = btnGastAuszeit;
		this.btnViertel = btnViertel;
		
		this.pnlHS1F1 = pnlHS1F1;
		this.pnlHS1F2 = pnlHS1F2;
		this.pnlHS1F3 = pnlHS1F3;
		this.pnlHS1F4 = pnlHS1F4;
		this.pnlHS1F5 = pnlHS1F5;
		
		this.pnlHS2F1 = pnlHS2F1;
		this.pnlHS2F2 = pnlHS2F2;
		this.pnlHS2F3 = pnlHS2F3;
		this.pnlHS2F4 = pnlHS2F4;
		this.pnlHS2F5 = pnlHS2F5;
		
		this.pnlHS3F1 = pnlHS3F1;
		this.pnlHS3F2 = pnlHS3F2;
		this.pnlHS3F3 = pnlHS3F3;
		this.pnlHS3F4 = pnlHS3F4;
		this.pnlHS3F5 = pnlHS3F5;
		
		this.pnlHS4F1 = pnlHS4F1;
		this.pnlHS4F2 = pnlHS4F2;
		this.pnlHS4F3 = pnlHS4F3;
		this.pnlHS4F4 = pnlHS4F4;
		this.pnlHS4F5 = pnlHS4F5;
		
		this.pnlHS5F1 = pnlHS5F1;
		this.pnlHS5F2 = pnlHS5F2;
		this.pnlHS5F3 = pnlHS5F3;
		this.pnlHS5F4 = pnlHS5F4;
		this.pnlHS5F5 = pnlHS5F5;
		
		this.pnlHS6F1 = pnlHS6F1;
		this.pnlHS6F2 = pnlHS6F2;
		this.pnlHS6F3 = pnlHS6F3;
		this.pnlHS6F4 = pnlHS6F4;
		this.pnlHS6F5 = pnlHS6F5;
		
		this.pnlHS7F1 = pnlHS7F1;
		this.pnlHS7F2 = pnlHS7F2;
		this.pnlHS7F3 = pnlHS7F3;
		this.pnlHS7F4 = pnlHS7F4;
		this.pnlHS7F5 = pnlHS7F5;
		
		this.pnlHS8F1 = pnlHS8F1;
		this.pnlHS8F2 = pnlHS8F2;
		this.pnlHS8F3 = pnlHS8F3;
		this.pnlHS8F4 = pnlHS8F4;
		this.pnlHS8F5 = pnlHS8F5;
		
		this.pnlHS9F1 = pnlHS9F1;
		this.pnlHS9F2 = pnlHS9F2;
		this.pnlHS9F3 = pnlHS9F3;
		this.pnlHS9F4 = pnlHS9F4;
		this.pnlHS9F5 = pnlHS9F5;

		this.pnlHS10F1 = pnlHS10F1;
		this.pnlHS10F2 = pnlHS10F2;
		this.pnlHS10F3 = pnlHS10F3;
		this.pnlHS10F4 = pnlHS10F4;
		this.pnlHS10F5 = pnlHS10F5;
		
		this.pnlHS11F1 = pnlHS11F1;
		this.pnlHS11F2 = pnlHS11F2;
		this.pnlHS11F3 = pnlHS11F3;
		this.pnlHS11F4 = pnlHS11F4;
		this.pnlHS11F5 = pnlHS11F5;
		
		this.pnlHS12F1 = pnlHS12F1;
		this.pnlHS12F2 = pnlHS12F2;
		this.pnlHS12F3 = pnlHS12F3;
		this.pnlHS12F4 = pnlHS12F4;
		this.pnlHS12F5 = pnlHS12F5;
		
		this.pnlGS1F1 = pnlGS1F1;
		this.pnlGS1F2 = pnlGS1F2;
		this.pnlGS1F3 = pnlGS1F3;
		this.pnlGS1F4 = pnlGS1F4;
		this.pnlGS1F5 = pnlGS1F5;
		
		this.pnlGS2F1 = pnlGS2F1;
		this.pnlGS2F2 = pnlGS2F2;
		this.pnlGS2F3 = pnlGS2F3;
		this.pnlGS2F4 = pnlGS2F4;
		this.pnlGS2F5 = pnlGS2F5;
		
		this.pnlGS3F1 = pnlGS3F1;
		this.pnlGS3F2 = pnlGS3F2;
		this.pnlGS3F3 = pnlGS3F3;
		this.pnlGS3F4 = pnlGS3F4;
		this.pnlGS3F5 = pnlGS3F5;
	
		this.pnlGS4F1 = pnlGS4F1;
		this.pnlGS4F2 = pnlGS4F2;
		this.pnlGS4F3 = pnlGS4F3;
		this.pnlGS4F4 = pnlGS4F4;
		this.pnlGS4F5 = pnlGS4F5;
		
		this.pnlGS5F1 = pnlGS5F1;
		this.pnlGS5F2 = pnlGS5F2;
		this.pnlGS5F3 = pnlGS5F3;
		this.pnlGS5F4 = pnlGS5F4;
		this.pnlGS5F5 = pnlGS5F5;
	
		this.pnlGS6F1 = pnlGS6F1;
		this.pnlGS6F2 = pnlGS6F2;
		this.pnlGS6F3 = pnlGS6F3;
		this.pnlGS6F4 = pnlGS6F4;
		this.pnlGS6F5 = pnlGS6F5;
	
		this.pnlGS7F1 = pnlGS7F1;
		this.pnlGS7F2 = pnlGS7F2;
		this.pnlGS7F3 = pnlGS7F3;
		this.pnlGS7F4 = pnlGS7F4;
		this.pnlGS7F5 = pnlGS7F5;
	
		this.pnlGS8F1 = pnlGS8F1;
		this.pnlGS8F2 = pnlGS8F2;
		this.pnlGS8F3 = pnlGS8F3;
		this.pnlGS8F4 = pnlGS8F4;
		this.pnlGS8F5 = pnlGS8F5;
		
		this.pnlGS9F1 = pnlGS9F1;
		this.pnlGS9F2 = pnlGS9F2;
		this.pnlGS9F3 = pnlGS9F3;
		this.pnlGS9F4 = pnlGS9F4;
		this.pnlGS9F5 = pnlGS9F5;
		
		this.pnlGS10F1 = pnlGS10F1;
		this.pnlGS10F2 = pnlGS10F2;
		this.pnlGS10F3 = pnlGS10F3;
		this.pnlGS10F4 = pnlGS10F4;
		this.pnlGS10F5 = pnlGS10F5;
	
		this.pnlGS11F1 = pnlGS11F1;
		this.pnlGS11F2 = pnlGS11F2;
		this.pnlGS11F3 = pnlGS11F3;
		this.pnlGS11F4 = pnlGS11F4;
		this.pnlGS11F5 = pnlGS11F5;
	
		this.pnlGS12F1 = pnlGS12F1;
		this.pnlGS12F2 = pnlGS12F2;
		this.pnlGS12F3 = pnlGS12F3;
		this.pnlGS12F4 = pnlGS12F4;
		this.pnlGS12F5 = pnlGS12F5;
		
		
		
		frame.addKeyListener(new KeyListener() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
				
				int keyCode = e.getKeyCode();
				Tasten(keyCode);
				
			}
			
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
		});
		
		btnHP1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				PunkteH(1);
			}
		});
		
		btnHP1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				
				btnHP1.setBackground(new Color(0, 153, 0));
				
				if (iL == 0) {
					
					lblHinweis.setText("Addiert 1 Punkt zu Heim");
					
				} else if (iL == 1) {
					
					lblHinweis.setText("Adds 1 Point to Home");
					
				}
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
				btnHP1.setBackground(new Color(0, 102, 0));
				lblHinweis.setText("");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				btnHP1.setBackground(new Color(0, 153, 0));
			}
			
		});
		
		
		btnHP2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				PunkteH(2);
				
			}
		});
		
		btnHP2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				
				btnHP2.setBackground(new Color(0, 153, 0));
				
				if (iL == 0) {
					
					lblHinweis.setText("Addiert 2 Punkte zu Heim");
					
				} else if (iL == 1) {
					
					lblHinweis.setText("Adds 2 Points to Home");
					
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				btnHP2.setBackground(new Color(0, 102, 0));
				
				lblHinweis.setText("");
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				btnHP2.setBackground(new Color(0, 153, 0));
				
			}
		});
		
		btnHP3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				PunkteH(3);

			}
		});
		
		btnHP3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnHP3.setBackground(new Color(0, 153, 0));
				if (iL == 0) {
					lblHinweis.setText("Addiert 3 Punkte zu Heim");
				} else if (iL == 1) {
					lblHinweis.setText("Adds 3 Points to Home");
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnHP3.setBackground(new Color(0, 102, 0));
				lblHinweis.setText("");
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				btnHP3.setBackground(new Color(0, 153, 0));
			}
		});
		
		btnHM1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				PunkteH(-1);
				
			}
		});
		
		btnHM1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnHM1.setBackground(Color.RED);
				if (iL == 0) {
					lblHinweis.setText("Subtrahiert 1 Punkt von Heim");
				} else if (iL == 1) {
					lblHinweis.setText("Subtracts 1 Point of Home");
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnHM1.setBackground(new Color(153, 0, 0));
				lblHinweis.setText("");
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				btnHM1.setBackground(Color.RED);
			}
		});
		
		
		btnHM2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				PunkteH(-2);
				
			}
		});
		
		btnHM2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnHM2.setBackground(Color.RED);
				if (iL == 0) {
					lblHinweis.setText("Subtrahiert 2 Punkte von Heim");
				} else if (iL == 1) {
					lblHinweis.setText("Subtracts 2 Points of Home");
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnHM2.setBackground(new Color(153, 0, 0));
				lblHinweis.setText("");
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				btnHM2.setBackground(Color.RED);
			}
		});
		
		btnHM3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				PunkteH(-3);
				
			}
		});
		
		btnHM3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnHM3.setBackground(Color.RED);
				if (iL == 0) {
					lblHinweis.setText("Subtrahiert 3 Punkte von Heim");
				} else if (iL == 1) {
					lblHinweis.setText("Subtracts 3 Points of Home");
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnHM3.setBackground(new Color(153, 0, 0));
				lblHinweis.setText("");
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				btnHM3.setBackground(Color.RED);
			}
		});
		
		btnGP1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				PunkteG(1);
				
			}
		});
		
		btnGP1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnGP1.setBackground(new Color(0, 153, 0));
				if (iL == 0) {
					lblHinweis.setText("Addiert 1 Punkt von Gast");
				} else if (iL == 1) {
					lblHinweis.setText("Adds 1 Point to Away");
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnGP1.setBackground(new Color(0, 102, 0));
				lblHinweis.setText("");
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				btnGP1.setBackground(new Color(0, 153, 0));
			}
		});
		
		btnGP2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				PunkteG(2);
				
			}
		});
		
		btnGP2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnGP2.setBackground(new Color(0, 153, 0));
				if (iL == 0) {
					lblHinweis.setText("Addiert 2 Punkte von Gast");
				} else if (iL == 1) {
					lblHinweis.setText("Adds 2 Points to Away");
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnGP2.setBackground(new Color(0, 102, 0));
				lblHinweis.setText("");
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				btnGP2.setBackground(new Color(0, 153, 0));
			}
		});
		
		btnGP3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				PunkteG(3);
				
			}
		});
		
		btnGP3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnGP3.setBackground(new Color(0, 153, 0));
				if (iL == 0) {
					lblHinweis.setText("Addiert 3 Punkte von Gast");
				} else if (iL == 1) {
					lblHinweis.setText("Adds 3 Points to Away");
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnGP3.setBackground(new Color(0, 102, 0));
				lblHinweis.setText("");
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				btnGP3.setBackground(new Color(0, 153, 0));
			}
		});
		
		btnGM1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				PunkteG(-1);
				
			}
		});
		
		btnGM1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnGM1.setBackground(Color.RED);
				if (iL == 0) {
					lblHinweis.setText("Subtrahiert 1 Punkt von Gast");
				} else if (iL == 1) {
					lblHinweis.setText("Subtracts 1 Point of Away");
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnGM1.setBackground(new Color(153, 0, 0));
				lblHinweis.setText("");
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				btnGM1.setBackground(Color.RED);
			}
		});
		
		btnGM2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				PunkteG(-2);
				
			}
		});
		
		btnGM2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnGM2.setBackground(Color.RED);
				if (iL == 0) {
					lblHinweis.setText("Subtrahiert 2 Punkte von Gast");
				} else if (iL == 1) {
					lblHinweis.setText("Subtracts 2 Points of Away");
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnGM2.setBackground(new Color(153, 0, 0));
				lblHinweis.setText("");
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				btnGM2.setBackground(Color.RED);
			}
		});
		
		btnGM3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				PunkteG(-3);
				
			}
		});
		
		btnGM3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnGM3.setBackground(Color.RED);
				if (iL == 0) {
					lblHinweis.setText("Subtrahiert 3 Punkte von Gast");
				} else if (iL == 1) {
					lblHinweis.setText("Subtracts 3 Points of Away");
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnGM3.setBackground(new Color(153, 0, 0));
				lblHinweis.setText("");
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				btnGM3.setBackground(Color.RED);
			}
		});
		
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Reset();
				
			}
		});
		
		btnReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnReset.setBackground(Color.GRAY);
				if (iL == 0) {
					lblHinweis.setText("Setzt Spielstand zurï¿½ck");
				} else if (iL == 1) {
					lblHinweis.setText("Resets Score");
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnReset.setBackground(Color.DARK_GRAY);
				lblHinweis.setText("");
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				btnReset.setBackground(Color.GRAY);
			}
		});
		
		btnShotclock14.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				iT = 14;
				if (Shotclock==false) {
					
				t.start();
				
				Shotclock=true;
				
				} else if (Shotclock==true){
					
					t.suspend();
					
					iT=15;
					
					
					t.resume();
					
				} else {
					
					
				}

			}
		});
		
		btnShotclock14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnShotclock14.setBackground(Color.GRAY);
				if (iL == 0) {
					lblHinweis.setText("Setzt die Shotclock auf 14s");
				} else if (iL == 1) {
					lblHinweis.setText("Sets Shotclock to 14s");
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnShotclock14.setBackground(Color.DARK_GRAY);
				lblHinweis.setText("");
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				btnShotclock14.setBackground(Color.GRAY);
			
			}
		});
		
		btnShotclock24.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				iT = 24;
				if (Shotclock==false) {
					
				t.start();
				
				Shotclock=true;
				
				} else if (Shotclock==true){
					
					t.suspend();
					
					iT=25;
					
					
					t.resume();
					
				} else {
					
					
				}
				
			}
			
		});
		
		btnShotclock24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnShotclock24.setBackground(Color.GRAY);
				if (iL == 0) {
					lblHinweis.setText("Setzt die Shotclock auf 24s");
				} else if (iL == 1) {
					lblHinweis.setText("Sets Shotclock to 14s");
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnShotclock24.setBackground(Color.DARK_GRAY);
				lblHinweis.setText("");
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				btnShotclock24.setBackground(Color.GRAY);
				
			}
		});
		
		btnUhrStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (Zeit == false && Zeits == false) {
					
					z.start();
					
				} else if (Zeit == false && Zeits ==true) {
				
					
					z.resume();
					
					Zeit = true;
					Zeits = false;
					
				} else {
					
					
				}
				
				
			}
		});
		
		btnUhrStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnUhrStart.setBackground(Color.GRAY);
				if (iL == 0) {
					lblHinweis.setText("Startet die Uhr");
				} else if (iL == 1) {
					lblHinweis.setText("Starts Clock");
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnUhrStart.setBackground(Color.DARK_GRAY);
				lblHinweis.setText("");
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				btnUhrStart.setBackground(Color.GRAY);
				
			}
		});
		
		btnUhrStopp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				z.suspend();
				
				Zeit=false;
				Zeits=true;
				
				
			}
				
		});
		
		btnUhrStopp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnUhrStopp.setBackground(Color.GRAY);
				if (iL == 0) {
					lblHinweis.setText("Stoppt die Uhr");
				} else if (iL == 1) {
					lblHinweis.setText("Stops Clock");
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnUhrStopp.setBackground(Color.DARK_GRAY);
				lblHinweis.setText("");
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				btnUhrStopp.setBackground(Color.GRAY);
				
			}
		});
		
		btnHFoul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int i = Integer.parseInt(tfHeimFoul.getText());
	
				String nS = JOptionPane.showInputDialog("Trikotnummer eingeben");
				int n = 0;

				if (nS.length()>0) {
					
					n = Integer.parseInt(nS);
					
				} else if (nS.length() == 0) {
					
					n = 0;

				}
				
				FoulH(i);
				FoulHNr(n);
				
			}
		});
		
		btnHFoul.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnHFoul.setBackground(Color.GRAY);
				if (iL == 0) {
					lblHinweis.setText("Rechnet Heim ein Foul zu");
				} else if (iL == 1) {
					lblHinweis.setText("Adds 1 Foul to Home");
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnHFoul.setBackground(Color.DARK_GRAY);
				lblHinweis.setText("");
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				btnHFoul.setBackground(Color.GRAY);
			}
		});
		
		btnGFoul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int i = Integer.parseInt(tfGastFoul.getText());
				
				String nS = JOptionPane.showInputDialog("Trikotnummer eingeben");
				int n = 0;
				
				if (nS.length()>0) {
					
					n = Integer.parseInt(nS);
					
				} else if (nS.length() == 0) {
					
					n = 0;

				}
				
				FoulG(i);
				FoulGNr(n);
				
			}
		});
		
		btnGFoul.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnGFoul.setBackground(Color.GRAY);
				if (iL == 0) {
					lblHinweis.setText("Rechnet Gast ein Foul zu");
				} else if (iL == 1) {
					lblHinweis.setText("Adds 1 Foul to Away");
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnGFoul.setBackground(Color.DARK_GRAY);
				lblHinweis.setText("");
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				btnGFoul.setBackground(Color.GRAY);
			}
		});
		
		btnHeimAuszeit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AuszeitH(iH++);
			}
		});
		
		btnHeimAuszeit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnHeimAuszeit.setBackground(Color.GRAY);
				if (iL == 0) {
					lblHinweis.setText("Rechnet Heim eine Auszeit zu");
				} else if (iL == 1) {
					lblHinweis.setText("Adds 1 Timeout to Home");
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnHeimAuszeit.setBackground(Color.DARK_GRAY);
				lblHinweis.setText("");
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				btnHeimAuszeit.setBackground(Color.GRAY);
			}
		});
		
		btnGastAuszeit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AuszeitG(iG++);
				
			}
		});
	
		btnGastAuszeit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				
				btnGastAuszeit.setBackground(Color.GRAY);
				
				if (iL == 0) {
					
					lblHinweis.setText("Rechnet Gast eine Auszeit zu");
					
				} else if (iL == 1) {
					
					lblHinweis.setText("Adds 1 Timeout to Away");
					
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				btnGastAuszeit.setBackground(Color.DARK_GRAY);
				lblHinweis.setText("");
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				btnGastAuszeit.setBackground(Color.GRAY);
				
			}
		});
		
		btnInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (iL == 0) {
					
					Info info = new Info();
					info.InfoWindow(null);
				
				} else if (iL == 1) {
					
					InfoEnglisch InfoE = new InfoEnglisch();
					InfoE.InfoWindow(null);
				}
			}
		});
	
		btnInfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				
				btnInfo.setBackground(Color.GRAY);
				
				if (iL == 0) {
					
					lblHinweis.setText("ï¿½ffnet das Infofenster");
					
				} else if (iL == 1) {
					
					lblHinweis.setText("Opens the Information Window");
					
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				btnInfo.setBackground(Color.DARK_GRAY);
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				btnInfo.setBackground(Color.GRAY);
				
			}
		});
		
		btnHotkeys.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				
				btnHotkeys.setBackground(Color.GRAY);
				
				
				if (iK == 0) {
					
					Hotkeysein();
					
				} else if (iK == 1){
					
					Hotkeysaus();
					
				} else {}
				
				if (iL == 0) {
					
					lblHinweis.setText("Tastenbelegung anzeigen");
					
				} else if (iL == 1) {
					
					lblHinweis.setText("Toggle Keybindings");
					 
				} else {}
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
				btnHotkeys.setBackground(Color.DARK_GRAY);
				lblHinweis.setText("");
				
				if (iK == 0) {
					
					Hotkeysaus();
					
				} else if (iK == 1) {
					
					Hotkeysein();
					
				} else {}
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				btnHotkeys.setBackground(Color.GRAY);
			}
		});
		
		btnHotkeys.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (iK == 0) {
					
					iK = 1;
					Hotkeysein();
					
				} else if (iK == 1) {
					
					iK = 0;
					Hotkeysaus();
					
				} else {
					
					
				}
			}
			
		});
		
		btnDeutsch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				
				btnDeutsch.setBackground(Color.GRAY);
				
				if (iL == 0 && iK == 0) {
					
					Deutsch();
					Hotkeysaus();
					lblHinweis.setText("Setzt die Sprache auf Deutsch");
					
				} else if (iL == 0 && iK == 1) {
					
					Deutsch();
					Hotkeysein();
					lblHinweis.setText("Setzt die Sprache auf Deutsch");
					
				} else if (iL== 1 && iK == 0) {
					
					Deutsch();
					Hotkeysaus();
					lblHinweis.setText("Sets Language to Englisch");
					
				} else if (iL== 1 && iK == 1) {
					
					Deutsch();
					Hotkeysein();
					lblHinweis.setText("Sets Language to Englisch");
					
				} else {}
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
				btnDeutsch.setBackground(Color.DARK_GRAY);
				
				if (iL == 1 && iK == 0) {
					
					Englisch();
					Hotkeysaus();
					
				} else if (iL == 1 && iK == 1) {
					
					Englisch();
					Hotkeysein();
					
				} else if (iL == 0 && iK == 0) {
					
					Deutsch();
					Hotkeysaus();
					
				} else if (iL == 0 && iK == 1) {
					
					Deutsch();
					Hotkeysein();
					
				}
				
				lblHinweis.setText("");
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				btnDeutsch.setBackground(Color.GRAY);
			}
		});
		
		btnEnglisch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				
				btnEnglisch.setBackground(Color.GRAY);
				
				if (iL == 0 && iK == 0) {
					
					Englisch();
					Hotkeysaus();
					lblHinweis.setText("Setzt die Sprache auf Englisch");
					
				} else if (iL == 0 && iK == 1) {
					
					Englisch();
					Hotkeysein();
					lblHinweis.setText("Setzt die Sprache auf Englisch");
					
				} else if (iL== 1 && iK == 0) {
					
					Englisch();
					Hotkeysaus();
					lblHinweis.setText("Sets Language to Englisch");
					
				} else if (iL== 1 && iK == 1) {
					
					Englisch();
					Hotkeysein();
					lblHinweis.setText("Sets Language to Englisch");
					
				} else {}
				
			
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
				btnEnglisch.setBackground(Color.DARK_GRAY);
				
				if (iL == 1 && iK == 0) {
					
					Englisch();
					Hotkeysaus();
					
				} else if (iL == 1 && iK == 1){
					
					Englisch();
					Hotkeysein();
					
				} else if (iL == 0 && iK == 0) {
					
					Deutsch();
					Hotkeysaus();
					
				} else if (iL == 0 && iK == 1) {
					
					Deutsch();
					Hotkeysein();
					
				} else {}
				
				lblHinweis.setText("");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				btnEnglisch.setBackground(Color.GRAY);
				
			}
		});
		
		btnEnglisch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				iL = 1;
				Englisch();
				
				if (iK == 0) {
					
					Hotkeysaus();
					
				} else if (iK == 1) {
					
					Hotkeysein();
				}
			}
		});
		
		btnDeutsch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				iL = 0;
				Deutsch();
				
				if (iK == 0) {
					
					Hotkeysaus();
					
				} else if (iK == 1) {
					
					Hotkeysein();
				}
			}
		});
		
		btnShotclockReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				
				btnShotclockReset.setBackground(Color.GRAY);
				
				if (iL == 0) {
					
					lblHinweis.setText("Setzt die Shotclock zurück");
					
				} else if (iL == 1) {
					
					lblHinweis.setText("Resets Shotclock");
					
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				btnShotclockReset.setBackground(Color.DARK_GRAY);
				
				lblHinweis.setText("");
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				btnShotclockReset.setBackground(Color.GRAY);
			}
		});
		
		btnShotclockReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				iT = 0;
				t.start();
				
			}
		});
		
		btnViertel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				Viertel(iV++);
				
			}
			
		});
		
		btnViertel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				
				btnViertel.setBackground(Color.GRAY);
				
				if (iL == 0) {
					
					lblHinweis.setText("Nï¿½chstes Viertel");
					
				} else if (iL == 1 ) {
					
					lblHinweis.setText("Next Period");
				}
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				
				btnViertel.setBackground(Color.DARK_GRAY);
				lblHinweis.setText("");
				
			}
			
			@Override 
			public void mouseClicked(MouseEvent arg0) {
				
			}
			
		});
		
		btnUhrreset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				Uhrreset();
				
			}
			
		});
		
		btnUhrreset.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				
				btnUhrreset.setBackground(Color.GRAY);
				
				if (iL == 0) {
					
					lblHinweis.setText("Setzt die Uhr zurück");
					
				} else if (iL == 1) {
					
					lblHinweis.setText("Resets Clock");
					
				}
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
				btnUhrreset.setBackground(Color.DARK_GRAY);
				lblHinweis.setText("");
				
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				
			}
			
		});
	
		
		
	
	}
	
	public void PunkteH(int i) {
		
		String SPunkteH = tfPunkteHeim.getText();
		int iPunkteH = Integer.parseInt(SPunkteH);
		
		if (iPunkteH+i > 0) {
			
			iPunkteH = iPunkteH+i;
			
		} else if (iPunkteH+i <= 0){
			
			iPunkteH = 0;
			
		} else {
			
			iPunkteH = 0;
		}
		
		tfPunkteHeim.setText(Integer.toString(iPunkteH));
		
	}
	
	public void PunkteG(int i) {
		
		String SPunkteG = tfPunkteGast.getText();
		int iPunkteG = Integer.parseInt(SPunkteG);
		
		if (iPunkteG+i > 0) {
			
			iPunkteG = iPunkteG+i;
			
		} else if (iPunkteG+i <= 0){
			
			iPunkteG = 0;
			
		} else {
			
			iPunkteG = 0;
		}
		
		tfPunkteGast.setText(Integer.toString(iPunkteG));
		
	}
	
	
	
	public void Reset() {
		
		if (Shotclock=true) {
			
			t.suspend();
			
		} else {
			
			
		}
		
		tfPunkteHeim.setText("0");
		tfPunkteGast.setText("0");
		
		tfHeimFoul.setText("0");
		tfGastFoul.setText("0");
		
		tfShotclock.setText("0");
		
		pnlAuszeitHeim1.setVisible(false);
		pnlAuszeitHeim2.setVisible(false);
		pnlAuszeitHeim3.setVisible(false);
		pnlAuszeitGast1.setVisible(false);
		pnlAuszeitGast2.setVisible(false);
		pnlAuszeitGast3.setVisible(false);
		
		pnlViertel1.setVisible(false);
		pnlViertel2.setVisible(false);
		pnlViertel3.setVisible(false);
		pnlViertel4.setVisible(false);
		
		pnlHS1F1.setVisible(false);
		pnlHS1F2.setVisible(false);
		pnlHS1F3.setVisible(false);
		pnlHS1F4.setVisible(false);
		pnlHS1F5.setVisible(false);
		
		pnlHS2F1.setVisible(false);
		pnlHS2F2.setVisible(false);
		pnlHS2F3.setVisible(false);
		pnlHS2F4.setVisible(false);
		pnlHS2F5.setVisible(false);
		
		pnlHS3F1.setVisible(false);
		pnlHS3F2.setVisible(false);
		pnlHS3F3.setVisible(false);
		pnlHS3F4.setVisible(false);
		pnlHS3F5.setVisible(false);
		
		pnlHS4F1.setVisible(false);
		pnlHS4F2.setVisible(false);
		pnlHS4F3.setVisible(false);
		pnlHS4F4.setVisible(false);
		pnlHS4F5.setVisible(false);
		
		pnlHS5F1.setVisible(false);
		pnlHS5F2.setVisible(false);
		pnlHS5F3.setVisible(false);
		pnlHS5F4.setVisible(false);
		pnlHS5F5.setVisible(false);
		
		pnlHS6F1.setVisible(false);
		pnlHS6F2.setVisible(false);
		pnlHS6F3.setVisible(false);
		pnlHS6F4.setVisible(false);
		pnlHS6F5.setVisible(false);
		
		pnlHS7F1.setVisible(false);
		pnlHS7F2.setVisible(false);
		pnlHS7F3.setVisible(false);
		pnlHS7F4.setVisible(false);
		pnlHS7F5.setVisible(false);
		
		pnlHS8F1.setVisible(false);
		pnlHS8F2.setVisible(false);
		pnlHS8F3.setVisible(false);
		pnlHS8F4.setVisible(false);
		pnlHS8F5.setVisible(false);
		
		pnlHS9F1.setVisible(false);
		pnlHS9F2.setVisible(false);
		pnlHS9F3.setVisible(false);
		pnlHS9F4.setVisible(false);
		pnlHS9F5.setVisible(false);
	
		pnlHS10F1.setVisible(false);
		pnlHS10F2.setVisible(false);
		pnlHS10F3.setVisible(false);
		pnlHS10F4.setVisible(false);
		pnlHS10F5.setVisible(false);
		
		pnlHS11F1.setVisible(false);
		pnlHS11F2.setVisible(false);
		pnlHS11F3.setVisible(false);
		pnlHS11F4.setVisible(false);
		pnlHS11F5.setVisible(false);
		
		pnlHS12F1.setVisible(false);
		pnlHS12F2.setVisible(false);
		pnlHS12F3.setVisible(false);
		pnlHS12F4.setVisible(false);
		pnlHS12F5.setVisible(false);
		
		pnlGS1F1.setVisible(false);
		pnlGS1F2.setVisible(false);
		pnlGS1F3.setVisible(false);
		pnlGS1F4.setVisible(false);
		pnlGS1F5.setVisible(false);
		
		pnlGS2F1.setVisible(false);
		pnlGS2F2.setVisible(false);
		pnlGS2F3.setVisible(false);
		pnlGS2F4.setVisible(false);
		pnlGS2F5.setVisible(false);
		
		pnlGS3F1.setVisible(false);
		pnlGS3F2.setVisible(false);
		pnlGS3F3.setVisible(false);
		pnlGS3F4.setVisible(false);
		pnlGS3F5.setVisible(false);
		
		pnlGS4F1.setVisible(false);
		pnlGS4F2.setVisible(false);
		pnlGS4F3.setVisible(false);
		pnlGS4F4.setVisible(false);
		pnlGS4F5.setVisible(false);
		
		pnlGS5F1.setVisible(false);
		pnlGS5F2.setVisible(false);
		pnlGS5F3.setVisible(false);
		pnlGS5F4.setVisible(false);
		pnlGS5F5.setVisible(false);
		
		pnlGS6F1.setVisible(false);
		pnlGS6F2.setVisible(false);
		pnlGS6F3.setVisible(false);
		pnlGS6F4.setVisible(false);
		pnlGS6F5.setVisible(false);
		
		pnlGS7F1.setVisible(false);
		pnlGS7F2.setVisible(false);
		pnlGS7F3.setVisible(false);
		pnlGS7F4.setVisible(false);
		pnlGS7F5.setVisible(false);
		
		pnlGS8F1.setVisible(false);
		pnlGS8F2.setVisible(false);
		pnlGS8F3.setVisible(false);
		pnlGS8F4.setVisible(false);
		pnlGS8F5.setVisible(false);
		
		pnlGS9F1.setVisible(false);
		pnlGS9F2.setVisible(false);
		pnlGS9F3.setVisible(false);
		pnlGS9F4.setVisible(false);
		pnlGS9F5.setVisible(false);
	
		pnlGS10F1.setVisible(false);
		pnlGS10F2.setVisible(false);
		pnlGS10F3.setVisible(false);
		pnlGS10F4.setVisible(false);
		pnlGS10F5.setVisible(false);
		
		pnlGS11F1.setVisible(false);
		pnlGS11F2.setVisible(false);
		pnlGS11F3.setVisible(false);
		pnlGS11F4.setVisible(false);
		pnlGS11F5.setVisible(false);
		
		pnlGS12F1.setVisible(false);
		pnlGS12F2.setVisible(false);
		pnlGS12F3.setVisible(false);
		pnlGS12F4.setVisible(false);
		pnlGS12F5.setVisible(false);
		
		tfHeimFoul.setBackground(Color.black);
		tfGastFoul.setBackground(Color.black);

		tfHS1.setBackground(Color.black);
		tfHS2.setBackground(Color.black);
		tfHS3.setBackground(Color.black);
		tfHS4.setBackground(Color.black);
		tfHS5.setBackground(Color.black);
		tfHS6.setBackground(Color.black);
		tfHS7.setBackground(Color.black);
		tfHS8.setBackground(Color.black);
		tfHS9.setBackground(Color.black);
		tfHS10.setBackground(Color.black);
		tfHS11.setBackground(Color.black);
		tfHS12.setBackground(Color.black);
		
		
		tfGS1.setBackground(Color.black);
		tfGS2.setBackground(Color.black);
		
		iG = 1;
		iH = 1;
		iV = 1;
		iHS1 = 0;
		iHS2 = 0;
		
		
	}
	
	public void Uhrreset() {
		
		if (Zeit=true) {
			
			z.suspend();
			Zeit=false;
			Zeits=true;
			
			iZs=0;
			iZm=10;
			
			tfZeit.setText("10 : 00");
			
		} else {
			
		}
		
	}
	
	public void FoulH(int i) {
		
		System.out.println(i);
		
		if (i<4) {
			
			i++;
			
		} else if (i==4){
			
			i++;
			
			if (iL == 0) {
				
				JOptionPane.showMessageDialog(null, "Bei weiteren Fouls Freiwï¿½rfe fï¿½r Gast", "Freiwurfwarnung", JOptionPane.INFORMATION_MESSAGE);
				
			} else if (iL == 1) {
				
				JOptionPane.showMessageDialog(null, "Free throws for guest on further fouls", "Free throw warning", JOptionPane.INFORMATION_MESSAGE);
				
			}
			
			
			tfHeimFoul.setBackground(Color.red);
			
		} else {
			
			i = 5;
			
			if (iL == 0) {
			
				JOptionPane.showMessageDialog(null, "Freiwï¿½rfe fï¿½r Gast", "Freiwurfwarnung", JOptionPane.INFORMATION_MESSAGE);
				
			}else if (iL == 1) {
				
				JOptionPane.showMessageDialog(null, "Free throws for guest", "Free throw warning", JOptionPane.INFORMATION_MESSAGE);
				
			}
			
			
		}
		
		String Si = Integer.toString(i);
		tfHeimFoul.setText(Si);
		
	}
	
	public void FoulG(int i) {
		
		System.out.println(i);
		
		if (i<4) {
			
			i++;
		} else if (i==4){
			
			i++;
			
			if (iL == 0) {
				
				JOptionPane.showMessageDialog(null, "Bei weiteren Fouls Freiwï¿½rfe fï¿½r Heim", "Freiwurfwarnung", JOptionPane.INFORMATION_MESSAGE);
			
			} else if (iL == 1) {
				
				JOptionPane.showMessageDialog(null, "Free throws for home on further fouls", "Free throw warning", JOptionPane.INFORMATION_MESSAGE);
				
			}
			
			tfGastFoul.setBackground(Color.red);
			
		} else {
			
			i = 5;
			
			if (iL == 0) {
				
			JOptionPane.showMessageDialog(null, "Freiwï¿½rfe fï¿½r Heim", "Freiwurfwarnung", JOptionPane.INFORMATION_MESSAGE);
			
			} else if (iL == 1) {
				
				JOptionPane.showMessageDialog(null, "Free throws for home", "Free throw warning", JOptionPane.INFORMATION_MESSAGE);
				
			}
		}
		
		String Si = Integer.toString(i);
		tfGastFoul.setText(Si);
		
	}
	
	public void FoulHNr(int n) {
		
		int HS1 = Integer.parseInt(tfHS1.getText());
		int HS2 = Integer.parseInt(tfHS2.getText());
		int HS3 = Integer.parseInt(tfHS3.getText());
		int HS4 = Integer.parseInt(tfHS4.getText());
		int HS5 = Integer.parseInt(tfHS5.getText());
		int HS6 = Integer.parseInt(tfHS6.getText());
		int HS7 = Integer.parseInt(tfHS7.getText());
		int HS8 = Integer.parseInt(tfHS8.getText());
		int HS9 = Integer.parseInt(tfHS9.getText());
		int HS10 = Integer.parseInt(tfHS10.getText());
		int HS11 = Integer.parseInt(tfHS11.getText());
		int HS12 = Integer.parseInt(tfHS12.getText());
	
		if (n == HS1) {
			
			iHS1++;
			
		} else if (n == HS2) {
			
			iHS2++;
			
		} else if (n == HS3) {
			
			iHS3++;
			
		} else if (n == HS4) {
			
			iHS4++;
			
		} else if (n == HS5) {
			
			iHS5++;
			
		} else if (n == HS6) {
			
			iHS6++;
			
		} else if (n == HS7) {
			
			iHS7++;
			
		} else if (n == HS8) {
			
			iHS8++;
			
		} else if (n == HS9) {
			
			iHS9++;
			
		} else if (n == HS10) {
			
			iHS10++;
			
		} else if (n == HS11) {
	
			iHS11++;
	
		} else if (n == HS12) {
	
			iHS12++;
	
		} else {
			
			if (iL == 0) {
				
				JOptionPane.showMessageDialog(null, "Diese Trikotnummer ist nicht vorhanden bei Team Heim", "", JOptionPane.ERROR_MESSAGE);
				
			} else if (iL == 1) {
				
				JOptionPane.showMessageDialog(null, "This jersey number is not available on Team Home", "", JOptionPane.ERROR_MESSAGE);
				
			}
			
		}
		
		
		switch (iHS1) {
		
		case 0: 
			pnlHS1F1.setVisible(false);
			pnlHS1F2.setVisible(false);
			pnlHS1F3.setVisible(false);
			pnlHS1F4.setVisible(false);
			pnlHS1F5.setVisible(false);
			break;
			
		case 1:
			pnlHS1F1.setVisible(true);
			pnlHS1F2.setVisible(false);
			pnlHS1F3.setVisible(false);
			pnlHS1F4.setVisible(false);
			pnlHS1F5.setVisible(false);
			break;
			
		case 2:
			pnlHS1F1.setVisible(true);
			pnlHS1F2.setVisible(true);
			pnlHS1F3.setVisible(false);
			pnlHS1F4.setVisible(false);
			pnlHS1F5.setVisible(false);
			break;
			
		case 3:
			pnlHS1F1.setVisible(true);
			pnlHS1F2.setVisible(true);
			pnlHS1F3.setVisible(true);
			pnlHS1F4.setVisible(false);
			pnlHS1F5.setVisible(false);
			break;
			
		case 4:
			pnlHS1F1.setVisible(true);
			pnlHS1F2.setVisible(true);
			pnlHS1F3.setVisible(true);
			pnlHS1F4.setVisible(true);
			pnlHS1F5.setVisible(false);
			break;
			
		case 5:
			pnlHS1F1.setVisible(true);
			pnlHS1F2.setVisible(true);
			pnlHS1F3.setVisible(true);
			pnlHS1F4.setVisible(true);
			pnlHS1F5.setVisible(true);
			
			if (iL == 0) {
				
				JOptionPane.showMessageDialog(null, "Der Spieler mit der Trikotnummer " + HS1 + " ist fï¿½r den Rest des Spiels gesperrt", "Spielersperrung", JOptionPane.WARNING_MESSAGE);
				
			} else if (iL == 1) {
				
				JOptionPane.showMessageDialog(null, "The player with jersey number " + HS1 + " is blocked for the rest of the Game", "Player Ban", JOptionPane.WARNING_MESSAGE);
				
			}
			
			tfHS1.setBackground(Color.red);
			break;
			
		case 6:
			pnlHS1F1.setVisible(true);
			pnlHS1F2.setVisible(true);
			pnlHS1F3.setVisible(true);
			pnlHS1F4.setVisible(true);
			pnlHS1F5.setVisible(true);
			break;
			
		}
		
		
		switch (iHS2) {
		
		case 0: 
			pnlHS2F1.setVisible(false);
			pnlHS2F2.setVisible(false);
			pnlHS2F3.setVisible(false);
			pnlHS2F4.setVisible(false);
			pnlHS2F5.setVisible(false);
			break;
			
		case 1:
			pnlHS2F1.setVisible(true);
			pnlHS2F2.setVisible(false);
			pnlHS2F3.setVisible(false);
			pnlHS2F4.setVisible(false);
			pnlHS2F5.setVisible(false);
			break;
			
		case 2:
			pnlHS2F1.setVisible(true);
			pnlHS2F2.setVisible(true);
			pnlHS2F3.setVisible(false);
			pnlHS2F4.setVisible(false);
			pnlHS2F5.setVisible(false);
			break;
			
		case 3:
			pnlHS2F1.setVisible(true);
			pnlHS2F2.setVisible(true);
			pnlHS2F3.setVisible(true);
			pnlHS2F4.setVisible(false);
			pnlHS2F5.setVisible(false);
			break;
			
		case 4:
			pnlHS2F1.setVisible(true);
			pnlHS2F2.setVisible(true);
			pnlHS2F3.setVisible(true);
			pnlHS2F4.setVisible(true);
			pnlHS2F5.setVisible(false);
			break;
			
		case 5:
			pnlHS2F1.setVisible(true);
			pnlHS2F2.setVisible(true);
			pnlHS2F3.setVisible(true);
			pnlHS2F4.setVisible(true);
			pnlHS2F5.setVisible(true);
			
			if (iL == 0) {
				
				JOptionPane.showMessageDialog(null, "Der Spieler mit der Trikotnummer " + HS2 + " ist fï¿½r den Rest des Spiels gesperrt", "Spielersperrung", JOptionPane.WARNING_MESSAGE);
				
			} else if (iL == 1) {
				
				JOptionPane.showMessageDialog(null, "The player with jersey number " + HS2 + " is blocked for the rest of the Game", "Player Ban", JOptionPane.WARNING_MESSAGE);
				
			}
			
			tfHS2.setBackground(Color.red);
			break;
			
		case 6:
			pnlHS2F1.setVisible(true);
			pnlHS2F2.setVisible(true);
			pnlHS2F3.setVisible(true);
			pnlHS2F4.setVisible(true);
			pnlHS2F5.setVisible(true);
			break;
			
		}
		
		switch (iHS3) {
		
		case 0: 
			pnlHS3F1.setVisible(false);
			pnlHS3F2.setVisible(false);
			pnlHS3F3.setVisible(false);
			pnlHS3F4.setVisible(false);
			pnlHS3F5.setVisible(false);
			break;
			
		case 1:
			pnlHS3F1.setVisible(true);
			pnlHS3F2.setVisible(false);
			pnlHS3F3.setVisible(false);
			pnlHS3F4.setVisible(false);
			pnlHS3F5.setVisible(false);
			break;
			
		case 2:
			pnlHS3F1.setVisible(true);
			pnlHS3F2.setVisible(true);
			pnlHS3F3.setVisible(false);
			pnlHS3F4.setVisible(false);
			pnlHS3F5.setVisible(false);
			break;
			
		case 3:
			pnlHS3F1.setVisible(true);
			pnlHS3F2.setVisible(true);
			pnlHS3F3.setVisible(true);
			pnlHS3F4.setVisible(false);
			pnlHS3F5.setVisible(false);
			break;
		case 4:
			pnlHS3F1.setVisible(true);
			pnlHS3F2.setVisible(true);
			pnlHS3F3.setVisible(true);
			pnlHS3F4.setVisible(true);
			pnlHS3F5.setVisible(false);
			break;
			
		case 5:
			pnlHS3F1.setVisible(true);
			pnlHS3F2.setVisible(true);
			pnlHS3F3.setVisible(true);
			pnlHS3F4.setVisible(true);
			pnlHS3F5.setVisible(true);
	
			if (iL == 0) {
				
				JOptionPane.showMessageDialog(null, "Der Spieler mit der Trikotnummer " + HS3 + " ist fï¿½r den Rest des Spiels gesperrt", "Spielersperrung", JOptionPane.WARNING_MESSAGE);
				
			} else if (iL == 1) {
				
				JOptionPane.showMessageDialog(null, "The player with jersey number " + HS3 + " is blocked for the rest of the Game", "Player Ban", JOptionPane.WARNING_MESSAGE);
				
			}
			
			tfHS3.setBackground(Color.red);
			break;
			
		case 6:
			pnlHS3F1.setVisible(true);
			pnlHS3F2.setVisible(true);
			pnlHS3F3.setVisible(true);
			pnlHS3F4.setVisible(true);
			pnlHS3F5.setVisible(true);
			break;
			
		}
		
		switch (iHS4) {
		
		case 0: 
			pnlHS4F1.setVisible(false);
			pnlHS4F2.setVisible(false);
			pnlHS4F3.setVisible(false);
			pnlHS4F4.setVisible(false);
			pnlHS4F5.setVisible(false);
			break;
			
		case 1:
			pnlHS4F1.setVisible(true);
			pnlHS4F2.setVisible(false);
			pnlHS4F3.setVisible(false);
			pnlHS4F4.setVisible(false);
			pnlHS4F5.setVisible(false);
			break;
			
		case 2:
			pnlHS4F1.setVisible(true);
			pnlHS4F2.setVisible(true);
			pnlHS4F3.setVisible(false);
			pnlHS4F4.setVisible(false);
			pnlHS4F5.setVisible(false);
			break;
			
		case 3:
			pnlHS4F1.setVisible(true);
			pnlHS4F2.setVisible(true);
			pnlHS4F3.setVisible(true);
			pnlHS4F4.setVisible(false);
			pnlHS4F5.setVisible(false);
			break;
			
		case 4:
			pnlHS4F1.setVisible(true);
			pnlHS4F2.setVisible(true);
			pnlHS4F3.setVisible(true);
			pnlHS4F4.setVisible(true);
			pnlHS4F5.setVisible(false);
			break;
			
		case 5:
			pnlHS4F1.setVisible(true);
			pnlHS4F2.setVisible(true);
			pnlHS4F3.setVisible(true);
			pnlHS4F4.setVisible(true);
			pnlHS4F5.setVisible(true);
			
			if (iL == 0) {
				
				JOptionPane.showMessageDialog(null, "Der Spieler mit der Trikotnummer " + HS4 + " ist fï¿½r den Rest des Spiels gesperrt", "Spielersperrung", JOptionPane.WARNING_MESSAGE);
				
			} else if (iL == 1) {
				
				JOptionPane.showMessageDialog(null, "The player with jersey number " + HS4 + " is blocked for the rest of the Game", "Player Ban", JOptionPane.WARNING_MESSAGE);
				
			}
			
			tfHS4.setBackground(Color.red);
			break;
			
		case 6:
			pnlHS4F1.setVisible(true);
			pnlHS4F2.setVisible(true);
			pnlHS4F3.setVisible(true);
			pnlHS4F4.setVisible(true);
			pnlHS4F5.setVisible(true);
			break;
			
		}
		
		
		switch (iHS5) {
		
		case 0: 
			pnlHS5F1.setVisible(false);
			pnlHS5F2.setVisible(false);
			pnlHS5F3.setVisible(false);
			pnlHS5F4.setVisible(false);
			pnlHS5F5.setVisible(false);
			break;
			
		case 1:
			pnlHS5F1.setVisible(true);
			pnlHS5F2.setVisible(false);
			pnlHS5F3.setVisible(false);
			pnlHS5F4.setVisible(false);
			pnlHS5F5.setVisible(false);
			break;
			
		case 2:
			pnlHS5F1.setVisible(true);
			pnlHS2F2.setVisible(true);
			pnlHS2F3.setVisible(false);
			pnlHS2F4.setVisible(false);
			pnlHS2F5.setVisible(false);
			break;
			
		case 3:
			pnlHS5F1.setVisible(true);
			pnlHS5F2.setVisible(true);
			pnlHS5F3.setVisible(true);
			pnlHS5F4.setVisible(false);
			pnlHS5F5.setVisible(false);
			break;
			
		case 4:
			pnlHS5F1.setVisible(true);
			pnlHS5F2.setVisible(true);
			pnlHS5F3.setVisible(true);
			pnlHS5F4.setVisible(true);
			pnlHS5F5.setVisible(false);
			break;
			
		case 5:
			pnlHS5F1.setVisible(true);
			pnlHS5F2.setVisible(true);
			pnlHS5F3.setVisible(true);
			pnlHS5F4.setVisible(true);
			pnlHS5F5.setVisible(true);
			
			if (iL == 0) {
				
				JOptionPane.showMessageDialog(null, "Der Spieler mit der Trikotnummer " + HS5 + " ist fï¿½r den Rest des Spiels gesperrt", "Spielersperrung", JOptionPane.WARNING_MESSAGE);
				
			} else if (iL == 1) {
				
				JOptionPane.showMessageDialog(null, "The player with jersey number " + HS5 + " is blocked for the rest of the Game", "Player Ban", JOptionPane.WARNING_MESSAGE);
				
			}
			
			tfHS5.setBackground(Color.red);
			break;
			
		case 6:
			pnlHS5F1.setVisible(true);
			pnlHS5F2.setVisible(true);
			pnlHS5F3.setVisible(true);
			pnlHS5F4.setVisible(true);
			pnlHS5F5.setVisible(true);
			break;
			
		}
		
		switch (iHS6) {
		
		case 0: 
			pnlHS6F1.setVisible(false);
			pnlHS6F2.setVisible(false);
			pnlHS6F3.setVisible(false);
			pnlHS6F4.setVisible(false);
			pnlHS6F5.setVisible(false);
			break;
			
		case 1:
			pnlHS6F1.setVisible(true);
			pnlHS6F2.setVisible(false);
			pnlHS6F3.setVisible(false);
			pnlHS6F4.setVisible(false);
			pnlHS6F5.setVisible(false);
			break;
			
		case 2:
			pnlHS6F1.setVisible(true);
			pnlHS6F2.setVisible(true);
			pnlHS6F3.setVisible(false);
			pnlHS6F4.setVisible(false);
			pnlHS6F5.setVisible(false);
			break;
			
		case 3:
			pnlHS6F1.setVisible(true);
			pnlHS6F2.setVisible(true);
			pnlHS6F3.setVisible(true);
			pnlHS6F4.setVisible(false);
			pnlHS6F5.setVisible(false);
			break;
			
		case 4:
			pnlHS6F1.setVisible(true);
			pnlHS6F2.setVisible(true);
			pnlHS6F3.setVisible(true);
			pnlHS6F4.setVisible(true);
			pnlHS6F5.setVisible(false);
			break;
			
		case 5:
			pnlHS6F1.setVisible(true);
			pnlHS6F2.setVisible(true);
			pnlHS6F3.setVisible(true);
			pnlHS6F4.setVisible(true);
			pnlHS6F5.setVisible(true);
	
			if (iL == 0) {
				
				JOptionPane.showMessageDialog(null, "Der Spieler mit der Trikotnummer " + HS6 + " ist fï¿½r den Rest des Spiels gesperrt", "Spielersperrung", JOptionPane.WARNING_MESSAGE);
				
			} else if (iL == 1) {
				
				JOptionPane.showMessageDialog(null, "The player with jersey number " + HS6 + " is blocked for the rest of the Game", "Player Ban", JOptionPane.WARNING_MESSAGE);
				
			}
			
			tfHS6.setBackground(Color.red);
			break;
			
		case 6:
			pnlHS6F1.setVisible(true);
			pnlHS6F2.setVisible(true);
			pnlHS6F3.setVisible(true);
			pnlHS6F4.setVisible(true);
			pnlHS6F5.setVisible(true);
			break;
			
		}
		
		switch (iHS7) {
		
		case 0: 
			pnlHS7F1.setVisible(false);
			pnlHS7F2.setVisible(false);
			pnlHS7F3.setVisible(false);
			pnlHS7F4.setVisible(false);
			pnlHS7F5.setVisible(false);
			break;
			
		case 1:
			pnlHS7F1.setVisible(true);
			pnlHS7F2.setVisible(false);
			pnlHS7F3.setVisible(false);
			pnlHS7F4.setVisible(false);
			pnlHS7F5.setVisible(false);
			break;
			
		case 2:
			pnlHS7F1.setVisible(true);
			pnlHS7F2.setVisible(true);
			pnlHS7F3.setVisible(false);
			pnlHS7F4.setVisible(false);
			pnlHS7F5.setVisible(false);
			break;
			
		case 3:
			pnlHS7F1.setVisible(true);
			pnlHS7F2.setVisible(true);
			pnlHS7F3.setVisible(true);
			pnlHS7F4.setVisible(false);
			pnlHS7F5.setVisible(false);
			break;
			
		case 4:
			pnlHS7F1.setVisible(true);
			pnlHS7F2.setVisible(true);
			pnlHS7F3.setVisible(true);
			pnlHS7F4.setVisible(true);
			pnlHS7F5.setVisible(false);
			break;
			
		case 5:
			pnlHS7F1.setVisible(true);
			pnlHS7F2.setVisible(true);
			pnlHS7F3.setVisible(true);
			pnlHS7F4.setVisible(true);
			pnlHS7F5.setVisible(true);
			
			if (iL == 0) {
				
				JOptionPane.showMessageDialog(null, "Der Spieler mit der Trikotnummer " + HS7 + " ist fï¿½r den Rest des Spiels gesperrt", "Spielersperrung", JOptionPane.WARNING_MESSAGE);
				
			} else if (iL == 1) {
				
				JOptionPane.showMessageDialog(null, "The player with jersey number " + HS7 + " is blocked for the rest of the Game", "Player Ban", JOptionPane.WARNING_MESSAGE);
				
			}
			
			tfHS7.setBackground(Color.red);
			break;
			
		case 6:
			pnlHS7F1.setVisible(true);
			pnlHS7F2.setVisible(true);
			pnlHS7F3.setVisible(true);
			pnlHS7F4.setVisible(true);
			pnlHS7F5.setVisible(true);
			break;
			
		}
		
		
		switch (iHS8) {
		
		case 0: 
			pnlHS8F1.setVisible(false);
			pnlHS8F2.setVisible(false);
			pnlHS8F3.setVisible(false);
			pnlHS8F4.setVisible(false);
			pnlHS8F5.setVisible(false);
			break;
			
		case 1:
			pnlHS8F1.setVisible(true);
			pnlHS8F2.setVisible(false);
			pnlHS8F3.setVisible(false);
			pnlHS8F4.setVisible(false);
			pnlHS8F5.setVisible(false);
			break;
			
		case 2:
			pnlHS8F1.setVisible(true);
			pnlHS8F2.setVisible(true);
			pnlHS8F3.setVisible(false);
			pnlHS8F4.setVisible(false);
			pnlHS8F5.setVisible(false);
			break;
			
		case 3:
			pnlHS8F1.setVisible(true);
			pnlHS8F2.setVisible(true);
			pnlHS8F3.setVisible(true);
			pnlHS8F4.setVisible(false);
			pnlHS8F5.setVisible(false);
			break;
			
		case 4:
			pnlHS8F1.setVisible(true);
			pnlHS8F2.setVisible(true);
			pnlHS8F3.setVisible(true);
			pnlHS8F4.setVisible(true);
			pnlHS8F5.setVisible(false);
			break;
			
		case 5:
			pnlHS8F1.setVisible(true);
			pnlHS8F2.setVisible(true);
			pnlHS8F3.setVisible(true);
			pnlHS8F4.setVisible(true);
			pnlHS8F5.setVisible(true);
			
			if (iL == 0) {
				
				JOptionPane.showMessageDialog(null, "Der Spieler mit der Trikotnummer " + HS8 + " ist fï¿½r den Rest des Spiels gesperrt", "Spielersperrung", JOptionPane.WARNING_MESSAGE);
				
			} else if (iL == 1) {
				
				JOptionPane.showMessageDialog(null, "The player with jersey number " + HS8 + " is blocked for the rest of the Game", "Player Ban", JOptionPane.WARNING_MESSAGE);
				
			}
			
			tfHS8.setBackground(Color.red);
			break;
			
		case 6:
			pnlHS8F1.setVisible(true);
			pnlHS8F2.setVisible(true);
			pnlHS8F3.setVisible(true);
			pnlHS8F4.setVisible(true);
			pnlHS8F5.setVisible(true);
			break;
			
		}
		
		switch (iHS9) {
		
		case 0: 
			pnlHS9F1.setVisible(false);
			pnlHS9F2.setVisible(false);
			pnlHS9F3.setVisible(false);
			pnlHS9F4.setVisible(false);
			pnlHS9F5.setVisible(false);
			break;
			
		case 1:
			pnlHS9F1.setVisible(true);
			pnlHS9F2.setVisible(false);
			pnlHS9F3.setVisible(false);
			pnlHS9F4.setVisible(false);
			pnlHS9F5.setVisible(false);
			break;
			
		case 2:
			pnlHS9F1.setVisible(true);
			pnlHS9F2.setVisible(true);
			pnlHS9F3.setVisible(false);
			pnlHS9F4.setVisible(false);
			pnlHS9F5.setVisible(false);
			break;
			
		case 3:
			pnlHS9F1.setVisible(true);
			pnlHS9F2.setVisible(true);
			pnlHS9F3.setVisible(true);
			pnlHS9F4.setVisible(false);
			pnlHS9F5.setVisible(false);
			break;
		case 4:
			pnlHS9F1.setVisible(true);
			pnlHS9F2.setVisible(true);
			pnlHS9F3.setVisible(true);
			pnlHS9F4.setVisible(true);
			pnlHS9F5.setVisible(false);
			break;
			
		case 5:
			pnlHS9F1.setVisible(true);
			pnlHS9F2.setVisible(true);
			pnlHS9F3.setVisible(true);
			pnlHS9F4.setVisible(true);
			pnlHS9F5.setVisible(true);
	
			if (iL == 0) {
				
				JOptionPane.showMessageDialog(null, "Der Spieler mit der Trikotnummer " + HS9 + " ist fï¿½r den Rest des Spiels gesperrt", "Spielersperrung", JOptionPane.WARNING_MESSAGE);
				
			} else if (iL == 1) {
				
				JOptionPane.showMessageDialog(null, "The player with jersey number " + HS9 + " is blocked for the rest of the Game", "Player Ban", JOptionPane.WARNING_MESSAGE);
				
			}
			
			tfHS9.setBackground(Color.red);
			break;
			
		case 6:
			pnlHS9F1.setVisible(true);
			pnlHS9F2.setVisible(true);
			pnlHS9F3.setVisible(true);
			pnlHS9F4.setVisible(true);
			pnlHS9F5.setVisible(true);
			break;
			
		}
		
		switch (iHS10) {
		
		case 0: 
			pnlHS10F1.setVisible(false);
			pnlHS10F2.setVisible(false);
			pnlHS10F3.setVisible(false);
			pnlHS10F4.setVisible(false);
			pnlHS10F5.setVisible(false);
			break;
			
		case 1:
			pnlHS4F1.setVisible(true);
			pnlHS10F2.setVisible(false);
			pnlHS10F3.setVisible(false);
			pnlHS10F4.setVisible(false);
			pnlHS10F5.setVisible(false);
			break;
			
		case 2:
			pnlHS4F1.setVisible(true);
			pnlHS10F2.setVisible(true);
			pnlHS10F3.setVisible(false);
			pnlHS10F4.setVisible(false);
			pnlHS10F5.setVisible(false);
			break;
			
		case 3:
			pnlHS10F1.setVisible(true);
			pnlHS10F2.setVisible(true);
			pnlHS10F3.setVisible(true);
			pnlHS10F4.setVisible(false);
			pnlHS10F5.setVisible(false);
			break;
			
		case 4:
			pnlHS10F1.setVisible(true);
			pnlHS10F2.setVisible(true);
			pnlHS10F3.setVisible(true);
			pnlHS10F4.setVisible(true);
			pnlHS10F5.setVisible(false);
			break;
			
		case 5:
			pnlHS10F1.setVisible(true);
			pnlHS10F2.setVisible(true);
			pnlHS10F3.setVisible(true);
			pnlHS10F4.setVisible(true);
			pnlHS10F5.setVisible(true);
			
			if (iL == 0) {
				
				JOptionPane.showMessageDialog(null, "Der Spieler mit der Trikotnummer " + HS10 + " ist fï¿½r den Rest des Spiels gesperrt", "Spielersperrung", JOptionPane.WARNING_MESSAGE);
				
			} else if (iL == 1) {
				
				JOptionPane.showMessageDialog(null, "The player with jersey number " + HS10 + " is blocked for the rest of the Game", "Player Ban", JOptionPane.WARNING_MESSAGE);
				
			}
			
			tfHS10.setBackground(Color.red);
			break;
			
		case 6:
			pnlHS10F1.setVisible(true);
			pnlHS10F2.setVisible(true);
			pnlHS10F3.setVisible(true);
			pnlHS10F4.setVisible(true);
			pnlHS10F5.setVisible(true);
			break;
			
		}
		
		
		switch (iHS11) {
		
		case 0: 
			pnlHS11F1.setVisible(false);
			pnlHS11F2.setVisible(false);
			pnlHS11F3.setVisible(false);
			pnlHS11F4.setVisible(false);
			pnlHS11F5.setVisible(false);
			break;
			
		case 1:
			pnlHS11F1.setVisible(true);
			pnlHS11F2.setVisible(false);
			pnlHS11F3.setVisible(false);
			pnlHS11F4.setVisible(false);
			pnlHS11F5.setVisible(false);
			break;
			
		case 2:
			pnlHS11F1.setVisible(true);
			pnlHS11F2.setVisible(true);
			pnlHS11F3.setVisible(false);
			pnlHS11F4.setVisible(false);
			pnlHS11F5.setVisible(false);
			break;
			
		case 3:
			pnlHS11F1.setVisible(true);
			pnlHS11F2.setVisible(true);
			pnlHS11F3.setVisible(true);
			pnlHS11F4.setVisible(false);
			pnlHS11F5.setVisible(false);
			break;
			
		case 4:
			pnlHS11F1.setVisible(true);
			pnlHS11F2.setVisible(true);
			pnlHS11F3.setVisible(true);
			pnlHS11F4.setVisible(true);
			pnlHS11F5.setVisible(false);
			break;
			
		case 5:
			pnlHS11F1.setVisible(true);
			pnlHS11F2.setVisible(true);
			pnlHS11F3.setVisible(true);
			pnlHS11F4.setVisible(true);
			pnlHS11F5.setVisible(true);
			
			if (iL == 0) {
				
				JOptionPane.showMessageDialog(null, "Der Spieler mit der Trikotnummer " + HS11 + " ist fï¿½r den Rest des Spiels gesperrt", "Spielersperrung", JOptionPane.WARNING_MESSAGE);
				
			} else if (iL == 1) {
				
				JOptionPane.showMessageDialog(null, "The player with jersey number " + HS11 + " is blocked for the rest of the Game", "Player Ban", JOptionPane.WARNING_MESSAGE);
				
			}
			
			tfHS11.setBackground(Color.red);
			break;
			
		case 6:
			pnlHS11F1.setVisible(true);
			pnlHS11F2.setVisible(true);
			pnlHS11F3.setVisible(true);
			pnlHS11F4.setVisible(true);
			pnlHS11F5.setVisible(true);
			break;
			
		}
		
		switch (iHS12) {
		
		case 0: 
			pnlHS12F1.setVisible(false);
			pnlHS12F2.setVisible(false);
			pnlHS12F3.setVisible(false);
			pnlHS12F4.setVisible(false);
			pnlHS12F5.setVisible(false);
			break;
			
		case 1:
			pnlHS12F1.setVisible(true);
			pnlHS12F2.setVisible(false);
			pnlHS12F3.setVisible(false);
			pnlHS12F4.setVisible(false);
			pnlHS12F5.setVisible(false);
			break;
			
		case 2:
			pnlHS12F1.setVisible(true);
			pnlHS12F2.setVisible(true);
			pnlHS12F3.setVisible(false);
			pnlHS12F4.setVisible(false);
			pnlHS12F5.setVisible(false);
			break;
			
		case 3:
			pnlHS12F1.setVisible(true);
			pnlHS12F2.setVisible(true);
			pnlHS12F3.setVisible(true);
			pnlHS12F4.setVisible(false);
			pnlHS12F5.setVisible(false);
			break;
			
		case 4:
			pnlHS12F1.setVisible(true);
			pnlHS12F2.setVisible(true);
			pnlHS12F3.setVisible(true);
			pnlHS12F4.setVisible(true);
			pnlHS12F5.setVisible(false);
			break;
			
		case 5:
			pnlHS12F1.setVisible(true);
			pnlHS12F2.setVisible(true);
			pnlHS12F3.setVisible(true);
			pnlHS12F4.setVisible(true);
			pnlHS12F5.setVisible(true);
	
			if (iL == 0) {
				
				JOptionPane.showMessageDialog(null, "Der Spieler mit der Trikotnummer " + HS12 + " ist fï¿½r den Rest des Spiels gesperrt", "Spielersperrung", JOptionPane.WARNING_MESSAGE);
				
			} else if (iL == 1) {
				
				JOptionPane.showMessageDialog(null, "The player with jersey number " + HS12 + " is blocked for the rest of the Game", "Player Ban", JOptionPane.WARNING_MESSAGE);
				
			}
			
			tfHS12.setBackground(Color.red);
			break;
			
		case 6:
			pnlHS12F1.setVisible(true);
			pnlHS12F2.setVisible(true);
			pnlHS12F3.setVisible(true);
			pnlHS12F4.setVisible(true);
			pnlHS12F5.setVisible(true);
			break;
			
		}
		
	}
	
	public void FoulGNr(int n) {
		
		int GS1 = Integer.parseInt(tfGS1.getText());
		int GS2 = Integer.parseInt(tfGS2.getText());
		int GS3 = Integer.parseInt(tfGS3.getText());
		int GS4 = Integer.parseInt(tfGS4.getText());
		int GS5 = Integer.parseInt(tfGS5.getText());
		int GS6 = Integer.parseInt(tfGS6.getText());
		int GS7 = Integer.parseInt(tfGS7.getText());
		int GS8 = Integer.parseInt(tfGS8.getText());
		int GS9 = Integer.parseInt(tfGS9.getText());
		int GS10 = Integer.parseInt(tfGS10.getText());
		int GS11 = Integer.parseInt(tfGS11.getText());
		int GS12 = Integer.parseInt(tfGS12.getText());
	
		if (n == GS1) {
			
			iGS1++;
			
		} else if (n == GS2) {
			
			iGS2++;
			
		} else if (n == GS3) {
			
			iGS3++;
			
		} else if (n == GS4) {
			
			iGS4++;
			
		} else if (n == GS5) {
			
			iGS5++;
			
		} else if (n == GS6) {
			
			iGS6++;
			
		} else if (n == GS7) {
			
			iGS7++;
			
		} else if (n == GS8) {
			
			iGS8++;
			
		} else if (n == GS9) {
			
			iGS9++;
			
		} else if (n == GS10) {
			
			iGS10++;
			
		} else if (n == GS11) {
	
			iGS11++;
	
		} else if (n == GS12) {
	
			iGS12++;
	
		} else {
			
			if (iL == 0) {
				
				JOptionPane.showMessageDialog(null, "Diese Trikotnummer ist nicht vorhanden bei Team Heim", "", JOptionPane.ERROR_MESSAGE);
				
			} else if (iL == 1) {
				
				JOptionPane.showMessageDialog(null, "This jersey number is not available on Team Home", "", JOptionPane.ERROR_MESSAGE);
				
			}
			
		}
		
		
		switch (iGS1) {
		
		case 0: 
			pnlGS1F1.setVisible(false);
			pnlGS1F2.setVisible(false);
			pnlGS1F3.setVisible(false);
			pnlGS1F4.setVisible(false);
			pnlGS1F5.setVisible(false);
			break;
			
		case 1:
			pnlGS1F1.setVisible(true);
			pnlGS1F2.setVisible(false);
			pnlGS1F3.setVisible(false);
			pnlGS1F4.setVisible(false);
			pnlGS1F5.setVisible(false);
			break;
			
		case 2:
			pnlGS1F1.setVisible(true);
			pnlGS1F2.setVisible(true);
			pnlGS1F3.setVisible(false);
			pnlGS1F4.setVisible(false);
			pnlGS1F5.setVisible(false);
			break;
			
		case 3:
			pnlGS1F1.setVisible(true);
			pnlGS1F2.setVisible(true);
			pnlGS1F3.setVisible(true);
			pnlGS1F4.setVisible(false);
			pnlGS1F5.setVisible(false);
			break;
			
		case 4:
			pnlGS1F1.setVisible(true);
			pnlGS1F2.setVisible(true);
			pnlGS1F3.setVisible(true);
			pnlGS1F4.setVisible(true);
			pnlGS1F5.setVisible(false);
			break;
			
		case 5:
			pnlGS1F1.setVisible(true);
			pnlGS1F2.setVisible(true);
			pnlGS1F3.setVisible(true);
			pnlGS1F4.setVisible(true);
			pnlGS1F5.setVisible(true);
			
			if (iL == 0) {
				
				JOptionPane.showMessageDialog(null, "Der Spieler mit der Trikotnummer " + GS1 + " ist fï¿½r den Rest des Spiels gesperrt", "Spielersperrung", JOptionPane.WARNING_MESSAGE);
				
			} else if (iL == 1) {
				
				JOptionPane.showMessageDialog(null, "The player with jersey number " + GS1 + " is blocked for the rest of the Game", "Player Ban", JOptionPane.WARNING_MESSAGE);
				
			}
			
			tfGS1.setBackground(Color.red);
			break;
			
		case 6:
			pnlGS1F1.setVisible(true);
			pnlGS1F2.setVisible(true);
			pnlGS1F3.setVisible(true);
			pnlGS1F4.setVisible(true);
			pnlGS1F5.setVisible(true);
			break;
			
		}
		
		
		switch (iGS2) {
		
		case 0: 
			pnlGS2F1.setVisible(false);
			pnlGS2F2.setVisible(false);
			pnlGS2F3.setVisible(false);
			pnlGS2F4.setVisible(false);
			pnlGS2F5.setVisible(false);
			break;
			
		case 1:
			pnlGS2F1.setVisible(true);
			pnlGS2F2.setVisible(false);
			pnlGS2F3.setVisible(false);
			pnlGS2F4.setVisible(false);
			pnlGS2F5.setVisible(false);
			break;
			
		case 2:
			pnlGS2F1.setVisible(true);
			pnlGS2F2.setVisible(true);
			pnlGS2F3.setVisible(false);
			pnlGS2F4.setVisible(false);
			pnlGS2F5.setVisible(false);
			break;
			
		case 3:
			pnlGS2F1.setVisible(true);
			pnlGS2F2.setVisible(true);
			pnlGS2F3.setVisible(true);
			pnlGS2F4.setVisible(false);
			pnlGS2F5.setVisible(false);
			break;
			
		case 4:
			pnlGS2F1.setVisible(true);
			pnlGS2F2.setVisible(true);
			pnlGS2F3.setVisible(true);
			pnlGS2F4.setVisible(true);
			pnlGS2F5.setVisible(false);
			break;
			
		case 5:
			pnlGS2F1.setVisible(true);
			pnlGS2F2.setVisible(true);
			pnlGS2F3.setVisible(true);
			pnlGS2F4.setVisible(true);
			pnlGS2F5.setVisible(true);
			
			if (iL == 0) {
				
				JOptionPane.showMessageDialog(null, "Der Spieler mit der Trikotnummer " + GS2 + " ist fï¿½r den Rest des Spiels gesperrt", "Spielersperrung", JOptionPane.WARNING_MESSAGE);
				
			} else if (iL == 1) {
				
				JOptionPane.showMessageDialog(null, "The player with jersey number " + GS2 + " is blocked for the rest of the Game", "Player Ban", JOptionPane.WARNING_MESSAGE);
				
			}
			
			tfGS2.setBackground(Color.red);
			break;
			
		case 6:
			pnlGS2F1.setVisible(true);
			pnlGS2F2.setVisible(true);
			pnlGS2F3.setVisible(true);
			pnlGS2F4.setVisible(true);
			pnlGS2F5.setVisible(true);
			break;
			
		}
		
		switch (iGS3) {
		
		case 0: 
			pnlGS3F1.setVisible(false);
			pnlGS3F2.setVisible(false);
			pnlGS3F3.setVisible(false);
			pnlGS3F3.setVisible(false);
			pnlGS3F5.setVisible(false);
			break;
			
		case 1:
			pnlGS3F1.setVisible(true);
			pnlGS3F2.setVisible(false);
			pnlGS3F3.setVisible(false);
			pnlGS3F4.setVisible(false);
			pnlGS3F5.setVisible(false);
			break;
			
		case 2:
			pnlGS3F1.setVisible(true);
			pnlGS3F2.setVisible(true);
			pnlGS3F3.setVisible(false);
			pnlGS3F4.setVisible(false);
			pnlGS3F5.setVisible(false);
			break;
			
		case 3:
			pnlGS3F1.setVisible(true);
			pnlGS3F2.setVisible(true);
			pnlGS3F3.setVisible(true);
			pnlGS3F4.setVisible(false);
			pnlGS3F5.setVisible(false);
			break;
		case 4:
			pnlGS3F1.setVisible(true);
			pnlGS3F2.setVisible(true);
			pnlGS3F3.setVisible(true);
			pnlGS3F4.setVisible(true);
			pnlGS3F5.setVisible(false);
			break;
			
		case 5:
			pnlGS3F1.setVisible(true);
			pnlGS3F2.setVisible(true);
			pnlGS3F3.setVisible(true);
			pnlGS3F4.setVisible(true);
			pnlGS3F5.setVisible(true);
	
			if (iL == 0) {
				
				JOptionPane.showMessageDialog(null, "Der Spieler mit der Trikotnummer " + GS3 + " ist fï¿½r den Rest des Spiels gesperrt", "Spielersperrung", JOptionPane.WARNING_MESSAGE);
				
			} else if (iL == 1) {
				
				JOptionPane.showMessageDialog(null, "The player with jersey number " + GS3 + " is blocked for the rest of the Game", "Player Ban", JOptionPane.WARNING_MESSAGE);
				
			}
			
			tfGS3.setBackground(Color.red);
			break;
			
		case 6:
			pnlGS3F1.setVisible(true);
			pnlGS3F2.setVisible(true);
			pnlGS3F3.setVisible(true);
			pnlGS3F3.setVisible(true);
			pnlGS3F5.setVisible(true);
			break;
			
		}
		
		switch (iGS4) {
		
		case 0: 
			pnlGS4F1.setVisible(false);
			pnlGS4F2.setVisible(false);
			pnlGS4F3.setVisible(false);
			pnlGS4F4.setVisible(false);
			pnlGS4F5.setVisible(false);
			break;
			
		case 1:
			pnlGS4F1.setVisible(true);
			pnlGS4F2.setVisible(false);
			pnlGS4F3.setVisible(false);
			pnlGS4F4.setVisible(false);
			pnlGS4F5.setVisible(false);
			break;
			
		case 2:
			pnlGS4F1.setVisible(true);
			pnlGS4F2.setVisible(true);
			pnlGS4F3.setVisible(false);
			pnlGS4F4.setVisible(false);
			pnlGS4F5.setVisible(false);
			break;
			
		case 3:
			pnlGS4F1.setVisible(true);
			pnlGS4F2.setVisible(true);
			pnlGS4F3.setVisible(true);
			pnlGS4F4.setVisible(false);
			pnlGS4F5.setVisible(false);
			break;
			
		case 4:
			pnlGS4F1.setVisible(true);
			pnlGS4F2.setVisible(true);
			pnlGS4F3.setVisible(true);
			pnlGS4F4.setVisible(true);
			pnlGS4F5.setVisible(false);
			break;
			
		case 5:
			pnlGS4F1.setVisible(true);
			pnlGS4F2.setVisible(true);
			pnlGS4F3.setVisible(true);
			pnlGS4F4.setVisible(true);
			pnlGS4F5.setVisible(true);
			
			if (iL == 0) {
				
				JOptionPane.showMessageDialog(null, "Der Spieler mit der Trikotnummer " + GS4 + " ist fï¿½r den Rest des Spiels gesperrt", "Spielersperrung", JOptionPane.WARNING_MESSAGE);
				
			} else if (iL == 1) {
				
				JOptionPane.showMessageDialog(null, "The player with jersey number " + GS4 + " is blocked for the rest of the Game", "Player Ban", JOptionPane.WARNING_MESSAGE);
				
			}
			
			tfGS4.setBackground(Color.red);
			break;
			
		case 6:
			pnlGS4F1.setVisible(true);
			pnlGS4F2.setVisible(true);
			pnlGS4F3.setVisible(true);
			pnlGS4F4.setVisible(true);
			pnlGS4F5.setVisible(true);
			break;
			
		}
		
		
		switch (iGS5) {
		
		case 0: 
			pnlGS5F1.setVisible(false);
			pnlGS5F2.setVisible(false);
			pnlGS5F3.setVisible(false);
			pnlGS5F4.setVisible(false);
			pnlGS5F5.setVisible(false);
			break;
			
		case 1:
			pnlGS5F1.setVisible(true);
			pnlGS5F2.setVisible(false);
			pnlGS5F3.setVisible(false);
			pnlGS5F4.setVisible(false);
			pnlGS5F5.setVisible(false);
			break;
			
		case 2:
			pnlGS5F1.setVisible(true);
			pnlGS2F2.setVisible(true);
			pnlGS2F3.setVisible(false);
			pnlGS2F4.setVisible(false);
			pnlGS2F5.setVisible(false);
			break;
			
		case 3:
			pnlGS5F1.setVisible(true);
			pnlGS5F2.setVisible(true);
			pnlGS5F3.setVisible(true);
			pnlGS5F4.setVisible(false);
			pnlGS5F5.setVisible(false);
			break;
			
		case 4:
			pnlGS5F1.setVisible(true);
			pnlGS5F2.setVisible(true);
			pnlGS5F3.setVisible(true);
			pnlGS5F4.setVisible(true);
			pnlGS5F5.setVisible(false);
			break;
			
		case 5:
			pnlGS5F1.setVisible(true);
			pnlGS5F2.setVisible(true);
			pnlGS5F3.setVisible(true);
			pnlGS5F4.setVisible(true);
			pnlGS5F5.setVisible(true);
			
			if (iL == 0) {
				
				JOptionPane.showMessageDialog(null, "Der Spieler mit der Trikotnummer " + GS5 + " ist fï¿½r den Rest des Spiels gesperrt", "Spielersperrung", JOptionPane.WARNING_MESSAGE);
				
			} else if (iL == 1) {
				
				JOptionPane.showMessageDialog(null, "The player with jersey number " + GS5 + " is blocked for the rest of the Game", "Player Ban", JOptionPane.WARNING_MESSAGE);
				
			}
			
			tfGS5.setBackground(Color.red);
			break;
			
		case 6:
			pnlGS5F1.setVisible(true);
			pnlGS5F2.setVisible(true);
			pnlGS5F3.setVisible(true);
			pnlGS5F4.setVisible(true);
			pnlGS5F5.setVisible(true);
			break;
			
		}
		
		switch (iGS6) {
		
		case 0: 
			pnlGS6F1.setVisible(false);
			pnlGS6F2.setVisible(false);
			pnlGS6F3.setVisible(false);
			pnlGS6F4.setVisible(false);
			pnlGS6F5.setVisible(false);
			break;
			
		case 1:
			pnlGS6F1.setVisible(true);
			pnlGS6F2.setVisible(false);
			pnlGS6F3.setVisible(false);
			pnlGS6F4.setVisible(false);
			pnlGS6F5.setVisible(false);
			break;
			
		case 2:
			pnlGS6F1.setVisible(true);
			pnlGS6F2.setVisible(true);
			pnlGS6F3.setVisible(false);
			pnlGS6F4.setVisible(false);
			pnlGS6F5.setVisible(false);
			break;
			
		case 3:
			pnlGS6F1.setVisible(true);
			pnlGS6F2.setVisible(true);
			pnlGS6F3.setVisible(true);
			pnlGS6F4.setVisible(false);
			pnlGS6F5.setVisible(false);
			break;
			
		case 4:
			pnlGS6F1.setVisible(true);
			pnlGS6F2.setVisible(true);
			pnlGS6F3.setVisible(true);
			pnlGS6F4.setVisible(true);
			pnlGS6F5.setVisible(false);
			break;
			
		case 5:
			pnlGS6F1.setVisible(true);
			pnlGS6F2.setVisible(true);
			pnlGS6F3.setVisible(true);
			pnlGS6F4.setVisible(true);
			pnlGS6F5.setVisible(true);
	
			if (iL == 0) {
				
				JOptionPane.showMessageDialog(null, "Der Spieler mit der Trikotnummer " + GS6 + " ist fï¿½r den Rest des Spiels gesperrt", "Spielersperrung", JOptionPane.WARNING_MESSAGE);
				
			} else if (iL == 1) {
				
				JOptionPane.showMessageDialog(null, "The player with jersey number " + GS6 + " is blocked for the rest of the Game", "Player Ban", JOptionPane.WARNING_MESSAGE);
				
			}
			
			tfGS6.setBackground(Color.red);
			break;
			
		case 6:
			pnlGS6F1.setVisible(true);
			pnlGS6F2.setVisible(true);
			pnlGS6F3.setVisible(true);
			pnlGS6F4.setVisible(true);
			pnlGS6F5.setVisible(true);
			break;
			
		}
		
		switch (iGS7) {
		
		case 0: 
			pnlGS7F1.setVisible(false);
			pnlGS7F2.setVisible(false);
			pnlGS7F3.setVisible(false);
			pnlGS7F4.setVisible(false);
			pnlGS7F5.setVisible(false);
			break;
			
		case 1:
			pnlGS7F1.setVisible(true);
			pnlGS7F2.setVisible(false);
			pnlGS7F3.setVisible(false);
			pnlGS7F4.setVisible(false);
			pnlGS7F5.setVisible(false);
			break;
			
		case 2:
			pnlGS7F1.setVisible(true);
			pnlGS7F2.setVisible(true);
			pnlGS7F3.setVisible(false);
			pnlGS7F4.setVisible(false);
			pnlGS7F5.setVisible(false);
			break;
			
		case 3:
			pnlGS7F1.setVisible(true);
			pnlGS7F2.setVisible(true);
			pnlGS7F3.setVisible(true);
			pnlGS7F4.setVisible(false);
			pnlGS7F5.setVisible(false);
			break;
			
		case 4:
			pnlGS7F1.setVisible(true);
			pnlGS7F2.setVisible(true);
			pnlGS7F3.setVisible(true);
			pnlGS7F4.setVisible(true);
			pnlGS7F5.setVisible(false);
			break;
			
		case 5:
			pnlGS7F1.setVisible(true);
			pnlGS7F2.setVisible(true);
			pnlGS7F3.setVisible(true);
			pnlGS7F4.setVisible(true);
			pnlGS7F5.setVisible(true);
			
			if (iL == 0) {
				
				JOptionPane.showMessageDialog(null, "Der Spieler mit der Trikotnummer " + GS7 + " ist fï¿½r den Rest des Spiels gesperrt", "Spielersperrung", JOptionPane.WARNING_MESSAGE);
				
			} else if (iL == 1) {
				
				JOptionPane.showMessageDialog(null, "The player with jersey number " + GS7 + " is blocked for the rest of the Game", "Player Ban", JOptionPane.WARNING_MESSAGE);
				
			}
			
			tfGS7.setBackground(Color.red);
			break;
			
		case 6:
			pnlGS7F1.setVisible(true);
			pnlGS7F2.setVisible(true);
			pnlGS7F3.setVisible(true);
			pnlGS7F4.setVisible(true);
			pnlGS7F5.setVisible(true);
			break;
			
		}
		
		
		switch (iGS8) {
		
		case 0: 
			pnlGS8F1.setVisible(false);
			pnlGS8F2.setVisible(false);
			pnlGS8F3.setVisible(false);
			pnlGS8F4.setVisible(false);
			pnlGS8F5.setVisible(false);
			break;
			
		case 1:
			pnlGS8F1.setVisible(true);
			pnlGS8F2.setVisible(false);
			pnlGS8F3.setVisible(false);
			pnlGS8F4.setVisible(false);
			pnlGS8F5.setVisible(false);
			break;
			
		case 2:
			pnlGS8F1.setVisible(true);
			pnlGS8F2.setVisible(true);
			pnlGS8F3.setVisible(false);
			pnlGS8F4.setVisible(false);
			pnlGS8F5.setVisible(false);
			break;
			
		case 3:
			pnlGS8F1.setVisible(true);
			pnlGS8F2.setVisible(true);
			pnlGS8F3.setVisible(true);
			pnlGS8F4.setVisible(false);
			pnlGS8F5.setVisible(false);
			break;
			
		case 4:
			pnlGS8F1.setVisible(true);
			pnlGS8F2.setVisible(true);
			pnlGS8F3.setVisible(true);
			pnlGS8F4.setVisible(true);
			pnlGS8F5.setVisible(false);
			break;
			
		case 5:
			pnlGS8F1.setVisible(true);
			pnlGS8F2.setVisible(true);
			pnlGS8F3.setVisible(true);
			pnlGS8F4.setVisible(true);
			pnlGS8F5.setVisible(true);
			
			if (iL == 0) {
				
				JOptionPane.showMessageDialog(null, "Der Spieler mit der Trikotnummer " + GS8 + " ist fï¿½r den Rest des Spiels gesperrt", "Spielersperrung", JOptionPane.WARNING_MESSAGE);
				
			} else if (iL == 1) {
				
				JOptionPane.showMessageDialog(null, "The player with jersey number " + GS8 + " is blocked for the rest of the Game", "Player Ban", JOptionPane.WARNING_MESSAGE);
				
			}
			
			tfGS8.setBackground(Color.red);
			break;
			
		case 6:
			pnlGS8F1.setVisible(true);
			pnlGS8F2.setVisible(true);
			pnlGS8F3.setVisible(true);
			pnlGS8F4.setVisible(true);
			pnlGS8F5.setVisible(true);
			break;
			
		}
		
		switch (iGS9) {
		
		case 0: 
			pnlGS9F1.setVisible(false);
			pnlGS9F2.setVisible(false);
			pnlGS9F3.setVisible(false);
			pnlGS9F4.setVisible(false);
			pnlGS9F5.setVisible(false);
			break;
			
		case 1:
			pnlGS9F1.setVisible(true);
			pnlGS9F2.setVisible(false);
			pnlGS9F3.setVisible(false);
			pnlGS9F4.setVisible(false);
			pnlGS9F5.setVisible(false);
			break;
			
		case 2:
			pnlGS9F1.setVisible(true);
			pnlGS9F2.setVisible(true);
			pnlGS9F3.setVisible(false);
			pnlGS9F4.setVisible(false);
			pnlGS9F5.setVisible(false);
			break;
			
		case 3:
			pnlGS9F1.setVisible(true);
			pnlGS9F2.setVisible(true);
			pnlGS9F3.setVisible(true);
			pnlGS9F4.setVisible(false);
			pnlGS9F5.setVisible(false);
			break;
		case 4:
			pnlGS9F1.setVisible(true);
			pnlGS9F2.setVisible(true);
			pnlGS9F3.setVisible(true);
			pnlGS9F4.setVisible(true);
			pnlGS9F5.setVisible(false);
			break;
			
		case 5:
			pnlGS9F1.setVisible(true);
			pnlGS9F2.setVisible(true);
			pnlGS9F3.setVisible(true);
			pnlGS9F4.setVisible(true);
			pnlGS9F5.setVisible(true);
	
			if (iL == 0) {
				
				JOptionPane.showMessageDialog(null, "Der Spieler mit der Trikotnummer " + GS9 + " ist fï¿½r den Rest des Spiels gesperrt", "Spielersperrung", JOptionPane.WARNING_MESSAGE);
				
			} else if (iL == 1) {
				
				JOptionPane.showMessageDialog(null, "The player with jersey number " + GS9 + " is blocked for the rest of the Game", "Player Ban", JOptionPane.WARNING_MESSAGE);
				
			}
			
			tfGS9.setBackground(Color.red);
			break;
			
		case 6:
			pnlGS9F1.setVisible(true);
			pnlGS9F2.setVisible(true);
			pnlGS9F3.setVisible(true);
			pnlGS9F4.setVisible(true);
			pnlGS9F5.setVisible(true);
			break;
			
		}
		
		switch (iGS10) {
		
		case 0: 
			pnlGS10F1.setVisible(false);
			pnlGS10F2.setVisible(false);
			pnlGS10F3.setVisible(false);
			pnlGS10F4.setVisible(false);
			pnlGS10F5.setVisible(false);
			break;
			
		case 1:
			pnlGS4F1.setVisible(true);
			pnlGS10F2.setVisible(false);
			pnlGS10F3.setVisible(false);
			pnlGS10F4.setVisible(false);
			pnlGS10F5.setVisible(false);
			break;
			
		case 2:
			pnlGS4F1.setVisible(true);
			pnlGS10F2.setVisible(true);
			pnlGS10F3.setVisible(false);
			pnlGS10F4.setVisible(false);
			pnlGS10F5.setVisible(false);
			break;
			
		case 3:
			pnlGS10F1.setVisible(true);
			pnlGS10F2.setVisible(true);
			pnlGS10F3.setVisible(true);
			pnlGS10F4.setVisible(false);
			pnlGS10F5.setVisible(false);
			break;
			
		case 4:
			pnlGS10F1.setVisible(true);
			pnlGS10F2.setVisible(true);
			pnlGS10F3.setVisible(true);
			pnlGS10F4.setVisible(true);
			pnlGS10F5.setVisible(false);
			break;
			
		case 5:
			pnlGS10F1.setVisible(true);
			pnlGS10F2.setVisible(true);
			pnlGS10F3.setVisible(true);
			pnlGS10F4.setVisible(true);
			pnlGS10F5.setVisible(true);
			
			if (iL == 0) {
				
				JOptionPane.showMessageDialog(null, "Der Spieler mit der Trikotnummer " + GS10 + " ist fï¿½r den Rest des Spiels gesperrt", "Spielersperrung", JOptionPane.WARNING_MESSAGE);
				
			} else if (iL == 1) {
				
				JOptionPane.showMessageDialog(null, "The player with jersey number " + GS10 + " is blocked for the rest of the Game", "Player Ban", JOptionPane.WARNING_MESSAGE);
				
			}
			
			tfGS10.setBackground(Color.red);
			break;
			
		case 6:
			pnlGS10F1.setVisible(true);
			pnlGS10F2.setVisible(true);
			pnlGS10F3.setVisible(true);
			pnlGS10F4.setVisible(true);
			pnlGS10F5.setVisible(true);
			break;
			
		}
		
		
		switch (iGS11) {
		
		case 0: 
			pnlGS11F1.setVisible(false);
			pnlGS11F2.setVisible(false);
			pnlGS11F3.setVisible(false);
			pnlGS11F4.setVisible(false);
			pnlGS11F5.setVisible(false);
			break;
			
		case 1:
			pnlGS11F1.setVisible(true);
			pnlGS11F2.setVisible(false);
			pnlGS11F3.setVisible(false);
			pnlGS11F4.setVisible(false);
			pnlGS11F5.setVisible(false);
			break;
			
		case 2:
			pnlGS11F1.setVisible(true);
			pnlGS11F2.setVisible(true);
			pnlGS11F3.setVisible(false);
			pnlGS11F4.setVisible(false);
			pnlGS11F5.setVisible(false);
			break;
			
		case 3:
			pnlGS11F1.setVisible(true);
			pnlGS11F2.setVisible(true);
			pnlGS11F3.setVisible(true);
			pnlGS11F4.setVisible(false);
			pnlGS11F5.setVisible(false);
			break;
			
		case 4:
			pnlGS11F1.setVisible(true);
			pnlGS11F2.setVisible(true);
			pnlGS11F3.setVisible(true);
			pnlGS11F4.setVisible(true);
			pnlGS11F5.setVisible(false);
			break;
			
		case 5:
			pnlGS11F1.setVisible(true);
			pnlGS11F2.setVisible(true);
			pnlGS11F3.setVisible(true);
			pnlGS11F4.setVisible(true);
			pnlGS11F5.setVisible(true);
			
			if (iL == 0) {
				
				JOptionPane.showMessageDialog(null, "Der Spieler mit der Trikotnummer " + GS11 + " ist fï¿½r den Rest des Spiels gesperrt", "Spielersperrung", JOptionPane.WARNING_MESSAGE);
				
			} else if (iL == 1) {
				
				JOptionPane.showMessageDialog(null, "The player with jersey number " + GS11 + " is blocked for the rest of the Game", "Player Ban", JOptionPane.WARNING_MESSAGE);
				
			}
			
			tfGS11.setBackground(Color.red);
			break;
			
		case 6:
			pnlGS11F1.setVisible(true);
			pnlGS11F2.setVisible(true);
			pnlGS11F3.setVisible(true);
			pnlGS11F4.setVisible(true);
			pnlGS11F5.setVisible(true);
			break;
			
		}
		
		switch (iGS12) {
		
		case 0: 
			pnlGS12F1.setVisible(false);
			pnlGS12F2.setVisible(false);
			pnlGS12F3.setVisible(false);
			pnlGS12F4.setVisible(false);
			pnlGS12F5.setVisible(false);
			break;
			
		case 1:
			pnlGS12F1.setVisible(true);
			pnlGS12F2.setVisible(false);
			pnlGS12F3.setVisible(false);
			pnlGS12F4.setVisible(false);
			pnlGS12F5.setVisible(false);
			break;
			
		case 2:
			pnlGS12F1.setVisible(true);
			pnlGS12F2.setVisible(true);
			pnlGS12F3.setVisible(false);
			pnlGS12F4.setVisible(false);
			pnlGS12F5.setVisible(false);
			break;
			
		case 3:
			pnlGS12F1.setVisible(true);
			pnlGS12F2.setVisible(true);
			pnlGS12F3.setVisible(true);
			pnlGS12F4.setVisible(false);
			pnlGS12F5.setVisible(false);
			break;
			
		case 4:
			pnlGS12F1.setVisible(true);
			pnlGS12F2.setVisible(true);
			pnlGS12F3.setVisible(true);
			pnlGS12F4.setVisible(true);
			pnlGS12F5.setVisible(false);
			break;
			
		case 5:
			pnlGS12F1.setVisible(true);
			pnlGS12F2.setVisible(true);
			pnlGS12F3.setVisible(true);
			pnlGS12F4.setVisible(true);
			pnlGS12F5.setVisible(true);
	
			if (iL == 0) {
				
				JOptionPane.showMessageDialog(null, "Der Spieler mit der Trikotnummer " + GS12 + " ist fï¿½r den Rest des Spiels gesperrt", "Spielersperrung", JOptionPane.WARNING_MESSAGE);
				
			} else if (iL == 1) {
				
				JOptionPane.showMessageDialog(null, "The player with jersey number " + GS12 + " is blocked for the rest of the Game", "Player Ban", JOptionPane.WARNING_MESSAGE);
				
			}
			
			tfGS12.setBackground(Color.red);
			break;
			
		case 6:
			pnlGS12F1.setVisible(true);
			pnlGS12F2.setVisible(true);
			pnlGS12F3.setVisible(true);
			pnlGS12F4.setVisible(true);
			pnlGS12F5.setVisible(true);
			break;
			
		}
		
	}
	
	public void AuszeitH(int i) {
		
		if (i == 0) {
			
			pnlAuszeitHeim1.setVisible(false);
			pnlAuszeitHeim2.setVisible(false);
			pnlAuszeitHeim3.setVisible(false);
			
		} else if (i == 1){
			
			pnlAuszeitHeim1.setVisible(true);
			pnlAuszeitHeim2.setVisible(false);
			pnlAuszeitHeim3.setVisible(false);

		} else if (i == 2){

			pnlAuszeitHeim1.setVisible(true);
			pnlAuszeitHeim2.setVisible(true);
			pnlAuszeitHeim3.setVisible(false);

		} else if (i == 3) {
			
			pnlAuszeitHeim1.setVisible(true);
			pnlAuszeitHeim2.setVisible(true);
			pnlAuszeitHeim3.setVisible(true);
			
		} else {
			
			if (iL == 0) {
			
				JOptionPane.showMessageDialog(null, "Keine Auszeiten mehr ï¿½brig.", "Auszeit", JOptionPane.ERROR_MESSAGE);
				
			} else if (iL == 1) {
				
				JOptionPane.showMessageDialog(null, "No more Timeouts available.", "Timeout", JOptionPane.ERROR_MESSAGE);
			}
			
			System.out.println(i);
			
		}
	}
	
	public void AuszeitG(int i) {
		
		if (i == 0) {
			
			pnlAuszeitGast1.setVisible(false);
			pnlAuszeitGast2.setVisible(false);
			pnlAuszeitGast3.setVisible(false);
		
		} else if (i == 1){
			
			pnlAuszeitGast1.setVisible(true);
			pnlAuszeitGast2.setVisible(false);
			pnlAuszeitGast3.setVisible(false);

		} else if (i == 2){
			
			pnlAuszeitGast1.setVisible(true);
			pnlAuszeitGast2.setVisible(true);
			pnlAuszeitGast3.setVisible(false);
			
		} else if (i == 3) {
			
			pnlAuszeitGast1.setVisible(true);
			pnlAuszeitGast2.setVisible(true);
			pnlAuszeitGast3.setVisible(true);
			
		} else {
			
			if (iL == 0) {
				
				JOptionPane.showMessageDialog(null, "Keine Auszeiten mehr ï¿½brig.", "Auszeit", JOptionPane.ERROR_MESSAGE);
				
			} else if (iL == 1) {
				
				JOptionPane.showMessageDialog(null, "No more Timeouts available.", "Timeout", JOptionPane.ERROR_MESSAGE);
			}
			
			System.out.println(i);
			
		}
	}
	
	public void Viertel (int i) {
		
		iH = 1;
		iG = 1;
		
		tfHeimFoul.setText("0");
		tfGastFoul.setText("0");
		
		
		if (i == 0) {
			
			pnlViertel1.setVisible(false);
			pnlViertel2.setVisible(false);
			pnlViertel3.setVisible(false);
			pnlViertel4.setVisible(false);
			
			
		} else if (i == 1) {
			
			pnlViertel1.setVisible(true);
			pnlViertel2.setVisible(false);
			pnlViertel3.setVisible(false);
			pnlViertel4.setVisible(false);

			
		} else if (i == 2) {
			
			pnlViertel1.setVisible(false);
			pnlViertel2.setVisible(true);
			pnlViertel3.setVisible(false);
			pnlViertel4.setVisible(false);
			
		} else if (i == 3) {
			
			pnlViertel1.setVisible(false);
			pnlViertel2.setVisible(false);
			pnlViertel3.setVisible(true);
			pnlViertel4.setVisible(false);
			
		} else if (i == 4) {
		
			pnlViertel1.setVisible(false);
			pnlViertel2.setVisible(false);
			pnlViertel3.setVisible(false);
			pnlViertel4.setVisible(true);

			
		} else {
			
			
		}
		
		
		
	}
	
	public void Shotclock() {
		
		try {
			
			while(running) {
				
				if (iT>0) {
					
					tfShotclock.setText(Integer.toString(iT));
					
					Thread.sleep(1000);
					
					iT--;
					
					} else if (iT == 0){
						
						tfShotclock.setText("0");
						
						Thread.sleep(300);
						tfShotclock.setBorder(new LineBorder(Color.RED));
						
						Thread.sleep(300);
						tfShotclock.setBorder(new LineBorder(Color.WHITE));
						
					}
				
				}
				
			} catch(Exception e) {
				
				
			}
		
		
	}
	
	public void Zeit () {
		
		try {
			
			while(running) {
				
				
					if (iZs>0) {
					
						if (iZs > 9) {
						
							tfZeit.setText(Integer.toString(iZm)+" : "+Integer.toString(iZs));
							iZs--;
							Thread.sleep(1000);
						
						} else {
						
							tfZeit.setText(Integer.toString(iZm)+" : 0"+Integer.toString(iZs));
							iZs--;
							Thread.sleep(1000);
						
							}
					
					} else if (iZs == 0 && iZm > 0) {
					
						Thread.sleep(1000);
						tfZeit.setText(Integer.toString(iZm)+" : "+Integer.toString(iZs));
						iZs = 59;
						iZm--;
							
				} else {
					
					
					Thread.sleep(1000);
					tfZeit.setBorder(new LineBorder(Color.RED));
					Thread.sleep(1000);
					tfZeit.setBorder(new LineBorder(Color.WHITE));
					
				}

				}
			
				} catch (Exception e) {

				}
		
		
	}
	
	public void Viertelblinken() {
		
		try {
			
			while(running) {
				
				if (iV == 1) {
					
					Thread.sleep(400);
					btnViertel.setBorder(new LineBorder(Color.GREEN));
					Thread.sleep(400);
					btnViertel.setBorder(new LineBorder(Color.WHITE));
					
					} else {
						
						btnViertel.setBorder(new LineBorder(Color.WHITE));
						
					}	
				
			}
			
			}catch(Exception e) {
				
			}
		
	}
	
	
	public void Tasten(int a) {
		
		switch (a) {
		
		case KeyEvent.VK_Q: btnHP1.doClick(); break;
		case KeyEvent.VK_W: btnHP2.doClick(); break;
		case KeyEvent.VK_E: btnHP3.doClick(); break;
		case KeyEvent.VK_A: btnHM1.doClick(); break;
		case KeyEvent.VK_S: btnHM2.doClick(); break;
		case KeyEvent.VK_D: btnHM3.doClick(); break;
		case KeyEvent.VK_U: btnGP1.doClick(); break;
		case KeyEvent.VK_I: btnGP2.doClick(); break;
		case KeyEvent.VK_O: btnGP3.doClick(); break;
		case KeyEvent.VK_J: btnGM1.doClick(); break;
		case KeyEvent.VK_K: btnGM2.doClick(); break;
		case KeyEvent.VK_L: btnGM3.doClick(); break;
		case KeyEvent.VK_1: btnHFoul.doClick(); break;
		case KeyEvent.VK_7: btnGFoul.doClick(); break;
		case KeyEvent.VK_2: btnHeimAuszeit.doClick(); break;
		case KeyEvent.VK_8: btnGastAuszeit.doClick(); break;
		case KeyEvent.VK_M : btnReset.doClick(); break;
		
		}
	}
	
	
	public void Englisch() {
		
		btnReset.setText("Reset");
		lblHeim.setText("Home");
		lblGast.setText("Away");
		btnHeimAuszeit.setText("Timeout");
		btnGastAuszeit.setText("Timeout");
		btnDeutsch.setText("German");
		btnEnglisch.setText("English");
		btnShotclockReset.setText("Reset Shotclock");
		btnHotkeys.setText("Toggle Keybindings");
		btnHeimAuszeit.setText("Timeout");
		btnGastAuszeit.setText("Timeout");
		btnHFoul.setText("Foul");
		btnGFoul.setText("Foul");	
		lblViertel.setText("Period");
		btnViertel.setText("Next Period");
		btnReset.setText("Reset");
		btnUhrStart.setText("Start Counter");
		btnUhrStopp.setText("Stop Counter");
		btnUhrreset.setText("Reset Clock");
		frame.setTitle("Scoreboard");
		
	}
	
	public void Deutsch() {
		
		btnReset.setText("Zurücksetzen");
		lblHeim.setText("Heim");
		lblGast.setText("Gast");
		btnHeimAuszeit.setText("Auszeit");
		btnGastAuszeit.setText("Auszeit");
		btnDeutsch.setText("Deutsch");
		btnEnglisch.setText("Englisch");
		btnShotclockReset.setText("Shotclock zurücksetzen");
		btnHotkeys.setText("Tastenbelegung anzeigen");
		btnHeimAuszeit.setText("Auszeit");
		btnGastAuszeit.setText("Auszeit");
		btnHFoul.setText("Foul");
		btnGFoul.setText("Foul");
		lblViertel.setText("Viertel");
		btnViertel.setText("Nächstes Viertel");
		btnReset.setText("Zurücksetzen");
		btnUhrStart.setText("Uhr start");
		btnUhrStopp.setText("Uhr stopp");
		btnUhrreset.setText("Uhr zurücksetzen");
		frame.setTitle("Punkteanzeige");
		
	}
	
	public void Hotkeysaus() {
		
		btnHP1.setText("+1");
		btnHP2.setText("+2");
		btnHP3.setText("+3");
		btnHM1.setText("-1");
		btnHM2.setText("-2");
		btnHM3.setText("-3");
		
		btnGP1.setText("+1");
		btnGP2.setText("+2");
		btnGP3.setText("+3");
		btnGM1.setText("-1");
		btnGM2.setText("-2");
		btnGM3.setText("-3");
		
		btnHFoul.setText("Foul");
		btnGFoul.setText("Foul");
		
		if (iL == 0) {
			
			btnHeimAuszeit.setText("Auszeit");
			btnGastAuszeit.setText("Auszeit");
			
		} else if (iL == 1) {
			
			btnHeimAuszeit.setText("Timeout");
			btnGastAuszeit.setText("Timeout");
			
		}
				
	}
	
	public void Hotkeysein() {
		
		btnHP1.setText("Q");
		btnHP2.setText("W");
		btnHP3.setText("E");
		btnHM1.setText("A");
		btnHM2.setText("S");
		btnHM3.setText("D");
		
		btnGP1.setText("U");
		btnGP2.setText("I");
		btnGP3.setText("O");
		btnGM1.setText("J");
		btnGM2.setText("K");
		btnGM3.setText("L");
		
		btnHFoul.setText("1");
		btnHeimAuszeit.setText("2");

		btnGFoul.setText("7");
		btnGastAuszeit.setText("8");
		
	}
}
