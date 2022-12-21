import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Component;
import javax.swing.SwingConstants;

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
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel info1 = new JLabel(shop.info(0));
		info1.setHorizontalAlignment(SwingConstants.CENTER);
		info1.setAlignmentX(Component.CENTER_ALIGNMENT);
		info1.setBounds(31, 172, 117, 82);
		contentPane.add(info1);
		
		JLabel image1 = new JLabel("");
		image1.setBounds(31, 25, 117, 158);
		Image sevenstar = new ImageIcon(this.getClass().getResource("/winston.jpg")).getImage().getScaledInstance(image1.getWidth(), image1.getHeight(), Image.SCALE_DEFAULT);
		image1.setIcon(new ImageIcon(sevenstar));
		
		contentPane.add(image1);
	}
}
