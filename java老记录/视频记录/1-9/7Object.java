/*

Object:������ĸ��ࡣ

Object�ǲ��ϳ�ȡ�������߱������ж��󶼾߱��Ĺ������ݡ�

���õĹ��Թ��ܣ�
   equals(obj)//�Ƚϵ��Ƿ�Ϊͬһ���ã��������أ��򸲸�
     equals(obj o){this==o;}
*/

class Person extends Object
{
	private int age;
	Person(int age)
	{
		this.age = age;
	}
	/*
	һ�㶼�Ḳ�Ǵ˷��������ݶ�����������ݣ������ж϶����Ƿ���ͬ�����ݡ�
	*/
	public boolean equals(Object obj)//Object obj = p2;
	{
		if(!(obj instanceof Person))
		{
//			return false;
			throw new ClassCastException("���ʹ���");
		}
		Person p = (Person)obj;
		return this.age == p.age;
	}



	public int hashCode()//����obj��hashCode����
	{
		return age;
	}


	public String toString()//��д
	{
		return "Person :"+age;
	}
}

class  ObjectDemo
{
	public static void main(String[] args) 
	{
		Person p1 = new Person(60);
		Person p2 = new Person(20);
		Demo d = new Demo();
	System.out.println(p1.equals(p2));

	System.out.println(p1);//���������16���ƵĹ�ϣֵ
	System.out.println(Integer.toHexString(p1.hashCode()));//�����ϣֵ
			

	Class clazz1 = p1.getClass();//getClass()��������ʱ����
	Class clazz2 = p2.getClass();
	System.out.println(clazz1==clazz2);//ture
	System.out.println(clazz1.getName());//��������

	System.out.println(p1.toString());//Person@61de33  ���ظö����ַ�����ʾ��ʽ
	System.out.println(p1.getClass().getName()+"$"+Integer.toHexString(p1.hashCode()));//Person@61de33

	}
}
