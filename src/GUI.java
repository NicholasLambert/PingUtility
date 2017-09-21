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
import java.awt.Color;

public class GUI {

	private JFrame frame;
	private JTextField textField_Hostname;

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
		frame.setBounds(100, 100, 508, 697);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		pingDevice p = new pingDevice();
		
		JTextArea textArea_PingResult = new JTextArea();
		textArea_PingResult.setBounds(10, 413, 472, 234);
		frame.getContentPane().add(textArea_PingResult);
		
		
		JButton btnStartPing = new JButton("Ping");
		btnStartPing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea_PingResult.append(pingDevice.runSystemCommand("wb-206-ipcp.fm-mgmt.weber.edu"));
			}
		});
		btnStartPing.setBounds(209, 367, 141, 35);
		frame.getContentPane().add(btnStartPing);
		
		/**************
		 * Room Buttons
		 **************/
		JPanel panelRooms = new JPanel();
		panelRooms.setBackground(Color.LIGHT_GRAY);
		panelRooms.setBounds(16, 11, 141, 318);
		frame.getContentPane().add(panelRooms);
		panelRooms.setLayout(null);
		
		JButton btnLL = new JButton("Lind");
		btnLL.setBounds(10, 113, 121, 23);
		panelRooms.add(btnLL);
		
		JButton btnBC = new JButton("Browning");
		btnBC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				p.setBuilding("BC");
			}
		});
		btnBC.setBounds(10, 11, 121, 23);
		panelRooms.add(btnBC);
		
		JButton btnEH = new JButton("Elizabeth");
		btnEH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				p.setBuilding("EH");
			}
		});
		btnEH.setBounds(10, 45, 121, 23);
		panelRooms.add(btnEH);
		
		JButton btnKA = new JButton("Kimball");
		btnKA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				p.setBuilding("KA");
			}
		});
		btnKA.setBounds(10, 79, 121, 23);
		panelRooms.add(btnKA);
		
		JButton btnTY = new JButton("Tracy");
		btnTY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				p.setBuilding("TY");
			}
		});
		btnTY.setBounds(10, 147, 121, 23);
		panelRooms.add(btnTY);
		
		//Building Buttons
		JButton btnWB = new JButton("Wattis");
		btnWB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				p.setBuilding("WB");
			}
		});
		btnWB.setBounds(10, 181, 121, 23);
		panelRooms.add(btnWB);
		
		JButton btnSU = new JButton("Union");
		btnSU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				p.setBuilding("SU");
			}
		});
		btnSU.setBounds(10, 215, 121, 23);
		panelRooms.add(btnSU);
		
		JButton btnLP = new JButton("Lampros");
		btnLP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				p.setBuilding("LP");
			}
		});
		btnLP.setBounds(10, 249, 121, 23);
		panelRooms.add(btnLP);
		
		JButton btnMA = new JButton("Miller");
		btnMA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				p.setBuilding("MA");
			}
		});
		btnMA.setBounds(10, 285, 121, 23);
		panelRooms.add(btnMA);
		
		
		
		
		/****************
		 * Number Buttons
		 ****************/
		JPanel panelNums = new JPanel();
		panelNums.setBackground(Color.LIGHT_GRAY);
		panelNums.setBounds(167, 11, 159, 211);
		frame.getContentPane().add(panelNums);
		panelNums.setLayout(null);
		
		JButton btnNum1 = new JButton("1");
		btnNum1.setBounds(10, 111, 39, 39);
		panelNums.add(btnNum1);
		
		JButton btnNum2 = new JButton("2");
		btnNum2.setBounds(59, 111, 39, 39);
		panelNums.add(btnNum2);
		
		JButton btnNum3 = new JButton("3");
		btnNum3.setBounds(108, 111, 39, 39);
		panelNums.add(btnNum3);
		
		JButton btnNum4 = new JButton("4");
		btnNum4.setBounds(10, 61, 39, 39);
		panelNums.add(btnNum4);
		
		JButton btnNum5 = new JButton("5");
		btnNum5.setBounds(59, 61, 39, 39);
		panelNums.add(btnNum5);
		
		JButton btnNum6 = new JButton("6");
		btnNum6.setBounds(108, 61, 39, 39);
		panelNums.add(btnNum6);
		
		JButton btnNum7 = new JButton("7");
		btnNum7.setBounds(10, 11, 39, 39);
		panelNums.add(btnNum7);
		
		JButton btnNum8 = new JButton("8");
		btnNum8.setBounds(59, 11, 39, 39);
		panelNums.add(btnNum8);
		
		JButton btnNum9 = new JButton("9");
		btnNum9.setBounds(108, 11, 39, 39);
		panelNums.add(btnNum9);
		
		JButton btnNum0 = new JButton("0");
		btnNum0.setBounds(10, 161, 39, 39);
		panelNums.add(btnNum0);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnClear.setBounds(59, 161, 88, 39);
		panelNums.add(btnClear);
		
		
		
		
		/****************
		 * Bottom Buttons
		 ****************/
		textField_Hostname = new JTextField();
		textField_Hostname.setBounds(16, 367, 178, 35);
		frame.getContentPane().add(textField_Hostname);
		textField_Hostname.setColumns(10);
		
		JPanel panelDevice = new JPanel();
		panelDevice.setBackground(Color.LIGHT_GRAY);
		panelDevice.setBounds(336, 11, 141, 318);
		frame.getContentPane().add(panelDevice);
		panelDevice.setLayout(null);
		
		JButton btn1608 = new JButton("IN 1608");
		btn1608.setBounds(10, 11, 121, 23);
		panelDevice.add(btn1608);
		
		JButton btnIPCP350 = new JButton("IN 1608");
		btnIPCP350.setBounds(10, 45, 121, 23);
		panelDevice.add(btnIPCP350);
		
		JButton btnIPCP250 = new JButton("IN 1608");
		btnIPCP250.setBounds(10, 79, 121, 23);
		panelDevice.add(btnIPCP250);
		
		JButton btnDMP = new JButton("IN 1608");
		btnDMP.setBounds(10, 113, 121, 23);
		panelDevice.add(btnDMP);
		
		JButton btnSMP = new JButton("IN 1608");
		btnSMP.setBounds(10, 147, 121, 23);
		panelDevice.add(btnSMP);
		
		JButton btnCP = new JButton("IN 1608");
		btnCP.setBounds(10, 181, 121, 23);
		panelDevice.add(btnCP);
		
		JButton button_5 = new JButton("IN 1608");
		button_5.setBounds(10, 215, 121, 23);
		panelDevice.add(button_5);
		
		JButton button_6 = new JButton("IN 1608");
		button_6.setBounds(10, 249, 121, 23);
		panelDevice.add(button_6);
		
		JButton button_7 = new JButton("IN 1608");
		button_7.setBounds(10, 283, 121, 23);
		panelDevice.add(button_7);
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
