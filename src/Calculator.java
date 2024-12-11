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
		jf.setSize(720,1000);
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
		displayBox.setBounds(50,50,620,110);
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
		
		
		//digits of calulator(.,0=)
		JButton dotButton=new JButton(".");
		dotButton.setBounds(50, 690, 130, 130);
		dotButton.setFont(new Font("Arial", Font.PLAIN, 90));
		dotButton.setBorderPainted(false);
		//code to add dot button to JFrame
		jf.add(dotButton);
		
		JButton numberZero=new JButton("0");
		numberZero.setBounds(210, 690, 130, 130);
		numberZero.setFont(new Font("Arial", Font.PLAIN, 90));
		numberZero.setBorderPainted(false);
		//code to add number zero to JFrame
		jf.add(numberZero);
		
		JButton equalButton=new JButton("=");
		equalButton.setBounds(370, 690, 130, 130);
		equalButton.setFont(new Font("Arial", Font.PLAIN, 90));
		equalButton.setBorderPainted(false);
		//code to add equal button to JFrame
		jf.add(equalButton);
		
		
		//digits of operations
		JButton divisionButton=new JButton("/");
		divisionButton.setBounds(530, 210, 130, 130);
		divisionButton.setFont(new Font("Arial", Font.PLAIN, 90));
		divisionButton.setBorderPainted(false);
		//code to add division button to JFrame
		jf.add(divisionButton);
		
		JButton additionButton=new JButton("+");
		additionButton.setBounds(530, 370, 130, 130);
		additionButton.setFont(new Font("Arial", Font.PLAIN, 90));
		additionButton.setBorderPainted(false);
		//code to add addition button to JFrame
		jf.add(additionButton);
		
		JButton subtractionButton=new JButton("-");
		subtractionButton.setBounds(530, 530, 130, 130);
		subtractionButton.setFont(new Font("Arial", Font.PLAIN, 90));
		subtractionButton.setBorderPainted(false);
		//code to add subtraction button to JFrame
		jf.add(subtractionButton);
		
		JButton multiplictionButton=new JButton("*");
		multiplictionButton.setBounds(530, 690, 130, 130);
		multiplictionButton.setFont(new Font("Arial", Font.PLAIN, 90));
		multiplictionButton.setBorderPainted(false);
		//code to add subtraction button to JFrame
		jf.add(multiplictionButton);
	}
	
	//main function starts here
	public static void main(String ar[]) {
		new Calculator();
	}
}
