package com.sysh.util;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import sun.misc.BASE64Decoder;

import java.io.*;
import java.net.SocketException;

public class ImageUtil {




    /**
     * Base64字符串转 二进制流
     *   文件读取转换成base64
     * @param  strBase64
     * @return base64String
     * @throws IOException 异常
     */
    public   byte[] getStringImage(String strBase64) throws IOException {

        /*String fileName = "G:/echarts.png"; //源文件
        String strBase64 = null;
        try {
            InputStream in = new FileInputStream(fileName);
            // in.available()返回文件的字节长度
            byte[] bytes = new byte[in.available()];
            // 将文件中的内容读入到数组中
            in.read(bytes);
            strBase64 = new BASE64Encoder().encode(bytes);      //将字节流数组转换为字符串
            in.close();
        } catch (FileNotFoundException fe) {
            fe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }*/

        BASE64Decoder decoder = new BASE64Decoder();
        return strBase64 != null ? decoder.decodeBuffer(strBase64) : null;
    }

    /**
     * 在服务器保存图片，使用Base64转化过来的流
     */

    //public  void UploadPicutre(File file,String type,String date,String time,String userID,Long s)
    //public  void UploadPicutre(File file,String type,Long s)
    public  void UploadPicutre(String fileName,Long s)
    {
        //File imagefile = new File("G:/echarts.png");
        String imagefileFileName = ".jpg";
        //创建ftp客户端
        FTPClient ftpClient = new FTPClient();
        ftpClient.setControlEncoding("iso-8859-1");
        String hostname = "116.85.42.226";
        int port = 21;
        String username = "ftp-f";
        String password = "User2018";


        try {
            //链接ftp服务器
            ftpClient.connect(hostname, port);
            //登录ftp
            ftpClient.login(username, password);
            int  reply = ftpClient.getReplyCode();
            System.out.println(reply);
            //如果reply返回230就算成功了，如果返回530密码用户名错误或当前用户无权限下面有详细的解释。
            if (!FTPReply.isPositiveCompletion(reply)) {
                ftpClient.disconnect();
                return ;
            }
            //fTPClient.enterLocalPassiveMode();
            //ftpClient.makeDirectory("path");//在root目录下创建文件夹
            String path="/home/ftp/img";
            ftpClient.changeWorkingDirectory(path);
            //ftpClient.enterLocalPassiveMode();
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
            //跳转到当前文件夹下。判断文件夹下当前时间文件夹是否存在
            //String time=TimeUtil.dateFormat();
            //Long s=System.currentTimeMillis();
            //图片文件名
            //Long s=System.currentTimeMillis();
            String remoteFileName = s+imagefileFileName;
            //File file=new FileInputStream()
            //InputStream input = new FileInputStream("D:/images/fuping1/"+fileName);

            //InputStream input = new FileInputStream("/home/ftp/img/"+fileName);

            //Boolean flag=DeleteFileDir.deleteFile("D:\\images\\fuping1\\"+fileName);
            //InputStream input = new FileInputStream("/home/ftp/img"+fileName);
            //TODO 正式环境需要修改环境,测试环境已经通过，
            FileInputStream input = new FileInputStream("/home/ftp/img/"+fileName);
            //ftpClient.enterLocalPassiveMode();
            ftpClient.enterLocalPassiveMode();
                boolean flag=ftpClient.storeFile(remoteFileName, input);//文件你若是不指定就会上传到root目录下
                System.out.println("文件到这了"+flag);
                input.close();
                ftpClient.logout();

            //InputStream input=new ByteArrayInputStream(getStringImage(baseStr));


            //System.out.println("已完毕");

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally
        {
            if (ftpClient.isConnected())
            {
                try
                {
                    ftpClient.disconnect();
                } catch (IOException ioe)
                {
                    ioe.printStackTrace();
                }
            }

        }
    }










    //判断服务器上面是否有该文件夹（当前日期）
    public  Boolean fileIsExist(String path)
    {
        //得到当前日期
       // String time=TimeUtil.dateFormat();
        File file=new File(path);
        if(file.exists())
        {
            return true;
        }
        return false;
    }

    /*//判断服务器上面是否有该文件夹（当前日期）
    public Boolean makeFile(Stirng path)
    {
        //得到当前日期
        //String time=TimeUtil.dateFormat();
        File file=new File("/data/picture/"+time);
        if(!file.exists())
        {

        }
        return false;
    }*/

}
