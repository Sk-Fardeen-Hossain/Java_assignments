import java.awt.*;
import java.awt.event.*;

public class LoginFormAWT extends Frame {
    private TextField usernameTextField;
    private TextField passwordTextField;
    private TextArea displayTextArea;

    public LoginForm() {
        setTitle("Login App");
        setSize(400, 300);
        setLayout(new FlowLayout());

        Label usernameLabel = new Label("Username: ");
        usernameTextField = new TextField(20);

        Label passwordLabel = new Label("Password: ");
        passwordTextField = new TextField(20);
        passwordTextField.setEchoChar('*');

        Button loginButton = new Button("Login");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameTextField.getText();
                String password = passwordTextField.getText();
                String data = "Username: " + username + "\nPassword: " + password + "\n";
                displayTextArea.append(data);
            }
        });

        displayTextArea = new TextArea(10, 30);
        displayTextArea.setEditable(false);

        add(usernameLabel);
        add(usernameTextField);
        add(passwordLabel);
        add(passwordTextField);
        add(loginButton);
        add(displayTextArea);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginFormAWT();
    }
}
