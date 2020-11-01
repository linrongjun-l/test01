package cn.etuc.xxgc.object;

import java.io.*;
import java.net.Socket;

/**
 * 文件上传客户
 * */
public class Demo11Fileupfata {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",8888);
        OutputStream os = socket.getOutputStream();
        InputStream is = socket.getInputStream();

        FileInputStream in=new FileInputStream("D:\\b.txt");
        BufferedInputStream bufferin=new BufferedInputStream(in);
        byte[] bytes=new byte[1024];
        while((bufferin.read(bytes))!=-1){
            os.write(bytes);
        }

        socket.shutdownOutput();

        byte[] bytes1=new byte[1024];
        while((is.read(bytes1))!=-1){
            System.out.println(new String(bytes1));
        }

        bufferin.close();
        in.close();
        socket.close();
    }
}
