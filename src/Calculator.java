import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator {
	
	//initialize jframe class to create window to run calculator
	Calculator(){
		JFrame jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(1000,1200);
		jf.setVisible(true);
		jf.setLocation(200,250);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//outputdisplay to the user using jlabel class
		JLabel displayBox=new JLabel("Hello");
		displayBox.setBackground(Color.gray);
		displayBox.setForeground(Color.white);
		displayBox.setFont(new Font("Arial", Font.PLAIN, 90));
		displayBox.setBorder(BorderFactory.createEmptyBorder(20, 15, 20, 15));
		displayBox.setHorizontalAlignment(SwingConstants.RIGHT);
		displayBox.setBounds(50,50,900,110);
		displayBox.setOpaque(true);
		//code to add display box to the JFrame
		jf.add(displayBox);
		
		//digits of calulator
		JButton numberSeven=new JButton("7");
		numberSeven.setBounds(50, 210, 130, 130);
		numberSeven.setFont(new Font("Arial", Font.PLAIN, 90));
		numberSeven.setBorderPainted(false);
		//code to add number seven to JFrame
		jf.add(numberSeven);
		
		JButton numberEight=new JButton("8");
		numberEight.setBounds(210, 210, 130, 130);
		numberEight.setFont(new Font("Arial", Font.PLAIN, 90));
		numberEight.setBorderPainted(false);
		//code to add number seven to JFrame
		jf.add(numberEight);
		
		JButton numberNine=new JButton("9");
		numberNine.setBounds(370, 210, 130, 130);
		numberNine.setFont(new Font("Arial", Font.PLAIN, 90));
		numberNine.setBorderPainted(false);
		//code to add number seven to JFrame
		jf.add(numberNine);
	}
	
	//main function starts here
	public static void main(String ar[]) {
		new Calculator();
	}
}
