package mx.rafex.cursos.introduccion.dia2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JavaCalculator implements ActionListener {

    JFrame guiFrame;
    JPanel buttonPanel;
    JTextField numberCalc;
    int calcOperation = 0;
    int currentCalc;

    public static void main(final String[] args) {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {

                new JavaCalculator();
            }
        });

    }

    public JavaCalculator() {
        guiFrame = new JFrame();
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("Simple Calculator");
        guiFrame.setSize(300, 300);
        guiFrame.setLocationRelativeTo(null);
        numberCalc = new JTextField();
        numberCalc.setHorizontalAlignment(JTextField.RIGHT);
        numberCalc.setEditable(false);
        guiFrame.add(numberCalc, BorderLayout.NORTH);
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));
        guiFrame.add(buttonPanel, BorderLayout.CENTER);

        for (int i = 0; i < 10; i++)
            addNumberButton(buttonPanel, String.valueOf(i));

        addActionButton(buttonPanel, 1, "+");
        addActionButton(buttonPanel, 2, "-");
        addActionButton(buttonPanel, 3, "*");
        addActionButton(buttonPanel, 4, "/");
        addActionButton(buttonPanel, 5, "^2");

        final JButton equalsButton = new JButton("=");
        equalsButton.setActionCommand("=");
        equalsButton.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent event) {
                if (!numberCalc.getText().isEmpty()) {
                    final int number = Integer.parseInt(numberCalc.getText());
                    if (calcOperation == 1) {
                        final int calculate = currentCalc + number;
                        numberCalc.setText(Integer.toString(calculate));
                    } else if (calcOperation == 2) {
                        final int calculate = currentCalc - number;
                        numberCalc.setText(Integer.toString(calculate));
                    } else if (calcOperation == 3) {
                        final int calculate = currentCalc * number;
                        numberCalc.setText(Integer.toString(calculate));
                    } else if (calcOperation == 4) {
                        final int calculate = currentCalc / number;
                        numberCalc.setText(Integer.toString(calculate));
                    } else if (calcOperation == 5) {
                        final int calculate = currentCalc * currentCalc;
                        numberCalc.setText(Integer.toString(calculate));
                    }
                }
            }
        });

        buttonPanel.add(equalsButton);
        guiFrame.setVisible(true);
    }

    private void addNumberButton(final Container parent, final String name) {
        final JButton but = new JButton(name);
        but.setActionCommand(name);
        but.addActionListener(this);
        parent.add(but);
    }

    private void addActionButton(final Container parent, final int action, final String text) {
        final JButton but = new JButton(text);
        but.setActionCommand(text);
        final OperatorAction addAction = new OperatorAction(1);
        but.addActionListener(addAction);
        parent.add(but);
    }

    public void actionPerformed(final ActionEvent event) {
        final String action = event.getActionCommand();

        numberCalc.setText(action);
    }

    private class OperatorAction implements ActionListener {
        private final int operator;

        public OperatorAction(final int operation) {
            operator = operation;
        }

        public void actionPerformed(final ActionEvent event) {
            currentCalc = Integer.parseInt(numberCalc.getText());
            calcOperation = operator;
        }
    }
}
