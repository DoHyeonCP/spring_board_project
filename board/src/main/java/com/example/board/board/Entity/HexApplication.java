import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class HexApplication{

    pubilc static void main(String[] args){
        SpringApplication.run(HexApplication.class, args);
    }
}