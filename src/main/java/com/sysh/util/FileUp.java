package com.sysh.util;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import org.apache.log4j.Logger;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.InputStream;
import java.util.Properties;
import java.util.UUID;

/**
 * Update by acy on 2017/8/3.
 * @author Acy
 */

public class FileUp {

    /**
     * 图片类型
     *
     */
    public static final int IMAGE = 1;

    /**
     *  音频类型文件
     */
    public static final int AUDIO = 2;
    /**
     * 视频类型文件
     */

    public static final int VIDEO = 3;
    /**
     * 文档类型文件
     */
    public static final int DOCUMENT = 4;
    /**
     * 其他类型文件
     */
    public static final int OTHER = 5;

    
    /**
     * 实现SpringMVC中文件的上传的功能
     *
     * @param //files     上传的文件,类型:MultipartFile
     * @param //dirNames  文件夹名,多层文件夹名用,号隔开例如:"1,2,3"
     * @param //types      类型 图片为1,音频为2,视频为3,文档为4,其他为5 可使用类内的静态变量
     * @param isNewName 是否使用新文件名 boolean 是为true
     * 返回(文件夹名和文件名)或者空
     */
    /*
    public static void upFiles(MultipartFile[] files, HttpServletRequest request, String dirNames, Integer[] types, boolean isNewName, ResultData[] rs) {
        for (int i = 0; i < files.length; i++) {
            rs[i].setCode(upFile(files[i], request, dirNames, types[i], isNewName, rs[i]));
        }
    }*/

