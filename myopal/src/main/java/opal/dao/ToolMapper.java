package opal.dao;

import opal.model.Tool;

import java.util.List;

public interface ToolMapper {
    int deleteByPrimaryKey(Integer toolid);

    int insert(Tool record);

    int insertSelective(Tool record);

    Tool selectByPrimaryKey(Integer toolid);

    int updateByPrimaryKeySelective(Tool record);

    int updateByPrimaryKey(Tool record);

    List<Tool> getAll();
}