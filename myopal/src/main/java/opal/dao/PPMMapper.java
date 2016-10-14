package opal.dao;

import opal.model.PPM;

public interface PPMMapper {
    int deleteByPrimaryKey(Integer ppmid);

    int insert(PPM record);

    int insertSelective(PPM record);

    PPM selectByPrimaryKey(Integer ppmid);

    int updateByPrimaryKeySelective(PPM record);

    int updateByPrimaryKey(PPM record);
}