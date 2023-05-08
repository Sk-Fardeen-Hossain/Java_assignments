import java.awt.*;
import java.awt.event.*;

public class RegFormAWT extends Frame implements ActionListener {
    private Label nameLabel, emailLabel, passwordLabel;
    private TextField nameTextField, emailTextField, passwordTextField;
    private Button signupButton;
    private TextArea displayTextArea;
	private CheckboxGroup cbg;  
    private Checkbox cb1, cb2;

    public AWTassignment() {
        // Set layout manager for the frame
        setLayout(null);

        // Create and add labels for input fields
        nameLabel = new Label("Name:");
		nameLabel.setBounds(50,80,120,40);
        add(nameLabel);
        nameTextField = new TextField(20);
		nameTextField.setBounds(170,80,150,30);
        add(nameTextField);

        emailLabel = new Label("Email:");
		emailLabel.setBounds(50,130,120,40);
        add(emailLabel);
        emailTextField = new TextField(20);
		emailTextField.setBounds(170,130,150,30);
        add(emailTextField);

        passwordLabel = new Label("Password:");
		passwordLabel.setBounds(50,180,120,40);
        add(passwordLabel);
        passwordTextField = new TextField(20);
		passwordTextField.setBounds(170,180,150,30);
        passwordTextField.setEchoChar('*');
        add(passwordTextField);
		
		cbg = new CheckboxGroup();
		cb1 = new Checkbox("Male", cbg, false);    
        cb1.setBounds(50,220, 50,50);    
        cb2 = new Checkbox("Female", cbg, true);    
        cb2.setBounds(50,230, 120,90);    
        add(cb1);    
        add(cb2);    

        // Create and add submit button
        signupButton = new Button("SIGN UP");
		signupButton.setBounds(170,360,60,30);
        signupButton.addActionListener(this);
        add(signupButton);

        // Create and add text area for display
        displayTextArea = new TextArea(10, 30);
		displayTextArea.setBounds(400,80,300,300);
        add(displayTextArea);

        // Set window properties
        setTitle("Registration Form");
        setSize(800, 400);
        setVisible(true);

        // Add window listener to handle closing event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // Handle button click event
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == signupButton) {
            // Get user input from text fields
            String name = nameTextField.getText();
            String email = emailTextField.getText();
            String password = passwordTextField.getText();

            // Append user input to text area
            displayTextArea.append("Name: " + name + "\n");
            displayTextArea.append("Email: " + email + "\n");
            displayTextArea.append("Password: " + password + "\n");
            displayTextArea.append("\n");

            // Clear text fields
            nameTextField.setText("");
            emailTextField.setText("");
            passwordTextField.setText("");
        }
    }

    public static void main(String[] args) {
        new RegFormAWT();
    }
}
