package ASimulatorSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;

public class Signup extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15;
    CustomTextField t1, t2, t3, t4, t5, t6, t7;
    JRadioButton r1, r2, r3, r4, r5;
    RoundRectButton b;
    JDateChooser dateChooser;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = "" + Math.abs(first4);

    Signup() {
        setTitle("NEW ACCOUNT APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ASimulatorSystem/icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(20, 0, 100, 100);
        add(l11);

        l1 = new JLabel("APPLICATION FORM NO. " + first);
        l1.setForeground(new Color(7, 164, 121));
        l1.setFont(new Font("Raleway", Font.BOLD, 38));

        l2 = new JLabel("Page 1: Personal Details");
        l2.setForeground(new Color(7, 164, 121));
        l2.setFont(new Font("Raleway", Font.BOLD, 22));

        l3 = new JLabel("Name:");
        l3.setForeground(new Color(7, 164, 121));
        l3.setFont(new Font("Raleway", Font.BOLD, 20));

        l4 = new JLabel("Surname:");
        l4.setForeground(new Color(7, 164, 121));
        l4.setFont(new Font("Raleway", Font.BOLD, 20));

        l5 = new JLabel("Date of Birth:");
        l5.setForeground(new Color(7, 164, 121));
        l5.setFont(new Font("Raleway", Font.BOLD, 20));

        l6 = new JLabel("Gender:");
        l6.setForeground(new Color(7, 164, 121));
        l6.setFont(new Font("Raleway", Font.BOLD, 20));

        l7 = new JLabel("Email Address:");
        l7.setForeground(new Color(7, 164, 121));
        l7.setFont(new Font("Raleway", Font.BOLD, 20));

        l8 = new JLabel("Marital Status:");
        l8.setForeground(new Color(7, 164, 121));
        l8.setFont(new Font("Raleway", Font.BOLD, 20));

        l9 = new JLabel("Address:");
        l9.setForeground(new Color(7, 164, 121));
        l9.setFont(new Font("Raleway", Font.BOLD, 20));

        l10 = new JLabel("City:");
        l10.setForeground(new Color(7, 164, 121));
        l10.setFont(new Font("Raleway", Font.BOLD, 20));

        l11 = new JLabel("Postal Code:");
        l11.setForeground(new Color(7, 164, 121));
        l11.setFont(new Font("Raleway", Font.BOLD, 20));

        l12 = new JLabel("Country:");
        l12.setForeground(new Color(7, 164, 121));
        l12.setFont(new Font("Raleway", Font.BOLD, 20));

        l13 = new JLabel("Date");
        l13.setForeground(new Color(7, 164, 121));
        l13.setFont(new Font("Raleway", Font.BOLD, 14));

        l14 = new JLabel("Month");
        l14.setForeground(new Color(7, 164, 121));
        l14.setFont(new Font("Raleway", Font.BOLD, 14));

        l15 = new JLabel("Year");
        l15.setForeground(new Color(7, 164, 121));
        l15.setFont(new Font("Raleway", Font.BOLD, 14));

        // Custom JTextFields with shadow
        t1 = new CustomTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 14));

        t2 = new CustomTextField();
        t2.setFont(new Font("Raleway", Font.BOLD, 14));

        t3 = new CustomTextField();
        t3.setFont(new Font("Raleway", Font.BOLD, 14));

        t4 = new CustomTextField();
        t4.setFont(new Font("Raleway", Font.BOLD, 14));

        t5 = new CustomTextField();
        t5.setFont(new Font("Raleway", Font.BOLD, 14));

        t6 = new CustomTextField();
        t6.setFont(new Font("Raleway", Font.BOLD, 14));

        t7 = new CustomTextField();
        t7.setFont(new Font("Raleway", Font.BOLD, 14));

        // Custom round rectangle button
        b = new RoundRectButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD, 14));
        b.setBackground(new Color(7, 164, 121));
        b.setForeground(Color.WHITE);

        r1 = new JRadioButton("Male");
        r1.setForeground(new Color(7, 164, 121));
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(Color.WHITE);

        r2 = new JRadioButton("Female");
        r2.setForeground(new Color(7, 164, 121));
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(Color.WHITE);

        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(r1);
        groupgender.add(r2);

        r3 = new JRadioButton("Married");
        r3.setForeground(new Color(7, 164, 121));
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(Color.WHITE);

        r4 = new JRadioButton("Unmarried");
        r4.setForeground(new Color(7, 164, 121));
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(Color.WHITE);

        r5 = new JRadioButton("Other");
        r5.setForeground(new Color(7, 164, 121));
        r5.setFont(new Font("Raleway", Font.BOLD, 14));
        r5.setBackground(Color.WHITE);

        ButtonGroup groupstatus = new ButtonGroup();
        groupstatus.add(r3);
        groupstatus.add(r4);
        groupstatus.add(r5);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(137, 337, 200, 29);
        add(dateChooser);

        setLayout(null);
        l1.setBounds(140, 20, 600, 40);
        add(l1);

        l2.setBounds(290, 80, 600, 30);
        add(l2);

        l3.setBounds(100, 140, 100, 30);
        add(l3);

        t1.setBounds(300, 140, 400, 30);
        add(t1);

        l4.setBounds(100, 190, 200, 30);
        add(l4);

        t2.setBounds(300, 190, 400, 30);
        add(t2);

        l5.setBounds(100, 240, 200, 30);
        add(l5);

        dateChooser.setBounds(300, 240, 400, 30);
        add(dateChooser);

        l6.setBounds(100, 290, 200, 30);
        add(l6);

        r1.setBounds(300, 290, 60, 30);
        add(r1);

        r2.setBounds(450, 290, 90, 30);
        add(r2);

        l7.setBounds(100, 340, 200, 30);
        add(l7);

        t3.setBounds(300, 340, 400, 30);
        add(t3);

        l8.setBounds(100, 390, 200, 30);
        add(l8);

        r3.setBounds(300, 390, 100, 30);
        add(r3);

        r4.setBounds(450, 390, 100, 30);
        add(r4);

        r5.setBounds(635, 390, 100, 30);
        add(r5);

        l9.setBounds(100, 440, 200, 30);
        add(l9);

        t4.setBounds(300, 440, 400, 30);
        add(t4);

        l10.setBounds(100, 490, 200, 30);
        add(l10);

        t5.setBounds(300, 490, 400, 30);
        add(t5);

        l11.setBounds(100, 540, 200, 30);
        add(l11);

        t6.setBounds(300, 540, 400, 30);
        add(t6);

        l12.setBounds(100, 590, 200, 30);
        add(l12);

        t7.setBounds(300, 590, 400, 30);
        add(t7);

        b.setBounds(620, 660, 80, 30);
        add(b);

        b.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(350, 120);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String formno = first;
        String name = t1.getText();
        String fname = t2.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (r1.isSelected()) {
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        }

        String email = t3.getText();
        String marital = null;
        if (r3.isSelected()) {
            marital = "Married";
        } else if (r4.isSelected()) {
            marital = "Unmarried";
        } else if (r5.isSelected()) {
            marital = "Other";
        }

        String address = t4.getText();
        String city = t5.getText();
        String pincode = t6.getText();
        String state = t7.getText();

        try {
            if (t6.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            } else {
                Conn c1 = new Conn();
                String q1 = "insert into signup values('" + formno + "','" + name + "','" + fname + "','" + dob + "','" + gender + "','" + email + "','" + marital + "','" + address + "','" + city + "','" + pincode + "','" + state + "')";
                c1.s.executeUpdate(q1);

                new Signup2(first).setVisible(true);
                setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup().setVisible(true);
    }

    // Custom JTextField with enhanced shadow effect
    class CustomTextField extends JTextField {

        protected void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();

            // Set rendering hints for smooth edges
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            // Shadow color and position
            g2d.setColor(new Color(150, 150, 150, 150)); // Semi-transparent gray shadow
            int shadowOffset = 2; // Shadow offset from the text
            g2d.drawString(getText(), getInsets().left + shadowOffset, getBaseline(getWidth(), getHeight()) + shadowOffset);

            // Draw the actual text on top of the shadow
            g2d.setColor(getForeground());
            g2d.drawString(getText(), getInsets().left, getBaseline(getWidth(), getHeight()));

            g2d.dispose();
            super.paintComponent(g);
        }
    }


    // Custom RoundButton class
    class RoundButton extends JButton {
        public RoundButton(String label) {
            super(label);
            setContentAreaFilled(false);
            setFocusPainted(false);
        }


        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(getBackground());
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);
            super.paintComponent(g);
            g2.dispose();
        }


        protected void paintBorder(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(getForeground());
            g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 30, 30);
            g2.dispose();
        }
    }
}
