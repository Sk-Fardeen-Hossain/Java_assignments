import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegFormSwing extends JFrame implements ActionListener {
    private JLabel heading, nameLabel, emailLabel, passwordLabel, deptLabel;
    private JTextField nameTextField, emailTextField;
	private JPasswordField passwordTextField;
    private JButton signupButton;
    private JTextArea displayTextArea;
    private JRadioButton maleRadioButton, femaleRadioButton;
	private JComboBox cmb;
    private ButtonGroup genderButtonGroup;

    public SwingAssignment() {
        setLayout(null);
		heading = new JLabel("COLLEGE REGISTRATION FORM");
		heading.setBounds(240, 10, 350, 50);
		heading.setFont(new Font("Sherif", Font.BOLD, 20));
		add(heading);
		
        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 80, 120, 40);
        add(nameLabel);
        nameTextField = new JTextField(20);
        nameTextField.setBounds(170, 80, 150, 30);
        add(nameTextField);

        emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 130, 120, 40);
        add(emailLabel);
        emailTextField = new JTextField(20);
        emailTextField.setBounds(170, 130, 150, 30);
        add(emailTextField);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 180, 120, 40);
        add(passwordLabel);
        passwordTextField = new JPasswordField(20);
        passwordTextField.setBounds(170, 180, 150, 30);
        passwordTextField.setEchoChar('*');
        add(passwordTextField);

        genderButtonGroup = new ButtonGroup();
        maleRadioButton = new JRadioButton("Male", false);
        maleRadioButton.setBounds(50, 220, 100, 40);
        femaleRadioButton = new JRadioButton("Female", false);
        femaleRadioButton.setBounds(50, 250, 100, 40);
        genderButtonGroup.add(femaleRadioButton);
        genderButtonGroup.add(maleRadioButton);
        add(maleRadioButton);
        add(femaleRadioButton);

        signupButton = new JButton("REGISTER");
        signupButton.setBounds(170, 300, 100, 30);
        signupButton.addActionListener(this);
        add(signupButton);
		
		deptLabel  = new JLabel(" Select Dept :");
		deptLabel.setBounds(50, 300,150,30);
		add(deptLabel);
		String department[] = {"","ECE","CSE","ME","AUE","EE","IT","AIML"};
		cmb = new JComboBox(department);
		cmb.setBounds(50, 300,100,30);
		add(cmb);

		displayTextArea = new JTextArea(10, 30);
        JScrollPane scrollPane = new JScrollPane(displayTextArea);
		displayTextArea.setEditable(false);
        scrollPane.setBounds(400, 80, 300, 280);
        add(scrollPane);

        setTitle("Registration Form");
        setSize(800, 400);
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == signupButton) {
            String name = nameTextField.getText();
            String email = emailTextField.getText();
            String password = passwordTextField.getText();
            String gender = maleRadioButton.isSelected() ? "Male" : "Female";
	    String dept = (String)cmb.getSelectedItem();

            displayTextArea.append("Name: " + name + "\n");
            displayTextArea.append("Email: " + email + "\n");
            displayTextArea.append("Password: " + password + "\n");
            displayTextArea.append("Gender: " + gender + "\n");
	    displayTextArea.append("Department : " +dept + "\n");
            displayTextArea.append("\n-----------------------------------------------------------------------------\n");

            nameTextField.setText("");
            emailTextField.setText("");
            passwordTextField.setText("");
	}
	}

    public static void main(String[] args) {
        new RegFormSwing();
    }
}
