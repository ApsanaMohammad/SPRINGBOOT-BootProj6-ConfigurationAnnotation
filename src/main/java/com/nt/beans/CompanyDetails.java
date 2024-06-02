package com.nt.beans;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component("company")
@ConfigurationProperties(prefix="org.nit")
@Data
public class CompanyDetails {
    public String name;
    private String type;
    private String location;
	@Override
	public String toString() {
		return "CompanyDetails [name=" + name + ", type=" + type + ", location=" + location + "]";
	}
    
}
