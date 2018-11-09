package com.sysh.mapper;

import com.sysh.entity.update.PovertyBasicInfoModel;

/**
 * ClassName:  <br/>
 * Function: 新增审核信息<br/>
 * date: 2018年06月12日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public interface Sh01DDMapper {

        Integer insertSh01(PovertyBasicInfoModel p);
        Integer insertEight(PovertyBasicInfoModel p);
        Integer insertVillage(PovertyBasicInfoModel p);
        Long selectInsertPrimary();
}
