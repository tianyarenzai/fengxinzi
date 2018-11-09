package com.sysh.mapper;

import com.sysh.entity.update.Sh02Model;

import java.util.Map;

/**
 * ClassName:  <br/>
 * Function: 添加信息<br/>
 * date: 2018年06月12日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public interface Sh02DDMapper {

    Integer insertSh02(Sh02Model s);
    Integer insertEight(Sh02Model s);
    Integer insertVillage(Sh02Model s);
    String findFieldName(Map<String, String> map);

}
