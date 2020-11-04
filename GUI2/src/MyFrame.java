import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Jag extendar JFrame och lägger alla min kod i det. Det gör det enkelt att hålla ordning på vad som händer
public class MyFrame extends JFrame {
    /*
    De objekt jag vill lägga till i mitt GUI lägger jag som instansvariabler. Det gör att jag kan nå dem från
    hela klassen men också från mina inre klasser.

     */

    private JPanel panel1;
    private JPanel panel2;
    private JButton button1;
    private JButton button2;
    private JLabel label1;
    private JTextField textField1;
    private JTextField textField2;
    private ImageIcon imageIcon;


    public MyFrame(){
        /*
        När jag sätter upp min JFram så hänvisar jag till den som this eftersom den instans
         jag jobbar i är en subklass till JFrame.

         */

        this.setSize(640,480);
        this.setTitle("Fönstret Arne");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //Denna är VIKTIGT !

        // Metoderna sätter upp de skärmar jag kommer att växla mellan!
        setPanel1();
        setPanel2();

        //Lägg till panel1 och visa
        this.add(panel1);
        this.setVisible(true);
    }

    /*
1. Skapa panelen
2. Skapa objekten som ska visas i panelen
3. Skapa lyssnare till de objekt vi vill interagera med.
4. Lägg lyssnaran till objekten.
5. lägg objekten till panelen
6. lägg panelen till fönstret och kör setVisible
     */
private void setPanel1() {

    //Se häftet för fler exempel på Layout.
    panel1 = new JPanel(new GridLayout(2,2,10,10 ));

    textField2 = new JTextField("text 2", 10);
    button1 = new JButton("Knapp 1");
    button1.setBackground(Color.blue);
    button1.setForeground(Color.white);
    textField1 = new JTextField("bla bla", 20);
    Button1Listener b1l = new Button1Listener();
    button1.addActionListener(b1l);
    panel1.add(textField1);
    panel1.add(button1);
    panel1.add(textField2);


}
private void setPanel2(){
        panel2 = new JPanel(new GridLayout(2,2));
        Button2Listener b2l = new Button2Listener();
        button2 = new JButton("Knapp 2");
        button2.addActionListener(b2l);
        // Jag måster lägge imageIcon till en label för att kunna visa den!
        imageIcon = new ImageIcon("src/bild.gif");
        label1 = new JLabel(imageIcon);
        panel2.setBackground(Color.black);
        panel2.add(label1);
        panel2.add(button2);



}

/*
Kod för att växla panel. Stäng av panel1 sätt på panel2 lägg till panel2
 */
private void switchPanel(){
    panel1.setVisible(false);
    this.setVisible(true);
    panel2.setVisible(true);
    this.add(panel2);
    this.setVisible(true);
}
/*
Tillbakabytet räcker att stänga av panel1 och sedan sätta på panel1
efter som panel1 och två redan ligger i fönstret
 */
private void switchBack(){
        panel2.setVisible(false);

        panel1.setVisible(true);
    this.setVisible(true);

}

    /*
    Inre klass för en listener.
     */
    private class Button1Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            switchPanel();


        }
    }
    /*
 Inre klass för en listener.
  */
        private class Button2Listener implements ActionListener{

            public void actionPerformed(ActionEvent actionEvent) {
                switchBack();
            }
            }
        }




