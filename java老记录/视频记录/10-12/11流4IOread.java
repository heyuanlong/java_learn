read(...)�����кܶ����ذ汾��

package cn.itcast.p3.io.filereader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//���󣺶�ȡһ���ı��ļ�������ȡ�����ַ���ӡ������̨.
public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		//1,������ȡ�ַ����ݵ�������
		/*
		 * �ڴ�����ȡ������ʱ������Ҫ��ȷ����ȡ���ļ���һ��Ҫȷ�����ļ��Ǵ��ڵġ� 
		 * ��һ����ȡ������һ���Ѵ����ļ��� 
		 */
		FileReader fr = new FileReader("demo.txt");	
		int ch = 0;
		while((ch=fr.read())!=-1){
			System.out.println((char)ch);
		}
		
		/*
		//��Reader�е�read������ȡ�ַ���
		int ch = fr.read();
		System.out.println((char)ch);
		*/
		fr.close();
	}

}

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("demo.txt");
		/*
		 * ʹ��read(char[])��ȡ�ı��ļ����ݡ�
		 * �ȴ����ַ����顣
		 */
		char[] buf = new char[1024];		
		int len = 0;	
		while((len=fr.read(buf))!=-1){
			System.out.println(new String(buf,0,len));
				//int num = fr.read(buf);//����ȡ�����ַ��洢��������
		}
		fr.close();
	}
