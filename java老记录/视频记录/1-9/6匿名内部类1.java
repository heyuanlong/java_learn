
/*
�����ڲ��ࡣ�����ڲ���ļ�д��ʽ��
	
������ǰ�᣺
	�ڲ������̳л���ʵ��һ���ⲿ����߽ӿڡ�

�����ڲ��ࣺ��ʵ����һ������������� 

��ʽ��new ����or�ӿ�(){��������}

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
		
		new Demo()////////////////�����ڲ��ࡣ
		{
			void show()
			{
				System.out.println("show ........"+num);
			}
		}.show();//�����ڲ��ࣺ��ʵ����һ������������� 
	}
}

class InnerClassDemo4 
{
	public static void main(String[] args) 
	{
		new Outer().method();
	}
}
 