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
//		jLable.setText("用户账号：");
//		jLable.setBounds(120,10,70,30);
//		this.add(jLable);
//		
//		JTextField jtextfield = new JTextField();
//		jtextfield.setText("请输入账号");
//		jtextfield.setBounds(200, 10, 150, 30);
//		this.add(jtextfield);
//		
//		JLabel jlable = new JLabel();
//		jlable.setText("用户密码：");
//		jlable.setBounds(120,60,70,30);
//		this.add(jlable);
//		
//		JTextField jtextField = new JTextField();
//		jtextField.setText("请输入密码");
//		jtextField.setBounds(200, 60, 150, 30);
//		this.add(jtextField);
//		
//		JButton jbutton=new JButton();
//		jbutton.setText("点击登陆");
//		jbutton.setBounds(190, 110, 120, 50);
//		this.add(jbutton);
		JTextArea jtextfield = new JTextArea();
		jtextfield.setBounds(0, 0, 1200, 700);
		//this.add(jtextfield);
		//加入菜单
		JMenuBar jMenuBar=new JMenuBar();
		//菜单项
		JMenu jMenu=new JMenu();
		JMenu jMenu1=new JMenu();
		JMenu jMenu2=new JMenu();
		JMenu jMenu3=new JMenu();
		JMenu jMenu4=new JMenu();
		jMenu.setText("文件(F)");
		jMenu1.setText("编辑(E)");
		jMenu2.setText("格式(O)");
		jMenu3.setText("查看(V)");
		jMenu4.setText("帮助(H)");
		
		//文件菜单项
		JMenuItem jMenuItem=new JMenuItem();
		JMenuItem jMenuItem1=new JMenuItem();
		JMenuItem jMenuItem2=new JMenuItem();
		JMenuItem jMenuItem3=new JMenuItem();
		JMenuItem jMenuItem4=new JMenuItem();
		JMenuItem jMenuItem5=new JMenuItem();
		JMenuItem jMenuItem6=new JMenuItem();
		
		jMenuItem.setText("新建(N)");
		jMenuItem1.setText("打开(O)");
		jMenuItem2.setText("保存(S)");
		jMenuItem3.setText("另存为(A)");
		jMenuItem4.setText("页面设置(U)...");
		jMenuItem5.setText("打印(P)...");
		jMenuItem6.setText("退出(X)");
		jMenu.add(jMenuItem);
		jMenu.add(jMenuItem1);
		jMenu.add(jMenuItem2);
		jMenu.add(jMenuItem3);
		jMenu.add(jMenuItem4);
		jMenu.add(jMenuItem5);
		jMenu.add(jMenuItem6);
		//编辑菜单项
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
		jmenuItem.setText("撤销(U)");
		jmenuItem1.setText("剪切(T)");
		jmenuItem2.setText("复制(C)");
		jmenuItem3.setText("转到(G)");
		jmenuItem4.setText("粘贴(P)");
		jmenuItem5.setText("删除(L)");
		jmenuItem6.setText("查找(F)");
		jmenuItem7.setText("查找下一个(N)");
		jmenuItem8.setText("替换(R)");
		jmenuItem9.setText("全选(A)");
		jmenuItem10.setText("时间/日期(D)");
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
		//格式菜单项 
		JMenuItem jmenuitem = new JMenuItem();
		JMenuItem jmenuitem1 = new JMenuItem();
		jmenuitem.setText("自动换行(W)");
		jmenuitem1.setText("字体(F)");
		jMenu2.add(jmenuitem);
		jMenu2.add(jmenuitem1);
		
		//查看菜单栏
		JMenuItem caidan = new JMenuItem();
		caidan.setText("状态栏(S)");
		jMenu3.add(caidan);
		
		//帮助菜单栏
		JMenuItem bangzhu = new JMenuItem();
		JMenuItem bangzhu1 = new JMenuItem();
		bangzhu.setText("查看帮助(H)");
		bangzhu1.setText("关于记事本(A)");
		jMenu4.add(bangzhu);
		jMenu4.add(bangzhu1);
		
		
		
		jMenuBar.add(jMenu);
		jMenuBar.add(jMenu1);
		jMenuBar.add(jMenu2);
		jMenuBar.add(jMenu3);
		jMenuBar.add(jMenu4);
		this.setJMenuBar(jMenuBar);
		
		//事件（新建）
		jMenuItem.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				add(jtextfield);
				Main.this.repaint();				
			}	
		});
		//保存
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
		this.setTitle("记事本");//显示标题
		
	}
	public static void main(String[] arge){
		new Main();
	}

}
