package cn.etuc.xxgc.object;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.SocketHandler;

/**
 * TCP通信的客户端
 * 注意：
 *  1.客户端和服务器端进行交互，必须使用Socket中提供的网络流，不能自己使用创建的对象流
 *  2.当我们创建客户端对象Socket的时候，就会请求服务器和服务器经过3次握手建立连接通路
 *      这时如果服务器没有启动，那么就会抛出异常
 *      如果服务器已经启动，那么就可以进行交互
 */

public class Demo10TCPClient {
    public static void main(String[] args) throws IOException {
    //1.创建一个客户端对象Socket构造方法绑定服务器的IP地址和端口号
    Socket socket=new Socket("127.0.0.1",8888);
    //2.使用Socket对象中的方法getOutputStream（）获取网络字节输出流OutputStream
    OutputStream os=socket.getOutputStream();
    //3.使用网络字节流OutputStream对象中的方法write（），给服务器发送数据
    os.write("你好服务器".getBytes());
    //4.使用Socket对象中的方法getInputStream（）获取网络字节输入流InputStream
        InputStream is=socket.getInputStream();
    //5.使用网络字节流InputStream对象中的方法read（），读取服务器写回数据
        int len=0;
        byte[] bytes=new byte[1024];
        while ((len=is.read(bytes))!=-1){
            System.out.println(new String(bytes));
        }
    //6释放 资源
        socket.close();
    }
}
