package bg.smg.frame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener {
    private JButton loginBtn;
    private JLabel usernameLbl;
    private JLabel passwordLbl;
    private JTextField usernameTxf;
    private JPasswordField passwordPwdF;
    private JButton fpBtn;
    private JButton signupBtn;
    public LoginFrame(){
        this.setTitle("Login into Bank app");
        this.setSize(400, 240);
        this.setLayout(null);

        loginBtn = new JButton("Login");
        usernameLbl = new JLabel("Username");
        passwordLbl = new JLabel("Password");
        usernameTxf = new JTextField();
        passwordPwdF = new JPasswordField();
        fpBtn = new JButton("Forgotten Password");
        signupBtn = new JButton("Sign Up");

        usernameLbl.setBounds(40,20,100,20);
        usernameTxf.setBounds(140,20,160,20);
        passwordLbl.setBounds(40,60,160,20);
        passwordPwdF.setBounds(140, 60, 160, 20);
        loginBtn.setBounds(140,100,100,20);
        signupBtn.setBounds(40,140,100,20);
        fpBtn.setBounds(180,140,180,20);


        this.add(loginBtn);
        this.add(usernameLbl);
        this.add(passwordLbl);
        this.add(usernameTxf);
        this.add(passwordPwdF);
        this.add(fpBtn);
        this.add(signupBtn);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
