package com.example.comunda.demo.delegate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class LoanApplicationDelegate implements JavaDelegate {

    private static final Logger logger = LogManager.getLogger(LoanApplicationDelegate.class);

    public void execute(DelegateExecution delegate) throws Exception {
        logger.info("LoanApplicationDelegate выполнен");
        Object objVar = delegate.getVariable("applicationType");
        if (objVar != null) {
            logger.info("тип заявки: " + objVar.toString());
        } else {
            logger.info("тип заявки не указан");
        }
        // some actions
        //delegate.setVariable("otherVariable", "otherValue");
    }

}
