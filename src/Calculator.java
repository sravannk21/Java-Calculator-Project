import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
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
	}
	
	//main function starts here
	public static void main(String ar[]) {
		new Calculator();
	}
}
