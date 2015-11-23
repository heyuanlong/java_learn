package cn.itcast.gui.p1.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseAndKeyDemo {

	
	private Frame f;//框架
	private TextField tf;//文本框
	private Button but;//按钮
	
	public MouseAndKeyDemo() {
		init();//初始化
		
	}
	private void init() {//初始化重写
		
		f = new Frame("演示鼠标和键盘监听");
		f.setBounds(400,200,500,400);
		f.setLayout(new FlowLayout());//设置流式布局
		
		tf = new TextField(35);
		but = new Button("一个按钮");
		
		f.add(tf);//加入
		f.add(but);	//加入
		myEvent();	//事件
		f.setVisible(true);//显示
		
	}


	private void myEvent() {
		
		//给文本框添加键盘监听。
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {//键盘按下。。键盘事件
				
//				System.out.println("key run..."+KeyEvent.getKeyText(e.getKeyCode())+"::::"+e.getKeyCode());
//				int code = e.getKeyCode();
//				if(!(code>=KeyEvent.VK_0 && code<=KeyEvent.VK_9)){
//					System.out.println("必须是数字");
//					e.consume();
//				}
				
				if(e.isControlDown() && e.getKeyCode()==KeyEvent.VK_ENTER){//是不是ctrl+down？
					System.out.println("enter run ...");
				}
			}
			
		});
		
		
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				
				System.exit(0);
			}
			
		});
		


		but.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				System.out.println("action run.....");
			}
		});		
		//在按钮上添加一个鼠标监听.
		but.addMouseListener(new MouseAdapter() {

			private int count = 1;
			@Override
			public void mouseEntered(MouseEvent e) {
				
//				System.out.println("mouse enter..."+count++);
				
//				tf.setText("mouse enter..."+count++);//给文本框加入文本
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(e.getClickCount()==2)
				tf.setText("mouse double click..."+count++);
//				System.out.println("mouse click..."+count++);
			}			
		});
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		new MouseAndKeyDemo();
	}

}
