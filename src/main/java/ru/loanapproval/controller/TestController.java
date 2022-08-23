package ru.loanapproval.controller;

import org.camunda.bpm.engine.ProcessEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/set")
public class TestController {

    @Autowired
    ProcessEngine processEngine;

    @GetMapping("/loan/{id}")
    public void loanApproval(@PathVariable String id){
        processEngine.getRuntimeService().startProcessInstanceByKey("loanApproval", id);
    }
}
