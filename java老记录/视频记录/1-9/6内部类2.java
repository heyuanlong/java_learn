/*
为什么内部类能直接访问外部类中成员呢？
那是因为内部类持有了外部类的引用。  外部类名.this

*/
class Outer
{
	int num = 3;
	class Inner
	{
		int num = 4;
		void show()
		{
			int num = 5;
			System.out.println(num);//输出5
			System.out.println(this.num);//输出4
            System.out.println(Inner.this.num);//输出4
			System.out.println(Outer.this.num);//输出3
		}
	}
	void method()
	{
		new Inner().show();
	}
}


class InnerClassDemo2 
{
	public static void main(String[] args) 
	{
		new Outer().method();
	}
}
