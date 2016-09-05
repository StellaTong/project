package opal.service;

import opal.dao.DocumentMapper;
import opal.dao.ToolMapper;
import opal.model.Document;
import opal.model.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dongsidou on 2016/8/26.
 */
@Service("docService")
public class DocServiceImpl implements DocServiceI {

    private DocumentMapper documentMapper;
    private Document document;
    private Integer documentid;
    private String docname;

    public DocumentMapper getDocumentMapper(){
        return documentMapper;
    }

    @Autowired
    public  void setDocumentMapper(DocumentMapper documentMapper){
        this.documentMapper = documentMapper;
    }

    @Override
    public Document getDocumentById(Integer documentid){
        this.documentid= documentid;
        return documentMapper.selectByPrimaryKey(documentid);
    }

    @Override
    public int deleteDocumentById(Integer documentid){
        this.documentid=documentid;
        return documentMapper.deleteByPrimaryKey(documentid);
    }

    @Override
    public int insert(Document document){
        this.document=document;
        return documentMapper.insert(document);
    }

    @Override
    public List<Document> getAll(){
        return documentMapper.getAll();
    }


    @Override
    public int updateDocument(Document document){
        this.document=document;
        return documentMapper.updateByPrimaryKey(document);
    }

}
