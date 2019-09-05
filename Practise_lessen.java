import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Practise_lessen extends JFrame{

    public static void main(String[] args) {
        // opdracht 1
        System.out.println("Hello World!");
        // opdracht 2
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string pl0x: ");
        String naam = input.next();
        System.out.println("Hello " + naam);

        // opdracht 3
        Practise_lessen frame = new Practise_lessen();
        new Practise_lessen();
        frame.setSize(640, 800);
        frame.maakGUI();    // Dit is nodig om in de private void maakGUI(){ verder te kunnen sleutelen aan de gui
        frame.setVisible(true);
    }
        private void maakGUI(){
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            Container window = getContentPane();
            window.setLayout(new FlowLayout());
            window.setBackground(Color.GREEN);
            JTextField textField = new JTextField("Type hier");
            window.add(textField);
        }
    }

