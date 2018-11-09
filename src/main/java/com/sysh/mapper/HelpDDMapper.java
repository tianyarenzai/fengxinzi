package com.sysh.mapper;

import com.sysh.dto.InsertHelpReview;
import com.sysh.dto.UpdateHelpNumberDto;

/**
 * ClassName:  <br/>
 * Function: 帮扶责任人的修改添加<br/>
 * date: 2018年06月06日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public interface HelpDDMapper {

   //审核信息添加
   Integer  insertHelpReview(InsertHelpReview insertHelpReview);
   //具体修改的添加
   Integer insertHelpInfo(UpdateHelpNumberDto updateHelpNumberDto);


}
