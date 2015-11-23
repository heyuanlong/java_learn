class Demo extends Thread
{
	private String name;
	Demo(String name)
	{		super(name);
		this.name = name;
	}
	public void run()
	{
		
		for(int x=0; x<10; x++)
		{
			System.out.println("....x="+x+".....name="+Thread.currentThread().getName());
		}
	}
}

class ThreadDemo3 
{
	public static void main(String[] args) 
	{
		Demo d1 = new Demo("����");
		Demo d2 = new Demo("xiaoqiang");
		d1.start();
		
		d2.start();

		System.out.println(4/0);//throw new ArithmeticException();

		for(int x=0; x<20; x++)
		{
			System.out.println(x+"...."+Thread.currentThread().getName());
		}
	}
}
