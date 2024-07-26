package com.atccorp.SpringBootProject.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.atccorp.SpringBootProject.entities.Category;
import com.atccorp.SpringBootProject.entities.Order;
import com.atccorp.SpringBootProject.entities.OrderItem;
import com.atccorp.SpringBootProject.entities.Product;
import com.atccorp.SpringBootProject.entities.User;
import com.atccorp.SpringBootProject.entities.emuns.OrderStatus;
import com.atccorp.SpringBootProject.repositories.CategoryRepository;
import com.atccorp.SpringBootProject.repositories.OrderItemRepository;
import com.atccorp.SpringBootProject.repositories.OrderRepository;
import com.atccorp.SpringBootProject.repositories.ProductRepository;
import com.atccorp.SpringBootProject.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private OrderItemRepository orderitemRepository;

	@Override
	public void run(String... args) throws Exception {
	
		Category c1 = new Category(null, "Eletronics");
		Category c2 = new Category(null, "Computers");
		Category c3 = new Category(null, "Books");
		Category c4 = new Category(null, "Tools");
		Category c5 = new Category(null, "Fashion");
		
		Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
		Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
		
		categoryRepository.saveAll(Arrays.asList(c1, c2, c3, c4, c5));	
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
		
		p1.getCategories().add(c3);
		p2.getCategories().add(c1);
		p2.getCategories().add(c2);
		p3.getCategories().add(c4);
		p4.getCategories().add(c5);
		p5.getCategories().add(c3);
		
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		User u3 = new User(null, "Eric Rian", "ericr@gmail.com", "856935856", "123456");
		User u4 = new User(null, "Ícaro da Silva", "icaros@gmail.com", "842536987", "123456");
		User u5 = new User(null, "Saimon da Silva", "saimons@gmail.com", "869532659", "123456");
		
		Order o1 = new Order(null, Instant.parse("2024-07-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2024-07-18T03:42:10Z"), OrderStatus.CANCELED, u2);
		Order o3 = new Order(null, Instant.parse("2024-07-22T11:21:27Z"), OrderStatus.DELIVERED, u1);
		Order o4 = new Order(null, Instant.parse("2024-07-17T07:14:18Z"), OrderStatus.SHIPPED, u4);
		Order o5 = new Order(null, Instant.parse("2024-07-16T15:36:07Z"), OrderStatus.WAITING_PAYMENT, u5);
			
		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5));	
		orderRepository.saveAll(Arrays.asList(o1, o2, o3, o4, o5));	
		
		OrderItem oi1 = new OrderItem(o1, p1, 1, p1.getPrice());
		OrderItem oi2 = new OrderItem(o1, p2, 2, p3.getPrice());
		OrderItem oi3 = new OrderItem(o3, p3, 3, p3.getPrice());
		OrderItem oi4 = new OrderItem(o4, p4, 4, p4.getPrice());
		OrderItem oi5 = new OrderItem(o5, p5, 5, p5.getPrice());
		
		orderitemRepository.saveAll(Arrays.asList(oi1, oi2, oi3, oi4, oi5));
	}

}
