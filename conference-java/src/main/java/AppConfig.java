import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.pluralsight"})
// bootstrap configuration | the start point of your app
public class AppConfig {

    /*
    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
    public SpeakerService getSpeakerService() {
        // SpeakerServiceImpl serviceImpl = new SpeakerServiceImpl(getSpeakerRepository());
        // serviceImpl.setRepository(getSpeakerRepository());
        SpeakerServiceImpl serviceImpl = new SpeakerServiceImpl();
        return serviceImpl;
    }


    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }
    */

}
