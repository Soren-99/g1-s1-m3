package sorenrahimi.g1s1m3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sorenrahimi.g1s1m3.entities.Menu;


@SpringBootApplication
public class G1S1M3Application {

	public static void main(String[] args) {
		SpringApplication.run(G1S1M3Application.class, args);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(G1S1M3Application.class);
		Menu m = (Menu) ctx.getBean("menu");

		m.printMenu();
		ctx.close();
	}
}

