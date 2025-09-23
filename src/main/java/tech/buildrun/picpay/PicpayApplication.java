package tech.buildrun.picpay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;



// Resolvendo DESAFIO BACKEND do PicPay com Java e Spring Boot
// https://youtu.be/dttXo48oXt4



@SpringBootApplication
@EnableFeignClients
public class PicpayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PicpayApplication.class, args);
	}

}
