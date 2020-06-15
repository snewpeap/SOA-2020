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
    //���䣬��֤�뻺��
    private HashMap<String,String> mail=new HashMap<String,String>();

    //���ʼ�
    @WebMethod
    public String sendMail(String address) throws Exception{
        Properties prop = new Properties();
        // ����debug���ԣ��Ա��ڿ���̨�鿴
        prop.setProperty("mail.debug", "true");
        // �����ʼ�������������
        prop.setProperty("mail.host", "smtp.qq.com");
        // ���ͷ�������Ҫ�����֤
        prop.setProperty("mail.smtp.auth", "true");
        // �����ʼ�Э������
        prop.setProperty("mail.transport.protocol", "smtp");
        // ����SSL���ܣ������ʧ��
        MailSSLSocketFactory sf = null;
        try {
            sf = new MailSSLSocketFactory();
        } catch (GeneralSecurityException e1) {
            e1.printStackTrace();
        }
        sf.setTrustAllHosts(true);
        prop.put("mail.smtp.ssl.enable", "true");
        prop.put("mail.smtp.ssl.socketFactory", sf);

        // ����session
        Session session = Session.getInstance(prop);
        // ͨ��session�õ�transport����
        Transport ts = session.getTransport();
        // �����ʼ����������������ͣ��ʺţ�POP3/SMTPЭ����Ȩ��
        ts.connect("smtp.qq.com", "2303271494@qq.com", "7071822014ly");
        // �����ʼ�
        Message message = createSimpleMail(session, address);
        // �����ʼ�
        ts.sendMessage(message, message.getAllRecipients());
        ts.close();
        //��ʾ�û��ʼ����ͽ��
        String result = "�ѷ����ʼ���" + address;
        System.out.println(result);
        return result;
    }
    //���ɼ��ʼ�
    private MimeMessage createSimpleMail(Session session,String address) throws Exception{
        // �����ʼ�����
        MimeMessage message = new MimeMessage(session);
        // ָ���ʼ��ķ�����
        message.setFrom(new InternetAddress("2303271494@qq.com"));
        // ָ���ʼ����ռ���
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(
                address));
        // �ʼ��ı���
        message.setSubject("MailLogin");
        //������֤��
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
        // �ʼ����ı�����
        message.setContent("������ͨ�������¼����֤�룺"+verificationCode+",���Ǳ��˲�������ɾ�����ʼ���", "text/html;charset=UTF-8");
        // ���ش����õ��ʼ�����
        return message;
    }

    //��֤
    @WebMethod
    public String check(String newInput){
        String verificationCode = newInput.split("��")[1];
        String address = newInput.split("��")[0];
        String mailCode = mail.get(address);
        String res;
        if (verificationCode.equals(mailCode)){
            res = "��¼�ɹ���";
            if (address.contains("@smail")){//�Ͼ���ѧ����
                if (address.split("@")[0].contains("MF")){
                    res+="��ӭ�㣬�о�����";
                }else if (address.split("@")[0].contains("MG")){
                    res+="��ӭ�㣬��ʿ����";
                }else if (allNumber(address.split("@")[0])){
                    res+="��ӭ�㣬��������";
                }else {
                    res+="��ӭ�㣬��ʦ��";
                }
            }
        }else {
            res="��¼ʧ�ܣ�";
        }
        System.out.println(res);
        return res;
    }

    //�жϱ��������䣬������
    private boolean allNumber(String addressPart){
        for (char l:addressPart.toCharArray()){
            if (!Character.isDigit(l)){
                return false;
            }
        }
        return true;
    }
}
