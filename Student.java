import java.awt.*;  
import javax.swing.*;  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

public class Student extends JPanel implements ActionListener
{
    String fname;
    String lname;
    int psid;
    String standing;
    String email;
    String address;
    String city;
    String state;
    int zip;
    int sn;
    int tn;

    JFrame f= new JFrame("STUDENT");
    JLabel l1 = new JLabel("First Name: ");
    JLabel l2 = new JLabel("Last Name: ");  
    JLabel l3 = new JLabel("PeopleSoft ID: ");
    JLabel l4 = new JLabel("Class Standing: ");
    JLabel l5 = new JLabel("Email: ");  
    JLabel l6 = new JLabel("Address: ");  
    JLabel l7 = new JLabel("City: "); 
    JLabel l8 = new JLabel("State: "); 
    JLabel l9 = new JLabel("Zipcode: "); 
    JTextField tf1 = new JTextField(15);
    JTextField tf2 = new JTextField(15);
    JTextField tf3 = new JTextField(15);
    JTextField tf4 = new JTextField(15);
    JTextField tf5 = new JTextField(20);
    JTextField tf6 = new JTextField(20);
    JTextField tf7 = new JTextField(20);
    JTextField tf8 = new JTextField(20);
    JTextField tf9 = new JTextField(20);
    JButton submit = new JButton("SUBMIT");
    JButton close = new JButton("CLOSE");

    public Student(int studentNumber, int totalNumber)
    {
        sn = studentNumber;
        tn = totalNumber;
        JPanel panel=new JPanel(new FlowLayout(FlowLayout.LEFT)); 
        panel.setBackground(Color.white);
        
        submit.addActionListener(this);
        close.addActionListener(this);
        submit.setActionCommand("submit");
        close.setActionCommand("close");

        panel.add(l1); 
        panel.add(tf1); 

        panel.add(l2);
        panel.add(tf2);

        panel.add(l3);
        panel.add(tf3);

        panel.add(l4); 
        panel.add(tf4); 

        panel.add(l5);
        panel.add(tf5);

        panel.add(l6);
        panel.add(tf6);

        panel.add(l7); 
        panel.add(tf7); 

        panel.add(l8);
        panel.add(tf8);

        panel.add(l9);
        panel.add(tf9);

        panel.add(submit);
        panel.add(close);


        f.add(panel); 
        f.setSize(300,500);  
        f.setVisible(true);
    }

    public void getInfo()
    {
        JFrame frame = new JFrame();

        if (tf1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(frame,"Make sure to enter all information!");
            return;
        }
        else
        {
            if (!isLetter(tf1.getText()))
            {
                JOptionPane.showMessageDialog(frame,"Make sure only letters were entered for your name!");
                return;
            }
        }

        if (tf2.getText().equals(""))
        {
            JOptionPane.showMessageDialog(frame,"Make sure to enter all information!");
            return;
        }
        else
        {
            if (!isLetter(tf2.getText()))
            {
                JOptionPane.showMessageDialog(frame,"Make sure only letters were entered for your name!");
                return;
            }
        }

        if (tf3.getText().equals(""))
        {
            JOptionPane.showMessageDialog(frame,"Make sure to enter all information!");
            return;
        }
        else
        {
            if (isLetter(tf3.getText()))
            {
                JOptionPane.showMessageDialog(frame,"Make sure only numbers were entered for your PeopleSoft ID!");
                return;
            }

            if ((tf3.getText()).length() > 7)
            {
                JOptionPane.showMessageDialog(frame,"Make sure your PeopleSoft ID is less than 7 numbers");
                return;
            }
        }

        if (tf4.getText().equals(""))
        {
            JOptionPane.showMessageDialog(frame,"Make sure to enter all information!");
            return;
        }
        else
        {
            if ((tf4.getText().equals("freshman")) || (tf4.getText().equals("sophomore")) || (tf4.getText().equals("junior")) || (tf4.getText().equals("senior"))) 
            {
                
            }
            else
            {
                JOptionPane.showMessageDialog(frame,"Invalid standing entry!");
                return;
            }
        }

        if (tf5.getText().equals(""))
        {
            JOptionPane.showMessageDialog(frame,"Make sure to enter all information!");
            return;
        }

        if (tf6.getText().equals(""))
        {
            JOptionPane.showMessageDialog(frame,"Make sure to enter all information!");
            return;
        }

        if (tf7.getText().equals(""))
        {
            JOptionPane.showMessageDialog(frame,"Make sure to enter all information!");
            return;
        }

        if (tf8.getText().equals(""))
        {
            JOptionPane.showMessageDialog(frame,"Make sure to enter all information!");
            return;
        }
        else
        {
            if (!(isState(tf8.getText())))
            {
                JOptionPane.showMessageDialog(frame,"You did not enter a valid state!");
                return;
            }
        }

        if (tf9.getText().equals(""))
        {
            JOptionPane.showMessageDialog(frame,"Make sure to enter all information!");
            return;
        }
        else
        {
            if (isLetter(tf9.getText()))
            {
                JOptionPane.showMessageDialog(frame,"Make sure only numbers were entered for your zip code!");
                return;
            }

            if ((tf9.getText()).length() != 9)
            {
                JOptionPane.showMessageDialog(frame,"Make sure you entered a 9 digit zip code!");
                return;
            }
        }
        displayInfo();  
    }

    public void displayInfo()
    {
        System.out.println("--------------------------------------");
        System.out.println("--Students Details, Departmentof ILT--");
        System.out.println("--------------------------------------");
        System.out.println("\t");

        fname = tf1.getText();
        System.out.println("First Name: "+fname);
        System.out.println("\t");

        lname = tf2.getText();
        System.out.println("Last Name: "+lname);
        System.out.println("\t");

        psid = Integer.parseInt(tf3.getText());
        System.out.println("PeopleSoftID: "+psid);
        System.out.println("\t");

        standing = tf4.getText();
        System.out.println("Standing: "+standing);
        System.out.println("\t");

        email = tf5.getText();
        System.out.println("Email: "+email);
        System.out.println("\t");

        address = tf6.getText();
        System.out.println("Address: "+address);
        System.out.println("\t");

        city = tf7.getText();
        System.out.println("City: "+city);
        System.out.println("\t");

        state = tf8.getText();
        System.out.println("State: "+state);
        System.out.println("\t");

        zip = Integer.parseInt(tf9.getText());
        System.out.println("Zip: "+zip);
        System.out.println("\t");

        System.out.println("--------------------------------------");
        System.out.println("---Number of students:"+tn+"---");
        System.out.println("--------------------------------------");
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        switch (e.getActionCommand()) 
        {
            case "submit": 
                getInfo();
                break;
            case "close": 
                f.dispose();
                break;
        }
    }

    public static boolean isLetter(String a) {
		if (a == null) {
			return false;
		}

		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) {
				return false;
			}
		}
		return true;
    }

    public static boolean isState(String a)
    {
        List<String> states = new ArrayList<>(Arrays.asList("AK", "AL", "AR", "AZ", "CA", "CO", "CT", "DC", "DE", "FL", "GA", "HI", "IA", "ID", "IL", "IN", "KS", "KY", "LA", "MA", "MD", "ME", "MI", "MN", "MO", "MS", "MT", "NC", "ND", "NE", "NH", "NJ", "NM", "NV", "NY", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VA", "VT", "WA", "WI", "WV", "WY"));

        return states.contains(a);
    }
}