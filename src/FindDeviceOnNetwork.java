import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class FindDeviceOnNetwork {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FindDeviceOnNetwork window = new FindDeviceOnNetwork();
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
	public FindDeviceOnNetwork() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 572, 673);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JTextArea textArea_PingResult = new JTextArea();
		textArea_PingResult.setBounds(21, 278, 471, 271);
		frame.getContentPane().add(textArea_PingResult);
		
		
		JButton btnStartPing = new JButton("Ping");
		btnStartPing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea_PingResult.append(pingDevice.runSystemCommand("wb-206-ipcp.fm-mgmt.weber.edu"));
			}
		});
		btnStartPing.setBounds(21, 21, 141, 35);
		frame.getContentPane().add(btnStartPing);
		
	}
}
