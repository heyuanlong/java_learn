


class Outer
{
	void method()
	{
		Object obj = new Object()
		{
			public void show()
			{
				System.out.println("show run");
			}

		};
		obj.show();//����//��Ϊ�����ڲ�����������������ת��Ϊ��Object���͡�
					//�����Ͳ�����ʹ���������еķ����ˡ�


	}
}
///////////////////////////////////////////////////////////////////
class Outer
{
	void method()
	{
	   new Object()
		{
			public void show()
			{
				System.out.println("show run");
			}

		}.show();////ok
	}
}
class InnerClassDemo6 
{
	public static void main(String[] args) 
	{
		new Outer().method();
	}
}
