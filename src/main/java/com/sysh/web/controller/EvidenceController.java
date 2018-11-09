package com.sysh.web.controller;


import com.sysh.service.EvidenceService;
import com.sysh.util.*;
import org.apache.commons.lang3.StringUtils;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

import java.util.*;

/**
 * Created by sjy Cotter on 2018/8/7.
 * 佐证上传（五项达标情况，帮扶措施落实照片）
 */
@RestController
@RequestMapping(value = "/evidence")
public class EvidenceController {

    @Autowired
    private EvidenceService evidenceService;

    private Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping(value = "/img")
    public ResultData uploadEvidence(@RequestParam("file") MultipartFile[] filename, HttpServletRequest request, String povertyNumber, String helpNumber,String type) throws IOException {
        //log.info("进来了");
        //String path = "D:\\images\\fuping1";

        MultipartHttpServletRequest reqParam = (MultipartHttpServletRequest) request;
        povertyNumber = reqParam.getParameter("povertyNumber");
        helpNumber = reqParam.getParameter("helpNumber");
        type = reqParam.getParameter("type");

        String path = "/home/ftp/evidence";
        System.out.println("+++++文件大小++++++++++++" + filename.length);
        System.out.println("+++++日志内容++++++++++++" + povertyNumber);
        System.out.println("+++++帮扶干部编号++++++++++++" + helpNumber);
        System.out.println("+++++走访方式++++++++++++" + type);


        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;

        List<String> imageList = new ArrayList<>();
        for (MultipartFile file1 : filename) {
            /**
             注意这里获取的个数，是根据前端form表单里有几个，type=file来决定的，
             比如你虽然只点选了一个文件，上传，但这里实际上回有两个MultipartFile对 象，只不过其中一个MutipartFile的文件名会为空，这就是为什么下边会有个判断文件名
             为空的步骤**/
            String req = file1.getOriginalFilename();
            String[] txt1 = req.split("\\.");
            String txt=txt1[txt1.length-1];
            if (StringUtils.isBlank(req)) {
                continue;
            }
            File tempFile = new File(path, req);
            Long ss = System.currentTimeMillis();
            File newfile = new File(tempFile.getParent() + File.separator + ss + "." + txt);
            tempFile.renameTo(newfile);
            if (tempFile.exists()) {
                //newfile = new File(tempFile.getParent() + File.separator + ss+"."+txt);
                tempFile.renameTo(newfile);
            }
            //创建新名字的抽象文件
            //System.out.println(tempFile.getAbsolutePath());
            if (!newfile.exists()) {
                newfile.getParentFile().mkdirs();
                try {
                    newfile.createNewFile();
                    file1.transferTo(newfile);
                    ImageUtil imageUtil = new ImageUtil();
                    //log.info(s);
                    //imageUtil.UploadPicutre(file1, type, date, second, userID, s);
                    Long s = System.currentTimeMillis();
                    if("png".equals(txt)||"jpg".equals(txt)||"gif".equals(txt)||"jpeg".equals(txt))
                    {
                        imageList.add(ss+"."+txt);
                    }
                    else
                    {
                        imageList.add(ss+".jpg");
                    }
                    System.out.println(ss);
                    Thread thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            SftpUtil.imgUploadEvidence(ss + "." + txt, ss);
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
        Map<String, Object> map = new HashMap<>();
        map.put("povertyNumber", povertyNumber);
        map.put("helpNumber", helpNumber);
        map.put("type", type);
        map.put("imageList", imageList);
        map.put("newTime",DateUtil.NowDateSecond());
        //添加帮扶日志
        return evidenceService.insertEvidence(map);
        /*if (num == 1) {
            return ResultData.returnResultData(ResultData.RESULT_SUCCESS, "ok");
        } else {
            return ResultData.returnResultData(ResultData.DATA_FALSE, "fail");
        }*/
    }
}
