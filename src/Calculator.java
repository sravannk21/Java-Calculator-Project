import javax.swing.JFrame;

public class Calculator {
	
	//initialize jframe class to create window to run calculator
	Calculator(){
		JFrame jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(1000,1200);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//main function starts here
	public static void main(String ar[]) {
		new Calculator();
	}
}
