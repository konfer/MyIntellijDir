package com.ChatProject.Client;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-18
 * Time: 21:08:03
 * To change this template use File | Settings | File Templates.
 */
import com.ChatProject.util.CharacterUtil;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Client extends JFrame
{
	private JButton jButton1;

	private JButton jButton2;

	private JLabel jLabel1;

	private JLabel jLabel2;

	private JLabel jLabel3;

	private JPanel jPanel;

	private JTextField username;

	private JTextField hostAddress;

	private JTextField port;

	public Client(String name)
	{
		super(name);

		initComponents(); // initialize UI
	}

	private void initComponents()
	{
		jPanel = new JPanel();

		jLabel1 = new JLabel();
		jLabel2 = new JLabel();
		jLabel3 = new JLabel();

		username = new JTextField(15);
		hostAddress = new JTextField(15);
		port = new JTextField(15);

		jButton1 = new JButton();
		jButton2 = new JButton();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setAlwaysOnTop(true);
		this.setResizable(false);

		jPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("�û���¼"));

		jLabel1.setText("�û���");
		jLabel2.setText("������");
		jLabel3.setText("�˿ں�");

		jButton1.setText("��¼");
		jButton2.setText("����");

		jButton1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				//Client.this.login(e);
                jButton1ActionPerformed(evt);
			}
		});

        jButton2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				//Client.this.login(e);
                jButton2ActionPerformed(evt);
			}
		});

		jPanel.add(jLabel1);
		jPanel.add(username);
		jPanel.add(jLabel2);
		jPanel.add(hostAddress);
		jPanel.add(jLabel3);
		jPanel.add(port);

		jPanel.add(jButton1);
		jPanel.add(jButton2);

		this.getContentPane().add(jPanel);

		this.setSize(250, 300);
		this.setVisible(true);
	}

	private void login(ActionEvent event)
	{
//		String username = this.username.getText();
//		String hostAddress = this.hostAddress.getText();
//		String port = this.port.getText();
//
//	//	ClientConnection clientConnection = new ClientConnection(this, hostAddress, Integer.parseInt(port), username);
//
//		if(clientConnection.login())
//		{
//			clientConnection.start();
//		}
//		else
//		{
//			JOptionPane.showMessageDialog(this, "�û����ظ���", "����", JOptionPane.ERROR_MESSAGE);
//		}
    }

    public void jButton1ActionPerformed(ActionEvent evt)
    {
        String userName=this.username.getText();
        String hostAddress=this.hostAddress.getText();
        String hostPort=this.port.getText();

        if(CharacterUtil.isEmpty(userName))
        {
            JOptionPane.showMessageDialog(this,"�û�������Ϊ��!","����",JOptionPane.WARNING_MESSAGE);
            this.username.requestFocus();
            return;
        }
        if(!CharacterUtil.isUserNameCorrect(userName))
        {
            JOptionPane.showMessageDialog(this,"�û�����ʽ����ȷ!","����",JOptionPane.WARNING_MESSAGE);
            this.username.requestFocus();
            return;
        }

        int port=Integer.parseInt(hostPort);

        CharacterUtil.SERVER_HOST=hostAddress;
        CharacterUtil.CLIENT_NAME=userName;

    }

    public void jButton2ActionPerformed(ActionEvent evt)
    {

    }

	public static void main(String[] args)
	{
		new Client("�û���¼");
	}

}
