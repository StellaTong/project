package opal.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import opal.model.Document;
import opal.service.DocServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by dongsidou on 2016/8/30.
 */
@Controller
@RequestMapping("/document")
public class DocumentController {

    private DocServiceI docService;
    private DocServiceI getDocService(){
        return docService;
    }

    @Autowired
    private void setDocService(DocServiceI docService){
        this.docService=docService;
    }

    @RequestMapping("/list")
    public String documentlist(Model model, HttpServletRequest request){
        List<Document> documentList = docService.getAll();
        request.setAttribute("documentlist",documentList);
        return "documentlist";
    }
    @RequestMapping("/add")
    public String documentadd(Model model,HttpServletRequest request){
        Document document= new Document();
        document.setProcessid(Integer.parseInt(request.getParameter("processid")));
        document.setDoctype(request.getParameter("doctype"));
        document.setDocprotype(request.getParameter("docprotype"));
        return "documentadd";


    }

    @RequestMapping("/delete/{documentid}")
    public String documentdelete(@PathVariable Integer documentid, Model model, HttpServletRequest request){
        docService.getDocumentById(documentid);


        return "documentlist";
    }

    @RequestMapping("/edit/{documentid}")
    public String documentedit(@PathVariable Integer documentid,Model model,HttpServletRequest request){

        Document document=docService.getDocumentById(documentid);
        document.setProcessid(Integer.parseInt(request.getParameter("processid")));
        document.setDoctype(request.getParameter("doctype"));
        document.setDocprotype(request.getParameter("docprotype"));
        List<Document> documentList = docService.getAll();
        request.setAttribute("documentlist",documentList);
        return "documentlist";
    }

    @RequestMapping("/detail/{documentid}")
    public String documentdetail(@PathVariable Integer documentid,Model model,HttpServletRequest request){

        Document document=docService.getDocumentById(documentid);
        request.setAttribute("document",document);
        return "documentdetail";
    }

    @RequestMapping("/empty")
    public String documentdetail(Model model,HttpServletRequest request){
        Document document=new Document();
        request.setAttribute("document",document);
        return "documentdetail";

    }


}
