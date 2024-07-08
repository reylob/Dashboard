import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.EtchedBorder;

public class HomePanel extends JPanel {

	
	
	
	public HomePanel() {
		setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setBackground(Color.BLUE);

		setBounds(0, 0, 429, 419);
		setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(255, 204, 0));
		panel_1.setBounds(10, 11, 409, 397);
		add(panel_1);
		
		JLabel lblNewLabel = new JLabel("THIS IS HOME");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(59, 160, 291, 56);
		panel_1.add(lblNewLabel);
		setVisible(true);
		
	}
}
