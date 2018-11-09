package com.sysh.mapper;

import com.sysh.dto.EvidenceDto;

import java.util.Map;

/**
 * Created by sjy Cotter on 2018/8/7.
 */
public interface EvidenceMapper {

    Integer insertEvidence(Map map);

    Integer insertImagePath(EvidenceDto evidenceDto);
}
