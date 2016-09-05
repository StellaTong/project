package opal.service;

import opal.dao.PPBMapper;
import opal.model.PPB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dongsidou on 2016/8/26.
 */
@Service("ppbService")
public class PPBServiceImpl implements PPBServiceI {

    private PPBMapper ppbMapper;
    private PPB ppb;
    private Integer ppbid;
    private String ppbname;

    public PPBMapper getPPBMapper(){
        return ppbMapper;
    }

    @Autowired
    public  void setPPBMapper(PPBMapper ppbMapper){
        this.ppbMapper = ppbMapper;
    }

    @Override
    public PPB getPPBById(Integer ppbid) {
        this.ppbid= ppbid;
        return ppbMapper.selectByPrimaryKey(ppbid);
    }

    @Override
    public int deletePPBById(Integer ppbid) {
        this.ppbid=ppbid;
        return ppbMapper.deleteByPrimaryKey(ppbid);
    }

    @Override
    public int insert(PPB ppb) {
        this.ppb=ppb;
        return ppbMapper.insert(ppb);
    }

    @Override
    public List<PPB> getAll() {
        return ppbMapper.getAll();
    }

    @Override
    public int updatePPB(PPB ppb) {

        this.ppb = ppb;
        return ppbMapper.updateByPrimaryKey(ppb);
    }


}
