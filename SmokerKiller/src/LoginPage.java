import java.awt.EventQueue;

import java.util.*;
import java.text.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextArea;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.SpringLayout;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.DropMode;
import javax.swing.JFormattedTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import org.*;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LoginPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public LoginPage(Shop shop, ShoppingCart sc, Date todaysDate) {
		setResizable(false);
		setBackground(new Color(255, 255, 255));
		setTitle("菸鬼終結者1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 315, 213);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 235, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(93, 53, 114, 21);
		contentPane.add(formattedTextField);
		
		JButton btnNewButton = new JButton("身分驗證");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = formattedTextField.getText();
				if (id.length() != 10 | !Character.isUpperCase(id.charAt(0))) {
					JOptionPane.showMessageDialog(null, "格式錯誤", "格式錯誤", JOptionPane.ERROR_MESSAGE);
					
				}else {
					int boughtThisWeek = 0;
					int boughtLastWeek = 0;
					Workbook book;
					try {
						book = new XSSFWorkbook(this.getClass().getResourceAsStream("/luckylucky.xlsx"));
						XSSFSheet shhet =  (XSSFSheet) book.getSheetAt(0);
						
						for (Row cells : shhet) {
							
							try {
								if(cells.getCell(0).getStringCellValue().equals(id)) {
									String date = cells.getCell(2).getStringCellValue();
									Date seven = new Date(todaysDate.getTime() - (long)7 * 24 * 60 * 60 * 1000);
									Date twoWeek = new Date(todaysDate.getTime() - (long)14 * 24 * 60 * 60 * 1000);
									SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
									Date com = ft.parse(date);
									int a = (int) cells.getCell(1).getNumericCellValue();
									if (com.compareTo(seven) >= 0) {
										boughtThisWeek += a;
									}else if(com.compareTo(twoWeek)>=0 && com.compareTo(seven)<=0){
										boughtLastWeek += a;
									}
									
									
								}
								
							} catch (NullPointerException | ParseException NPE) {

							}
							
						}
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					User user = new User(id, boughtLastWeek, boughtThisWeek);
					dispose();
					ShopPage shopPage = new ShopPage(id,shop,sc,user);
					shopPage.setVisible(true);
				}
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(108, 103, 85, 23);
		contentPane.add(btnNewButton);
	}
}
