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

	
	private Frame f;//���
	private TextField tf;//�ı���
	private Button but;//��ť
	
	public MouseAndKeyDemo() {
		init();//��ʼ��
		
	}
	private void init() {//��ʼ����д
		
		f = new Frame("��ʾ���ͼ��̼���");
		f.setBounds(400,200,500,400);
		f.setLayout(new FlowLayout());//������ʽ����
		
		tf = new TextField(35);
		but = new Button("һ����ť");
		
		f.add(tf);//����
		f.add(but);	//����
		myEvent();	//�¼�
		f.setVisible(true);//��ʾ
		
	}


	private void myEvent() {
		
		//���ı�����Ӽ��̼�����
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {//���̰��¡��������¼�
				
//				System.out.println("key run..."+KeyEvent.getKeyText(e.getKeyCode())+"::::"+e.getKeyCode());
//				int code = e.getKeyCode();
//				if(!(code>=KeyEvent.VK_0 && code<=KeyEvent.VK_9)){
//					System.out.println("����������");
//					e.consume();
//				}
				
				if(e.isControlDown() && e.getKeyCode()==KeyEvent.VK_ENTER){//�ǲ���ctrl+down��
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
		//�ڰ�ť�����һ��������.
		but.addMouseListener(new MouseAdapter() {

			private int count = 1;
			@Override
			public void mouseEntered(MouseEvent e) {
				
//				System.out.println("mouse enter..."+count++);
				
//				tf.setText("mouse enter..."+count++);//���ı�������ı�
				
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
