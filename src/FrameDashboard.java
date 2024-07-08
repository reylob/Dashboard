import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.EtchedBorder;

public class FrameDashboard extends JFrame {

	private JPanel contentPane;

	private Image img_logohome = new ImageIcon(FrameLogin.class.getResource("res/homeLogo.png")).getImage().getScaledInstance(110, 110,Image.SCALE_SMOOTH);
	private Image img_home = new ImageIcon(FrameLogin.class.getResource("res/home1.png")).getImage().getScaledInstance(40, 40,Image.SCALE_SMOOTH);
	private Image img_profits = new ImageIcon(FrameLogin.class.getResource("res/profits.png")).getImage().getScaledInstance(40, 40,Image.SCALE_SMOOTH);
	private Image img_orders = new ImageIcon(FrameLogin.class.getResource("res/order.png")).getImage().getScaledInstance(40, 40,Image.SCALE_SMOOTH);
	private Image img_customers = new ImageIcon(FrameLogin.class.getResource("res/customer.png")).getImage().getScaledInstance(40, 40,Image.SCALE_SMOOTH);
	private Image img_setting = new ImageIcon(FrameLogin.class.getResource("res/settings.png")).getImage().getScaledInstance(40, 40,Image.SCALE_SMOOTH);
	private Image img_signout = new ImageIcon(FrameLogin.class.getResource("res/signout.png")).getImage().getScaledInstance(40, 40,Image.SCALE_SMOOTH);
	
