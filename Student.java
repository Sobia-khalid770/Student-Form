package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Student extends JFrame implements ActionListener {

    JTextField txtname, txtrollno, txtemail, txtnationality;
    JTextArea txtadd, txtoutput;
    JCheckBox txtjava, txtpython;
    JRadioButton txtmale, txtfemale;
    JButton txtsubmit, txtclear;
    // radio button means you can select one option

    Student() {

        // Frame Properties
        setTitle("Student Enrollment Form");
        setSize(650, 750);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(10, 2, 10, 10));
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));

        Color bgColor = Color.decode("#D6EAF8");
        Color fieldColor = Color.WHITE;
        Color submitColor = Color.decode("#3498DB");
        Color clearColor = Color.decode("#E74C3C");

        panel.setBackground(bgColor);

    //fonts properties
        Font font = new Font("Arial", Font.PLAIN, 18);
        Font labelFont = new Font("Arial", Font.BOLD, 17);
        Font headingFont = new Font("Arial", Font.BOLD, 24);

        // Heading
        JLabel heading = new JLabel("Student Enrollment Form");
        heading.setFont(headingFont);
        heading.setForeground(Color.decode("#1B4F72"));
        

        panel.add(heading);
        panel.add(new JLabel(""));

        // Text Fields
        txtname = new JTextField();
        txtrollno = new JTextField();
        txtemail = new JTextField();
        txtnationality = new JTextField();

        // Text Areas
        txtadd = new JTextArea(5, 20);
        txtoutput = new JTextArea(6, 25);
        txtoutput.setEditable(false);

        // Checkboxes
        txtjava = new JCheckBox("Java");
        txtpython = new JCheckBox("Python");

        // Radio Buttons
        txtmale = new JRadioButton("Male");
        txtfemale = new JRadioButton("Female");

        // Button Group
        ButtonGroup bg = new ButtonGroup();
        bg.add(txtmale);
        bg.add(txtfemale);

        // Buttons
        txtsubmit = new JButton("Submit");
        txtclear = new JButton("Clear");

        txtname.setFont(font);
        txtname.setBackground(fieldColor);
        txtname.setForeground(Color.BLACK);

        txtrollno.setFont(font);
        txtrollno.setBackground(fieldColor);
        txtrollno.setForeground(Color.BLACK);

        txtemail.setFont(font);
        txtemail.setBackground(fieldColor);
        txtemail.setForeground(Color.BLACK);

        txtnationality.setFont(font);
        txtnationality.setBackground(fieldColor);
        txtnationality.setForeground(Color.BLACK);

        txtadd.setFont(font);
        txtadd.setBackground(fieldColor);
        txtadd.setForeground(Color.BLACK);

        txtoutput.setFont(font);
        txtoutput.setBackground(fieldColor);
        txtoutput.setForeground(Color.BLACK);

        
        JLabel lname = new JLabel("Name");
        lname.setForeground(Color.decode("#1B4F72"));
        lname.setFont(labelFont);

        JLabel lroll = new JLabel("Roll No");
        lroll.setForeground(Color.decode("#1B4F72"));
        lroll.setFont(labelFont);

        JLabel lemail = new JLabel("Email");
        lemail.setForeground(Color.decode("#1B4F72"));
        lemail.setFont(labelFont);

        JLabel lnationality = new JLabel("Nationality");
        lnationality.setForeground(Color.decode("#1B4F72"));
        lnationality.setFont(labelFont);

        JLabel laddress = new JLabel("Address");
        laddress.setForeground(Color.decode("#1B4F72"));
        laddress.setFont(labelFont);

        JLabel lgender = new JLabel("Gender");
        lgender.setForeground(Color.decode("#1B4F72"));
        lgender.setFont(labelFont);

        JLabel lskills = new JLabel("Skills");
        lskills.setForeground(Color.decode("#1B4F72"));
        lskills.setFont(labelFont);

        JLabel loutput = new JLabel("Output");
        loutput.setForeground(Color.decode("#1B4F72"));
        loutput.setFont(labelFont);

        panel.add(lname);
        panel.add(txtname);

        panel.add(lroll);
        panel.add(txtrollno);

        panel.add(lemail);
        panel.add(txtemail);

        panel.add(lnationality);
        panel.add(txtnationality);

        panel.add(laddress);
        panel.add(new JScrollPane(txtadd));

        panel.add(lgender);

        JPanel genderp = new JPanel();
        genderp.setBackground(bgColor);

        txtmale.setBackground(bgColor);
        txtmale.setForeground(Color.decode("#1B4F72"));
        txtmale.setPreferredSize(new Dimension(120, 40));

        txtfemale.setBackground(bgColor);
        txtfemale.setForeground(Color.decode("#1B4F72"));
        txtfemale.setPreferredSize(new Dimension(120, 40));

        genderp.add(txtmale);
        genderp.add(txtfemale);

        panel.add(genderp);

        panel.add(lskills);

        JPanel skillp1 = new JPanel();
        skillp1.setBackground(bgColor);

        txtjava.setBackground(bgColor);
        txtjava.setForeground(Color.decode("#1B4F72"));
        txtjava.setPreferredSize(new Dimension(120, 40));

        txtpython.setBackground(bgColor);
        txtpython.setForeground(Color.decode("#1B4F72"));
        txtpython.setPreferredSize(new Dimension(120, 40));

        skillp1.add(txtjava);
        skillp1.add(txtpython);

        panel.add(skillp1);

        txtsubmit.setBackground(submitColor);
        txtsubmit.setForeground(Color.WHITE);
        txtsubmit.setFont(labelFont);

        txtclear.setBackground(clearColor);
        txtclear.setForeground(Color.WHITE);
        txtclear.setFont(labelFont);

        panel.add(txtsubmit);
        panel.add(txtclear);

        panel.add(loutput);
        panel.add(new JScrollPane(txtoutput));

        // Action Listeners
        txtsubmit.addActionListener(this);
        txtclear.addActionListener(this);

        //adding panel and setting it visible = true
        add(panel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {

            if (e.getSource() == txtsubmit) {

                String name = txtname.getText();
                String rollno = txtrollno.getText();
                String email = txtemail.getText();
                String nationality = txtnationality.getText();

                if (name.length() == 0) {

                    JOptionPane.showMessageDialog(this,
                            "Please enter your name");

                    return;
                }

                String gender =
                        txtmale.isSelected() ? "Male"
                                : txtfemale.isSelected() ? "Female"
                                : "Not Selected";

                String skills = "";

                if (txtjava.isSelected())
                    skills += "Java ";

                if (txtpython.isSelected())
                    skills += "Python ";

                txtoutput.setText(
                        "Name: " + name +
                        "\nRoll No: " + rollno +
                        "\nEmail: " + email +
                        "\nNationality: " + nationality +
                        "\nAddress: " + txtadd.getText() +
                        "\nGender: " + gender +
                        "\nSkills: " + skills
                );
            }

            if (e.getSource() == txtclear) {

                txtname.setText("");
                txtrollno.setText("");
                txtemail.setText("");
                txtnationality.setText("");
                txtadd.setText("");

                txtmale.setSelected(false);
                txtfemale.setSelected(false);

                txtjava.setSelected(false);
                txtpython.setSelected(false);

                txtoutput.setText("");
            }

        } catch (Exception e1) {

            JOptionPane.showMessageDialog(this,
                    e1.getMessage());
        }
    }

    public static void main(String[] args) {

        new Student();
    }
}

