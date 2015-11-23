1.class Ticket implements Runnable
		Ticket t = new Ticket();//创建一个线程任务对象。
		Thread t1 = new Thread(t);
		t1.start();
2.class Ticket extends Thread
		Ticket t1 = new Ticket();
		t1.start();

/*
需求：卖票。

线程安全问题产生的原因：

1，多个线程在操作共享的数据。
2，操作共享数据的线程代码有多条。

当一个线程在执行操作共享数据的多条代码过程中，其他线程参与了运算。
就会导致线程安全问题的产生。 
没有特殊限制的情况下，线程可以在任何代码段中断

解决思路；
就是将多条操作共享数据的线程代码封装起来，当有线程在执行这些代码的时候，
线程数是从0开始的
其他线程时不可以参与运算的。
必须要当前线程把这些代码都执行完毕后，其他线程才可以参与运算。 

在java中，用同步代码块就可以解决这个问题。
同步代码块的格式：
synchronized(对象)//这里的对象可以任意，可以是自定义的的，但一般用object对象
{
	需要被同步的代码 ；
}

同步的好处：解决了线程的安全问题。
同步的弊端：相对降低了效率，因为同步外的线程的都会判断同步锁。
同步的前提：同步中必须有多个线程并使用同一个锁。
*/

class Ticket implements Runnable//extends Thread
{
	private  int num = 100;

	Object obj = new Object();
	public void run()
	{//Object obj = new Object();若放在这里，那么线程就各有各的锁了。失败了
		while(true)
		{
			synchronized(obj)//一条线程搞定这代码块后，才允许其他线程从这里开始//这可以是一个卫生间
			{//////////////////不能突然中断也可以说其他线程不可以突然跑进来
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

		Ticket t = new Ticket();//创建一个线程任务对象。

		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);

		t1.start();
		t2.start();
		t3.start();
		t4.start();

		/*
	//若上面是	class Ticket extends Thread
		Ticket t1 = new Ticket();
//		Ticket t2 = new Ticket();
//		Ticket t3 = new Ticket();
//		Ticket t4 = new Ticket();有四个对象

		t1.start();
		t1.start();//一个线程不能开启两次，会抛出无效线程状态异常 
		t2.start();
		t3.start();
		*/

		
	}
}

