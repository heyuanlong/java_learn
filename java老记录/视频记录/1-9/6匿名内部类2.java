
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
ͨ����ʹ�ó���֮һ��
�����������ǽӿ�����ʱ�����ҽӿ��еķ���yһ�㲻����������
�����������ڲ�����Ϊʵ�ʲ������д���
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
       //new fff();����main�Ǿ�̬�ģ��������÷Ǿ�̬��
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

