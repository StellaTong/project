package opal.dao;

import opal.model.DBO;

public interface DBOMapper {
    int deleteByPrimaryKey(Integer dboid);

    int insert(DBO record);

    int insertSelective(DBO record);

    DBO selectByPrimaryKey(Integer dboid);

    int updateByPrimaryKeySelective(DBO record);

    int updateByPrimaryKey(DBO record);
}