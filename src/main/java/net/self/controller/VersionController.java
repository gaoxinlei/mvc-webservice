package net.self.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import net.self.bean.Request;
import net.self.bean.Response;

@Controller
public class VersionController {

	@ResponseBody
	@RequestMapping(value= {"/get/{version}"},method=RequestMethod.POST)
	public Response versionMethod(@PathVariable("version")String version,@RequestBody Request request) {
		Response response = new Response();
		Integer reqId = request.getReqId();
		response.setRespId(reqId+100);
		response.setVersion(version);
		response.setRespBody("resp content");
		return response;
	}
}
