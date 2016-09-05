package opal.service;

import opal.model.Document;


import java.util.List;

/**
 * Created by dongsidou on 2016/8/26.
 */
public interface DocServiceI {
    //通过Id查找文档
    public Document getDocumentById(Integer documentid);

    //通过Id删除文档
    public int deleteDocumentById(Integer documentid);

    //插入文档
    public int insert(Document document);


    //显示文档列表
    public List<Document> getAll();

    //更新文档信息
    public int updateDocument(Document document);
}
