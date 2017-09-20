import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 572, 697);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		pingDevice p = new pingDevice();
		
		JTextArea textArea_PingResult = new JTextArea();
		textArea_PingResult.setBounds(10, 413, 536, 234);
		frame.getContentPane().add(textArea_PingResult);
		
		
		JButton btnStartPing = new JButton("Ping");
		btnStartPing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea_PingResult.append(pingDevice.runSystemCommand("wb-206-ipcp.fm-mgmt.weber.edu"));
			}
		});
		btnStartPing.setBounds(209, 367, 141, 35);
		frame.getContentPane().add(btnStartPing);
		
		JPanel panel = new JPanel();
		panel.setBounds(16, 11, 141, 330);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnLL = new JButton("Lind");
		btnLL.setBounds(10, 113, 121, 23);
		panel.add(btnLL);
		
		JButton btnBC = new JButton("Browning");
		btnBC.setBounds(10, 11, 121, 23);
		panel.add(btnBC);
		
		JButton btnEH = new JButton("Elizabeth");
		btnEH.setBounds(10, 45, 121, 23);
		panel.add(btnEH);
		
		JButton btnKA = new JButton("Kimball");
		btnKA.setBounds(10, 79, 121, 23);
		panel.add(btnKA);
		
		JButton btnTY = new JButton("Tracy");
		btnTY.setBounds(10, 147, 121, 23);
		panel.add(btnTY);
		
		//Building Buttons
		JButton btnWB = new JButton("Wattis");
		btnWB.setBounds(10, 181, 121, 23);
		panel.add(btnWB);
		
		JButton btnSU = new JButton("Union");
		btnSU.setBounds(10, 215, 121, 23);
		panel.add(btnSU);
		
		JButton btnLP = new JButton("Lampros");
		btnLP.setBounds(10, 249, 121, 23);
		panel.add(btnLP);
		
		JButton btnMA = new JButton("Miller");
		btnMA.setBounds(10, 285, 121, 23);
		panel.add(btnMA);
		
		textField = new JTextField();
		textField.setBounds(16, 367, 178, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		btnWB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				p.setBuilding("WB");
			}
		});
		btnWB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				p.setBuilding("EH");
			}
		});
		btnWB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				p.setBuilding("Kimball");
			}
		});
		btnWB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				p.setBuilding("TY");
			}
		});
		btnWB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				p.setBuilding("LL");
			}
		});
		
	}
}
