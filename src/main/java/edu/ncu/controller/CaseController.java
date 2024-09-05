package edu.ncu.controller;

import edu.ncu.template.DataSyncProcessTemplate;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/case")
public class CaseController {


    @Resource(name = "jddjDataSyncService")
    private DataSyncProcessTemplate dataSyncProcessTemplate;


    @GetMapping("/template")
    public String template(){
        dataSyncProcessTemplate.excute("HJ091");
        return "OK";
    }
}
