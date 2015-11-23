
/*
死锁：常见情景之一：同步的嵌套。

前提：至少有两个不同的锁，至少两条线程
假设 锁为a b，线程为0 1
若线程0有了a锁，它还得有b锁，此时线程1有了b锁，它还得有a锁，
好了！若互不相让就死锁了！

*/
class Ticket implements Runnable
{
	private  int num = 100;
	Object obj = new Object();
	boolean flag = true;
	public void run()
	{


		if(flag)
			while(true)
			{
				synchronized(obj)
				{
					show();
				}
			}
		else
			while(true)
				this.show();
	}

	public synchronized void show()
	{

		synchronized(obj)
		{
			if(num>0)
			{
				try{Thread.sleep(10);}catch (InterruptedException e){}
				
				System.out.println(Thread.currentThread().getName()+".....sale...."+num--);
			}
		}
	}
}


class DeadLockDemo 
{
	public static void main(String[] args) 
	{
		Ticket t = new Ticket();
//		System.out.println("t:"+t);

		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);

		t1.start();
		try{Thread.sleep(10);}catch(InterruptedException e){}
		t.flag = false;
		t2.start();
	}
}
