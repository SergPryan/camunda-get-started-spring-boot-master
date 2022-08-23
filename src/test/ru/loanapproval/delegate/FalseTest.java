package ru.loanapproval.delegate;

//import static org.junit.jupiter.api.Assertions.*;

import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.bpm.engine.test.Deployment;
import org.camunda.bpm.engine.test.junit5.ProcessEngineExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import static org.camunda.bpm.engine.test.assertions.bpmn.BpmnAwareTests.runtimeService;

class FalseTest {

    @RegisterExtension
    ProcessEngineExtension extension = ProcessEngineExtension.builder().build();

    @Test
    @Deployment(resources = "loanApproval.bpmn")
    public void testFalse(){
//        processEngineRule.getRuntimeService().startProcessInstanceByKey("loanApproval");

        ProcessInstance processInstance = runtimeService().startProcessInstanceByKey("loanApproval");


    }

}