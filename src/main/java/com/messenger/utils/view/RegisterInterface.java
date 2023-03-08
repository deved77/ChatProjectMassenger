package com.messenger.utils.view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Tue Mar 07 23:56:27 PST 2023
 */



/**
 * @author UserNet
 */
public class RegisterInterface extends JFrame {
    public RegisterInterface() {
        initComponents();
    }

    private void createUIComponents() {
        // TODO: add custom component creation code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Ali
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        textField3 = new JTextField();
        label4 = new JLabel();
        label5 = new JLabel();
        textField5 = new JTextField();
        button1 = new JButton();
        textField4 = new JTextField();
        label6 = new JLabel();
        textField1 = new JTextField();

        //======== this ========
        setBackground(new Color(0xccffff));
        setIconImage(new ImageIcon("C:\\Users\\UserNet\\Desktop\\13.jpg").getImage());
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1 ========
        {
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing
            .border.EmptyBorder(0,0,0,0), "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e",javax.swing.border.TitledBorder
            .CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.Font("Dialo\u0067",java.
            awt.Font.BOLD,12),java.awt.Color.red),panel1. getBorder()))
            ;panel1. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e
            ){if("borde\u0072".equals(e.getPropertyName()))throw new RuntimeException();}})
            ;
            panel1.setLayout(null);

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
        panel1.setBounds(120, 70, panel1.getPreferredSize().width, 0);

        //======== panel2 ========
        {
            panel2.setLayout(null);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel2.getComponentCount(); i++) {
                    Rectangle bounds = panel2.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel2.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel2.setMinimumSize(preferredSize);
                panel2.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(panel2);
        panel2.setBounds(new Rectangle(new Point(175, 105), panel2.getPreferredSize()));

        //======== panel3 ========
        {
            panel3.setBackground(new Color(0xf1f3f4));
            panel3.setLayout(null);

            //======== panel4 ========
            {
                panel4.setBackground(Color.white);
                panel4.setBorder(new EtchedBorder());
                panel4.setLayout(null);

                //---- label1 ----
                label1.setText("Register");
                label1.setFont(new Font("Segoe UI Historic", Font.BOLD, 26));
                label1.setForeground(Color.black);
                panel4.add(label1);
                label1.setBounds(85, 30, 140, label1.getPreferredSize().height);

                //---- label2 ----
                label2.setText("First_Name");
                label2.setFont(new Font("Segoe UI", Font.BOLD, 16));
                label2.setForeground(Color.black);
                panel4.add(label2);
                label2.setBounds(75, 90, 115, 35);

                //---- textField2 ----
                textField2.setBackground(Color.white);
                textField2.setSelectionColor(Color.white);
                textField2.setBorder(new EtchedBorder());
                textField2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                panel4.add(textField2);
                textField2.setBounds(75, 130, 255, 40);

                //---- label3 ----
                label3.setText("Last_Name");
                label3.setFont(new Font("Segoe UI", Font.BOLD, 16));
                label3.setForeground(Color.black);
                panel4.add(label3);
                label3.setBounds(80, 185, 115, 35);

                //---- textField3 ----
                textField3.setBackground(Color.white);
                textField3.setBorder(new EtchedBorder());
                textField3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                panel4.add(textField3);
                textField3.setBounds(75, 225, 255, 40);

                //---- label4 ----
                label4.setText("Phone_Number");
                label4.setFont(new Font("Segoe UI", Font.BOLD, 16));
                label4.setForeground(Color.black);
                panel4.add(label4);
                label4.setBounds(75, 285, 145, 35);

                //---- label5 ----
                label5.setText("Address");
                label5.setFont(new Font("Segoe UI", Font.BOLD, 16));
                label5.setForeground(Color.black);
                panel4.add(label5);
                label5.setBounds(70, 375, 145, 35);

                //---- textField5 ----
                textField5.setBackground(Color.white);
                textField5.setBorder(new EtchedBorder());
                textField5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
                panel4.add(textField5);
                textField5.setBounds(70, 410, 255, 40);

                //---- button1 ----
                button1.setText("Register");
                button1.setBackground(new Color(0x3b98f7));
                button1.setForeground(Color.white);
                button1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                button1.setRolloverEnabled(false);
                button1.setRequestFocusEnabled(false);
                button1.setHideActionText(true);
                button1.setFont(new Font("Segoe UI", Font.BOLD, 16));
                button1.setBorder(null);
                button1.setBorderPainted(false);
                button1.setFocusTraversalPolicyProvider(true);
                button1.setDisplayedMnemonicIndex(0);
                button1.setMargin(new Insets(2, 14, 2, 14));
                button1.setAutoscrolls(true);
                button1.setOpaque(false);
                panel4.add(button1);
                button1.setBounds(95, 500, 193, 40);

                //---- textField4 ----
                textField4.setBackground(Color.white);
                textField4.setBorder(new EtchedBorder());
                textField4.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                panel4.add(textField4);
                textField4.setBounds(75, 325, 250, 40);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel4.getComponentCount(); i++) {
                        Rectangle bounds = panel4.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel4.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel4.setMinimumSize(preferredSize);
                    panel4.setPreferredSize(preferredSize);
                }
            }
            panel3.add(panel4);
            panel4.setBounds(60, 50, 415, 570);

            //---- label6 ----
            label6.setIcon(new ImageIcon(getClass().getResource("/com/messenger/utils/view/image/31.jpg")));
            panel3.add(label6);
            label6.setBounds(515, 60, 560, 550);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel3.getComponentCount(); i++) {
                    Rectangle bounds = panel3.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel3.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel3.setMinimumSize(preferredSize);
                panel3.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(panel3);
        panel3.setBounds(-20, 0, 1040, 720);

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

        //---- textField1 ----
        textField1.setBackground(new Color(0xcc0000));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Ali
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JLabel label1;
    private JLabel label2;
    private JTextField textField2;
    private JLabel label3;
    private JTextField textField3;
    private JLabel label4;
    private JLabel label5;
    private JTextField textField5;
    private JButton button1;
    private JTextField textField4;
    private JLabel label6;
    private JTextField textField1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
