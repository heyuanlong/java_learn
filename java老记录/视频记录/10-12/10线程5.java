1.class Ticket implements Runnable
		Ticket t = new Ticket();//����һ���߳��������
		Thread t1 = new Thread(t);
		t1.start();
2.class Ticket extends Thread
		Ticket t1 = new Ticket();
		t1.start();

/*
������Ʊ��

�̰߳�ȫ���������ԭ��

1������߳��ڲ�����������ݡ�
2�������������ݵ��̴߳����ж�����

��һ���߳���ִ�в����������ݵĶ�����������У������̲߳��������㡣
�ͻᵼ���̰߳�ȫ����Ĳ����� 
û���������Ƶ�����£��߳̿������κδ�����ж�

���˼·��
���ǽ����������������ݵ��̴߳����װ�����������߳���ִ����Щ�����ʱ��
�߳����Ǵ�0��ʼ��
�����߳�ʱ�����Բ�������ġ�
����Ҫ��ǰ�̰߳���Щ���붼ִ����Ϻ������̲߳ſ��Բ������㡣 

��java�У���ͬ�������Ϳ��Խ��������⡣
ͬ�������ĸ�ʽ��
synchronized(����)//����Ķ���������⣬�������Զ���ĵģ���һ����object����
{
	��Ҫ��ͬ���Ĵ��� ��
}

ͬ���ĺô���������̵߳İ�ȫ���⡣
ͬ���ı׶ˣ���Խ�����Ч�ʣ���Ϊͬ������̵߳Ķ����ж�ͬ������
ͬ����ǰ�᣺ͬ���б����ж���̲߳�ʹ��ͬһ������
*/

class Ticket implements Runnable//extends Thread
{
	private  int num = 100;

	Object obj = new Object();
	public void run()
	{//Object obj = new Object();�����������ô�߳̾͸��и������ˡ�ʧ����
		while(true)
		{
			synchronized(obj)//һ���̸߳㶨������󣬲����������̴߳����￪ʼ//�������һ��������
			{//////////////////����ͻȻ�ж�Ҳ����˵�����̲߳�����ͻȻ�ܽ���
				if(num>0)
				{
					try{Thread.sleep(10);}catch (InterruptedException e){}
					
					System.out.println(Thread.currentThread().getName()+".....sale...."+num--);
				}
			}
		}
	}
}


class  TicketDemo
{
	public static void main(String[] args) 
	{

		Ticket t = new Ticket();//����һ���߳��������

		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);

		t1.start();
		t2.start();
		t3.start();
		t4.start();

		/*
	//��������	class Ticket extends Thread
		Ticket t1 = new Ticket();
//		Ticket t2 = new Ticket();
//		Ticket t3 = new Ticket();
//		Ticket t4 = new Ticket();���ĸ�����

		t1.start();
		t1.start();//һ���̲߳��ܿ������Σ����׳���Ч�߳�״̬�쳣 
		t2.start();
		t3.start();
		*/

		
	}
}

