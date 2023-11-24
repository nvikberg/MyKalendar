//Nikolina Vikberg

import java.awt.*;
import java.awt.event.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
//MyFrame class extends JFrame class and implements ActionListener interface


    //Creating all the attributes and objects that I will use in the code
    JLabel todayLabel, label1, label2, label3, label4, label5, label6, label7;
    JButton button3, button1, button2, button4, button5, button6, button7;
    JTextArea textArea1, textArea2, textArea3, textArea4, textArea5, textArea6, textArea7;
    JTextField textField1, textField2, textField3, textField4, textField5, textField6, textField7;
    JPanel panel1, panel2, panel3, panel4, panel5, panel6, panel7;
    ImageIcon image = new ImageIcon("icons8-lotus-48.png");  //create image icon to use in frame and more

    MyFrame() { //Constructor for My Frame

        //All components and settings for panel 1 Monday
        panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel1.setPreferredSize(new Dimension(150, 420));
        panel1.setBackground(new Color(237,228,204));
        textArea1 = new JTextArea(); //use get text later to retrieve input
        textArea1.setPreferredSize(new Dimension(130, 270));
        button1 = new JButton("Add event");
        button1.setPreferredSize(new Dimension(100,30));
        button1.setFocusable(false);
        button1.setBackground(Color.white);
        button1.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        button1.addActionListener(this); //skapa actionlistner till save knappen sa den kan spara
        label1 = new JLabel();
        textField1 = new JTextField("Type here");
        textField1.setPreferredSize(new Dimension(120,30));


        //Adding all components to panel 1 monday
        panel1.add(label1);
        panel1.add(textArea1);
        panel1.add(button1);
        panel1.add(textField1);


        //All components and settings for panel 2 Tuesday
        panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(150, 420));
        panel2.setBackground(new Color(237,228,204));
        textArea2 = new JTextArea(); //use get text later to retrieve input
        textArea2.setPreferredSize(new Dimension(130, 270));
        button2 = new JButton ("Add event");
        button2.setPreferredSize(new Dimension(100,30));
        button2.setFocusable(false);
        button2.setBackground(Color.white);
        button2.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        button2.addActionListener(this);//
        label2 = new JLabel();
        textField2 = new JTextField("Type here");
        textField2.setPreferredSize(new Dimension(120,30));

        panel2.add(label2);
        panel2.add(textArea2);
        panel2.add(button2);
        panel2.add(textField2);


        //All components and settings for panel 3 Wednesday
        panel3 = new JPanel();
        panel3.setPreferredSize(new Dimension(150, 420));
        panel3.setBackground(new Color(237,228,204));
        textArea3 = new JTextArea(); //use get text later to retrieve input
        textArea3.setPreferredSize(new Dimension(130, 270));
        button3 = new JButton("Add event");
        button3.setPreferredSize(new Dimension(100,30));
        button3.setFocusable(false);
        button3.setBackground(Color.white);
        button3.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        button3.addActionListener(this);//
        label3 = new JLabel();
        textField3 = new JTextField("Type here");
        textField3.setPreferredSize(new Dimension(120,30));

        panel3.add(label3);
        panel3.add(textArea3);
        panel3.add(button3);
        panel3.add(textField3);


        //All components and settings for panel 4 Thursday
        panel4 = new JPanel();
        panel4.setPreferredSize(new Dimension(150, 420));
        panel4.setBackground(new Color(237,228,204));
        textArea4 = new JTextArea(); //use get text later to retrieve input
        textArea4.setPreferredSize(new Dimension(130, 270));
        button4 = new JButton("Add event");
        button4.setPreferredSize(new Dimension(100,30));
        button4.setFocusable(false);
        button4.setBackground(Color.white);
        button4.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        button4.addActionListener(this);//
        label4 = new JLabel();
        textField4 = new JTextField("Type here");
        textField4.setPreferredSize(new Dimension(120,30));

        panel4.add(label4);
        panel4.add(textArea4);
        panel4.add(button4);
        panel4.add(textField4);


        //All components and settings for panel 5 Friday
        panel5 = new JPanel();
        panel5.setPreferredSize(new Dimension(150, 420));
        panel5.setBackground(new Color(237,228,204));
        textArea5 = new JTextArea(); //use get text later to retrieve input
        textArea5.setPreferredSize(new Dimension(130, 270));
        button5 = new JButton("Add event");
        button5.setPreferredSize(new Dimension(100,30));
        button5.setFocusable(false);
        button5.setBackground(Color.white);
        button5.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        button5.addActionListener(this);//
        label5 = new JLabel();
        textField5 = new JTextField("Type here");
        textField5.setPreferredSize(new Dimension(120,30));

        panel5.add(label5);
        panel5.add(textArea5);
        panel5.add(button5);
        panel5.add(textField5);

        //All components and settings for panel 6 Saturday
        panel6 = new JPanel();
        panel6.setPreferredSize(new Dimension(150, 420));
        panel6.setBackground(new Color(237,228,204));
        textArea6 = new JTextArea(); //use get text later to retrieve input
        textArea6.setPreferredSize(new Dimension(130, 270));
        button6 = new JButton("Add event");
        button6.setPreferredSize(new Dimension(100,30));
        button6.setFocusable(false);
        button6.setBackground(Color.white);
        button6.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        button6.addActionListener(this);//
        label6 = new JLabel();
        textField6 = new JTextField("Type here");
        textField6.setPreferredSize(new Dimension(120,30));

        panel6.add(label6);
        panel6.add(textArea6);
        panel6.add(button6);
        panel6.add(textField6);

