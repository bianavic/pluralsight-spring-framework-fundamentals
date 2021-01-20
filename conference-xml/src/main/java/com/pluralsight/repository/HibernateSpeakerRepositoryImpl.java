package com.pluralsight.repository;

import com.pluralsight.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findall() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker(); // create a instance of Speaker

        speaker.setFirstName("Gonzales");
        speaker.setLastName("Caramelo");

        speakers.add(speaker);

        return speakers;
    }
}