    public static String upFile(MultipartFile file, HttpServletRequest request, String dirName, int type, boolean isNewName, ResultData rs,Logger log) {
        String newName;
        if (file == null || file.isEmpty()) {
            rs.setMessage("文件为空");
            return null;
        }
        int index = file.getOriginalFilename().lastIndexOf(".");
        String postfix = file.getName().substring(index);
        //String postfix = file.getOriginalFilename().substring(index);

        if (!isTrueType(type, postfix)) {
            rs.setMessage("文件格式不正确");
            return  null;
        }
        if (isNewName) {
            newName = newFileName(type, postfix);
        } else {
            newName = file.getOriginalFilename();
            //newName = file.getName();
        }
        String path = request.getSession().getServletContext().getRealPath("/");
        StringBuilder builder = new StringBuilder(path);
        builder.append(dirName);
        log.info("path:"+path);
        File temp = new File(builder.toString().trim());
        File temp2 = new File(builder.toString(), newName.trim());
        if (!temp.exists()) {
            if (!temp.mkdirs()) {
                rs.setMessage("无法创建文件夹");
                return null;
            }
        }
        try {
            file.transferTo(temp2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        rs.setData(dirName + "/" + newName);
        builder.append("/");
        builder.append(file.getOriginalFilename());
        return builder.toString();
    }

    public static String uploadFiles(MultipartFile file,String fileName,InputStream input) {

        String path=null;
        ChannelSftp sftp = null;
        Channel channel = null;
        Session sshSession = null;
        try {
            JSch jsch = new JSch();
            jsch.getSession("root", "192.168.1.195", 22);
            sshSession = jsch.getSession("root", "192.168.1.195", 22);
            sshSession.setPassword("123");
            Properties sshConfig = new Properties();
            sshConfig.put("StrictHostKeyChecking", "no");
            sshSession.setConfig(sshConfig);
            sshSession.connect();
            channel = sshSession.openChannel("sftp");
            channel.connect();
            sftp = (ChannelSftp) channel;
            //sftp.mkdir("/usr/local/image");
            sftp.cd("/usr/local/image");
            if(file!=null){
                sftp.put(input,fileName,ChannelSftp.OVERWRITE);
            }else{
                return null;
            }
            path="http://192.168.1.195:9192"+"/"+fileName;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(sftp!=null && sftp.isConnected()){
                sftp.disconnect();
            }
            if(sshSession!=null && sshSession.isConnected()){
                sshSession.disconnect();
            }
            if(channel!=null && channel.isConnected()){
                channel.disconnect();
            }
        }
        System.out.println(path);
        return path;
    }

    private static boolean isTrueType(int type, String postfix) {
        if (type == IMAGE) {
            return ".jpg".equals(postfix) || ".jpeg".equals(postfix) || ".png".equals(postfix) || ".ico".equals(postfix) || ".gif".equals(postfix);
        } else if (type == AUDIO) {
            return ".mp3".equals(postfix) || ".silk".equals(postfix) || ".wav".equals(postfix);
        } else if (type == VIDEO) {
            return ".mp4".equals(postfix) || ".flv".equals(postfix) || ".avi".equals(postfix) || ".rmvb".equals(postfix);
        } else if (type == DOCUMENT) {
            return ".doc".equals(postfix) || ".ppt".equals(postfix) || ".xls".equals(postfix) || ".docx".equals(postfix) || ".pptx".equals(postfix) || ".xlsx".equals(postfix) || ".txt".equals(postfix) || ".pdf".equals(postfix);
        } else {return type == OTHER;}
    }

    public static String makeNewDir(HttpServletRequest request, String dirName) {
        StringBuilder path = new StringBuilder(request.getSession().getServletContext().getRealPath("/"));
        StringBuilder dirNames = new StringBuilder();
        String[] newDirs = dirName.split(",");
        if (newDirs.length > 1) {
            dirNames.append("");
            for (String newDir : newDirs) {
                dirNames.append("/");
                dirNames.append(newDir);
            }
        } else {
            dirNames.append("/");
            dirNames.append(dirName);
        }
        path.append(dirNames.toString());
        File temp = new File(path.toString().trim());
        if (!temp.exists()) {
            if (!temp.mkdirs()) {
                request.getSession().setAttribute("error", "无法创建文件夹");
            }
        }
        return dirNames.toString();
    }

    private synchronized static String newFileName(int type, String postfix) {
    		if (type == IMAGE) {
    		//	return "image" + TimeUtil.getDateTime(TimeUtil.FormatType.TO_MS_NONE) + postfix;
    			return "image" + UUID.randomUUID().toString().replace("-","") + postfix;
    		} else if (type == AUDIO) {
    			return "audio" + com.sysh.util.time.TimeUtil.getDateTime(com.sysh.util.time.TimeUtil.FormatType.TO_MS_NONE)+ postfix;
    		} else if (type == VIDEO) {
    			return "video" + com.sysh.util.time.TimeUtil.getDateTime(com.sysh.util.time.TimeUtil.FormatType.TO_MS_NONE)+ postfix;
    		} else if (type == DOCUMENT) {
    			return "document" + com.sysh.util.time.TimeUtil.getDateTime(com.sysh.util.time.TimeUtil.FormatType.TO_MS_NONE) + postfix;
    		} else {
    			return "file" +com.sysh.util.time.TimeUtil.getDateTime(com.sysh.util.time.TimeUtil.FormatType.TO_MS_NONE) + postfix;
    		}
    }

    public static boolean deleteFolder(String deletePath, HttpServletRequest request) {
        StringBuilder path = new StringBuilder(request.getSession().getServletContext().getRealPath("/"));
        StringBuilder dirNames = new StringBuilder("");
        String[] newDirs = deletePath.split(",");
        if (newDirs.length > 1) {
            for (int j = newDirs.length - 1; j >= 0; j--) {
                dirNames.append("/");
                dirNames.append(newDirs[j]);
            }
        }
        path.append(dirNames);
        System.out.println(path);
        File temp = new File(path.toString().trim());
        return temp.delete();
    }

    public static String[] rename(String path, int type, String oldName, String newName, HttpServletRequest request) {
        String[] temp = new String[2];
        StringBuilder dirNames = new StringBuilder("");
        String[] newDirs = path.split(",");
        if (newDirs.length > 1) {
            for (int j = newDirs.length - 1; j >= 0; j--) {
                dirNames.append("/");
                dirNames.append(newDirs[j]);
            }
        }
        if (type == 1) {
            String realPath = request.getServletContext().getRealPath("/") + dirNames;
            File file1 = new File(realPath + "/" + oldName);
            //将原文件夹更改为A，其中路径是必要的。注意
            if (file1.renameTo(new File(realPath + "/" + newName))){
                temp[0] = file1.getName();
                temp[1] = dirNames + "/" + newName;
            }else {
                return null;
            }
        } else {
            String realPath = request.getServletContext().getRealPath("/") + dirNames;
            if (newName.contains(".")) {
                File file1 = new File(realPath + "/" + oldName);
                //将原文件夹更改为A，其中路径是必要的。注意
                if (file1.renameTo(new File(realPath + "/" + newName))){
                    temp[0] = file1.getName();
                    temp[1] = dirNames + "/" + newName;
                }else {
                    return null;
                }
            } else {
                int index = oldName.lastIndexOf(".");
                String postfix = oldName.substring(index);
                File file1 = new File(realPath + "/" + oldName);
                //将原文件夹更改为A，其中路径是必要的。注意
                if (file1.renameTo(new File(realPath + "/" + newName))){
                    temp[0] = file1.getName();
                    temp[1] = dirNames + "/" + newName;
                }else {
                    return null;
                }
            }
        }
        return temp;
    }

    /*public static String upFile(MultipartFile file, HttpServletRequest request, String dirName, int type, boolean isNewName, ResultData rs,Logger log) {
        String newName;
        if (file == null || file.isEmpty()) {
            rs.setMessage("文件为空");
            return null;
        }
        int index = file.getOriginalFilename().lastIndexOf(".");
        //String postFix = file.getName().substring(index);
        String postfix = file.getOriginalFilename().substring(index);

        if (!isTrueType(type, postfix)) {
            rs.setMessage("文件格式不正确");
            return  null;
        }
        if (isNewName) {
            newName = newFileName(type, postfix);
        } else {
            newName = file.getOriginalFilename();
            //newName = file.getName();
        }
        String path = request.getSession().getServletContext().getRealPath("/");
        StringBuilder builder = new StringBuilder(path);
        builder.append(dirName);
        log.info("path:"+path);
        File temp = new File(builder.toString().trim());
        File temp2 = new File(builder.toString(), newName.trim());
        if (!temp.exists()) {
            if (!temp.mkdirs()) {
                rs.setMessage("无法创建文件夹");
                return null;
            }
        }
        try {
            file.transferTo(temp2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        rs.setData(dirName + "/" + newName);
        builder.append("/");
        builder.append(file.getOriginalFilename());
        return builder.toString();
    }*/

}