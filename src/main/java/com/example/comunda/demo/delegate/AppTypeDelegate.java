package com.example.comunda.demo.delegate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class AppTypeDelegate implements JavaDelegate {

    private static final Logger logger = LogManager.getLogger(AppTypeDelegate.class);

    public void execute(DelegateExecution delegate) throws Exception {
        logger.info("AppTypeDelegate выполнен");
        Object objVar = delegate.getVariable("appType");
        if (objVar != null) {
            if ((Integer) objVar == 1) {
                logger.info("Создана мини-анкета");
            } else if ((Integer) objVar == 2) {
                logger.info("Создана полная заявка");
            } else {
                logger.info("Тип не определен");
            }
        } else {
            logger.info("Тип не определен");
        }
        // some actions
        //delegate.setVariable("otherVariable", "otherValue");
    }

}
