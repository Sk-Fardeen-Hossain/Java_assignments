import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalcSwing extends JFrame implements ActionListener {
	JButton plusB, minusB, divideB, mulB, resetB, quitB;
	JLabel l1,l2,l3;
	JTextField num1Tf,num2Tf,resultTf;
	
	public SimpleCalcSwing() {
		setLayout(null);
		
		//Textareas and labels
		l1 = new JLabel("First no. :");
		l1.setBounds(20,50,100,40);
		add(l1);
		num1Tf = new JTextField(10);
		num1Tf.setBounds(100, 50,200,40);
		add(num1Tf);
		
		l2 = new JLabel("Second no. :");
		l2.setBounds(20,100,100,40);
		add(l2);
		num2Tf = new JTextField(10);
		num2Tf.setBounds(100, 100, 200,40);
		add(num2Tf);
		
		l3 = new JLabel("Result :");
		l3.setBounds(20,150,100,40);
		add(l3);
		resultTf = new JTextField(10);
		resultTf.setBounds(100, 150, 200,40);
		add(resultTf);
		
		
		//addition button
		plusB = new JButton("+");
		plusB.setBounds(100, 200, 50, 50);
		add(plusB);
		plusB.addActionListener(this);

		//subtraction button
		minusB = new JButton("-");
		minusB.setBounds(150, 200, 50, 50);
		add(minusB);
		minusB.addActionListener(this);

	
		//Multiplication button
		mulB = new JButton("X");
		mulB.setBounds(200,200,50,50);
		add(mulB);
		mulB.addActionListener(this);

	
		//Division button
		divideB = new JButton("/");
		divideB.setBounds(250,200,50,50);
		add(divideB);
		divideB.addActionListener(this);


		//Reset Button
		resetB = new JButton("Reset");
		resetB.setBounds(100, 270, 100,25);
		add(resetB);

		resetB.addActionListener(new ActionListener() {
           	public void actionPerformed(ActionEvent e) {
                num1Tf.setText(" ");
		num2Tf.setText(" ");
		resultTf.setText(" ");
            }
        });

		//Exit Button
		quitB = new JButton("QUIT");
		quitB.setBounds(200, 270, 100,25);
		add(quitB);

		quitB.addActionListener(new ActionListener() {
           	 public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

		//Frame
		setTitle("A simple Calculator");
		setSize(400,500);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
            	public void actionPerformed(ActionEvent e) {
                	int num1 = Integer.parseInt(num1Tf.getText());
                	int num2 = Integer.parseInt(num2Tf.getText());	
			if(e.getSource() == plusB) {		
                		int result = num1 + num2;
               			resultTf.setText("Addition : "+result);
			}
			if(e.getSource() == minusB) {
				int result = num1 - num2;
                		resultTf.setText("Subtraction : "+result);
			}
			if(e.getSource() == mulB) {
				int result = num1 * num2;
                		resultTf.setText("Multiplication : "+result);
			}
			if(e.getSource() == divideB) {
				int result = num1 / num2;
                		resultTf.setText("Divison : "+result);
			}
            	}
		
	
	public static void main(String[]args) {
		new SimpleCalcSwing();
	}
}