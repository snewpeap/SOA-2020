package startFromJava;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import com.sun.mail.util.MailSSLSocketFactory;

@WebService
public class MailLogin {
    //邮箱，验证码缓存
    private HashMap<String,String> mail=new HashMap<String,String>();

    //发邮件
    @WebMethod
    public String sendMail(String address) throws Exception{
        Properties prop = new Properties();
        // 开启debug调试，以便在控制台查看
        prop.setProperty("mail.debug", "true");
        // 设置邮件服务器主机名
        prop.setProperty("mail.host", "smtp.qq.com");
        // 发送服务器需要身份验证
        prop.setProperty("mail.smtp.auth", "true");
        // 发送邮件协议名称
        prop.setProperty("mail.transport.protocol", "smtp");
        // 开启SSL加密，否则会失败
        MailSSLSocketFactory sf = null;
        try {
            sf = new MailSSLSocketFactory();
        } catch (GeneralSecurityException e1) {
            e1.printStackTrace();
        }
        sf.setTrustAllHosts(true);
        prop.put("mail.smtp.ssl.enable", "true");
        prop.put("mail.smtp.ssl.socketFactory", sf);

        // 创建session
        Session session = Session.getInstance(prop);
        // 通过session得到transport对象
        Transport ts = session.getTransport();
        // 连接邮件服务器：邮箱类型，帐号，POP3/SMTP协议授权码
        ts.connect("smtp.qq.com", "2303271494@qq.com", "7071822014ly");
        // 创建邮件
        Message message = createSimpleMail(session, address);
        // 发送邮件
        ts.sendMessage(message, message.getAllRecipients());
        ts.close();
        //提示用户邮件发送结果
        String result = "已发送邮件到" + address;
        System.out.println(result);
        return result;
    }
    //生成简单邮件
    private MimeMessage createSimpleMail(Session session,String address) throws Exception{
        // 创建邮件对象
        MimeMessage message = new MimeMessage(session);
        // 指明邮件的发件人
        message.setFrom(new InternetAddress("2303271494@qq.com"));
        // 指明邮件的收件人
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(
                address));
        // 邮件的标题
        message.setSubject("MailLogin");
        //生成验证码
        String[] letters=new String[]{
                "a","b","c","d","e","f","g","h","i","j","k","l","m",
                "n", "o","p","q","r","s","t","u","v","w","x","y","z",
                "A","B","C","D","E","F","G","H","I","J","K","L","M",
                "N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
                "0","1","2","3","4","5","6","7","8","9"
        };
        StringBuilder verificationCode = new StringBuilder();
        for(int i=0;i<4;i++){
            verificationCode.append(letters[(int) Math.floor(Math.random()*letters.length)]);
        }
        mail.put(address,String.valueOf(verificationCode));
        // 邮件的文本内容
        message.setContent("您正在通过邮箱登录，验证码："+verificationCode+",若非本人操作，请删除本邮件。", "text/html;charset=UTF-8");
        // 返回创建好的邮件对象
        return message;
    }

    //验证
    @WebMethod
    public String check(String newInput){
        String verificationCode = newInput.split("：")[1];
        String address = newInput.split("：")[0];
        String mailCode = mail.get(address);
        String res;
        if (verificationCode.equals(mailCode)){
            res = "登录成功！";
            if (address.contains("@smail")){//南京大学邮箱
                if (address.split("@")[0].contains("MF")){
                    res+="欢迎你，研究生。";
                }else if (address.split("@")[0].contains("MG")){
                    res+="欢迎你，博士生。";
                }else if (allNumber(address.split("@")[0])){
                    res+="欢迎你，本科生。";
                }else {
                    res+="欢迎你，老师。";
                }
            }
        }else {
            res="登录失败！";
        }
        System.out.println(res);
        return res;
    }

    //判断本科生邮箱，纯数字
    private boolean allNumber(String addressPart){
        for (char l:addressPart.toCharArray()){
            if (!Character.isDigit(l)){
                return false;
            }
        }
        return true;
    }
}
