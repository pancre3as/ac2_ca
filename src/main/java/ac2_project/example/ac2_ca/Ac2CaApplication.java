package ac2_project.example.ac2_ca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@SpringBootApplication
@Controller
public class Ac2CaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ac2CaApplication.class, args);
		
	}
		
		@RequestMapping ("/")
		@ResponseBody
		String home()
		{
			return "Hello World";
	}
		
		
}


