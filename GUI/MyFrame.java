import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    private String text;
    private final int XSIZE = 500;
    private final int YSIZE = 300;
    private JButton button;
    private JTextField textField;
    private JPanel panel;
    public MyFrame(){
        this.setSize(XSIZE,YSIZE);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.button = new JButton("Click me!");
        this.textField = new JTextField("My text", 20);
        this.panel = new JPanel();
        this.panel.add(button);
        this.panel.add(textField);
        this.add(panel);
        this.setVisible(true);
        ButtonListener bl = new ButtonListener();
        button.addActionListener(bl);
        TextFieldListener tfl = new TextFieldListener();
        this.textField.addActionListener(tfl);

            }
    private class ButtonListener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println(textField.getText());
        }
    }
    private class TextFieldListener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent actionEvent) {
           text = textField.getText();
        }
    }



}
