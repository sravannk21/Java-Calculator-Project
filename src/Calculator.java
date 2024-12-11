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
		//code to add number eight to JFrame
		jf.add(numberEight);
		
		JButton numberNine=new JButton("9");
		numberNine.setBounds(370, 210, 130, 130);
		numberNine.setFont(new Font("Arial", Font.PLAIN, 90));
		numberNine.setBorderPainted(false);
		//code to add number nine to JFrame
		jf.add(numberNine);
		
		//digits of calulator 4-6
		JButton numberFour=new JButton("4");
		numberFour.setBounds(50, 370, 130, 130);
		numberFour.setFont(new Font("Arial", Font.PLAIN, 90));
		numberFour.setBorderPainted(false);
		//code to add number four to JFrame
		jf.add(numberFour);
		
		JButton numberFive=new JButton("5");
		numberFive.setBounds(210, 370, 130, 130);
		numberFive.setFont(new Font("Arial", Font.PLAIN, 90));
		numberFive.setBorderPainted(false);
		//code to add number five to JFrame
		jf.add(numberFive);
		
		JButton numberSix=new JButton("6");
		numberSix.setBounds(370, 370, 130, 130);
		numberSix.setFont(new Font("Arial", Font.PLAIN, 90));
		numberSix.setBorderPainted(false);
		//code to add number six to JFrame
		jf.add(numberSix);
		
		
		//digits of calulator 1-3
		JButton numberOne=new JButton("1");
		numberOne.setBounds(50, 530, 130, 130);
		numberOne.setFont(new Font("Arial", Font.PLAIN, 90));
		numberOne.setBorderPainted(false);
		//code to add number One to JFrame
		jf.add(numberOne);
		
		JButton numberTwo=new JButton("2");
		numberTwo.setBounds(210, 530, 130, 130);
		numberTwo.setFont(new Font("Arial", Font.PLAIN, 90));
		numberTwo.setBorderPainted(false);
		//code to add number Two to JFrame
		jf.add(numberTwo);
		
		JButton numberThree=new JButton("3");
		numberThree.setBounds(370, 530, 130, 130);
		numberThree.setFont(new Font("Arial", Font.PLAIN, 90));
		numberThree.setBorderPainted(false);
		//code to add number Three to JFrame
		jf.add(numberThree);
	}
	
	//main function starts here
	public static void main(String ar[]) {
		new Calculator();
	}
}
