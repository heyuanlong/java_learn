package mypack;

//import packa.DemoA;//������packa���е�DemoA�ࡣ
//import packa.DemoAA;
//import packa.DemoAAA;
/*
import packa.*;//������packa�������е��ࡣ
import packa.abc.*;

new packa.DemoA();ֱ����ʹ����д�ϰ���

*/
//������ԭ���õ��ĸ��࣬�͵����ĸ��ࡣ
//import �����õİ���Ϊ�˼�������д��

class  PackageDemo
{
	public static void main(String[] args) 
	{

		//packa.DemoA d = new packa.DemoA();
		DemoAbc d = new DemoA();
		d.show();

		packb.DemoB b = new packb.DemoB();
		b.method();
		System.out.println("Hello Package!");
	}
}


/*                           
ԭ������д��
��ΪDemoA���Ѿ��а������������Ա���Ҫ��ȷ�䱨����
��ס��DemoA������ʴ�ġ� ��ȷ�����Ǳ���.����  packa.DemoA
--------------------------------------

ԭ�����ڵ�ǰĿ¼��û�ҵ�����Ϊpacka���������Ŀ¼�£�
Ӧ������һ��classpath��
------------------------------------
PackageDemo.java:9: show() �� packa.DemoA �в��ǹ����ģ��޷����ⲿ������ж����
�з���

�ܽ᣺
�����֮�������з��ʣ������ʵİ��е��������public�ģ������ʵİ��е���ķ���Ҳ������public�ġ�

          public		protected		default		  private
ͬһ����    ok             ok              ok           ok
ͬһ����    ok             ok              ok           
������      ok             ok              
��ͬ����    ok


*/