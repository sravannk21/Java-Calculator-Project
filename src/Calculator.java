import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	//cheking any operator clicked?
	boolean isOperatorClicked=false;
	JLabel displayBox;
	//digits obects
	JButton numberSeven,numberEight,numberNine,numberFour,numberFive,
	numberSix,numberOne,numberTwo,numberThree,dotButton,numberZero;
	//operators objects
	JButton divisionButton,additionButton,subtractionButton,multiplictionButton,clearButton,backSpace;
	
	//initialize jframe class to create window to run calculator
	Calculator(){
		JFrame jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(720,1100);
		jf.setVisible(true);
		jf.setLocation(200,250);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//outputdisplay to the user using jlabel class
		displayBox=new JLabel();
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
		numberSeven=new JButton("7");
		numberSeven.setBounds(50, 210, 130, 130);
		numberSeven.setFont(new Font("Arial", Font.PLAIN, 90));
		numberSeven.setBorderPainted(false);
		numberSeven.addActionListener(this);
		//code to add number seven to JFrame
		jf.add(numberSeven);
		
		numberEight=new JButton("8");
		numberEight.setBounds(210, 210, 130, 130);
		numberEight.setFont(new Font("Arial", Font.PLAIN, 90));
		numberEight.setBorderPainted(false);
		numberEight.addActionListener(this);
		//code to add number eight to JFrame
		jf.add(numberEight);
		
		numberNine=new JButton("9");
		numberNine.setBounds(370, 210, 130, 130);
		numberNine.setFont(new Font("Arial", Font.PLAIN, 90));
		numberNine.setBorderPainted(false);
		numberNine.addActionListener(this);
		//code to add number nine to JFrame
		jf.add(numberNine);
		
		//digits of calulator 4-6
		numberFour=new JButton("4");
		numberFour.setBounds(50, 370, 130, 130);
		numberFour.setFont(new Font("Arial", Font.PLAIN, 90));
		numberFour.setBorderPainted(false);
		numberFour.addActionListener(this);
		//code to add number four to JFrame
		jf.add(numberFour);
		
		numberFive=new JButton("5");
		numberFive.setBounds(210, 370, 130, 130);
		numberFive.setFont(new Font("Arial", Font.PLAIN, 90));
		numberFive.setBorderPainted(false);
		numberFive.addActionListener(this);
		//code to add number five to JFrame
		jf.add(numberFive);
		
		numberSix=new JButton("6");
		numberSix.setBounds(370, 370, 130, 130);
		numberSix.setFont(new Font("Arial", Font.PLAIN, 90));
		numberSix.setBorderPainted(false);
		numberSix.addActionListener(this);
		//code to add number six to JFrame
		jf.add(numberSix);
		
		
		//digits of calulator 1-3
		numberOne=new JButton("1");
		numberOne.setBounds(50, 530, 130, 130);
		numberOne.setFont(new Font("Arial", Font.PLAIN, 90));
		numberOne.setBorderPainted(false);
		numberOne.addActionListener(this);
		//code to add number One to JFrame
		jf.add(numberOne);
		
		numberTwo=new JButton("2");
		numberTwo.setBounds(210, 530, 130, 130);
		numberTwo.setFont(new Font("Arial", Font.PLAIN, 90));
		numberTwo.setBorderPainted(false);
		numberTwo.addActionListener(this);
		//code to add number Two to JFrame
		jf.add(numberTwo);
		
		numberThree=new JButton("3");
		numberThree.setBounds(370, 530, 130, 130);
		numberThree.setFont(new Font("Arial", Font.PLAIN, 90));
		numberThree.setBorderPainted(false);
		numberThree.addActionListener(this);
		//code to add number Three to JFrame
		jf.add(numberThree);
		
		
		//digits of calulator(.,0=)
		dotButton=new JButton(".");
		dotButton.setBounds(50, 690, 130, 130);
		dotButton.setFont(new Font("Arial", Font.PLAIN, 90));
		dotButton.setBorderPainted(false);
		dotButton.addActionListener(this);
		//code to add dot button to JFrame
		jf.add(dotButton);
		
		numberZero=new JButton("0");
		numberZero.setBounds(210, 690, 130, 130);
		numberZero.setFont(new Font("Arial", Font.PLAIN, 90));
		numberZero.setBorderPainted(false);
		numberZero.addActionListener(this);
		//code to add number zero to JFrame
		jf.add(numberZero);
		
		JButton equalButton=new JButton("=");
		equalButton.setBounds(370, 690, 130, 130);
		equalButton.setFont(new Font("Arial", Font.PLAIN, 90));
		equalButton.setBorderPainted(false);
		//code to add equal button to JFrame
		jf.add(equalButton);
		
		
		//digits of operations
		divisionButton=new JButton("/");
		divisionButton.setBounds(530, 210, 130, 130);
		divisionButton.setFont(new Font("Arial", Font.PLAIN, 90));
		divisionButton.setBorderPainted(false);
		divisionButton.addActionListener(this);
		//code to add division button to JFrame
		jf.add(divisionButton);
		
		additionButton=new JButton("+");
		additionButton.setBounds(530, 370, 130, 130);
		additionButton.setFont(new Font("Arial", Font.PLAIN, 90));
		additionButton.setBorderPainted(false);
		additionButton.addActionListener(this);
		//code to add addition button to JFrame
		jf.add(additionButton);
		
		subtractionButton=new JButton("-");
		subtractionButton.setBounds(530, 530, 130, 130);
		subtractionButton.setFont(new Font("Arial", Font.PLAIN, 90));
		subtractionButton.setBorderPainted(false);
		subtractionButton.addActionListener(this);
		//code to add subtraction button to JFrame
		jf.add(subtractionButton);
		
		multiplictionButton=new JButton("*");
		multiplictionButton.setBounds(530, 690, 130, 130);
		multiplictionButton.setFont(new Font("Arial", Font.PLAIN, 90));
		multiplictionButton.setBorderPainted(false);
		multiplictionButton.addActionListener(this);
		//code to add subtraction button to JFrame
		jf.add(multiplictionButton);
		
		clearButton=new JButton("Clear");
		clearButton.setBounds(50, 850, 290, 130);
		clearButton.setFont(new Font("Arial", Font.PLAIN, 40));
		clearButton.setBorderPainted(false);
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		backSpace=new JButton("Backspace");
		backSpace.setBounds(370, 850, 290, 130);
		backSpace.setFont(new Font("Arial", Font.PLAIN, 40));
		backSpace.setBorderPainted(false);
		backSpace.addActionListener(this);
		jf.add(backSpace);
	}
	
	//main function starts here
	public static void main(String ar[]) {
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==numberSeven) {
			if(isOperatorClicked) {
				displayBox.setText("7");
				isOperatorClicked=false;
			}
			else {
				displayBox.setText(displayBox.getText()+"7");
			}
		}
		else if(e.getSource()==numberEight) {
				if(isOperatorClicked) {
					displayBox.setText("8");
					isOperatorClicked=false;
				}
				else {
					displayBox.setText(displayBox.getText()+"8");
				}
		}
		else if(e.getSource()==numberNine) {
				if(isOperatorClicked) {
					displayBox.setText("9");
					isOperatorClicked=false;
				}
				else {
					displayBox.setText(displayBox.getText()+"9");
				}
		}
		else if(e.getSource()==numberSix) {
				if(isOperatorClicked) {
					displayBox.setText("6");
					isOperatorClicked=false;
				}
				else {
					displayBox.setText(displayBox.getText()+"6");
				}
		}
		else if(e.getSource()==numberFive) {
				if(isOperatorClicked) {
					displayBox.setText("5");
					isOperatorClicked=false;
				}
				else {
					displayBox.setText(displayBox.getText()+"5");
				}
		}
		else if(e.getSource()==numberFour) {
				if(isOperatorClicked) {
					displayBox.setText("4");
					isOperatorClicked=false;
				}
				else {
					displayBox.setText(displayBox.getText()+"4");
				}
		}
		else if(e.getSource()==numberThree) {
				if(isOperatorClicked) {
					displayBox.setText("3");
					isOperatorClicked=false;
				}
				else {
					displayBox.setText(displayBox.getText()+"3");
				}
		}
		else if(e.getSource()==numberTwo) {
				if(isOperatorClicked) {
					displayBox.setText("2");
					isOperatorClicked=false;
				}
				else {
					displayBox.setText(displayBox.getText()+"2");
				}
		}
		else if(e.getSource()==numberOne) {
				if(isOperatorClicked) {
					displayBox.setText("1");
					isOperatorClicked=false;
				}
				else {
					displayBox.setText(displayBox.getText()+"1");
				}
		}
		else if(e.getSource()==numberZero) {
				if(isOperatorClicked) {
					displayBox.setText("0");
					isOperatorClicked=false;
				}
				else {
					displayBox.setText(displayBox.getText()+"0");
				}
		}
		else if(e.getSource()==dotButton) {
				if(isOperatorClicked) {
					displayBox.setText(".");
					isOperatorClicked=false;
				}
				else {
					displayBox.setText(displayBox.getText()+".");
				}
		}
		else if(e.getSource()==clearButton) {
			displayBox.setText("");
		}
		else if(e.getSource()==backSpace) {
			String currentText = displayBox.getText();
		    if (!currentText.isEmpty()) {
		        // Remove the last character
		        displayBox.setText(currentText.substring(0, currentText.length() - 1));
		    }
		}
		
		//operations
		else if(e.getSource()==additionButton) {
			isOperatorClicked=true;
		}
		else if(e.getSource()==subtractionButton) {
			isOperatorClicked=true;
			
		}
		else if(e.getSource()==multiplictionButton) {
			isOperatorClicked=true;
			
		}
		else if(e.getSource()==divisionButton) {
			isOperatorClicked=true;
			
		}
		
	}
}
