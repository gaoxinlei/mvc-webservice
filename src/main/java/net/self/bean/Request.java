package net.self.bean;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Request {
	private Integer reqId;
	private String reqBody;
	@JsonGetter
	public Integer getReqId() {
		return reqId;
	}
	@JsonSetter("reqId")
	public void setReqId(Integer reqId) {
		this.reqId = reqId;
	}
	@JsonGetter
	public String getReqBody() {
		return reqBody;
	}
	@JsonSetter("reqBody")
	public void setReqBody(String reqBody) {
		this.reqBody = reqBody;
	}
	@Override
	public String toString() {
		return "Request [reqId=" + reqId + ", reqBody=" + reqBody + "]";
	}

}
