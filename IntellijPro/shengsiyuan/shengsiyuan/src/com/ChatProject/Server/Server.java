package com.ChatProject.Server;

import com.ChatProject.util.CharacterUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-17
 * Time: 22:19:33
 * To change this template use File | Settings | File Templates.
 */
public class Server extends JFrame
{
    private JLabel Jlable1;
    private JLabel Jlable2;
    private JLabel Jlable3 ;

    private JButton jButton;
    private JPanel jPanel;
    private JPanel jPanel1;
    private JScrollPane jsPane;

    private JTextArea jtArea;
    private JTextField JTextField;

    private Map<String ,Integer> map=new HashMap<String ,Integer>();

    public Server(String name)
    {
        super(name);
        this.initComponents();
    }

    private void initComponents()
    {
        Jlable1=new JLabel();
        Jlable2=new JLabel();
        Jlable3=new JLabel();

        jPanel=new JPanel();
        jPanel1=new JPanel();

        jButton=new JButton();

        jsPane=new JScrollPane();
        JTextField=new JTextField(15);

        jtArea=new JTextArea();

        jPanel.setBorder(BorderFactory.createTitledBorder("服务器信息"));
        jPanel1.setBorder(BorderFactory.createTitledBorder("在线用户列表"));

       // JTextField.setText("5000");

        Jlable1.setText("服务器状态");
        Jlable2.setText("停止");
        Jlable3.setForeground(new Color(204,0,51));
        Jlable3.setText("端口号");

        jButton.setText("启动服务器");
        jButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                Server.this.execute(evt);
            }
        });

        this.jtArea.setEditable(false);
        this.jtArea.setForeground(new Color(245,0,0));

        jPanel.add(Jlable1);
        jPanel.add(Jlable2);
        jPanel.add(Jlable3);
        jPanel.add(JTextField);
        jPanel.add(jButton);

        jtArea.setColumns(30);
        jtArea.setForeground(new Color(0,51,204));
        jtArea.setRows(20);

        jsPane.setViewportView(jtArea);
        jPanel1.add(jsPane);

        this.getContentPane().add(jPanel,BorderLayout.NORTH);
        this.getContentPane().add(jPanel1,BorderLayout.SOUTH);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);


        
    }

    public void execute(ActionEvent evt)
    {
        String host=this.JTextField.getText();
        if(CharacterUtil.isEmpty(host))
        {
            JOptionPane.showMessageDialog(this,"端口号不能为空!","警告",JOptionPane.WARNING_MESSAGE);
            this.JTextField.requestFocus();
            return;
        }
        if(!CharacterUtil.isNumber(host))
        {
            JOptionPane.showMessageDialog(this,"端口号必须为数字!","警告",JOptionPane.WARNING_MESSAGE);
            this.JTextField.requestFocus();
            return;
        }
        if(!CharacterUtil.isPortCorrect(host))
        {
            JOptionPane.showMessageDialog(this,"端口号必须在1024与65535之间!","警告",JOptionPane.WARNING_MESSAGE);
            this.JTextField.requestFocus();
            return;
        }

    }

    

    public static void main(String[] args)
    {
        Server s=new Server("服务器");
    }

}
