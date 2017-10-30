package ru.bmstu;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ru.bmstu.domain.KernelSoftware;
import ru.bmstu.domain.SoftwareRepository;

@SpringBootApplication
@EnableJpaRepositories
public class SslTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslTestApplication.class, args);
	}

	@Autowired
	private SoftwareRepository repository;

	@Bean
	public InitializingBean init () {
		return () -> {
			KernelSoftware ks1 = new KernelSoftware();
			ks1.setName("KS1");
			repository.save(ks1);

			KernelSoftware ks2 = new KernelSoftware();
			ks2.setName("KS2");
			repository.save(ks2);

			KernelSoftware ks3 = new KernelSoftware();
			ks3.setName("KS3");
			repository.save(ks3);
		};
	}
}
