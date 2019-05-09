package mx.rafex.cursos.introduccion.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm extends Frame implements ActionListener {

    private static final long serialVersionUID = -6123855270895380633L;

    JLabel l1, l2, l3;
    JTextField tf1;
    JButton btn1;
    JPasswordField p1;

    LoginForm() {
        super("Login Form");
        this.setVisible(true);
        this.setBounds(-1, -1, 600, 600);
        final Panel panel = new Panel();
        this.l1 = new JLabel("Login Form");
        this.l1.setForeground(Color.blue);
        this.l1.setFont(new Font("Serif", Font.BOLD, 20));

        this.l2 = new JLabel("Username");
        this.l3 = new JLabel("Password");
        this.tf1 = new JTextField();
        this.p1 = new JPasswordField();
        this.btn1 = new JButton("Login");

        this.l1.setBounds(100, 30, 400, 30);
        this.l2.setBounds(80, 70, 200, 30);
        this.l3.setBounds(80, 110, 200, 30);
        this.tf1.setBounds(300, 70, 200, 30);
        this.p1.setBounds(300, 110, 200, 30);
        this.btn1.setBounds(150, 160, 100, 30);

        panel.add(this.l1);
        panel.add(this.l2);
        panel.add(this.tf1);
        panel.add(this.l3);
        panel.add(this.p1);
        panel.add(this.btn1);

        this.btn1.addActionListener(e -> {
            this.bb();
        });

        panel.setSize(600, 600);
//        panel.setLayout(null);
        panel.setVisible(true);

        this.add(panel);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(final WindowEvent evt) {
                LoginForm.this.exitForm(evt);
            }
        });
    }

    public void bb() {
        System.out.println("Estoy haciendo algo...");
        final String uname = this.tf1.getText();
        final String pass = new String(this.p1.getPassword());
        if (uname.equals("rafex") && pass.equals("123")) {
            final Welcome wel = new Welcome();
            wel.setVisible(true);
            final JLabel label = new JLabel("Welcome:" + uname);
            wel.add(label);
        } else {
            JOptionPane.showMessageDialog(this, "Incorrect login or password", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void exitForm(final WindowEvent evt) {
        System.out.print("Saliendo...");
        System.exit(0);
    }

    public static void main(final String[] args) {
        new LoginForm();
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        System.out.println(e);
        System.out.println(e.getActionCommand());

    }
}

class Welcome extends Frame {

    private static final long serialVersionUID = 3233155516987285057L;

    Welcome() {

        this.setTitle("Welcome");
        this.setSize(400, 200);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(final WindowEvent evt) {
                try {
                    this.finalize();
                } catch (final Throwable e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
    }
}
