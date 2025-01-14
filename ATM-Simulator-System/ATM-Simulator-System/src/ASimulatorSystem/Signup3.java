package ASimulatorSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class Signup3 extends JFrame implements ActionListener{

    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    JRadioButton r1,r2,r3,r4;
    RoundRectButton b1,b2;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    String formno;

    Signup3(String formno){

               // Setup components
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ASimulatorSystem/icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(150, 5, 100, 100);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(Color.WHITE);
        mainPanel.add(l14);

        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");
        setForeground(new Color(7, 164, 121));


        l1 = new JLabel("Page 3: Account Details");
        l1.setForeground(new Color(7, 164, 121));
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280, 40, 400, 40);
        mainPanel.add(l1);

        l2 = new JLabel("Account Type:");
        l2.setForeground(new Color(7, 164, 121));
        l2.setFont(new Font("Raleway", Font.BOLD, 18));
        l2.setBounds(100, 140, 200, 30);
        mainPanel.add(l2);

        r1 = new JRadioButton("Saving Account");
        r1.setForeground(new Color(7, 164, 121));
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100, 180, 150, 30);
        mainPanel.add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setForeground(new Color(7, 164, 121));
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350, 180, 250, 30);
        mainPanel.add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setForeground(new Color(7, 164, 121));
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(Color.WHITE);
        setBackground(new Color(7, 164, 121));
        r3.setBounds(100, 220, 250, 30);
        mainPanel.add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setForeground(new Color(7, 164, 121));
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350, 220, 250, 30);
        mainPanel.add(r4);

        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(r1);
        groupgender.add(r2);
        groupgender.add(r3);
        groupgender.add(r4);

        l3 = new JLabel("Card Number:");
        l3.setForeground(new Color(7, 164, 121));
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        l3.setBounds(100, 300, 200, 30);
        mainPanel.add(l3);

        l4 = new JLabel("XXXX-XXXX-XXXX-5144");
        l4.setForeground(new Color(7, 164, 121));
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        l4.setBounds(330, 300, 250, 30);
        mainPanel.add(l4);

        l5 = new JLabel("(Your 16-digit Card number)");
        l5.setForeground(new Color(7, 164, 121));
        l5.setFont(new Font("Raleway", Font.BOLD, 12));
        l5.setBounds(100, 330, 200, 20);
        mainPanel.add(l5);

        l6 = new JLabel("It would appear on ATM Card/Cheque Book and Statements");
        l6.setForeground(new Color(7, 164, 121));
        l6.setFont(new Font("Raleway", Font.BOLD, 12));
        l6.setBounds(330, 330, 500, 20);
        mainPanel.add(l6);

        l7 = new JLabel("PIN:");
        l7.setForeground(new Color(7, 164, 121));
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        l7.setBounds(100, 370, 200, 30);
        mainPanel.add(l7);

        l8 = new JLabel("XXXX");
        l8.setForeground(new Color(7, 164, 121));
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        l8.setBounds(330, 370, 200, 30);
        mainPanel.add(l8);

        l9 = new JLabel("(4-digit password)");
        l9.setForeground(new Color(7, 164, 121));
        l9.setFont(new Font("Raleway", Font.BOLD, 12));
        l9.setBounds(100, 400, 200, 20);
        mainPanel.add(l9);

        l10 = new JLabel("Services Required:");
        l10.setForeground(new Color(7, 164, 121));
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        l10.setBounds(100, 450, 200, 30);
        mainPanel.add(l10);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setForeground(new Color(7, 164, 121));
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(100, 500, 200, 30);
        mainPanel.add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setForeground(new Color(7, 164, 121));
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(350, 500, 200, 30);
        mainPanel.add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setForeground(new Color(7, 164, 121));
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(100, 550, 200, 30);
        mainPanel.add(c3);

        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBackground(Color.WHITE);
        c4.setForeground(new Color(7, 164, 121));
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(350, 550, 200, 30);
        mainPanel.add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setForeground(new Color(7, 164, 121));
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(100, 600, 200, 30);
        mainPanel.add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setForeground(new Color(7, 164, 121));
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(350, 600, 200, 30);
        mainPanel.add(c6);

        c7 = new JCheckBox("I hereby declare that the above-entered details are correct to the best of my knowledge.", true);
        c7.setBackground(Color.WHITE);
        c7.setForeground(new Color(7, 164, 121));
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(100, 650, 600, 20);
        mainPanel.add(c7);

        b1 = new RoundRectButton("Submit");
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setBackground(new Color(7, 164, 121));
        b1.setForeground(Color.WHITE);
        b1.setBounds(250, 700, 100, 30);
        mainPanel.add(b1);

        b2 = new RoundRectButton("Cancel");
        b2.setFont(new Font("Raleway", Font.BOLD, 14));
        b2.setBackground(new Color(7, 164, 121));
        b2.setForeground(Color.WHITE);
        b2.setBounds(420, 700, 100, 30);
        mainPanel.add(b2);

        l11 = new JLabel("Form No:");
        l11.setForeground(new Color(7, 164, 121));
        l11.setFont(new Font("Raleway", Font.BOLD, 14));
        l11.setBounds(700, 10, 100, 30);
        mainPanel.add(l11);

        l12 = new JLabel(formno);
        l12.setForeground(new Color(7, 164, 121));
        l12.setFont(new Font("Raleway", Font.BOLD, 14));
        l12.setBounds(770, 10, 70, 30);
        mainPanel.add(l12);

        // Set the layout and add the panel to the frame
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(mainPanel, BorderLayout.CENTER);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(350, 120);
        setVisible(true);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae){
        String atype = null;
        if (r1.isSelected()) {
            atype = "Saving Account";
        } else if (r2.isSelected()) {
            atype = "Fixed Deposit Account";
        } else if (r3.isSelected()) {
            atype = "Current Account";
        } else if (r4.isSelected()) {
            atype = "Recurring Deposit Account";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
        String cardno = "" + Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);

        String facility = "";
        if (c1.isSelected()) {
            facility += " ATM Card";
        }
        if (c2.isSelected()) {
            facility += " Internet Banking";
        }
        if (c3.isSelected()) {
            facility += " Mobile Banking";
        }
        if (c4.isSelected()) {
            facility += " EMAIL Alerts";
        }
        if (c5.isSelected()) {
            facility += " Cheque Book";
        }
        if (c6.isSelected()) {
            facility += " E-Statement";
        }

        try {
            if (ae.getSource() == b1) {
                if (atype.equals("")) {
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                } else {
                    Conn c1 = new Conn();
                    String q1 = "insert into signup3 values('" + formno + "','" + atype + "','" + cardno + "','" + pin + "','" + facility + "')";
                    String q2 = "insert into login values('" + formno + "','" + cardno + "','" + pin + "')";
                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardno + "\n Pin:" + pin);

                    new Deposit(pin).setVisible(true);
                    setVisible(false);
                }

            } else if (ae.getSource() == b2) {
                System.exit(0);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args){
        new Signup3("").setVisible(true);
    }
}
