package opal.service;

import opal.dao.HistoricaldataMapper;
import opal.model.Historicaldata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dongsidou on 2016/8/26.
 */
@Service("historicaldataService")
public class HistoricaldataServiceImpl implements HistoricaldataServiceI {

    private HistoricaldataMapper historicaldataMapper;
    private Historicaldata historicaldata;
    private Integer recordid;
    private String metricname;
    private String historicaldataname;

    public HistoricaldataMapper getHistoricaldataMapper(){
        return historicaldataMapper;
    }

    @Autowired
    public  void setHistoricaldataMapper(HistoricaldataMapper historicaldataMapper){
        this.historicaldataMapper = historicaldataMapper;
    }

    @Override
    public Historicaldata getHistoricaldataById(Integer recordid) {
        this.recordid= recordid;
        return historicaldataMapper.selectByPrimaryKey(recordid);
    }

    @Override
    public int deleteHistoricaldataById(Integer recordid) {
        this.recordid=recordid;
        return historicaldataMapper.deleteByPrimaryKey(recordid);
    }

    @Override
    public int insert(Historicaldata historicaldata) {
        this.historicaldata=historicaldata;
        return historicaldataMapper.insert(historicaldata);
    }

    @Override
    public List<Historicaldata> getAll() {
        return historicaldataMapper.getAll();
    }

    @Override
    public int updateHistoricaldata(Historicaldata Historicaldata) {

        this.historicaldata = historicaldata;
        return historicaldataMapper.updateByPrimaryKey(historicaldata);
    }

    @Override
    public List<Historicaldata> selectRecordByMetricname(String metricname){

        this.metricname = metricname;
        return historicaldataMapper.selectByMetricname(metricname);
    }


}
