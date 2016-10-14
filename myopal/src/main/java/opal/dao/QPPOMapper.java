package opal.dao;

import opal.model.QPPO;

public interface QPPOMapper {
    int deleteByPrimaryKey(Integer qppoid);

    int insert(QPPO record);

    int insertSelective(QPPO record);

    QPPO selectByPrimaryKey(Integer qppoid);

    int updateByPrimaryKeySelective(QPPO record);

    int updateByPrimaryKey(QPPO record);
}