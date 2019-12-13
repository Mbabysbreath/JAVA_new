package socket20191207;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 实现TCP的网络编程
 * 例题2：若客户端发送文件给服务端，服务端将文件保存在本地
 * @author ZhaoMin
 * @date 2019/12/12 23:37
 */
public class TCPTest2 {
    @Test
    public void client() {
        Socket socket= null;
        OutputStream os= null;
        FileInputStream fis= null;
        try {
            //1.socket 定位客户端地址
            InetAddress inet=InetAddress.getByName("127.0.0.1");
            socket = new Socket(inet,9090);
            //2.整一个输出流，进行数据输出
            os = socket.getOutputStream();
            //3.整一个输入流，进行文件读入，要发一个图片给对方，就要自己先有图片
            File file=new File("D:\\Java_HP\\src\\水天之间.jpg");
            fis = new FileInputStream(file);
            //4.开始进行数据输入
            byte[] buffer=new byte[1024];
            int len;
            while((len=fis.read(buffer))!=-1){
                os.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5.关闭
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(os!=null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    @Test
    public void server()  {
        ServerSocket ss= null;
        Socket socket= null;
        InputStream is= null;
        FileOutputStream os= null;
        try {
            //1.创建一个server socket，并允许接收客户端的请求
            ss = new ServerSocket(9090);
            socket = ss.accept();
            //2.输入流进行接收文件
            is = socket.getInputStream();
            //3.在本地创建一个文件用来存放接收的东西,例如创建一个beauty1.jpg
            File file=new File("beauty1.jpg");
            os = new FileOutputStream(file);
            //4.开始接收并输出写到本地
            byte[] buffer=new byte[1024];
            int len;
            while((len=is.read(buffer))!=-1){
                os.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5.关闭资源
            if(os!=null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }if(socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }if(ss!=null){
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
