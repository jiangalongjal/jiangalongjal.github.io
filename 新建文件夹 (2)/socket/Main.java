package com.socket;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main extends JFrame{
	public static String wb = "";
	public Main(){
		this.setLayout(null);
//		JLabel jLable = new JLabel();
//		jLable.setText("�û��˺ţ�");
//		jLable.setBounds(120,10,70,30);
//		this.add(jLable);
//		
//		JTextField jtextfield = new JTextField();
//		jtextfield.setText("�������˺�");
//		jtextfield.setBounds(200, 10, 150, 30);
//		this.add(jtextfield);
//		
//		JLabel jlable = new JLabel();
//		jlable.setText("�û����룺");
//		jlable.setBounds(120,60,70,30);
//		this.add(jlable);
//		
//		JTextField jtextField = new JTextField();
//		jtextField.setText("����������");
//		jtextField.setBounds(200, 60, 150, 30);
//		this.add(jtextField);
//		
//		JButton jbutton=new JButton();
//		jbutton.setText("�����½");
//		jbutton.setBounds(190, 110, 120, 50);
//		this.add(jbutton);
		JTextArea jtextfield = new JTextArea();
		jtextfield.setBounds(0, 0, 1200, 700);
		//this.add(jtextfield);
		//����˵�
		JMenuBar jMenuBar=new JMenuBar();
		//�˵���
		JMenu jMenu=new JMenu();
		JMenu jMenu1=new JMenu();
		JMenu jMenu2=new JMenu();
		JMenu jMenu3=new JMenu();
		JMenu jMenu4=new JMenu();
		jMenu.setText("�ļ�(F)");
		jMenu1.setText("�༭(E)");
		jMenu2.setText("��ʽ(O)");
		jMenu3.setText("�鿴(V)");
		jMenu4.setText("����(H)");
		
		//�ļ��˵���
		JMenuItem jMenuItem=new JMenuItem();
		JMenuItem jMenuItem1=new JMenuItem();
		JMenuItem jMenuItem2=new JMenuItem();
		JMenuItem jMenuItem3=new JMenuItem();
		JMenuItem jMenuItem4=new JMenuItem();
		JMenuItem jMenuItem5=new JMenuItem();
		JMenuItem jMenuItem6=new JMenuItem();
		
		jMenuItem.setText("�½�(N)");
		jMenuItem1.setText("��(O)");
		jMenuItem2.setText("����(S)");
		jMenuItem3.setText("���Ϊ(A)");
		jMenuItem4.setText("ҳ������(U)...");
		jMenuItem5.setText("��ӡ(P)...");
		jMenuItem6.setText("�˳�(X)");
		jMenu.add(jMenuItem);
		jMenu.add(jMenuItem1);
		jMenu.add(jMenuItem2);
		jMenu.add(jMenuItem3);
		jMenu.add(jMenuItem4);
		jMenu.add(jMenuItem5);
		jMenu.add(jMenuItem6);
		//�༭�˵���
		JMenuItem jmenuItem=new JMenuItem(); 
		JMenuItem jmenuItem1=new JMenuItem(); 
		JMenuItem jmenuItem2=new JMenuItem(); 
		JMenuItem jmenuItem3=new JMenuItem(); 
		JMenuItem jmenuItem4=new JMenuItem();
		JMenuItem jmenuItem5=new JMenuItem();
		JMenuItem jmenuItem6=new JMenuItem();
		JMenuItem jmenuItem7=new JMenuItem();
		JMenuItem jmenuItem8=new JMenuItem();
		JMenuItem jmenuItem9=new JMenuItem();
		JMenuItem jmenuItem10=new JMenuItem();
		jmenuItem.setText("����(U)");
		jmenuItem1.setText("����(T)");
		jmenuItem2.setText("����(C)");
		jmenuItem3.setText("ת��(G)");
		jmenuItem4.setText("ճ��(P)");
		jmenuItem5.setText("ɾ��(L)");
		jmenuItem6.setText("����(F)");
		jmenuItem7.setText("������һ��(N)");
		jmenuItem8.setText("�滻(R)");
		jmenuItem9.setText("ȫѡ(A)");
		jmenuItem10.setText("ʱ��/����(D)");
		jMenu1.add(jmenuItem);
		jMenu1.add(jmenuItem1);
		jMenu1.add(jmenuItem2);
		jMenu1.add(jmenuItem3);
		jMenu1.add(jmenuItem4);
		jMenu1.add(jmenuItem5);
		jMenu1.add(jmenuItem6);
		jMenu1.add(jmenuItem7);
		jMenu1.add(jmenuItem8);
		jMenu1.add(jmenuItem9);
		jMenu1.add(jmenuItem10);
		//��ʽ�˵��� 
		JMenuItem jmenuitem = new JMenuItem();
		JMenuItem jmenuitem1 = new JMenuItem();
		jmenuitem.setText("�Զ�����(W)");
		jmenuitem1.setText("����(F)");
		jMenu2.add(jmenuitem);
		jMenu2.add(jmenuitem1);
		
		//�鿴�˵���
		JMenuItem caidan = new JMenuItem();
		caidan.setText("״̬��(S)");
		jMenu3.add(caidan);
		
		//�����˵���
		JMenuItem bangzhu = new JMenuItem();
		JMenuItem bangzhu1 = new JMenuItem();
		bangzhu.setText("�鿴����(H)");
		bangzhu1.setText("���ڼ��±�(A)");
		jMenu4.add(bangzhu);
		jMenu4.add(bangzhu1);
		
		
		
		jMenuBar.add(jMenu);
		jMenuBar.add(jMenu1);
		jMenuBar.add(jMenu2);
		jMenuBar.add(jMenu3);
		jMenuBar.add(jMenu4);
		this.setJMenuBar(jMenuBar);
		
		//�¼����½���
		jMenuItem.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				add(jtextfield);
				Main.this.repaint();				
			}	
		});
		//����
		jMenuItem2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				wb=jtextfield.getText();
				Baocun.baocun();
			}
			
		});
		
		
		this.setBounds(0,0,1200,700);		
		this.setVisible(true);
		this.setTitle("���±�");//��ʾ����
		
	}
	public static void main(String[] arge){
		new Main();
	}

}
