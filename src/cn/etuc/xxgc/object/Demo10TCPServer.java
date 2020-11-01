package cn.etuc.xxgc.object;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *TCP通信服务器端
 */

public class Demo10TCPServer {
    public static void main(String[] args) throws IOException {

       //1.创建服务器ServerSocket对象和系统要指定的端口号
        ServerSocket serverSocket=new ServerSocket(8888);
       //2.使用ServerSocket对象中的方法accept，获取到请求的客户端对象Socket
        Socket socket = serverSocket.accept();
        //3.使用Socket对象中的方法getInputStream（）获取网络字节输入流InputStream
        InputStream is = socket.getInputStream();
        //4.使用网络字节流InputStream对象中的方法read（）
        byte[] bytes=new byte[1024];
        int len=is.read(bytes);
        System.out.println(new String(bytes));
       //5.使用Socket对象中的方法getOutputStream（）获取网络字节输出流OutputStream
        OutputStream os = socket.getOutputStream();
        //6.使用网络字节流OutputStream对象中的方法write（）
        os.write("收到，谢谢".getBytes());
       //7.释放资源
        socket.close();
        serverSocket.close();
    }
}
