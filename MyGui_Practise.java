import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyGui_Practise extends JFrame implements ActionListener {

    private JPanel panel;
//    private int i;

    public static void main(String[] args) {
        MyGui_Practise frame = new MyGui_Practise();
        new MyGui_Practise();
        frame.setSize(200, 200);
        frame.createGUI();
        frame.setVisible(true);
    }

     private void createGUI(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        window.setBackground(Color.CYAN);
         JTextField textField = new JTextField("                   ");
//        textField.setSize(100, 50);
        window.add(textField);
         JButton button = new JButton("klik, ik doe niks");
        button.addActionListener(this);
        window.add(button);
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 300));
        panel.setBackground(Color.YELLOW);
        window.add(panel);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Wubba lubba dub dub");
        Graphics paper = panel.getGraphics();
        Graphics Oxide = panel.getGraphics();
        Graphics Oxide2 = panel.getGraphics();

        Graphics Car = panel.getGraphics();


        paper.drawLine(100, 115, 150, 170);
        paper.drawLine(245, 115, 190, 170);

        Oxide.drawOval(75, 75, 40, 40);
        Oxide2.drawOval(225, 75, 40, 40);
        Car.drawOval(140, 160, 60, 60);

        Oxide.setColor(Color.RED);
        Oxide.fillOval(75, 75, 40, 40);

        Oxide2.setColor(Color.RED);
        Oxide2.fillOval(140, 160, 60, 60);

        Car.setColor(Color.BLUE);
        Car.fillOval(140, 160, 60, 60);
    }
}
