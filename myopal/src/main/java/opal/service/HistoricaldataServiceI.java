package opal.service;

import opal.model.Historicaldata;

import java.util.List;

/**
 * Created by dongsidou on 2016/8/26.
 */
public interface HistoricaldataServiceI {
    //通过Id查找工具
    public Historicaldata getHistoricaldataById(Integer recordid);

    //通过Id删除用户
    public int deleteHistoricaldataById(Integer recordid);

    //插入工具
    public int insert(Historicaldata historicaldata);


    //显示工具列表
    public List<Historicaldata> getAll();

    //更新工具信息
    public int updateHistoricaldata(Historicaldata historicaldata);

    public List<Historicaldata> selectRecordByMetricname(String metricname);
}
