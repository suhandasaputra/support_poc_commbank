/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bopro.process;

import com.bopro.database.BackendDBProcess;
import com.bo.parameter.FieldParameterMatapos;
import java.util.HashMap;
import org.apache.log4j.Logger;

/**
 *
 * @author suhanda
 */
public class deletecustomer {

    private static Logger log = Logger.getLogger(deletecustomer.class);

    public HashMap process(HashMap input) {
        BackendDBProcess dp = new BackendDBProcess();
        HashMap status = dp.deletecustomer(input.get(FieldParameterMatapos.brand_id).toString(), input.get(FieldParameterMatapos.customer_email).toString());
        return status;
    }
}
