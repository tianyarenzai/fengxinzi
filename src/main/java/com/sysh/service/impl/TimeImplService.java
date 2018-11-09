package com.sysh.service.impl;

import com.sysh.entity.Time1;
import com.sysh.mapper.TimeMapper;
import com.sysh.service.TimeService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimeImplService implements TimeService1 {
    @Autowired
    private TimeMapper timeMapper;
    @Override
    public int insert(Time1 time) {
        return timeMapper.insert(time);
    }

    @Override
    public Time1 select(Integer id) {
        return timeMapper.selectByPrimaryKey(id);
    }
}
