package id.web.learnwithghaniy.sidecarservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableSidecar
@EnableDiscoveryClient
public class SidecarServiceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SidecarServiceApplication.class, args);
	}

}

