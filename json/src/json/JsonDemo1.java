package json;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
@WebServlet(value="/json.do")
public class JsonDemo1 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
				throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		//�õ�ǰ̨����
		String data = req.getParameter("data");
		System.out.println(data);
		//�ѻ�ȡ�����ַ������͵�json���ݽ���ת����ָ���Ķ���
		//1.1����ǰ̨��json�ַ�����һ��javabean����ʱ
//		JSONObject jsonObject = JSONObject.parseObject(data);
//		System.out.println(jsonObject.getString("uid"));
//		System.out.println(jsonObject.getString("username"));
//		System.out.println(jsonObject.getString("password"));
//		//1.2����ǰ̨��json�ַ�����һ��javabean����ʱ��ת��һ��ָ����java����
//		User u = JSONObject.parseObject(data, User.class);
//		System.out.println(u);
		//2.��ǰ̨��json�ַ�����һ������ʱ
		ArrayList list = JSONObject.parseObject(data, new TypeReference<ArrayList>() {});
		System.out.println(list);
//		//3.��ǰ̨��json�ַ�����һ��javabean�������ʱ��
//		ArrayList<User> list1 = JSONObject.parseObject(data, new TypeReference<ArrayList<User>>() {});
//		System.out.println(list1);
	}
}
