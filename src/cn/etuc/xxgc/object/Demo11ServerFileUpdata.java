package cn.etuc.xxgc.object;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 文件上传服务端
 * */
public class Demo11ServerFileUpdata {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        InputStream is = socket.getInputStream();
        File file = new File("D:\\updata");
        if (!file.exists()) {
            file.mkdir();
        }
        FileOutputStream out = new FileOutputStream("D:\\updata\\c.txt");
        byte[] bytes = new byte[1024];
        while ((is.read(bytes)) != -1) {
            out.write(bytes);
        }
        OutputStream os = socket.getOutputStream();
        os.write("上传成功".getBytes());


        out.close();
        socket.close();
        serverSocket.close();
    }
}
