import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyFrame extends JFrame  implements ActionListener {
    
    JButton button;
    JLabel label;

    MyFrame() {

        ImageIcon icon = new ImageIcon("icon.png");
        ImageIcon icon2 = new ImageIcon("icon2.png");


        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(175, 170, 200, 90);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100, 100, 200, 90);
        button.addActionListener(this);  // swap "this" with lambda  / e -> System.out.println("Click! from lambda!") / function (we do not need implements ActionListener and @Override actionPerformed)
        button.setText("Click me!");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(-4);
        button.setForeground(Color.blue);
       // button.setBackground(Color.GRAY);
       button.setBorder(BorderFactory.createEtchedBorder());
       //button.setEnabled(false); // to disable button
        

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

 
  @Override
  public void actionPerformed(ActionEvent e) {
      if (e.getSource() == button) {
          System.out.println("Click!");
        button.setEnabled(false); // to only click once 
        label.setVisible(true); 
        }
        
    }
    

}
