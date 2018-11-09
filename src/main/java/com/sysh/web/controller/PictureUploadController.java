package com.sysh.web.controller;

import com.sysh.entity.helplog.HelpLogModel;
import com.sysh.service.HelpUserService;
import com.sysh.service.TimeService1;
import com.sysh.util.*;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * ClassName:  <br/>
 * Function: 功能(废弃不用)<br/>
 * date: 2018年06月10日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/picture")
public class PictureUploadController {
    Logger log = Logger.getLogger(this.getClass());
    @Autowired
    private HelpUserService helpUserService;

    @Autowired
    private TimeService1 timeService;

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String upload(MultipartFile file, HttpServletRequest request) throws IOException {
        log.info("进来了");
        //获取tomcat文件路径
        //String path = request.getSession().getServletContext().getRealPath("log");
        //String path = "D:/images/fuping";
        String path = "/home/ftp/img";
        log.info("path" + path);
        String fileName = file.getOriginalFilename();//获取到上传文件的名字
        log.info("filename" + fileName);
        //System.out.println(file.getName()+"2222");获取到file
        //file.getSize();获取到上传文件的大小
        File dir = new File(path, fileName);
        System.out.println(file.getSize());
        if (!dir.exists()) {
            dir.mkdirs();
        }
        //MultipartFile自带的解析方法
        file.transferTo(dir);
        return "/upload" + "/" + fileName;
    }


    @Transactional
    @RequestMapping("/setCase")
    public void doSetCase(@RequestParam("file1") CommonsMultipartFile detailImage, HttpServletRequest request, HttpServletResponse response) {
        try {
            if (detailImage != null && !detailImage.isEmpty()) {
                org.apache.commons.fileupload.FileItem item = detailImage.getFileItem();
                String filePath = com.sysh.util.file.FileUtils.saveFile(item.getInputStream(), "D:/images/fuping", item.getName(), item.getContentType());
                System.out.print("tup dizhi ------" + filePath);
            }

        } catch (Exception e) {
        }
    }

