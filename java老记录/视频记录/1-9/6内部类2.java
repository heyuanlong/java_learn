/*
Ϊʲô�ڲ�����ֱ�ӷ����ⲿ���г�Ա�أ�
������Ϊ�ڲ���������ⲿ������á�  �ⲿ����.this

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
			System.out.println(num);//���5
			System.out.println(this.num);//���4
            System.out.println(Inner.this.num);//���4
			System.out.println(Outer.this.num);//���3
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
