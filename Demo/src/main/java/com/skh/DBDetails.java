package com.skh;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "spring.datasource")
public class DBDetails {

	private String driverClassName;
	private String url;
	private String usuerName;
	private String password;
	public String getDriverClassName() {
		return driverClassName;
	}
	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsuerName() {
		return usuerName;
	}
	public void setUsuerName(String usuerName) {
		this.usuerName = usuerName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "DBDetails [driverClassName=" + driverClassName + ", url=" + url + ", usuerName=" + usuerName
				+ ", password=" + password + "]";
	}
	
}
