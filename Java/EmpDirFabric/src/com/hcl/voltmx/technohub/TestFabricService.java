package com.hcl.voltmx.technohub;


import com.konylabs.middleware.common.JavaService2;
import com.konylabs.middleware.controller.DataControllerRequest;
import com.konylabs.middleware.controller.DataControllerResponse;
import com.konylabs.middleware.dataobject.Param;
import com.konylabs.middleware.dataobject.Result;

public class TestFabricService implements JavaService2 {
	
	public Object invoke(String methodId, Object[] objectArray, DataControllerRequest request,
			DataControllerResponse response) throws Exception {
		Result result = new Result();
		result.addParam(new Param("opstatus", "0", "number"));
		result.addParam(new Param("status","Test"));
		return result;
	}

}
