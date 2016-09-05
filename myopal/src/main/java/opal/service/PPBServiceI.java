package opal.service;

import opal.model.PPB;

import java.util.List;

/**
 * Created by dongsidou on 2016/8/26.
 */
public interface PPBServiceI {
    //通过Id查找工具
    public PPB getPPBById(Integer ppbid);

    //通过Id删除用户
    public int deletePPBById(Integer ppbid);

    //插入工具
    public int insert(PPB ppb);


    //显示工具列表
    public List<PPB> getAll();

    //更新工具信息
    public int updatePPB(PPB ppb);
}
