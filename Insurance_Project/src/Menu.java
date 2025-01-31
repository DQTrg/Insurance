import javax.swing.*;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;




    public class Menu implements ActionListener {
        JFrame f;
        JMenuBar mb;
        JMenu file,edit,help;
        JMenuItem cut,copy,paste,selectAll;
        JTextArea ta;

        public Menu() {
            //Creating the frame
            JFrame frame = new JFrame();

            //Creating the menu items
            cut = new JMenuItem("cut");
            copy = new JMenuItem("copy");
            paste = new JMenuItem("paste");
            selectAll = new JMenuItem("selectAll");

            //Adding action listener for these menu items
            cut.addActionListener(this);
            copy.addActionListener(this);
            paste.addActionListener(this);
            selectAll.addActionListener(this);

            //Adding menu items to the menu bar
            mb = new JMenuBar();
            file = new JMenu("File");
            edit = new JMenu("Edit");
            edit.add(cut);
            edit.add(copy);
            edit.add(paste);
            edit.add(selectAll);

            //Creating the Text area
            ta = new JTextArea();
            ta.setBounds(10, 10, 360, 320);

            JButton b=new JButton("Bao Hiem");
            b.setBounds(50,100,95,30);


            //Adding all components to the frame
            frame.add(mb);
            f.add(ta);
            frame.setJMenuBar(mb);
            frame.setLayout(null);
            frame.setSize(400, 400);
            frame.setVisible(true);
            frame.setTitle("Tinh Bao Hiem");
        }

        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==cut)
                ta.cut();
            if(e.getSource()==paste)
                ta.paste();
            if(e.getSource()==copy)
                ta.copy();
            if(e.getSource()==selectAll)
                ta.selectAll();
            JButton b=new JButton("Bao Hiem");
            b.setBounds(50,100,95,30);



        }
    }

