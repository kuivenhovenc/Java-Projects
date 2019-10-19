import javax.swing.*;
import java.awt.*;

public class assignment2 extends JPanel
{
    public static void main(String args[])
    {

        String numStudentsString = JOptionPane.showInputDialog("Number of Students: ");
        int numStudents = Integer.parseInt(numStudentsString);

        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++)
        {
            students[i] = new Student((i+1),numStudents);
        }

        System.out.println("Number of Students: "+numStudents);
        System.out.println("");
    }
}