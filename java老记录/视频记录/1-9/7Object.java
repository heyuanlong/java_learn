/*

Object:所有类的根类。

Object是不断抽取而来，具备着所有对象都具备的共性内容。

常用的共性功能：
   equals(obj)//比较的是否为同一引用，除非重载，或覆盖
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
	一般都会覆盖此方法，根据对象的特有内容，建立判断对象是否相同的依据。
	*/
	public boolean equals(Object obj)//Object obj = p2;
	{
		if(!(obj instanceof Person))
		{
//			return false;
			throw new ClassCastException("类型错误");
		}
		Person p = (Person)obj;
		return this.age == p.age;
	}



	public int hashCode()//重载obj的hashCode方法
	{
		return age;
	}


	public String toString()//重写
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

	System.out.println(p1);//输出类名和16进制的哈希值
	System.out.println(Integer.toHexString(p1.hashCode()));//输出哈希值
			

	Class clazz1 = p1.getClass();//getClass()返回运行时的类
	Class clazz2 = p2.getClass();
	System.out.println(clazz1==clazz2);//ture
	System.out.println(clazz1.getName());//返回类名

	System.out.println(p1.toString());//Person@61de33  返回该对象字符串表示形式
	System.out.println(p1.getClass().getName()+"$"+Integer.toHexString(p1.hashCode()));//Person@61de33

	}
}
