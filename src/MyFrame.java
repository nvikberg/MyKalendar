//Nikolina Vikberg, Ardi V2

import java.awt.*;
import java.awt.event.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
//MyFrame class extends JFrame class and implements ActionListener interface
    //Creating all the attributes and objects that I will use in the code
    JLabel todayLabel;
    JButton[] buttons = new JButton[7];
    JTextArea[] textAreas = new JTextArea[7];
    JTextField[] textFields = new JTextField[7];
    JPanel[] panels = new JPanel[7];
    ImageIcon image = new ImageIcon("icons8-lotus-48.png");  //create image icon to use in frame and more

    MyFrame() {
        //Constructor for My Frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fonstret stangs
        setTitle("My Calendar");
        setLayout(new FlowLayout());
        setSize(1200, 500);
        setLocation(300, 150);
        setResizable(false);
        setIconImage(image.getImage()); //place logo in frame (switches out java logo)
        getContentPane().setBackground(Color.WHITE);

        for (int i = 0; i < 7; i++) {
            buttons[i] = new JButton("Add event");
            textAreas[i] = new JTextArea();
            textFields[i] = new JTextField("Type here");
            panels[i] = createDayPanel(buttons[i], textAreas[i], textFields[i]);
            add(panels[i]);
        }

        //TodayLabel is holding "TODAY" label for todaysDateMethod (highlighting which day is today in calendar)
        todayLabel = new JLabel();
        add(todayLabel); //add todaylabel to the frame

        //Calling methods for weekly dates and current date today
        dayAndDateMethod();
        todaysDateMethod();
        setVisible(true); //set frame to visible
    }

    private JPanel createDayPanel(JButton button, JTextArea textArea, JTextField textField) {
        JPanel panel = new JPanel(new GridLayout(4, 1));
        panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel.setPreferredSize(new Dimension(150, 420));
        panel.setBackground(new Color(237, 228, 204));
        textArea.setPreferredSize(new Dimension(130, 270));
        button.setPreferredSize(new Dimension(100, 30));
        button.setFocusable(false);
        button.setBackground(Color.white);
        button.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        button.addActionListener(this); //skapa actionlistner till save knappen sa den kan spara
        textField.setPreferredSize(new Dimension(120, 30));

        //Adding all components to all panels
        panel.add(new JLabel());
        panel.add(textArea);
        panel.add(button);
        panel.add(textField);


        return panel;
    }

    //Method for weekday and date using LocalDate and DayOfWeek w temoralAdjusters. Saving down weekday+date to label 1-7 for each weekday
    public void dayAndDateMethod() {
        LocalDate currentDate = LocalDate.now();

        for (int i = 0; i < 7; i++) {
            LocalDate dayDate = currentDate.with(TemporalAdjusters.previousOrSame(DayOfWeek.values()[i])); //Getting dayofweek and saving it to dayDate object
            String dayString = dayDate.getDayOfWeek().toString(); //saving down dayDate weekday to string mondayDay
            ((JLabel) panels[i].getComponent(0)).setText(dayString + " " + dayDate);

        }
    }
    //Method for todays date which comes with icon and text
    public void todaysDateMethod() {
        LocalDate todaysDate = LocalDate.now(); //gets date today
        String todaysDay = todaysDate.getDayOfWeek().toString(); //saves down todays day to string
        todayLabel.setIcon(image);
        todayLabel.setText(todaysDay + " TODAY! "); //now I can use todaysDay as an object and save the text to todayLabel

        for (int i = 0; i < 7; i++) {
            if (todaysDate.getDayOfWeek().getValue() == i + Calendar.SUNDAY) {
                panels[i].add(todayLabel);
                break;
            }
        }
    }
    //Action event method for pressing buttons 1-7 and save down users textInput to correct textArea in calendar "Adding an event"
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 7; i++) {
            if (e.getSource() == buttons[i]) { //when buttons get clicked this below happens
                String textInput = textFields[i].getText(); //
                textAreas[i].append(textInput + "\n");//users text input gets saved in textArea "adding an event"
                textFields[i].setText(null); //text in the textField gets deleted after button clicked
                JOptionPane.showOptionDialog(null, "Your event was saved", "Message",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, image, null, 0);
                break;
            }
        }
    }
}