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
public class grap {

    private static Logger log = Logger.getLogger(grap.class);

    public HashMap process(HashMap input) {
        BackendDBProcess dp = new BackendDBProcess();
        HashMap status = dp.getgrap(input.get(FieldParameterMatapos.brand_id).toString(), input.get(FieldParameterMatapos.outlet_id).toString(), input.get(FieldParameterMatapos.tanggal_from).toString(), input.get(FieldParameterMatapos.tanggal_to).toString());
        return status;
    }
}
