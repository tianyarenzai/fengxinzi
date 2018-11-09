package com.sysh.mapper;

public interface AA10TABLEMapper {
    //主要致贫原因
    String findMajorCause(String majorNumber);
    //识别标准
    String findIdentificationStandard(String s);
    //贫困户属性
    String findPovertyTypeName(String s);
    //脱贫标志
    String findSignsOfPovertyRelief(String s);
    //其他致贫原因
    String findOtherCause(String s);
    //是否重点对象
    String IsMajorObject(String s);
    //入户路类型
    String TypeEntryRoad(String s);
    //有无卫生厕所
    String IsToilet(String s);
    //主要燃料类型
    String majorFuelType(String s);
    //危房级别
    String CrisisLevel(String s);
    //搬迁方式
    String MoveMethod(String s);
    //与户主关系
    String FamilyRelation(String s);
    //证件类型
    String DocumentType(String s);
    //民族
    String Nation(String s);
    //文化程度
    String DegreeOfEducation(String s);
    //在校生情况
    String StudentStatus(String s);
    //劳动能力
    String LaborSkills(String s);
    //健康状况
    String Healthy(String s);
    //政治面貌
    String PoliticalOutlook(String s);
    //职务情况
    String Position(String s);
    //村属性
    String VillageType(String s);
    //发展方向
    String Development(String s);
    //地形地貌属性
    String Landform(String s);
    //查找村名称
    String SelectVillageName(String s);
    //技术特长
    String SelectTechnicalExpertise(String s);
    //隶属关系
    String findAffiliation(String s);
    //学历
    String findEducation(String s);
    //根据编号查询编号代表的名称
    String findFieldName(String s);

    //根据贫困户编号，查询户住证件号
    String findIdNumber(String s);

    //查询到乡镇是否通沥青水泥路
    String isConcrete(String s);
    //查询是否通客运班车
    String isPassengerBus(String s);










}