	private HomePanel homePanel;
	private ProfitsPanel profitsPanel;
	private OrdersPanel ordersPanel;
	private CustomerPanel customerPanel;
	private SettingPanel settingPanel;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameDashboard frame = new FrameDashboard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public FrameDashboard() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 712, 440);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		homePanel = new HomePanel();
		profitsPanel = new ProfitsPanel();
		ordersPanel = new OrdersPanel();
		customerPanel = new CustomerPanel();
		settingPanel = new SettingPanel();
		
		JPanel menuPane = new JPanel();
		menuPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		menuPane.setBackground(new Color(255, 255, 255));
		menuPane.setBounds(0, 0, 250, 441);
		contentPane.add(menuPane);
		menuPane.setLayout(null);
		
		JLabel lblIconLogo = new JLabel("");
		lblIconLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconLogo.setBounds(10, 11, 230, 168);
		lblIconLogo.setIcon(new ImageIcon(img_logohome));
		menuPane.add(lblIconLogo);
		
		JPanel homePane = new JPanel();
		homePane.addMouseListener(new PanelButtonMouseAdapter(homePane) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(homePanel);
			}
		});
		homePane.setBackground(new Color(135, 206, 250));
		homePane.setBounds(0, 190, 250, 40);
		menuPane.add(homePane);
		homePane.setLayout(null);
		
		JLabel lblHome = new JLabel("HOME");
		lblHome.setHorizontalAlignment(SwingConstants.CENTER);
		lblHome.setFont(new Font("Dialog", Font.BOLD, 14));
		lblHome.setBounds(60, 11, 43, 14);
		homePane.add(lblHome);
		lblHome.setForeground(new Color(0, 0, 0));
		lblHome.setBackground(new Color(0, 0, 0));
		
		JLabel lblIconHome = new JLabel("");
		lblIconHome.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconHome.setIcon(new ImageIcon(img_home));
		lblIconHome.setBounds(10, 0, 40, 40);
		homePane.add(lblIconHome);
		
		JPanel profitsPane = new JPanel();
		profitsPane.addMouseListener(new PanelButtonMouseAdapter(profitsPane) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(profitsPanel);
			}
			
		});
		profitsPane.setBackground(new Color(135, 206, 250));
		profitsPane.setBounds(0, 230, 250, 40);
		menuPane.add(profitsPane);
		profitsPane.setLayout(null);
		
		JLabel lblProfits = new JLabel("PROFITS");
		lblProfits.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfits.setForeground(Color.BLACK);
		lblProfits.setFont(new Font("Dialog", Font.BOLD, 14));
		lblProfits.setBackground(Color.BLACK);
		lblProfits.setBounds(60, 11, 60, 14);
		profitsPane.add(lblProfits);
		
		JLabel lblIconProfits = new JLabel("");
		lblIconProfits.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconProfits.setBounds(10, 0, 40, 40);
		lblIconProfits.setIcon(new ImageIcon(img_profits));
		profitsPane.add(lblIconProfits);
		
		JPanel ordersPane = new JPanel();
		ordersPane.addMouseListener(new PanelButtonMouseAdapter(ordersPane) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(ordersPanel);
			}
		});
		ordersPane.setBackground(new Color(135, 206, 250));
		ordersPane.setBounds(0, 270, 250, 40);
		menuPane.add(ordersPane);
		ordersPane.setLayout(null);
		
		JLabel lblOrders = new JLabel("ORDERS");
		lblOrders.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrders.setForeground(Color.BLACK);
		lblOrders.setFont(new Font("Dialog", Font.BOLD, 14));
		lblOrders.setBackground(Color.BLACK);
		lblOrders.setBounds(60, 11, 59, 14);
		ordersPane.add(lblOrders);
		
		JLabel lblIconOrders = new JLabel("");
		lblIconOrders.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconOrders.setBounds(10, 0, 40, 40);
		lblIconOrders.setIcon(new ImageIcon(img_orders));
		ordersPane.add(lblIconOrders);
		
		JPanel customersPane = new JPanel();
		customersPane.addMouseListener(new PanelButtonMouseAdapter(customersPane) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(customerPanel);
			}
		});
		customersPane.setBackground(new Color(135, 206, 250));
		customersPane.setBounds(0, 310, 250, 40);
		menuPane.add(customersPane);
		customersPane.setLayout(null);
		
		JLabel lblCustomers = new JLabel("CUSTOMERS");
		lblCustomers.setHorizontalAlignment(SwingConstants.CENTER);
		lblCustomers.setForeground(Color.BLACK);
		lblCustomers.setFont(new Font("Dialog", Font.BOLD, 14));
		lblCustomers.setBackground(Color.BLACK);
		lblCustomers.setBounds(60, 11, 89, 14);
		customersPane.add(lblCustomers);
		
		JLabel lblIconCustomers = new JLabel("");
		lblIconCustomers.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconCustomers.setBounds(10, 0, 40, 40);
		lblIconCustomers.setIcon(new ImageIcon(img_customers));
		customersPane.add(lblIconCustomers);
		
		JPanel settingPane = new JPanel();
		settingPane.addMouseListener(new PanelButtonMouseAdapter(settingPane) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(settingPanel);
			}
		});
		settingPane.setBackground(new Color(135, 206, 250));
		settingPane.setBounds(0, 350, 250, 40);
		menuPane.add(settingPane);
		settingPane.setLayout(null);
		
		JLabel lblSetting = new JLabel("SETTING");
		lblSetting.setHorizontalAlignment(SwingConstants.CENTER);
		lblSetting.setForeground(Color.BLACK);
		lblSetting.setFont(new Font("Dialog", Font.BOLD, 14));
		lblSetting.setBackground(Color.BLACK);
		lblSetting.setBounds(60, 11, 59, 14);
		settingPane.add(lblSetting);
		
		JLabel lblIconSetting = new JLabel("");
		lblIconSetting.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconSetting.setBounds(10, 0, 40, 40);
		lblIconSetting.setIcon(new ImageIcon(img_setting));
		settingPane.add(lblIconSetting);
		
		JPanel signOutPane = new JPanel();
		signOutPane.addMouseListener(new PanelButtonMouseAdapter(signOutPane) {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to sign out?") == 0) {
					FrameLogin frameLogin = new FrameLogin();
					frameLogin.setVisible(true);
					FrameDashboard.this.dispose();
				}
			}
				
		});
		signOutPane.setBackground(new Color(135, 206, 250));
		signOutPane.setBounds(0, 390, 250, 40);
		menuPane.add(signOutPane);
		signOutPane.setLayout(null);
		
		JLabel lblSignOut = new JLabel("SIGN OUT");
		lblSignOut.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignOut.setForeground(Color.BLACK);
		lblSignOut.setFont(new Font("Dialog", Font.BOLD, 14));
		lblSignOut.setBackground(Color.BLACK);
		lblSignOut.setBounds(60, 11, 67, 14);
		signOutPane.add(lblSignOut);
		
		JLabel lblIconSignout = new JLabel("");
		lblIconSignout.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconSignout.setBounds(10, 0, 40, 40);
		lblIconSignout.setIcon(new ImageIcon(img_signout));
		signOutPane.add(lblIconSignout);
		
		JPanel mainContentPane = new JPanel();
		mainContentPane.setBounds(260, 11, 430, 419);
		contentPane.add(mainContentPane);
		mainContentPane.setLayout(null);
		
		mainContentPane.add(homePanel);
		mainContentPane.add(profitsPanel);
		mainContentPane.add(ordersPanel);
		mainContentPane.add(customerPanel);
		mainContentPane.add(settingPanel);
		
		menuClicked(homePanel);
		
		JPanel panel = new JPanel();
		panel.setBounds(347, 11, 24, 26);
		homePanel.add(panel);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setLayout(null);
		
		JLabel lblExit = new JLabel("x");
		lblExit.setBounds(690, 0, 20, 20);
		contentPane.add(lblExit);
		lblExit.setHorizontalAlignment(SwingConstants.CENTER);
		lblExit.setForeground(Color.BLACK);
		lblExit.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
			FrameDashboard.this.dispose();
			
			}
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			lblExit.setForeground(Color.RED);
			
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			lblExit.setForeground(Color.BLACK);
			}
		});
	}
	
	public void menuClicked(JPanel panel) {
		homePanel.setVisible(false);
		profitsPanel.setVisible(false);
		ordersPanel.setVisible(false);
		customerPanel.setVisible(false);
		settingPanel.setVisible(false);
		
		panel.setVisible(true);
	}
	
	private class PanelButtonMouseAdapter extends MouseAdapter{
		
		JPanel panel;
		public PanelButtonMouseAdapter(JPanel panel) {
				this.panel = panel;
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			panel.setBackground(new Color(11, 206, 250));
		}	
		
		
		@Override
		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(135, 206, 250)); /*same*/
		}	
		
		@Override
		public void mousePressed(MouseEvent e) {
			panel.setBackground(new Color(14, 201, 150));
		}	
		
		@Override
		public void mouseReleased(MouseEvent e) {
			panel.setBackground(new Color(135, 206, 250)); /*same*/
			
		}
	}
}
