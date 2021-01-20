package com.pluralsight.repository;

import com.pluralsight.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Autowired
    private Calendar cal;

    public List<Speaker> findall() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker(); // create a instance of Speaker

        speaker.setFirstName("Gonzales");
        speaker.setLastName("Caramelo");

        System.out.println("cal: " + cal.getTime());

        speakers.add(speaker);

        return speakers;
    }
}
