package json;

import java.util.ArrayList;
import java.util.Collections;

import com.alibaba.fastjson.JSON;

public class JsonDemo2{
	public static void main(String[] args) {
//		javabean2json();
		//����̨��������һ�����ϻ�������Ļ�
		ArrayList<User> list = new ArrayList<User>();
		Collections.addAll(list, new User(1001,"zhangsan","123456"),
				new User(1002,"lisi","123456"),
				new User(1003,"wangwu","123456"));
		//����ת��
		Object obj = JSON.toJSON(list);
		System.out.println(obj.toString());
	}

	private static void javabean2json() {
		//����̨�������Ƕ���ʱ
		//1����������
		User u = new User(1001,"zhangsan","123456");
		//2��ʹ��fastjson�����б��룬�Ѷ���תΪjson�ַ����ĸ�ʽ
		Object obj = JSON.toJSON(u);
		System.out.println(obj.toString());
	}
}
