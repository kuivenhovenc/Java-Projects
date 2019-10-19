import java.util.Scanner;
import javax.swing.*;

public class assignment2 extends JPanel
{
    public static void main(String args[])
    {
        JFrame frame = new JFrame("Assignment 2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        JButton button = new JButton("Press");
        frame.getContentPane().add(button);
        frame.setVisible(true);

        //Scanner scan = new Scanner(System.in);

        //System.out.println("Please enter the number of students you will be entering for: ");
        //numStudents = scan.nextInt();
    }
}