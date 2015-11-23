
interface Inter
{
	void show1();
	void show2();
}

class Outer
{

	public void method()
	{
		Inter in = new Inter()
		{
			public void show1()
			{
				
			}
			public void show2()
			{
			
			}
			
		};
		in.show1();
		in.show2();
	}
}
/////////////////////////////////////////////////////////////////////////////////////////
/*
通常的使用场景之一：
当函数参数是接口类型时，而且接口中的方法y一般不超过三个。
可以用匿名内部类作为实际参数进行传递
*/
class InnerClassDemo5 
{

	class fff
	{
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		
		show(new Inter()
		{
			public void show1(){}
			public void show2(){}
		});
       //new fff();出错main是静态的，不能引用非静态的
	}
	public static void show(Inter in)
	{
		in.show1();
		in.show2();
	}
	public void method()
	{
		new fff();///ok
	}

}

