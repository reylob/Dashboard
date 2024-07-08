import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

import javax.swing.border.EtchedBorder;

public class OrdersPanel extends JPanel {
	

	public OrdersPanel() {
		setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setBackground(Color.MAGENTA);

		setBounds(0, 0, 429, 419);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(135, 206, 250));
		panel.setBounds(10, 11, 409, 397);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblThisIs = new JLabel("THIS IS ORDERS");
		lblThisIs.setForeground(Color.RED);
		lblThisIs.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblThisIs.setBounds(36, 158, 342, 56);
		panel.add(lblThisIs);
	}

}
