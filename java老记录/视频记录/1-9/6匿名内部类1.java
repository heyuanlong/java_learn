
/*
匿名内部类。就是内部类的简写格式。
	
必须有前提：
	内部类必须继承或者实现一个外部类或者接口。

匿名内部类：其实就是一个匿名子类对象。 

格式：new 父类or接口(){子类内容}

*/
abstract class Demo
{
	abstract void show();
}
class Outer
{
	int num = 4;
	public void method()
	{
		
		new Demo()////////////////匿名内部类。
		{
			void show()
			{
				System.out.println("show ........"+num);
			}
		}.show();//匿名内部类：其实就是一个匿名子类对象。 
	}
}

class InnerClassDemo4 
{
	public static void main(String[] args) 
	{
		new Outer().method();
	}
}
 