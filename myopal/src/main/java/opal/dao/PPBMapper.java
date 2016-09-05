package opal.dao;

import opal.model.PPB;

import java.util.List;

public interface PPBMapper {
    int deleteByPrimaryKey(Integer ppbid);

    int insert(PPB record);

    int insertSelective(PPB record);

    PPB selectByPrimaryKey(Integer ppbid);

    int updateByPrimaryKeySelective(PPB record);

    int updateByPrimaryKey(PPB record);

    List<PPB> getAll();

}