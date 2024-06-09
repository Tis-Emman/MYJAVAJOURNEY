import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI {

    public static void main(String[] args) {

        String name= JOptionPane.showInputDialog("ANO PANGALAN MO, BATA?");
        JOptionPane.showMessageDialog(null, "Ikaw ay si batang " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Ilang taon ka na bata? "));
        JOptionPane.showMessageDialog(null,  + age + " Taong gulang ka na!");

        String tirahan =  JOptionPane.showInputDialog("Saan ka nakatira? ");
        JOptionPane.showMessageDialog(null, "Ikaw ay nakatira sa " + tirahan);

        double taas = Double.parseDouble(JOptionPane.showInputDialog("Ano height mo? "));
        JOptionPane.showMessageDialog(null, "Ikaw ay " + taas + " Ft tall");

        JFrame frame = new JFrame();
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        frame.add(panel);
        frame.setLayout(null);
        
    }
}

