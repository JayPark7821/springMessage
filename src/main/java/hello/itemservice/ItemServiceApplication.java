package hello.itemservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;

@SpringBootApplication
public class ItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemServiceApplication.class, args);
	}

	// springboot 에선 자동으로 messageSource를 등록해준다.
//	@Bean
//	public MessageSource messageSource() {
//		ResourceBundleMessageSource messageSource = new
//				ResourceBundleMessageSource();
//		messageSource.setBasenames("messages", "errors");
//		messageSource.setDefaultEncoding("utf-8");
//		return messageSource;
//	}

}
