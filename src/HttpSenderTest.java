import com.bcloud.msg.http.Hex;
import com.bcloud.msg.http.HttpRequest;
import com.bcloud.msg.http.HttpSender;

public class HttpSenderTest {
	public static void main(String[] args) {
//		String url = "http://222.73.117.158/msg/";// 应用地址
		String url = "http://222.73.117.138:7891/mt";// 应用地址
		String account = "N18811306465";// 账号
		String pswd = "276833";// 密码
		String mobile = "18811306465";// 手机号码，多个号码使用","分割
		String msg = "【广联达】亲爱的用户，您的验证码是123456，5分钟内有效";// 短信内容,必须要有【广联达】类似的签名
		boolean needstatus = true;// 是否需要状态报告，需要true，不需要false
		String product = null;// 产品ID
		String extno = null;// 扩展码
//		String param = "un=" + account + "&pw=" + pswd + "&da=" + mobile + "&sm=" + Hex.str2HexStr(msg) + "&dc=15&rd=1";
		String param = "un=" + account + "&pw=" + pswd + "&da=" + mobile + "&sm=" + "a1beb9e3c1aab4efa1bfc7d7b0aeb5c4d3c3bba7a3acc4fab5c4d1e9d6a4c2ebcac7313233343536a3ac35b7d6d6d3c4dad3d0d0a7a1a320" + "&dc=15&rd=1";
		try {
//			String returnString = HttpSender.send(url, account, pswd, mobile, msg, needstatus, product, extno);
//			String returnString = HttpRequest.sendGet(url, param);
			String returnString = Hex.str2HexStr(msg);
			System.out.println(returnString);
			// TODO 处理返回值,参见HTTP协议文档
		} catch (Exception e) {
			// TODO 处理异常
			e.printStackTrace();
		}
	}
}