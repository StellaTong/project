package opal.dao;

import opal.model.Document;

import java.util.List;

public interface DocumentMapper {

    int deleteByPrimaryKey(Integer docid);

    int insert(Document record);

    int insertSelective(Document record);

    Document selectByPrimaryKey(Integer docid);

    int updateByPrimaryKeySelective(Document record);

    int updateByPrimaryKey(Document record);
    public List<Document> getAll();
}