package com.messenger.utils.view;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/*
 * Created by JFormDesigner on Tue Mar 07 22:34:34 PST 2023
 */



/**
 * @author user
 */
public class Login extends JPanel {
    public Login() {
        initComponents();
        textField4.setEnabled(false);
        textField4.setVisible(false);
        this2.setFocusable(true);
    }

    private void textField1FocusGained(FocusEvent e) {
        // TODO add your code here
       
        
    }

    private void textField4FocusGained(FocusEvent e) {
        // TODO add your code here

/*        if (textField4.getText().equals("Username")){
            textField4.setText("");
        }
        textField4.setForeground(new Color(153,153,153));*/


    }

    private void textField4FocusLost(FocusEvent e) {
        // TODO add your code here

/*        if (textField4.getText().equals("")){
            textField4.setText("Username");

        }
        else {
            textField4.setText("");
        }
        textField4.setForeground(new Color(153,153,153));*/
    }

    private void textField4MouseClicked(MouseEvent e) {
        // TODO add your code here
      /*  textField4.setEnabled(true);
        textField4.setText("");*/
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
//        textField4.setEnabled(true);
       // textField4.setText("");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Johan
        this2 = new JPanel();
        label3 = new JLabel();
        textField3 = new JTextField();
        textField4 = new JTextField();
        label1 = new JLabel();
        label9 = new JLabel();
        label6 = new JLabel();
        label2 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        button1 = new JButton();
        label10 = new JLabel();
        vSpacer1 = new JPanel(null);
        hSpacer1 = new JPanel(null);

        //======== this ========
        setBorder(null);
        setBackground(new Color(0xf1f3f4));
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new
        javax . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JFor\u006dDesi\u0067ner \u0045valu\u0061tion" , javax
        . swing .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java
        . awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,java . awt
        . Color .red ) , getBorder () ) );  addPropertyChangeListener( new java. beans .
        PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "bord\u0065r" .
        equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );
        setLayout(null);

        //======== this2 ========
        {
            this2.setBorder(null);
            this2.setBackground(new Color(0xfefefe));
            this2.setLayout(null);

            //---- label3 ----
            label3.setText("LOGIN");
            label3.setBorder(null);
            label3.setFont(new Font("Segoe UI", Font.PLAIN, 22));
            label3.setBackground(Color.black);
            label3.setForeground(Color.black);
            this2.add(label3);
            label3.setBounds(105, 115, 85, 35);

            //---- textField3 ----
            textField3.setBackground(Color.white);
            textField3.setBorder(new EtchedBorder());
            textField3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            this2.add(textField3);
            textField3.setBounds(45, 315, 240, 40);

            //---- textField4 ----
            textField4.setBackground(Color.white);
            textField4.setBorder(new EtchedBorder());
            textField4.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            textField4.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    textField4FocusGained(e);
                    textField4FocusGained(e);
                }
                @Override
                public void focusLost(FocusEvent e) {
                    textField4FocusLost(e);
                    textField4FocusLost(e);
                }
            });
            textField4.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    textField4MouseClicked(e);
                }
            });
            this2.add(textField4);
            textField4.setBounds(45, 240, 240, 40);

            //---- label1 ----
            label1.setIcon(new ImageIcon(getClass().getResource("/com/messenger/utils/view/image/login(1).png")));
            this2.add(label1);
            label1.setBounds(75, 5, 130, 115);

            //---- label9 ----
            label9.setIcon(new ImageIcon(getClass().getResource("/com/messenger/utils/view/image/uuuuuuuuuuuuu.png")));
            label9.setDisabledIcon(new ImageIcon(getClass().getResource("/img/useruseeruser.png")));
            label9.setBorder(new EtchedBorder());
            this2.add(label9);
            label9.setBounds(10, 240, 35, 40);

            //---- label6 ----
            label6.setIcon(new ImageIcon(getClass().getResource("/com/messenger/utils/view/image/ffffffffffff.png")));
            label6.setDisabledIcon(new ImageIcon(getClass().getResource("/img/ddddddddddd.png")));
            label6.setBorder(new EtchedBorder());
            label6.setAutoscrolls(true);
            this2.add(label6);
            label6.setBounds(10, 315, 35, 40);

            //---- label2 ----
            label2.setIcon(new ImageIcon(getClass().getResource("/img/login01.png")));
            this2.add(label2);
            label2.setBounds(300, 0, 545, 365);

            //---- label7 ----
            label7.setText("Username :");
            label7.setFont(new Font("Segoe UI", Font.PLAIN, 18));
            this2.add(label7);
            label7.setBounds(10, 210, 105, label7.getPreferredSize().height);

            //---- label8 ----
            label8.setText("Password :");
            label8.setFont(new Font("Segoe UI", Font.PLAIN, 18));
            this2.add(label8);
            label8.setBounds(new Rectangle(new Point(10, 285), label8.getPreferredSize()));

            //---- button1 ----
            button1.setText("Login");
            button1.setForeground(Color.white);
            button1.setBackground(new Color(0x3388bb));
            button1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
            this2.add(button1);
            button1.setBounds(5, 370, 280, 40);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < this2.getComponentCount(); i++) {
                    Rectangle bounds = this2.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = this2.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                this2.setMinimumSize(preferredSize);
                this2.setPreferredSize(preferredSize);
            }
        }
        add(this2);
        this2.setBounds(35, 35, 295, 430);

        //---- label10 ----
        label10.setIcon(new ImageIcon(getClass().getResource("/com/messenger/utils/view/image/login01.png")));
        add(label10);
        label10.setBounds(345, 30, 530, 435);
        add(vSpacer1);
        vSpacer1.setBounds(100, 470, vSpacer1.getPreferredSize().width, 35);
        add(hSpacer1);
        hSpacer1.setBounds(880, 275, 25, hSpacer1.getPreferredSize().height);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < getComponentCount(); i++) {
                Rectangle bounds = getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            setMinimumSize(preferredSize);
            setPreferredSize(preferredSize);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Johan
    private JPanel this2;
    private JLabel label3;
    private JTextField textField3;
    private JTextField textField4;
    private JLabel label1;
    private JLabel label9;
    private JLabel label6;
    private JLabel label2;
    private JLabel label7;
    private JLabel label8;
    private JButton button1;
    private JLabel label10;
    private JPanel vSpacer1;
    private JPanel hSpacer1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
