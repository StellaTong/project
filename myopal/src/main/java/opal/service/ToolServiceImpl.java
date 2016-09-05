package opal.service;

import opal.dao.ToolMapper;
import opal.model.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dongsidou on 2016/8/26.
 */
@Service("toolService")
public class ToolServiceImpl implements ToolServiceI {

    private ToolMapper toolMapper;
    private Tool tool;
    private Integer toolid;
    private String toolname;

    public ToolMapper getToolMapper(){
        return toolMapper;
    }

    @Autowired
    public  void setToolMapper(ToolMapper toolMapper){
        this.toolMapper = toolMapper;
    }

    @Override
    public Tool getToolById(Integer toolid) {
        this.toolid= toolid;
        return toolMapper.selectByPrimaryKey(toolid);
    }

    @Override
    public int deleteToolById(Integer toolid) {
        this.toolid=toolid;
        return toolMapper.deleteByPrimaryKey(toolid);
    }

    @Override
    public int insert(Tool tool) {
        this.tool=tool;
        return toolMapper.insert(tool);
    }

    @Override
    public List<Tool> getAll() {
        return toolMapper.getAll();
    }

    @Override
    public int updateTool(Tool tool) {

        this.tool = tool;
        return toolMapper.updateByPrimaryKey(tool);
    }


}
