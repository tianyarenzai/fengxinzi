package com.sysh.util;

import com.jcraft.jsch.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.Vector;

/**
 * Created by sjy Cotter on 2018/8/5.
 */
public class SftpUtil {

    /*host 主机
	port 端口
	username 用户名
	password 密码*/
    public ChannelSftp connect(String host, int port, String username,
                               String password) {
        ChannelSftp sftp = null;
        try {
            JSch jsch = new JSch();
            jsch.getSession(username, host, port);
            Session sshSession = jsch.getSession(username, host, port);
            sshSession.setPassword(password);
            Properties sshConfig = new Properties();
            sshConfig.put("StrictHostKeyChecking", "no");
            sshSession.setConfig(sshConfig);
            sshSession.connect();
            Channel channel = sshSession.openChannel("sftp");
            channel.connect();
            sftp = (ChannelSftp) channel;
        } catch (Exception e) {

        }
        return sftp;
    }

    /*directory 上传的目录
    uploadFile 要上传的文件*/
    public void upload(String directory, String uploadFile, ChannelSftp sftp) {
        try {
            sftp.cd(directory);
            File file = new File(uploadFile);
            sftp.put(new FileInputStream(file), file.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*downloadFile 下载的文件
    saveFile 存在本地的路径*/
    public void download(String directory, String downloadFile,
                         String saveFile, ChannelSftp sftp) {
        try {
            sftp.cd(directory);
            File file = new File(saveFile);
            sftp.get(downloadFile, new FileOutputStream(file));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*directory 要删除文件所在目录
    deleteFile 要删除的文件*/
    public void delete(String directory, String deleteFile, ChannelSftp sftp) {
        try {
            sftp.cd(directory);
            sftp.rm(deleteFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //directory 要列出的目录
    public Vector listFiles(String directory, ChannelSftp sftp)
            throws SftpException {
        return sftp.ls(directory);
    }

    public static synchronized void imgUpload(String fileName,Long s)
    {
        SftpUtil sf = new SftpUtil();
        String host = "10.16.167.164";
        int port = 22;
        String username = "root";
        String password = "Centos7.4";
        String directory = "/data/sftp/mysftp/img/";
        String uploadFile = "/home/ftp/img/"+fileName;
        ChannelSftp sftp = sf.connect(host, port, username, password);
        sf.upload(directory, uploadFile, sftp);
        //sf.download(directory, downloadFile, saveFile, sftp);
        //sf.delete(directory, deleteFile, sftp);
        try {
            System.out.println("成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static synchronized void imgUploadEvidence(String fileName,Long s)
    {
        SftpUtil sf = new SftpUtil();
        String host = "10.16.167.164";
        int port = 22;
        String username = "root";
        String password = "Centos7.4";
        String directory = "/data/sftp/mysftp/evidence/";
        String uploadFile = "/home/ftp/evidence/"+fileName;
        ChannelSftp sftp = sf.connect(host, port, username, password);
        sf.upload(directory, uploadFile, sftp);
        //sf.download(directory, downloadFile, saveFile, sftp);
        //sf.delete(directory, deleteFile, sftp);
        try {
            System.out.println("成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SftpUtil sf = new SftpUtil();
        String host = "10.16.167.164";
        int port = 22;
        String username = "root";
        String password = "Centos7.4";
        String directory = "/data/sftp/mysftp/evidence/";
        String uploadFile = "G:\\3.jpg";
        //String downloadFile = "upload.txt";
        //String saveFile = "D:\\tmp\\save.txt";
        //String deleteFile = "delete.txt";
        ChannelSftp sftp = sf.connect(host, port, username, password);
        sf.upload(directory, uploadFile, sftp);
        //sf.download(directory, downloadFile, saveFile, sftp);
        //sf.delete(directory, deleteFile, sftp);
        try {
            System.out.println("成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
