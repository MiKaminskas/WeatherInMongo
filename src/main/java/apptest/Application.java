package apptest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@Slf4j
@SpringBootApplication
public class Application {
    public static void main(String[] args){

        SpringApplication.run(Application.class, args);
    }

    /*@Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx){
        return args->{
            System.out.println("Lets test");
            String[] beans = ctx.getBeanDefinitionNames();
            Arrays.sort(beans);
            for (String beanName:beans){
                System.out.println(beanName);
            }
        };
    }*/
}
