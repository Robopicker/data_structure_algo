import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class helloworld {

	protected static final int ERROR_MESSAGE = 0;
	private JFrame frame;
	private JTextField textFieldnum1;
	private JTextField textFieldnum2;
	private JTextField Textfieldans;
	private JButton divide;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					helloworld window = new helloworld();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public helloworld() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldnum1 = new JTextField();
		textFieldnum1.setBounds(22, 11, 157, 36);
		frame.getContentPane().add(textFieldnum1);
		textFieldnum1.setColumns(10);
		
		textFieldnum2 = new JTextField();
		textFieldnum2.setBounds(248, 15, 157, 32);
		frame.getContentPane().add(textFieldnum2);
		textFieldnum2.setColumns(10);
		
		JButton btnAdd = new JButton("add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1, num2, ans;
				try
				{
					num1=Integer.parseInt(textFieldnum1.getText());
					num2=Integer.parseInt(textFieldnum2.getText());
					ans=num1+num2;
					Textfieldans.setText(Integer.toString(ans));
				}catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,"invalid number","error", ERROR_MESSAGE);
				}
			}
		});
		btnAdd.setBounds(51, 72, 89, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton btnAdd_1 = new JButton("subtract");
		btnAdd_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1, num2, ans;
				try
				{
					num1=Integer.parseInt(textFieldnum1.getText());
					num2=Integer.parseInt(textFieldnum2.getText());
					ans=num1-num2;
					Textfieldans.setText(Integer.toString(ans));
				}catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,"invalid number","error", ERROR_MESSAGE);
				}
			}
		});
		btnAdd_1.setBounds(276, 72, 89, 23);
		frame.getContentPane().add(btnAdd_1);
		
		JLabel lblNewLabel = new JLabel("  answer");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(120, 208, 89, 23);
		frame.getContentPane().add(lblNewLabel);
		
		Textfieldans = new JTextField();
		Textfieldans.setBounds(248, 187, 157, 45);
		frame.getContentPane().add(Textfieldans);
		Textfieldans.setColumns(10);
		
		divide = new JButton("divide");
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				try
				{
					num1=Integer.parseInt(textFieldnum1.getText());
					num2=Integer.parseInt(textFieldnum2.getText());
					ans=num1/num2;
					Textfieldans.setText(Integer.toString(ans));
				}catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null,"invalid number or enter divisor zero","error", ERROR_MESSAGE);
				}
				
			}
		});
		divide.setBounds(51, 127, 89, 23);
		frame.getContentPane().add(divide);
		
		btnNewButton_1 = new JButton("modulus");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				int num1, num2, ans;
				try
				{
					num1=Integer.parseInt(textFieldnum1.getText());
					num2=Integer.parseInt(textFieldnum2.getText());
					ans=num1%num2;
					Textfieldans.setText(Integer.toString(ans));
				}catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,"invalid number","error", ERROR_MESSAGE);
				}
				
			}
		});
		btnNewButton_1.setBounds(276, 127, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(22, 161, 72, 70);
		frame.getContentPane().add(panel);
	}
}
