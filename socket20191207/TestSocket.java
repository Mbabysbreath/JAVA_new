package socket20191207;

/**
 * @author ZhaoMin
 * @date 2019/11/17 0:44
 */

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestSocket {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress host = InetAddress.getLocalHost();
        String ip =host.getHostAddress();
        System.out.println("本机ip地址：" + ip);
        System.out.println(host);
    }
}

