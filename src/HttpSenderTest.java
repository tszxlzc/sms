import com.bcloud.msg.http.Hex;
import com.bcloud.msg.http.HttpRequest;
import com.bcloud.msg.http.HttpSender;

public class HttpSenderTest {
	public static void main(String[] args) {
//		String url = "http://222.73.117.158/msg/";// Ӧ�õ�ַ
		String url = "http://222.73.117.138:7891/mt";// Ӧ�õ�ַ
		String account = "N18811306465";// �˺�
		String pswd = "276833";// ����
		String mobile = "18811306465";// �ֻ����룬�������ʹ��","�ָ�
		String msg = "��������װ����û���������֤����123456��5��������Ч";// ��������,����Ҫ�С���������Ƶ�ǩ��
		boolean needstatus = true;// �Ƿ���Ҫ״̬���棬��Ҫtrue������Ҫfalse
		String product = null;// ��ƷID
		String extno = null;// ��չ��
//		String param = "un=" + account + "&pw=" + pswd + "&da=" + mobile + "&sm=" + Hex.str2HexStr(msg) + "&dc=15&rd=1";
		String param = "un=" + account + "&pw=" + pswd + "&da=" + mobile + "&sm=" + "a1beb9e3c1aab4efa1bfc7d7b0aeb5c4d3c3bba7a3acc4fab5c4d1e9d6a4c2ebcac7313233343536a3ac35b7d6d6d3c4dad3d0d0a7a1a320" + "&dc=15&rd=1";
		try {
//			String returnString = HttpSender.send(url, account, pswd, mobile, msg, needstatus, product, extno);
//			String returnString = HttpRequest.sendGet(url, param);
			String returnString = Hex.str2HexStr(msg);
			System.out.println(returnString);
			// TODO ������ֵ,�μ�HTTPЭ���ĵ�
		} catch (Exception e) {
			// TODO �����쳣
			e.printStackTrace();
		}
	}
}