import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.Font;

public class ShopPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	}

	/**
	 * Create the frame.
	 */
	public ShopPage(String id ,Shop shop) {
		setTitle("商店");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1125, 724);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel WinstonInfo = new JLabel(shop.info(0));
		WinstonInfo.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		WinstonInfo.setHorizontalAlignment(SwingConstants.CENTER);
		WinstonInfo.setAlignmentX(Component.CENTER_ALIGNMENT);
		WinstonInfo.setBounds(31, 183, 117, 82);
		contentPane.add(WinstonInfo);
		
		JLabel winston = new JLabel("");
		winston.setBounds(30, 25, 117, 178);
		Image winstonImage = new ImageIcon(this.getClass().getResource("/winston.jpg")).getImage().getScaledInstance(winston.getWidth(), winston.getHeight(), Image.SCALE_DEFAULT);
		winston.setIcon(new ImageIcon(winstonImage));
		contentPane.add(winston);
		
		JLabel sevenstar = new JLabel("");
		sevenstar.setBounds(268, 25, 117, 178);
		Image sevenstarImage = new ImageIcon(this.getClass().getResource("/sevenstar.jpeg")).getImage().getScaledInstance(winston.getWidth(), winston.getHeight(), Image.SCALE_DEFAULT);
		sevenstar.setIcon(new ImageIcon(sevenstarImage));
		contentPane.add(sevenstar);
		
		JLabel pm = new JLabel("");
		pm.setBounds(506, 25, 117, 178);
		Image pmImage = new ImageIcon(this.getClass().getResource("/pm.jpeg")).getImage().getScaledInstance(winston.getWidth(), winston.getHeight(), Image.SCALE_DEFAULT);
		pm.setIcon(new ImageIcon(pmImage));
		contentPane.add(pm);
		
		JLabel vesta = new JLabel("");
		vesta.setBounds(744, 25, 117, 178);
		Image vestaImage = new ImageIcon(this.getClass().getResource("/vesta.jpeg")).getImage().getScaledInstance(winston.getWidth(), winston.getHeight(), Image.SCALE_DEFAULT);
		vesta.setIcon(new ImageIcon(vestaImage));
		contentPane.add(vesta);
		
		JLabel daviddoff = new JLabel("");
		daviddoff.setBounds(982, 25, 117, 178);
		Image daviddoffImage = new ImageIcon(this.getClass().getResource("/daviddoff.jpeg")).getImage().getScaledInstance(winston.getWidth(), winston.getHeight(), Image.SCALE_DEFAULT);
		daviddoff.setIcon(new ImageIcon(daviddoffImage));
		contentPane.add(daviddoff);
		
		JLabel sevenstarInfo = new JLabel(shop.info(1));
		sevenstarInfo.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		sevenstarInfo.setHorizontalAlignment(SwingConstants.CENTER);
		sevenstarInfo.setAlignmentX(0.5f);
		sevenstarInfo.setBounds(268, 183, 117, 82);
		contentPane.add(sevenstarInfo);
		
		JLabel pmInfo = new JLabel(shop.info(2));
		pmInfo.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		pmInfo.setHorizontalAlignment(SwingConstants.CENTER);
		pmInfo.setAlignmentX(0.5f);
		pmInfo.setBounds(506, 183, 117, 82);
		contentPane.add(pmInfo);
		
		JLabel vestaInfo = new JLabel(shop.info(3));
		vestaInfo.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		vestaInfo.setHorizontalAlignment(SwingConstants.CENTER);
		vestaInfo.setAlignmentX(0.5f);
		vestaInfo.setBounds(744, 183, 117, 82);
		contentPane.add(vestaInfo);
		
		JLabel daviddoffInfo = new JLabel(shop.info(4));
		daviddoffInfo.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		daviddoffInfo.setHorizontalAlignment(SwingConstants.CENTER);
		daviddoffInfo.setAlignmentX(0.5f);
		daviddoffInfo.setBounds(982, 183, 117, 82);
		contentPane.add(daviddoffInfo);
	}
}
