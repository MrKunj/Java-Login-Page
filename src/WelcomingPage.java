import javax.swing.*;
import java.awt.*;

public class WelcomingPage {
    WelcomingPage(String name){
        JFrame frame = new JFrame();
        JLabel welcome = new JLabel("Hello " + name);
        welcome.setBounds(0,0,200,35);
        welcome.setFont(new Font(null, Font.PLAIN,  25));

        frame.add(welcome);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);


        System.out.println("Hello sir your name is: " + name);
    }
}
