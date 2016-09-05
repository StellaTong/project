package opal.dao;

import opal.model.Historicaldata;

import java.util.List;

public interface HistoricaldataMapper {
    int deleteByPrimaryKey(Integer recordid);

    int insert(Historicaldata record);

    int insertSelective(Historicaldata record);

    Historicaldata selectByPrimaryKey(Integer recordid);

    int updateByPrimaryKeySelective(Historicaldata record);

    int updateByPrimaryKey(Historicaldata record);

    List<Historicaldata> getAll();

    List<Historicaldata> selectByMetricname(String metricname);

}