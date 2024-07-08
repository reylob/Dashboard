import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.border.BevelBorder;

public class ProfitsPanel extends JPanel {

		

	public ProfitsPanel() {
		setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setBackground(Color.CYAN);
		
		setBounds(0, 0, 429, 419);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(221, 160, 221));
		panel.setBounds(10, 11, 409, 397);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblThisIsProfits = new JLabel("THIS IS PROFITS");
		lblThisIsProfits.setForeground(new Color(0, 0, 0));
		lblThisIsProfits.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblThisIsProfits.setBounds(32, 171, 346, 56);
		panel.add(lblThisIsProfits);
	}

}
