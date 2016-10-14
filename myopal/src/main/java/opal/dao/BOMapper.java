package opal.dao;

import opal.model.BO;

public interface BOMapper {
    int deleteByPrimaryKey(Integer boid);

    int insert(BO record);

    int insertSelective(BO record);

    BO selectByPrimaryKey(Integer boid);

    int updateByPrimaryKeySelective(BO record);

    int updateByPrimaryKey(BO record);
}