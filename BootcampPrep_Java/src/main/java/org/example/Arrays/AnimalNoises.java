package org.example.Arrays;

import java.util.Map;

public class AnimalNoises {
    private String animal;
    private Map<String, String> animalSounds;

    public AnimalNoises(String animal, Map<String, String> animalSounds) {
        this.animal = animal;
        this.animalSounds = animalSounds;
    }

    public String getAnimal() {
        return animal;
    }

    public String getAnimalSounds(String animal) {
        return animalSounds.get(animal);
    }

    public String getCountrySound(String country) {
        return this.animalSounds.get(country);
    }
}
