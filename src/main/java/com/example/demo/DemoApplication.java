package com.example.demo;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.delivery.DHLDeliveryStrategy;
import com.example.demo.delivery.PostDeliveryStrategy;
import com.example.demo.flower.Flower;
import com.example.demo.flower.FlowerColor;
import com.example.demo.flower.FlowerType;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/order")
	public static List<Order> listFlowers() {
		return List.of(
				new Order(
						List.of((new Flower(10, FlowerColor.BLUE, 10, FlowerType.ROSE)),
								new Flower(10, FlowerColor.BLUE, 10, FlowerType.ROSE),
								new Flower(10, FlowerColor.BLUE, 10, FlowerType.ROSE)),
						new DHLDeliveryStrategy()),
				new Order(
						List.of((new Flower(10, FlowerColor.BLUE, 10, FlowerType.ROSE)),
								new Flower(10, FlowerColor.BLUE, 10, FlowerType.ROSE),
								new Flower(10, FlowerColor.BLUE, 10, FlowerType.ROSE)),
						new PostDeliveryStrategy()));

	}
}
