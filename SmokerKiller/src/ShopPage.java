import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import org.apache.logging.log4j.core.tools.picocli.CommandLine.Help.TextTable.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;


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
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.awt.event.ActionEvent;

import java.util.*;
import java.text.*;

public class ShopPage extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private double lastPrice;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	}
	public void addTable(String name, double p) {
		DefaultTableModel dt = (DefaultTableModel) table.getModel();
		
		Vector v = new Vector();
		
		v.add(name);
		v.add(p);
		
		dt.addRow(v);
		
	}

	/**
	 * Create the frame.
	 */
	public ShopPage(String id ,Shop shop,ShoppingCart sc, User user) {
		
		setTitle("商店");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1125, 790);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lastWeek = new JLabel("上週購買包數: " + user.getLimit());
		lastWeek.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lastWeek.setBounds(30, 40, 402, 29);
		contentPane.add(lastWeek);
		
		JLabel thisWeek = new JLabel("本週已購包數: " + user.getHaveBought());
		thisWeek.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		thisWeek.setBounds(30, 70, 402, 29);
		contentPane.add(thisWeek);
		
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
		vesta.setBounds(30, 449, 117, 178);
		Image vestaImage = new ImageIcon(this.getClass().getResource("/vesta.jpeg")).getImage().getScaledInstance(winston.getWidth(), winston.getHeight(), Image.SCALE_DEFAULT);
		vesta.setIcon(new ImageIcon(vestaImage));
		contentPane.add(vesta);
		
		JLabel daviddoff = new JLabel("");
		daviddoff.setBounds(268, 449, 117, 178);
		Image daviddoffImage = new ImageIcon(this.getClass().getResource("/daviddoff.jpeg")).getImage().getScaledInstance(winston.getWidth(), winston.getHeight(), Image.SCALE_DEFAULT);
		daviddoff.setIcon(new ImageIcon(daviddoffImage));
		contentPane.add(daviddoff);
		
		JLabel lucky = new JLabel("");
		lucky.setBounds(506, 443, 117, 178);
		Image luckyImage = new ImageIcon(this.getClass().getResource("/lucky.PNG")).getImage().getScaledInstance(winston.getWidth(), winston.getHeight(), Image.SCALE_DEFAULT);
		lucky.setIcon(new ImageIcon(luckyImage));
		contentPane.add(lucky);
		
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
		vestaInfo.setBounds(30, 606, 117, 82);
		contentPane.add(vestaInfo);
		
		JLabel daviddoffInfo = new JLabel(shop.info(4));
		daviddoffInfo.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		daviddoffInfo.setHorizontalAlignment(SwingConstants.CENTER);
		daviddoffInfo.setAlignmentX(0.5f);
		daviddoffInfo.setBounds(268, 606, 117, 82);
		contentPane.add(daviddoffInfo);
		
		JLabel luckyInfo = new JLabel(shop.info(5));
		luckyInfo.setHorizontalAlignment(SwingConstants.CENTER);
		luckyInfo.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		luckyInfo.setBackground(Color.WHITE);
		luckyInfo.setAlignmentX(0.5f);
		luckyInfo.setBounds(506, 606, 117, 82);
		contentPane.add(luckyInfo);
		
		
		
		JLabel sum = new JLabel("目前購買數量: " +sc.getQuantity());
		sum.setHorizontalAlignment(SwingConstants.CENTER);
		sum.setFont(new Font("微軟正黑體", Font.PLAIN, 15));
		sum.setBounds(770, 665, 251, 29);
		contentPane.add(sum);
		
		JLabel sum_1 = new JLabel("目前價格: $" + sc.getPrice());
		sum_1.setHorizontalAlignment(SwingConstants.CENTER);
		sum_1.setFont(new Font("微軟正黑體", Font.PLAIN, 15));
		sum_1.setBounds(770, 691, 251, 29);
		contentPane.add(sum_1);
		
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
					user.buy();
					String name = shop.getGoods().get(0).getName();
					double price = shop.getGoods().get(0).getPrice()*user.calcPenalty();
					sc.add(name,Math.ceil(price));
					addTable(name, (int)Math.ceil(price));
					sum.setText("目前購買數量: " +sc.getQuantity());
					sum_1.setText("目前價格: $" + sc.getPrice());
					
				}
				
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
					user.buy();
					String name = shop.getGoods().get(1).getName();
					double price = shop.getGoods().get(1).getPrice()*user.calcPenalty();				
					sc.add(name,Math.ceil(price));
					addTable(name, (int)Math.ceil(price));
					sum.setText("目前購買數量: " +sc.getQuantity());
					sum_1.setText("目前價格: $" + sc.getPrice());
					
				}
				
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
					user.buy();
					String name = shop.getGoods().get(2).getName();
					double price = shop.getGoods().get(2).getPrice()*user.calcPenalty();
					sc.add(name,Math.ceil(price));
					addTable(name, (int)Math.ceil(price));
					sum.setText("目前購買數量: " +sc.getQuantity());
					sum_1.setText("目前價格: $" + sc.getPrice());
				}
				
			}
		});
		scButton1_2.setBackground(Color.WHITE);
		scButton1_2.setBounds(600, 333, 23, 23);
		scButton1_2.setIcon(new ImageIcon(getClass().getResource("/1616.png")));
		contentPane.add(scButton1_2);
		
		JComboBox comboBox1_3 = new JComboBox();
		comboBox1_3.setEditable(true);
		comboBox1_3.setBackground(Color.WHITE);
		comboBox1_3.setBounds(30, 665, 96, 23);
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
					user.buy();
					String name = shop.getGoods().get(3).getName();
					double price = shop.getGoods().get(3).getPrice()*user.calcPenalty();					
					sc.add(name,Math.ceil(price));
					addTable(name, (int)Math.ceil(price));
					sum.setText("目前購買數量: " +sc.getQuantity());
					sum_1.setText("目前價格: $" + sc.getPrice());
				}
				
			}
		});
		scButton1_3.setBackground(Color.WHITE);
		scButton1_3.setBounds(124, 665, 23, 23);
		scButton1_3.setIcon(new ImageIcon(getClass().getResource("/1616.png")));
		contentPane.add(scButton1_3);
		
		JComboBox comboBox1_4 = new JComboBox();
		comboBox1_4.setEditable(true);
		comboBox1_4.setBackground(Color.WHITE);
		comboBox1_4.setBounds(268, 665, 96, 23);
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
					user.buy();
					String name = shop.getGoods().get(4).getName();
					double price = shop.getGoods().get(4).getPrice()*user.calcPenalty();
					sc.add(name,Math.ceil(price));
					addTable(name, (int)Math.ceil(price));
					sum.setText("目前購買數量: " +sc.getQuantity());
					sum_1.setText("目前價格: $" + sc.getPrice());
					
				}
				
			}
		});
		scButton1_4.setBackground(Color.WHITE);
		scButton1_4.setBounds(362, 665, 23, 23);
		scButton1_4.setIcon(new ImageIcon(getClass().getResource("/1616.png")));
		contentPane.add(scButton1_4);
		
		JComboBox comboBox1_5 = new JComboBox();
		comboBox1_5.setEditable(true);
		comboBox1_5.setBackground(Color.WHITE);
		comboBox1_5.setBounds(506, 665, 96, 23);
		comboBox1_5.addItem("1");
		comboBox1_5.addItem("2");
		comboBox1_5.addItem("3");
		comboBox1_5.addItem("4");
		comboBox1_5.addItem("5");
		comboBox1_5.addItem("6");
		comboBox1_5.addItem("7");
		comboBox1_5.addItem("8");
		comboBox1_5.addItem("9");
		comboBox1_5.addItem("10");
		contentPane.add(comboBox1_5);
		
		JButton scButton1_5 = new JButton("");
		scButton1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int quantity =Integer.valueOf ((String)comboBox1_5.getSelectedItem());
				
				for (int i = 0; i < quantity; i++) {
					user.buy();
					String name = shop.getGoods().get(5).getName();
					double price = shop.getGoods().get(5).getPrice()*user.calcPenalty();
					sc.add(name,Math.ceil(price));
					addTable(name, (int)Math.ceil(price));
					sum.setText("目前購買數量: " +sc.getQuantity());
					sum_1.setText("目前價格: $" + sc.getPrice());
					
				}
				
			}
		});
		scButton1_5.setBackground(Color.WHITE);
		scButton1_5.setBounds(600, 665, 23, 23);
		scButton1_5.setIcon(new ImageIcon(getClass().getResource("/1616.png")));
		contentPane.add(scButton1_5);
		
		JLabel lblNewLabel = new JLabel("購買人:" + id);
		lblNewLabel.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblNewLabel.setBounds(30, 10, 402, 29);
		contentPane.add(lblNewLabel);
		
		
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Workbook book;
				try {
					book = new XSSFWorkbook(this.getClass().getResourceAsStream("/luckylucky.xlsx"));
					XSSFSheet sheet =  (XSSFSheet) book.getSheetAt(0);
					int currentRow = sheet.getLastRowNum()+1;
					int currentCell = 0;
					
					Row row = sheet.createRow(sheet.getLastRowNum()+1);
					org.apache.poi.ss.usermodel.Cell id = row.createCell(0);
					org.apache.poi.ss.usermodel.Cell amount = row.createCell(1);
					org.apache.poi.ss.usermodel.Cell date = row.createCell(2);
					id.setCellValue(user.getId());
					amount.setCellValue(sc.getQuantity());
					Date d = new Date();
					SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
					String todaysDate = ft.format(d);
					date.setCellValue(todaysDate);
					
					try {
					    FileOutputStream fos = new FileOutputStream(new File("/Users/home/git/SmokerKiller1.0/SmokerKiller/images/luckylucky.xlsx"));
					    book.write(fos);
					    fos.flush();
					    fos.close();
					} catch (IOException e2) {
					    e2.printStackTrace();
					}
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				sc.printResult();
				dispose();
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(1008, 655, 70, 70);
		btnNewButton.setIcon(new ImageIcon(getClass().getResource("/next.png")));
		contentPane.add(btnNewButton);
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(699, 111, 383, 513);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		scrollPane.setViewportView(table);
		table.setBackground(Color.WHITE);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u54C1\u540D", "\u50F9\u683C"
			}
		));
		
		JButton btnNewButton_1 = new JButton("刪除最後一筆");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel dt = (DefaultTableModel) table.getModel();
				int rw = table.getRowCount()-1;
				lastPrice = (double) table.getValueAt(rw, 1);
				dt.removeRow(rw);
				user.rebuy();
				
				sc.deleteLast(lastPrice);
				sum.setText("目前購買數量: " +sc.getQuantity());
				sum_1.setText("目前價格: $" + sc.getPrice());
				//String r = dt.getValueAt(table.getSelectedRow(), 0).toString();
				
			}
		});
		btnNewButton_1.setBounds(965, 624, 117, 29);
		contentPane.add(btnNewButton_1);
		

	}
}
