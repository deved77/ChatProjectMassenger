package com.messenger.utils.view;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;
/*
 * Created by JFormDesigner on Wed Mar 08 06:31:57 PST 2023
 */



/**
 * @author UserNet
 */
public class MassageInterface extends JFrame {
    public MassageInterface() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Ali
        textField1 = new JTextField();
        label1 = new JLabel();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        label2 = new JLabel();
        button1 = new JButton();
        panel1 = new JPanel();
        label3 = new JLabel();
        label4 = new JLabel();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- textField1 ----
        textField1.setFont(new Font("Segoe UI", Font.BOLD, 20));
        textField1.setBorder(new EtchedBorder());
        contentPane.add(textField1);
        textField1.setBounds(25, 525, 440, 41);

        //---- label1 ----
        label1.setIcon(new ImageIcon(getClass().getResource("/com/messenger/utils/view/image/45.png")));
        label1.setBackground(Color.white);
        contentPane.add(label1);
        label1.setBounds(470, 525, 25, 40);

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(textArea1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(20, 100, 445, 420);

        //---- label2 ----
        label2.setIcon(new ImageIcon(getClass().getResource("/com/messenger/utils/view/image/60.jpg")));
        label2.setBackground(new Color(0xcccccc));
        contentPane.add(label2);
        label2.setBounds(490, 25, 530, 565);

        //---- button1 ----
        button1.setText("chat messages");
        button1.setFont(new Font("Times New Roman", Font.BOLD, 22));
        contentPane.add(button1);
        button1.setBounds(20, 60, 445, 40);

        //======== panel1 ========
        {
            panel1.setBackground(new Color(0x4568c6));
            panel1.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax .
            swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JFor\u006dDesi\u0067ner \u0045valu\u0061tion" , javax. swing .border
            . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "Dia\u006cog"
            , java .awt . Font. BOLD ,12 ) ,java . awt. Color .red ) ,panel1. getBorder
            () ) ); panel1. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java
            . beans. PropertyChangeEvent e) { if( "bord\u0065r" .equals ( e. getPropertyName () ) )throw new RuntimeException
            ( ) ;} } );
            panel1.setLayout(null);

            //---- label3 ----
            label3.setIcon(new ImageIcon(getClass().getResource("/com/messenger/utils/view/image/60.png")));
            panel1.add(label3);
            label3.setBounds(10, 0, 30, 40);

            //---- label4 ----
            label4.setIcon(new ImageIcon(getClass().getResource("/com/messenger/utils/view/image/61.png")));
            panel1.add(label4);
            label4.setBounds(50, 5, 45, 35);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel1.getComponentCount(); i++) {
                    Rectangle bounds = panel1.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel1.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel1.setMinimumSize(preferredSize);
                panel1.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(panel1);
        panel1.setBounds(10, 10, 1035, panel1.getPreferredSize().height);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Ali
    private JTextField textField1;
    private JLabel label1;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JLabel label2;
    private JButton button1;
    private JPanel panel1;
    private JLabel label3;
    private JLabel label4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