    @RequestMapping(value = "/img", method = RequestMethod.POST)
    public String uploadImg(MultipartFile file, HttpServletRequest request) throws IOException {
        log.info("进来了");

        //String path = "/home/img";
        String path = "D:/images/fuping";

        log.info("path" + path);
        String fileName = file.getOriginalFilename();//获取到上传文件的名字
        log.info("filename" + fileName);
        //System.out.println(file.getName()+"2222");获取到file
        //file.getSize();获取到上传文件的大小
        File dir = new File(path, fileName);
       /* String base64 = null;
        InputStream in = null;*/
        log.info("文件读取成功");
        //File file = new File(path);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        //MultipartFile自带的解析方法
        file.transferTo(dir);

        ImageUtil imageUtil = new ImageUtil();
        //log.info(s);
        //imageUtil.UploadPicutre(file1, type, date, second, userID, s);
        Long s=System.currentTimeMillis();
        log.info(s);
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                imageUtil.UploadPicutre(fileName,s);
            }
        });
        HelpLogModel helpLogModel=new HelpLogModel();
        Map<String,Object> map=new HashMap<>();
        map.put("helpLog",helpLogModel.getLog());
        map.put("helpTime", DateUtil.NowDate().toString());
        map.put("helpNumber",helpLogModel.getHelpNumber());
        map.put("numberPraise","0");
        map.put("visitingMode",helpLogModel.getVisitingMode().toString());
        //添加帮扶日志
        Long num=helpUserService.insertHelpLog(map);

        thread.start();
        return "/upload" + "/" + fileName;
    }


    @RequestMapping(value = "/img1")
    public ResultData uploadImg1(@RequestParam("file") MultipartFile[] filename, HttpServletRequest request,String log,String helpNumber,String visitingMode) throws IOException {
        //log.info("进来了");
        //String path = "D:\\images\\fuping1";

        MultipartHttpServletRequest reqParam=(MultipartHttpServletRequest)request;
        log=reqParam.getParameter("log");
        helpNumber=reqParam.getParameter("helpNumber");
        visitingMode=reqParam.getParameter("visitingMode");

        String path = "/home/ftp/img";
        System.out.println("+++++文件大小++++++++++++"+filename.length);
        System.out.println("+++++日志内容++++++++++++"+log);
        System.out.println("+++++帮扶干部编号++++++++++++"+helpNumber);
        System.out.println("+++++走访方式++++++++++++"+visitingMode);

        //String path = "/home/ftp/img";
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        //List<MultipartFile> fileList = multipartRequest.getFiles("file");

        List<String> imageList=new ArrayList<>();
        for(MultipartFile file1:filename){
            /**
             注意这里获取的个数，是根据前端form表单里有几个，type=file来决定的，
             比如你虽然只点选了一个文件，上传，但这里实际上回有两个MultipartFile对 象，只不过其中一个MutipartFile的文件名会为空，这就是为什么下边会有个判断文件名
             为空的步骤**/
            String req= file1.getOriginalFilename();
            String[] txt1 = req.split("\\.");
            String txt=txt1[txt1.length-1];
            if(StringUtils.isBlank(req)){
                continue;
            }
            File tempFile = new File(path, req);
            Long ss=System.currentTimeMillis();
            File newfile=new File(tempFile.getParent() + File.separator + ss+"."+txt);
            tempFile.renameTo(newfile);
            if(tempFile.exists()) {
                //newfile = new File(tempFile.getParent() + File.separator + ss+"."+txt);
                tempFile.renameTo(newfile);
            }
            //创建新名字的抽象文件
            //System.out.println(tempFile.getAbsolutePath());
            if(!newfile.exists()){
                newfile.getParentFile().mkdirs();
                try {
                    newfile.createNewFile();
                    file1.transferTo(newfile);
                    ImageUtil imageUtil = new ImageUtil();
                    //log.info(s);
                    //imageUtil.UploadPicutre(file1, type, date, second, userID, s);
                    Long s=System.currentTimeMillis();
                    if("png".equals(txt)||"jpg".equals(txt)||"gif".equals(txt) || "jpeg".equals(txt))
                    {
                        imageList.add(ss+"."+txt);
                    }
                    else
                    {
                        imageList.add(ss+".jpg");
                    }
                    System.out.println(ss);
                    Thread thread=new Thread(new Runnable() {
                        @Override
                        public void run() {
                            //imageUtil.UploadPicutre( ss+"."+txt,ss);
                            SftpUtil.imgUpload(ss+"."+txt,ss);
                        }
                    });
                    thread.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            //System.out.println(req);
        }

        //添加帮扶日志
        //HelpLogModel helpLogModel=new HelpLogModel();
        Map<String,Object> map=new HashMap<>();
        map.put("helpLog",log);
        map.put("helpTime", DateUtil.NowDate().toString());
        map.put("helpNumber",helpNumber);
        /*map.put("numberPraise","0");*/
        map.put("visitingMode",visitingMode);
        map.put("imageList",imageList);
        //添加帮扶日志
        Long num=helpUserService.insertHelpLog(map);
        if(num==1)
        {
            /*try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            DeleteFileDir.deleteDir(path);*/

            return  ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok");
        }
        else
        {
            return   ResultData.returnResultData(ResultData.DATA_FALSE,"fail");
        }



    }

    /**
     * 上传四书四照
     * @param request
     * @return
     */
    //@PostMapping("/upload/img/log")

    public ResultData getImgUpload(@RequestParam("files") MultipartHttpServletRequest files,HttpServletRequest request,HelpLogModel helpLogModel) {

        log.info("进来了");
        Map map=new HashMap();
        /*map.put("aac031",holderIDCode);
        map.put("aar040",zoneYear);
        String aac001=photoMapper.queryHolderCode(map);
        map.put("aac001",aac001);
        Integer index=photoMapper.queryHolderCodeIsExist(map);*/
        /*if(index>0){
            return ResultData.returnResultData(ResultData.DATA_FALSE,"该贫困户已上传了四书四照",0);
        }*/
        /*//根据贫困户编号存放图片的路径
        HolderBooksPhotosEntity photos=new HolderBooksPhotosEntity();
        photos.setHolderCode(aac001);
        photos.setZoneYear(zoneYear);*/
        //获得上传的图片
        Map<String, MultipartFile> mapImgage = files.getFileMap();
        log.info("+++++++++++++++++得到的图片数量+++++++++++++++++="+mapImgage.size());
        String path;
        List<String> imageList=new ArrayList<>();
        Integer count=0;
        for (String file:mapImgage.keySet()) {
            MultipartFile file1= mapImgage.get(file);
            try {
                InputStream input=file1.getInputStream();
                //设置保存图片的名称
                Date date=new Date();
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
                //String photoName=dateFormat.format(date);
                String photoName=String.valueOf(System.currentTimeMillis());
                int round=(int) Math.random()*100;
                String txt=file1.getOriginalFilename().split("\\.")[1];
                String imgName=photoName+round+"."+txt;
                log.info("+++++++++++图片路径+++++++++++"+imgName);
                //将图片上传到服务器并返回路径
                path= FileUp.uploadFiles(file1,imgName,input);
                if(path==null){
                    return ResultData.returnResultData(ResultData.DATA_FALSE, "接收失败");
                }
                log.info("name: "+file1.getName());
                imageList.add(path);
                /*photos.setPhotoName(file1.getName());
                photos.setPhotoUrl(path);
                count=photoMapper.insertBooksPhotos(photos);*/

                log.info("count:"+count);
                count++;
            } catch (IOException e) {
                return ResultData.returnResultData(ResultData.DATA_FALSE, "接收失败");
            }
        }
        log.info("++++++++++++++++图片得数量++++++++++++++"+imageList.size());
        Map<String,Object> map1=new HashMap<>();
        map1.put("helpLog",helpLogModel.getLog());
        map1.put("helpTime", DateUtil.NowDate().toString());
        map1.put("helpNumber",helpLogModel.getHelpNumber());
        /*map.put("numberPraise","0");*/
        map1.put("visitingMode",helpLogModel.getVisitingMode());
        map1.put("imageList",imageList);
        //添加帮扶日志
        Long num=helpUserService.insertHelpLog(map1);
        if(num>0){
            return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"上传成功");
        }else{
            return ResultData.returnResultData(ResultData.DATA_FALSE, "接收失败");
        }
    }


}
