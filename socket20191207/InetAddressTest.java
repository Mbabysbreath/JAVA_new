package socket20191207;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**下一次看21：TCP网络编程例3
 * 一、网络编程中有两个主要的问题：
 * 1.怎么准确定位网络上一台或多态主机，定位主机上的特定的应用
 * 2.找到主机后如何让可靠高效进行数据传输
 * 二、网络编程中的两个要素
 * 1、对应问题一：IP和端口号
 * 2、对应问题二：提供网络通信协议：TCP/IP参考模型：应用层、传输层、网络层、物理层+数据链路层
 *三、通信要素一：IP和端口号
 * 1.IP：唯一的标识互联网上的计算机（通信实体）
 *2.在java中使用InetAddress类代表IP
 * 3.IP分类：IPV4和IPV6   万维网和局域网
 *4.域名：www.baidu.com,
 * 用域名访问的途径：
 * （1）DNS先根据域名将其进行解析为IP地址，再根据IP地址访问网络服务器
 *DNS:域名解析服务器
 * （2）从本地先找
 * 5.本地回路地址（本机地址）：
 * 127.0.0.1———域名：对应localhost
 * 6.如何实例化InetAddress：
 * (1)InetAddress.getByName(String host)
 * (2)如果获取本机还可以：InetAddress.getLocalHost()
 * 7.获取到IP地址对象后可以让对象调用两个常用方法
 * inet.getHostName()/对象.getHostAddress
 *8.端口号：正在计算机运行的进程
 * 要求：不同的进程有不同的端口号
 * 范围：0-65535
 * 9.Scoket:端口号和IP地址组合得出的一个网络套接字
 *
 * 10.TCP--三次握手--建立连接
 *      ---四次挥手--释放资源
 *
 * @author ZhaoMin
 * @date 2019/12/7 13:06
 */
public class InetAddressTest {
    public static void main(String[] args) {
        try {
            //如何实例化InetAddress：getByName("String")
            InetAddress inet1=InetAddress.getByName("192.168.10.14");
            System.out.println(inet1);
            InetAddress inet2=InetAddress.getByName("www.atguigu.com");
            System.out.println(inet2);
            //获取本机IP地址（1）
            InetAddress inet3=InetAddress.getByName("127.0.0.1");
            System.out.println(inet3);
            //获取本机IP地址（2）
            InetAddress inet4=InetAddress.getLocalHost();
            System.out.println(inet4);
            //getHostName():获取域名
            System.out.println(inet2.getHostName());
            //getHostAddress()：获取主机地址
            System.out.println(inet2.getHostAddress());
            System.out.println(inet1.getHostAddress());
            System.out.println(inet1.getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}
