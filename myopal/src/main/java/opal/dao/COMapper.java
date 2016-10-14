package opal.dao;

import opal.model.CO;

public interface COMapper {
    int deleteByPrimaryKey(Integer coid);

    int insert(CO record);

    int insertSelective(CO record);

    CO selectByPrimaryKey(Integer coid);

    int updateByPrimaryKeySelective(CO record);

    int updateByPrimaryKey(CO record);
}