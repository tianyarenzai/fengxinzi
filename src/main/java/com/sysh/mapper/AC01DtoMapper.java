package com.sysh.mapper;

import com.sysh.dto.PovertyLoginAfterDto;
import com.sysh.entity.AC01Part;

import java.util.List;

public interface AC01DtoMapper {
    /**
     * 查询多个贫困户信息
     * @param num
     * @return
     */
    PovertyLoginAfterDto findPovertyUserName(Long num);

    AC01Part selectAll(Long povertyNumber);

    String findAdress(String aac001);

    //拿村找人（村编号）
    List<AC01Part> selectPovertyName(Long Number);
}