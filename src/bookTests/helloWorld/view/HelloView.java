package bookTests.helloWorld.view;

import bookTests.helloWorld.controller.IController;
import bookTests.helloWorld.controller.HelloController;
import bookTests.helloWorld.model.HelloModel;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HelloView extends JFrame implements IView {
    private HelloController controller;
    private JPanel topPane;
    private JPanel botPane;
    private JLabel greetingLabel;
    private JButton greetingBtn;

    public HelloView() {
        this.setController(new HelloController(new HelloModel()));
        this.initComponents();
    }

    public void initComponents() {
        // Define UI panes
        topPane = new JPanel();
        botPane = new JPanel();

        // Define pane components
        greetingLabel = new JLabel();
        greetingBtn = new JButton();

        greetingBtn.setText("Greet");
        greetingBtn.setToolTipText("Click to greet!");

        // Configure frame properties
        this.setLayout(null);
        this.setSize(500, 500);

        // Configure and set inner panes
        topPane.setSize(200, 150);
        topPane.setBorder(new EmptyBorder(50, 50, 50, 50));
        topPane.add(greetingLabel);

        botPane.setSize(200, 150);
        botPane.setBorder(new EmptyBorder(100, 100, 100, 100));
        botPane.add(greetingBtn);

        getContentPane().add(topPane);
        getContentPane().add(botPane);
        //getContentPane().setSize(200, 300);

        // Set UI listeners
        addListeners();
    }

    public void addListeners() {
        // Add window listeners
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                endProgram(evt);
            }
        });

        // Add object listeners
        greetingBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                greet();
            }
        });
    }

    public void greet() {
        // Set text and basic properties
        greetingLabel.setHorizontalAlignment(SwingConstants.CENTER);
        greetingLabel.setFont(new Font("Dialog", 1, 18));
        greetingLabel.setText(getController().castModel().getGreeting());

        // Set text background color
        float red, green, blue;
        red = green = blue = (float) Math.random();

        greetingLabel.setForeground(new Color(red, green, blue));
    }

    private void endProgram(WindowEvent evt) {
        System.exit(0);
    }

    @Override
    public HelloController getController() { return controller; }

    @Override
    public void setController(IController controller) { this.controller = (HelloController) controller; }

    public static void main(String[] args) {
        HelloView hello = new HelloView();
        hello.setVisible(true);
    }
}
