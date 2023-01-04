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
import javax.swing.JComboBox;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.awt.event.ActionEvent;

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
	public ShopPage(String id ,Shop shop,ShoppingCart sc) {
		setTitle("商店");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1125, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel WinstonInfo = new JLabel(shop.info(0));
		WinstonInfo.setBackground(SystemColor.text);
		WinstonInfo.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		WinstonInfo.setHorizontalAlignment(SwingConstants.CENTER);
		WinstonInfo.setAlignmentX(Component.CENTER_ALIGNMENT);
		WinstonInfo.setBounds(30, 274, 117, 82);
		contentPane.add(WinstonInfo);
		
		JLabel winston = new JLabel("");
		winston.setBounds(30, 111, 117, 178);
		Image winstonImage = new ImageIcon(this.getClass().getResource("/winston.jpg")).getImage().getScaledInstance(winston.getWidth(), winston.getHeight(), Image.SCALE_DEFAULT);
		winston.setIcon(new ImageIcon(winstonImage));
		contentPane.add(winston);
		
		JLabel sevenstar = new JLabel("");
		sevenstar.setBounds(268, 111, 117, 178);
		Image sevenstarImage = new ImageIcon(this.getClass().getResource("/sevenstar.jpeg")).getImage().getScaledInstance(winston.getWidth(), winston.getHeight(), Image.SCALE_DEFAULT);
		sevenstar.setIcon(new ImageIcon(sevenstarImage));
		contentPane.add(sevenstar);
		
		JLabel pm = new JLabel("");
		pm.setBounds(506, 111, 117, 178);
		Image pmImage = new ImageIcon(this.getClass().getResource("/pm.jpeg")).getImage().getScaledInstance(winston.getWidth(), winston.getHeight(), Image.SCALE_DEFAULT);
		pm.setIcon(new ImageIcon(pmImage));
		contentPane.add(pm);
		
		JLabel vesta = new JLabel("");
		vesta.setBounds(744, 111, 117, 178);
		Image vestaImage = new ImageIcon(this.getClass().getResource("/vesta.jpeg")).getImage().getScaledInstance(winston.getWidth(), winston.getHeight(), Image.SCALE_DEFAULT);
		vesta.setIcon(new ImageIcon(vestaImage));
		contentPane.add(vesta);
		
		JLabel daviddoff = new JLabel("");
		daviddoff.setBounds(982, 111, 117, 178);
		Image daviddoffImage = new ImageIcon(this.getClass().getResource("/daviddoff.jpeg")).getImage().getScaledInstance(winston.getWidth(), winston.getHeight(), Image.SCALE_DEFAULT);
		daviddoff.setIcon(new ImageIcon(daviddoffImage));
		contentPane.add(daviddoff);
		
		JLabel sevenstarInfo = new JLabel(shop.info(1));
		sevenstarInfo.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		sevenstarInfo.setHorizontalAlignment(SwingConstants.CENTER);
		sevenstarInfo.setAlignmentX(0.5f);
		sevenstarInfo.setBounds(268, 274, 117, 82);
		contentPane.add(sevenstarInfo);
		
		JLabel pmInfo = new JLabel(shop.info(2));
		pmInfo.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		pmInfo.setHorizontalAlignment(SwingConstants.CENTER);
		pmInfo.setAlignmentX(0.5f);
		pmInfo.setBounds(506, 274, 117, 82);
		contentPane.add(pmInfo);
		
		JLabel vestaInfo = new JLabel(shop.info(3));
		vestaInfo.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		vestaInfo.setHorizontalAlignment(SwingConstants.CENTER);
		vestaInfo.setAlignmentX(0.5f);
		vestaInfo.setBounds(744, 274, 117, 82);
		contentPane.add(vestaInfo);
		
		JLabel daviddoffInfo = new JLabel(shop.info(4));
		daviddoffInfo.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		daviddoffInfo.setHorizontalAlignment(SwingConstants.CENTER);
		daviddoffInfo.setAlignmentX(0.5f);
		daviddoffInfo.setBounds(982, 274, 117, 82);
		contentPane.add(daviddoffInfo);
		
		JLabel sum = new JLabel("目前購買數量: " +sc.getQuantity());
		sum.setFont(new Font("微軟正黑體", Font.PLAIN, 30));
		sum.setBounds(770, 423, 251, 55);
		contentPane.add(sum);
		
		JComboBox comboBox1 = new JComboBox();
		comboBox1.setEditable(true);
		comboBox1.setBackground(SystemColor.window);
		comboBox1.setBounds(30, 333, 96, 23);
		comboBox1.addItem("1");
		comboBox1.addItem("2");
		comboBox1.addItem("3");
		comboBox1.addItem("4");
		comboBox1.addItem("5");
		comboBox1.addItem("6");
		comboBox1.addItem("7");
		comboBox1.addItem("8");
		comboBox1.addItem("9");
		comboBox1.addItem("10");
		contentPane.add(comboBox1);
		
		JButton scButton1 = new JButton("");
		scButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int quantity =Integer.valueOf ((String)comboBox1.getSelectedItem());
				
				for (int i = 0; i < quantity; i++) {
					sc.add(shop.getGoods().get(0));
					shop.getGoods().get(0).adjustPrice(1.2);
					sum.setText("目前購買數量: " +sc.getQuantity());
				}
				sc.printResult();
			}
		});
		scButton1.setBackground(SystemColor.window);
		scButton1.setIcon(new ImageIcon(getClass().getResource("/1616.png")));
		scButton1.setBounds(124, 333, 23, 23);
		contentPane.add(scButton1);
		
		JComboBox comboBox1_1 = new JComboBox();
		comboBox1_1.setEditable(true);
		comboBox1_1.setBackground(Color.WHITE);
		comboBox1_1.setBounds(268, 333, 96, 23);
		comboBox1_1.addItem("1");
		comboBox1_1.addItem("2");
		comboBox1_1.addItem("3");
		comboBox1_1.addItem("4");
		comboBox1_1.addItem("5");
		comboBox1_1.addItem("6");
		comboBox1_1.addItem("7");
		comboBox1_1.addItem("8");
		comboBox1_1.addItem("9");
		comboBox1_1.addItem("10");
		contentPane.add(comboBox1_1);
		
		JButton scButton1_1 = new JButton("");
		scButton1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int quantity =Integer.valueOf ((String)comboBox1_1.getSelectedItem());
				
				for (int i = 0; i < quantity; i++) {
					sc.add(shop.getGoods().get(1));
					shop.getGoods().get(1).adjustPrice(1.2);
					sum.setText("目前購買數量: " +sc.getQuantity());
				}
				sc.printResult();
			}
		});
		scButton1_1.setBackground(Color.WHITE);
		scButton1_1.setBounds(362, 333, 23, 23);
		scButton1_1.setIcon(new ImageIcon(getClass().getResource("/1616.png")));
		contentPane.add(scButton1_1);
		
		JComboBox comboBox1_2 = new JComboBox();
		comboBox1_2.setEditable(true);
		comboBox1_2.setBackground(Color.WHITE);
		comboBox1_2.setBounds(506, 333, 96, 23);
		comboBox1_2.addItem("1");
		comboBox1_2.addItem("2");
		comboBox1_2.addItem("3");
		comboBox1_2.addItem("4");
		comboBox1_2.addItem("5");
		comboBox1_2.addItem("6");
		comboBox1_2.addItem("7");
		comboBox1_2.addItem("8");
		comboBox1_2.addItem("9");
		comboBox1_2.addItem("10");
		contentPane.add(comboBox1_2);
		
		JButton scButton1_2 = new JButton("");
		scButton1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int quantity =Integer.valueOf ((String)comboBox1_2.getSelectedItem());
				
				for (int i = 0; i < quantity; i++) {
					sc.add(shop.getGoods().get(2));
					shop.getGoods().get(2).adjustPrice(1.2);
					sum.setText("目前購買數量: " +sc.getQuantity());
				}
				sc.printResult();
			}
		});
		scButton1_2.setBackground(Color.WHITE);
		scButton1_2.setBounds(600, 333, 23, 23);
		scButton1_2.setIcon(new ImageIcon(getClass().getResource("/1616.png")));
		contentPane.add(scButton1_2);
		
		JComboBox comboBox1_3 = new JComboBox();
		comboBox1_3.setEditable(true);
		comboBox1_3.setBackground(Color.WHITE);
		comboBox1_3.setBounds(744, 333, 96, 23);
		comboBox1_3.addItem("1");
		comboBox1_3.addItem("2");
		comboBox1_3.addItem("3");
		comboBox1_3.addItem("4");
		comboBox1_3.addItem("5");
		comboBox1_3.addItem("6");
		comboBox1_3.addItem("7");
		comboBox1_3.addItem("8");
		comboBox1_3.addItem("9");
		comboBox1_3.addItem("10");
		contentPane.add(comboBox1_3);
		
		JButton scButton1_3 = new JButton("");
		scButton1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int quantity =Integer.valueOf ((String)comboBox1_3.getSelectedItem());
				
				for (int i = 0; i < quantity; i++) {
					sc.add(shop.getGoods().get(3));
					shop.getGoods().get(3).adjustPrice(1.2);
					sum.setText("目前購買數量: " +sc.getQuantity());
				}
				sc.printResult();
			}
		});
		scButton1_3.setBackground(Color.WHITE);
		scButton1_3.setBounds(838, 333, 23, 23);
		scButton1_3.setIcon(new ImageIcon(getClass().getResource("/1616.png")));
		contentPane.add(scButton1_3);
		
		JComboBox comboBox1_4 = new JComboBox();
		comboBox1_4.setEditable(true);
		comboBox1_4.setBackground(Color.WHITE);
		comboBox1_4.setBounds(984, 333, 96, 23);
		comboBox1_4.addItem("1");
		comboBox1_4.addItem("2");
		comboBox1_4.addItem("3");
		comboBox1_4.addItem("4");
		comboBox1_4.addItem("5");
		comboBox1_4.addItem("6");
		comboBox1_4.addItem("7");
		comboBox1_4.addItem("8");
		comboBox1_4.addItem("9");
		comboBox1_4.addItem("10");
		contentPane.add(comboBox1_4);
		
		JButton scButton1_4 = new JButton("");
		scButton1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int quantity =Integer.valueOf ((String)comboBox1_4.getSelectedItem());
				
				for (int i = 0; i < quantity; i++) {
					sc.add(shop.getGoods().get(4));
					shop.getGoods().get(4).adjustPrice(1.2);
					sum.setText("目前購買數量: " +sc.getQuantity());
				}
				sc.printResult();
			}
		});
		scButton1_4.setBackground(Color.WHITE);
		scButton1_4.setBounds(1078, 333, 23, 23);
		scButton1_4.setIcon(new ImageIcon(getClass().getResource("/1616.png")));
		contentPane.add(scButton1_4);
		
		JLabel lblNewLabel = new JLabel("購買人:" + id);
		lblNewLabel.setFont(new Font("微軟正黑體", Font.BOLD, 30));
		lblNewLabel.setBounds(30, 33, 402, 29);
		contentPane.add(lblNewLabel);
		
		
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(1019, 423, 55, 55);
		btnNewButton.setIcon(new ImageIcon(getClass().getResource("/right-arrow.png")));
		contentPane.add(btnNewButton);
	}
}
