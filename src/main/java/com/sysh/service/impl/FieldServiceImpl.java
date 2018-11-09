package com.sysh.service.impl;

import com.sysh.mapper.FieldMapper;
import com.sysh.service.FieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * ClassName:  <br/>
 * Function: 字段实现<br/>
 * date: 2018年06月20日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
@Service
public class FieldServiceImpl implements FieldService {
    @Autowired
    private FieldMapper fieldMapper;


    @Override
    public List<String> findType(String s) {
        return fieldMapper.findField(s);
    }

    @Override
    public List<Map> findTypeHelp(String s) {
        return fieldMapper.findFieldHelp(s);
    }
}
