package com.socket;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 * ��½�Ƚ�
 * */
public class Main2 extends JFrame{
	public Main2(){
		this.setLayout(null);
		this.setTitle("QQ��½");
		JLabel jLabel = new JLabel();
		jLabel.setText("QQ");//Ҫʵ�ֵ�����
		jLabel.setFont(new java.awt.Font("Dialog",1,15));
		
		jLabel.setBounds(10,5,30,30);//���ÿؼ���λ��
		this.add(jLabel);//����ŵ�������
		
		JLabel jlabel = new JLabel();
		jlabel.setText("�˺�");//Ҫʵ�ֵ�����
		jlabel.setBounds(25, 40, 150, 20);//���ÿؼ���λ��
		this.add(jlabel);//����ŵ�������
		//�ı���
		JTextArea jTextArea = new JTextArea();//����ؼ�
		jTextArea.setBounds(65, 40, 150, 20);//���ÿؼ���λ��
		this.add(jTextArea);//����ŵ�������
		
		JLabel label = new JLabel();
		label.setText("����");//Ҫʵ�ֵ�����
		label.setBounds(25, 70, 150, 20);//���ÿؼ���λ��
		this.add(label);//����ŵ�������
		//�����
		JPasswordField jPasswordField = new JPasswordField (); 
		jPasswordField.setBounds(65, 70, 150, 20);
		jPasswordField.setEchoChar('*');
		this.add(jPasswordField);

		JButton jButton = new JButton();//����ؼ�
		jButton.setText("��¼");//����ʵ��
		jButton.setBounds(65, 100, 150, 20);//���ÿؼ���λ��
		this.add(jButton);//����ŵ�������
		
		JTextArea jTextArea2 = new JTextArea();//����ؼ�
		jTextArea2.setText("");
		jTextArea2.setVisible(false);
		jTextArea2.setOpaque(false);
		jTextArea2.setBounds(65, 130, 200, 20);//���ÿؼ���λ��
		this.add(jTextArea2);//����ŵ�������
		
		this.setBounds(300,200,300,200);//���崰�ڴ�С
		this.setVisible(true);//���崰���Ƿ�ɼ�
		
		jButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = jTextArea.getText();
				String b = jPasswordField.getText();
				if(a.equals("717560182") && b.equals("123")){
					jTextArea2.setVisible(true);
					jTextArea2.setText("��½�ɹ�");
				}else if(!a.equals("717560182") && b.equals("123")){
					jTextArea2.setVisible(true);
					jTextArea2.setText("��¼ʧ��,�˺�����");
				}else if(a.equals("717560182") && !b.equals("123")){
					jTextArea2.setVisible(true);
					jTextArea2.setText("��¼ʧ��,��������");
				}else{
					jTextArea2.setVisible(true);
					jTextArea2.setText("��¼ʧ��,�����˺��������Ƿ�����");
				}
			}
		});
	}
	public static void main(String[] args) {
		new Main2();
	}
}
