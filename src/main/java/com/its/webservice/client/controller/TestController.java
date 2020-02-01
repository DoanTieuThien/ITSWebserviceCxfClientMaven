package com.its.webservice.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.its.webservice.client.model.ResponseModel;
import com.its.ws.ITSWebServicePortType;
import com.its.ws.itsdatatypes.RetResultType;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	private ITSWebServicePortType portType = null;
	
	@GetMapping("/load-data")
	public ResponseModel loadDataSample() {
		ResponseModel res = new ResponseModel();

		try {
			RetResultType retResultType = portType.login("ITS_SAMPLE", "ITS_SAMPLE123");
			String code = retResultType.getStatus();
			String message = retResultType.getMessage();
			res.setCode(code);
			res.setMessage(message);
			res.setPayload(retResultType.getPayload());
		} catch (Exception exp) {
			exp.printStackTrace();
			res.setCode("API-99999");
			res.setMessage(exp.getMessage());
		}
		return res;
	}
}
