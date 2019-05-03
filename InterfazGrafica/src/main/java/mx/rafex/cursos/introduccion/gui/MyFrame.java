package mx.rafex.cursos.introduccion.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {

    private static final long serialVersionUID = -965197318344048837L;

    public MyFrame() {
        initComponents();
    }

    public MyFrame(final String title) {
        super(title);
        initComponents();
    }

    private void initComponents() {

        this.setSize(400, 400);
        setLocationRelativeTo(null);
//        this.setBounds(100, 400, 400, 400);
        setLayout(new FlowLayout());

        final TextField texto = new TextField("Introduce texto");
        final Button boton = new Button("Enviar...");

        this.add(texto);
        this.add(boton);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(final WindowEvent evt) {
                exitForm(evt);
            }
        });
    }

    private void exitForm(final WindowEvent evt) {
        System.out.print("Saliendo...");
        System.exit(0);
    }

}
