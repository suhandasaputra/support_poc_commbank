/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bopro.process;

import com.bopro.database.BackendDBProcess;
import com.bo.entity.Tempmsg;
import com.bo.parameter.FieldParameterMatapos;
import java.util.HashMap;
import org.apache.log4j.Logger;

/**
 *
 * @author suhanda
 */
public class editpassword {
 
    private static Logger log = Logger.getLogger(editpassword.class);

    public HashMap process(HashMap input) {
        BackendDBProcess dp = new BackendDBProcess();
        HashMap status = dp.editpassword(input.get(FieldParameterMatapos.brand_id).toString(), input.get(FieldParameterMatapos.user_id).toString(), input.get(FieldParameterMatapos.oldPassword).toString(), input.get(FieldParameterMatapos.password).toString());
        return status;
    }
}
