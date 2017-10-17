package net.self.bean;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Response {

	private Integer respId;
	private String respBody;
	private String version;
	public Integer getRespId() {
		return respId;
	}
	@JsonSetter
	public void setRespId(Integer respId) {
		this.respId = respId;
	}
	@JsonGetter
	public String getRespBody() {
		return respBody;
	}
	@JsonSetter
	public void setRespBody(String respBody) {
		this.respBody = respBody;
	}
	@JsonGetter
	public String getVersion() {
		return version;
	}
	@JsonSetter
	public void setVersion(String version) {
		this.version = version;
	}
	@Override
	public String toString() {
		return "Response [respId=" + respId + ", respBody=" + respBody + ", version=" + version + "]";
	}
	
}
