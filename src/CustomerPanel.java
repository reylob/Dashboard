import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.EtchedBorder;

public class CustomerPanel extends JPanel {

	

	public CustomerPanel() {
		setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setBackground(new Color(255, 255, 0));

		setBounds(0, 0, 429, 419);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(154, 205, 50));
		panel.setBounds(10, 11, 409, 397);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblThisIsCustomer = new JLabel("THIS IS CUSTOMER");
		lblThisIsCustomer.setForeground(new Color(0, 0, 0));
		lblThisIsCustomer.setFont(new Font("Tahoma", Font.BOLD, 39));
		lblThisIsCustomer.setBounds(10, 152, 398, 56);
		panel.add(lblThisIsCustomer);
	}

}
