import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// bootstrap configuration | the start point of your app
public class AppConfig {

    // beans are by default a SINGLETON = will only
    // execute the method the first time it is called
    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
        SpeakerServiceImpl serviceImpl = new SpeakerServiceImpl(getSpeakerRepository());
        // serviceImpl.setRepository(getSpeakerRepository());
        return serviceImpl;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }

}
