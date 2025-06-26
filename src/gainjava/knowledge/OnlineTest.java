package gainjava.knowledge;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OnlineTest extends JFrame implements ActionListener {

    //Created JLabel , JRadioButton , JButton onJFrame

    JLabel label;
    JRadioButton radioButton[] = new JRadioButton[5];
    JButton btnNext , btnBookmark;
    ButtonGroup bg;
    int count = 0 , current = 0 , x = 1 , y = 1 , now = 0;
    int m[] = new int[10];

    OnlineTest(String message){
        super(s);
        label = new JLabel();
        add(label);
        bg =  new ButtonGroup();
        for(int i = 0; i < 5 ; i++){
            radioButton[i] = new JRadioButton();
            add(radioButton[i]);
            bg.add(radioButton[i]);
        }
        btnNext = new JButton("Next");
        btnBookmark = new JButton("Bookmark");
        btnNext.addActionListener(this);
        btnBookmark.addActionListener(this);
        add(btnNext);
        add(btnBookmark);
        set();
        label.setBounds(30,40,450,20);
        radioButton[0].setBounds(50,80,100,20);
        radioButton[1].setBounds(50,110,100,20);
        radioButton[2].setBounds(50,140,100,20);
        radioButton[3].setBounds(50,170,100,20);
        btnNext.setBounds(100,240, 100,30);
        btnBookmark.setBounds(270,240,100,30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250,100);
        setVisible(true);
        setSize(600,350);

    }
    void set(){
        radioButton[4] = setSelected(true);
        if(current == 0){
            label.setText("Q1: Which of the following is not introduced with java 8?");
            radioButton[0].setText("Stream API");
            radioButton[1].setText("Serialization");
            radioButton[2].setText("Spliterator");
            radioButton[3].setText("Lambda Expression");

        }
        if(current == 1){

            label.setText("Q2: What is the function of BooleanSupplier function interface?");
            radioButton[0].setText("Represent supplier of boolean-valued result");
            radioButton[1].setText("Return Boolean-valued result");
            radioButton[2].setText("There is no such function interface");
            radioButton[3].setText("Return null if boolean is passed as arguments");

        }
        if(current == 2){

            label.setText("Q3: What is the return type of lambda expression?");
            radioButton[0].setText("String");
            radioButton[1].setText("Object");
            radioButton[2].setText("Void");
            radioButton[3].setText("Function");

        }
        if(current == 3){

            label.setText("Q4: What is the function of BooleanSupplier function interface?");
            radioButton[0].setText("Represent supplier of boolean-valued result");
            radioButton[1].setText("Return Boolean-valued result");
            radioButton[2].setText("There is no such function interface");
            radioButton[3].setText("Return null if boolean is passed as arguments");

        }
        if(current == 4){

            label.setText("Q5: What is the function of BooleanSupplier function interface?");
            radioButton[0].setText("Represent supplier of boolean-valued result");
            radioButton[1].setText("Return Boolean-valued result");
            radioButton[2].setText("There is no such function interface");
            radioButton[3].setText("Return null if boolean is passed as arguments");

        }

        if(current == 5){

            label.setText("Q6: How to add entire file in one lline using java 8?");
            radioButton[0].setText("Files.readAllLines()");
            radioButton[1].setText("Files.read()");
            radioButton[2].setText("Files.readFile()");
            radioButton[3].setText("Files.lines()");

        } if(current == 6){

            label.setText("Q7: What is the function of BooleanSupplier function interface?");
            radioButton[0].setText("Represent supplier of boolean-valued result");
            radioButton[1].setText("Return Boolean-valued result");
            radioButton[2].setText("There is no such function interface");
            radioButton[3].setText("Return null if boolean is passed as arguments");

        }
        if(current == 7){

            label.setText("Q8: Which of the following is not the core interface of hibernate?");
            radioButton[0].setText("Configuration");
            radioButton[1].setText("Criteria");
            radioButton[2].setText("SessionManagement");
            radioButton[3].setText("session");

        }
        if(current == 8){

            label.setText("Q9: Session factory is a thread safe object.");
            radioButton[0].setText("true");
            radioButton[1].setText("false");
            radioButton[2].setText("Don't know");
            radioButton[3].setText("false");

        }
        if(current == 9){

            label.setText("Q10: Which of the following is not hte state of object in Hibernate?");
            radioButton[0].setText("Attached()");
            radioButton[1].setText("Detached()");
            radioButton[2].setText("Persistent()");
            radioButton[3].setText("Transient");

        }



    }
    @Override
    public void actionPerformed(ActionEvent e){

    }


}