/**/

        //All components and settings for panel 7 Sunday
        panel7 = new JPanel();
        panel7.setPreferredSize(new Dimension(150, 420));
        panel7.setBackground(new Color(237,228,204));
        textArea7 = new JTextArea(); //use get text later to retrieve input
        textArea7.setPreferredSize(new Dimension(130, 270));
        button7 = new JButton("Add event");/**/
        button7.setPreferredSize(new Dimension(100,30));
        button7.setFocusable(false);
        button7.setBackground(Color.white);
        button7.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        button7.addActionListener(this);//
        label7 = new JLabel();
        textField7 = new JTextField("Type here");
        textField7.setPreferredSize(new Dimension(120,30));

        panel7.add(label7);
        panel7.add(textArea7);
        panel7.add(button7);
        panel7.add(textField7);


        //My Frame settings // no need to add frame. here since JFrame is extended
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fonstret stangs
        setTitle("My Calendar");
        setLayout(new FlowLayout());
        setSize(1200, 500);
        setLocation(300, 150);
        setResizable(false);
        setIconImage(image.getImage()); //place logo in frame (switches out java logo)
        getContentPane().setBackground(Color.WHITE);

        //Adding all panels to my frame
        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);
        add(panel5);
        add(panel6);
        add(panel7);

        //TodayLabel is holding "TODAY" label for todaysDateMethod (highlighting which day is today in calendar)
        todayLabel = new JLabel();
        add(todayLabel); //add todaylabel to the frame

        setVisible(true); //set frame to visible

        //Calling methods for weekly dates and current date today
        dayAndDateMethod();
        todaysDateMethod();
        }

        //Method for weekday and date using LocalDate and DayOfWeek w temoralAdjusters. Saving down weekday+date to label 1-7 for each weekday
        public void dayAndDateMethod () {

            LocalDate mondayDate = LocalDate.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY)); //Getting dayofweek and saving it to mondayDate object
            String mondayDay = mondayDate.getDayOfWeek().toString(); //saving down monday weekday to string mondayDay
            label1.setText(mondayDay + " " + mondayDate); //adding weekday and date to label1

            LocalDate tuesdayDate = LocalDate.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.TUESDAY));
            String tuesdayDay = tuesdayDate.getDayOfWeek().toString();
            label2.setText(tuesdayDay + " " + tuesdayDate);

            LocalDate wednesdayDate = LocalDate.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.WEDNESDAY));
            String wednesdayDay = wednesdayDate.getDayOfWeek().toString();
            label3.setText(wednesdayDay + " " + wednesdayDate);

            LocalDate thursdayDate = LocalDate.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.THURSDAY));
            String thursdayDay = thursdayDate.getDayOfWeek().toString();
            label4.setText(thursdayDay + " " + thursdayDate);

            LocalDate fridayDate = LocalDate.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.FRIDAY));
            String fridayDay = fridayDate.getDayOfWeek().toString();
            label5.setText(fridayDay + " " + fridayDate);

            LocalDate saturdayDate = LocalDate.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.SATURDAY));
            String saturdayDay = saturdayDate.getDayOfWeek().toString();
            label6.setText(saturdayDay + " " + saturdayDate);

            LocalDate sundayDate = LocalDate.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY));
            String sundayDay = sundayDate.getDayOfWeek().toString();
            label7.setText(sundayDay + " " + sundayDate);
            }

        //Method for todays date which comes with icon and text
        public void todaysDateMethod () {
            LocalDate todaysDate = LocalDate.now(); //gets date today
            String todaysDay = todaysDate.getDayOfWeek().toString(); //saves down todays day to string
            todayLabel.setIcon(image);
            todayLabel.setText(todaysDay + " TODAY! "); //now I can use todaysDay as an object and save the text to todayLabel

            // if statement IF DayOfWeek equals todays date, then todayLabel with attributes is added to that days panel
            if (todaysDate.getDayOfWeek().equals(DayOfWeek.MONDAY)) {
                panel1.add(todayLabel);
            } else if (todaysDate.getDayOfWeek().equals(DayOfWeek.TUESDAY)) {
                panel2.add(todayLabel);
            } else if (todaysDate.getDayOfWeek().equals(DayOfWeek.WEDNESDAY)) {
                panel3.add(todayLabel);
            } else if (todaysDate.getDayOfWeek().equals(DayOfWeek.THURSDAY)) {
                panel4.add(todayLabel);
            } else if (todaysDate.getDayOfWeek() == DayOfWeek.FRIDAY) {
                panel5.add(todayLabel);
            } else if (todaysDate.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
                panel6.add(todayLabel);
            } else if (todaysDate.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
                panel7.add(todayLabel);
            }

        }

    //Action event method for pressing buttons 1-7 and save down users textInput to correct textArea in calendar "Adding an event"
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button1) { //when button1 get clicked this below happens
            String textInput = textField1.getText(); //
            textArea1.append(textInput + "\n");//users text input gets saved in textArea1 "adding an event"
            textField1.setText(null); //text in the textField gets deleted after button clicked
            JOptionPane.showOptionDialog(null,"Your event was saved", "Message",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, image, null, 0);

        } else if (e.getSource() == button2) {
            String textInput = textField2.getText();
            textArea2.append(textInput + "\n");
            textField2.setText(null);
            JOptionPane.showOptionDialog(null,"Your event was saved", "Message",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, image, null, 0);


        } else if (e.getSource() == button3) {
            String textInput = textField3.getText();
            textArea3.append(textInput + "\n");
            textField3.setText(null);
            JOptionPane.showOptionDialog(null,"Your event was saved", "Message",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, image, null, 0);

        } else if (e.getSource() == button4) {
            String textInput = textField4.getText();
            textArea4.append(textInput  + "\n");
            textField4.setText(null);
            JOptionPane.showOptionDialog(null,"Your event was saved", "Message",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, image, null, 0);

        } else if (e.getSource() == button5) {
            String textInput = textField5.getText();
            textArea5.append(textInput  + "\n");
            textField5.setText(null);
            JOptionPane.showOptionDialog(null,"Your event was saved", "Message",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, image, null, 0);

        } else if (e.getSource() == button6) {
            String textInput = textField6.getText();
            textArea6.append(textInput  + "\n");
            textField6.setText(null);
            JOptionPane.showOptionDialog(null,"Your event was saved", "Message",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, image, null, 0);

        } else if (e.getSource() == button7) {
            String textInput = textField7.getText();
            textArea7.append(textInput  + "\n");
            textField7.setText(null);
            JOptionPane.showOptionDialog(null,"Your event was saved", "Create player",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, image, null, 0);




            }
    }
}