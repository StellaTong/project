package opal.service;

import opal.model.Tool;

import java.util.List;

/**
 * Created by dongsidou on 2016/8/26.
 */
public interface ToolServiceI {
    //通过Id查找工具
    public Tool getToolById(Integer toolid);

    //通过Id删除用户
    public int deleteToolById(Integer toolid);

    //插入工具
    public int insert(Tool tool);


    //显示工具列表
    public List<Tool> getAll();

    //更新工具信息
    public int updateTool(Tool tool);
}
