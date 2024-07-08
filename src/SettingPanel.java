import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class SettingPanel extends JPanel {

	
	public SettingPanel() {
		setBorder(null);
		setBackground(new Color(0, 250, 154));

		setBounds(0, 0, 429, 419);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(240, 255, 240));
		panel.setBounds(10, 11, 409, 397);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblThisIsSetting = new JLabel("THIS IS SETTING");
		lblThisIsSetting.setForeground(new Color(0, 0, 0));
		lblThisIsSetting.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblThisIsSetting.setBounds(33, 160, 348, 56);
		panel.add(lblThisIsSetting);
	}

}
