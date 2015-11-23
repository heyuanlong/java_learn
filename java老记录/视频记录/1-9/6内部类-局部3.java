/*
内部类可以存放在局部位置上。 
内部类在局部位置上只能访问局部中被final修饰的局部变量。
这样当函数退出时，final局部变量其实早被数值替换了，即使变量消失也也没关系
*/


class Outer
{
	int num = 3;
	Object method()
	{

			final int x = 9;

			class Inner
			{
				public String toString()
				{
					return "show ..."+x;
				}
			}

			Object in = new Inner();
			return in;//0x0045
	//		in.show();
	}


	
}

class InnerClassDemo3 
{
	public static void main(String[] args) 
	{
		Outer out = new Outer();
		Object obj = out.method();
		System.out.println(obj);

	}
}
/*

class Fu extends Object
{
}
class zi extends Fu
{
}

Fu f = new zi();

Object o = new Fu();
*/