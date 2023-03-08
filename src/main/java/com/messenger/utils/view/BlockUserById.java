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
 * Created by JFormDesigner on Wed Mar 08 10:28:17 PST 2023
 */



/**
 * @author user
 */
public class BlockUserById extends JPanel {
    public BlockUserById() {
        initComponents();
    }

    private void textField4FocusGained(FocusEvent e) {
        // TODO add your code here
    }

    private void textField4FocusLost(FocusEvent e) {
        // TODO add your code here
    }

    private void textField4MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Johan
        button2 = new JButton();
        textField5 = new JTextField();
        label9 = new JLabel();
        label5 = new JLabel();
        label1 = new JLabel();
        label6 = new JLabel();
        this2 = new JPanel();

        //======== this ========
        setBackground(Color.white);
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .EmptyBorder
        ( 0, 0 ,0 , 0) ,  "JFor\u006dDesi\u0067ner \u0045valu\u0061tion" , javax. swing .border . TitledBorder. CENTER ,javax . swing. border
        .TitledBorder . BOTTOM, new java. awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,java . awt
        . Color .red ) , getBorder () ) );  addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void
        propertyChange (java . beans. PropertyChangeEvent e) { if( "bord\u0065r" .equals ( e. getPropertyName () ) )throw new RuntimeException( )
        ;} } );
        setLayout(null);

        //---- button2 ----
        button2.setText("Block");
        button2.setForeground(Color.white);
        button2.setBackground(new Color(0x3388bb));
        button2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        add(button2);
        button2.setBounds(0, 390, 280, 40);

        //---- textField5 ----
        textField5.setBackground(Color.white);
        textField5.setBorder(new EtchedBorder());
        textField5.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        textField5.addFocusListener(new FocusAdapter() {
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
        textField5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textField4MouseClicked(e);
            }
        });
        add(textField5);
        textField5.setBounds(40, 330, 240, 40);

        //---- label9 ----
        label9.setIcon(new ImageIcon(getClass().getResource("/com/messenger/utils/view/image/301111.png")));
        label9.setDisabledIcon(new ImageIcon(getClass().getResource("/img/useruseeruser.png")));
        label9.setBorder(new EtchedBorder());
        add(label9);
        label9.setBounds(5, 330, 35, 40);

        //---- label5 ----
        label5.setText("Block User :");
        label5.setBorder(null);
        label5.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        label5.setBackground(Color.black);
        label5.setForeground(Color.black);
        add(label5);
        label5.setBounds(5, 295, 120, 35);

        //---- label1 ----
        label1.setIcon(new ImageIcon(getClass().getResource("/com/messenger/utils/view/image/52.png")));
        add(label1);
        label1.setBounds(75, 15, 125, 115);

        //---- label6 ----
        label6.setText("Block ");
        label6.setBorder(null);
        label6.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        label6.setBackground(Color.black);
        label6.setForeground(Color.black);
        add(label6);
        label6.setBounds(110, 145, 75, 35);

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

        //======== this2 ========
        {
            this2.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new
            javax.swing.border.EmptyBorder(0,0,0,0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion",javax
            .swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java
            .awt.Font("Dia\u006cog",java.awt.Font.BOLD,12),java.awt
            .Color.red),this2. getBorder()));this2. addPropertyChangeListener(new java.beans.
            PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("bord\u0065r".
            equals(e.getPropertyName()))throw new RuntimeException();}});
            this2.setLayout(null);

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
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Johan
    private JButton button2;
    private JTextField textField5;
    private JLabel label9;
    private JLabel label5;
    private JLabel label1;
    private JLabel label6;
    private JPanel this2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
