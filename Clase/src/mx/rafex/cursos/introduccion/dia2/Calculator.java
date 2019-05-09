package mx.rafex.cursos.introduccion.dia2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 * Hello world!
 *
 */
public class Calculator extends JFrame implements ActionListener {
    // create a frame
    static JFrame fdklsjljdks;

    // hksdfhsdjkf

    // create a textfield
    static JTextField l;

    // store oprerator and operands
    String s0, s1, s2;

    // default constrcutor
    Calculator() {
        this.s0 = this.s1 = this.s2 = "";
    }

    // main function
    public static void main(final String args[]) {
        // create a frame
        fdklsjljdks = new JFrame("calculator");

        try {
            // set look and feel
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (final Exception e) {
            System.err.println(e.getMessage());
        }

        // create a object of class
        final Calculator c = new Calculator();

        // create a textfield
        l = new JTextField(16);

        // set the textfield to non editable
        l.setEditable(false);

        // create number buttons and some operators
        JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, be, beq, beq1;

        // create number buttons
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");

        // equals button
        beq1 = new JButton("=");

        // create operator buttons
        ba = new JButton("+");
        bs = new JButton("-");
        bd = new JButton("/");
        bm = new JButton("*");
        beq = new JButton("C");

        // create . button
        be = new JButton(".");

        // create a panel
        final JPanel p = new JPanel();

        // add action listeners
        bm.addActionListener(c);
        bd.addActionListener(c);
        bs.addActionListener(c);
        ba.addActionListener(c);
        b9.addActionListener(c);
        b8.addActionListener(c);
        b7.addActionListener(c);
        b6.addActionListener(c);
        b5.addActionListener(c);
        b4.addActionListener(c);
        b3.addActionListener(c);
        b2.addActionListener(c);
        b1.addActionListener(c);
        b0.addActionListener(c);
        be.addActionListener(c);
        beq.addActionListener(c);
        beq1.addActionListener(c);

        // add elements to panel
        p.add(l);
        p.add(ba);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(bs);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(bm);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(bd);
        p.add(be);
        p.add(b0);
        p.add(beq);
        p.add(beq1);

        // set Background of panel
        p.setBackground(Color.blue);

        // add panel to frame
        fdklsjljdks.add(p);

        fdklsjljdks.setSize(200, 220);
        fdklsjljdks.show();
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        final String s = e.getActionCommand();

        // if the value is a number
        if (((s.charAt(0) >= '0') && (s.charAt(0) <= '9')) || (s.charAt(0) == '.')) {
            // if operand is present then add to second no
            if (!this.s1.equals("")) {
                this.s2 = this.s2 + s;
            } else {
                this.s0 = this.s0 + s;
            }

            // set the value of text
            l.setText(this.s0 + this.s1 + this.s2);
        } else if (s.charAt(0) == 'C') {
            // clear the one letter
            this.s0 = this.s1 = this.s2 = "";

            // set the value of text
            l.setText(this.s0 + this.s1 + this.s2);
        } else if (s.charAt(0) == '=') {

            double te;

            // store the value in 1st
            if (this.s1.equals("+")) {
                te = Double.parseDouble(this.s0) + Double.parseDouble(this.s2);
            } else if (this.s1.equals("-")) {
                te = Double.parseDouble(this.s0) - Double.parseDouble(this.s2);
            } else if (this.s1.equals("/")) {
                te = Double.parseDouble(this.s0) / Double.parseDouble(this.s2);
            } else {
                te = Double.parseDouble(this.s0) * Double.parseDouble(this.s2);
            }

            // set the value of text
            l.setText(this.s0 + this.s1 + this.s2 + "=" + te);

            // convert it to string
            this.s0 = Double.toString(te);

            this.s1 = this.s2 = "";
        } else {
            // if there was no operand
            if (this.s1.equals("") || this.s2.equals("")) {
                this.s1 = s;
            } else {
                double te;

                // store the value in 1st
                if (this.s1.equals("+")) {
                    te = Double.parseDouble(this.s0) + Double.parseDouble(this.s2);
                } else if (this.s1.equals("-")) {
                    te = Double.parseDouble(this.s0) - Double.parseDouble(this.s2);
                } else if (this.s1.equals("/")) {
                    te = Double.parseDouble(this.s0) / Double.parseDouble(this.s2);
                } else {
                    te = Double.parseDouble(this.s0) * Double.parseDouble(this.s2);
                }

                // convert it to string
                this.s0 = Double.toString(te);

                // place the operator
                this.s1 = s;

                // make the operand blank
                this.s2 = "";
            }

            // set the value of text
            l.setText(this.s0 + this.s1 + this.s2);
        }
    }
}
