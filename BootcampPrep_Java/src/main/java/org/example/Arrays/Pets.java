package org.example.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Pets {
    public String petSounds(String animal, String country) {

        Map<String, String> dog = Map.of(
                "America", "Woof! Woof!",
                "Germany", "Wau Wau!",
                "England", "Bow wow!",
                "Uruguay", "Jua jua!",
                "Afrikaans", "Blaf!",
                "Korea", "Mong mong!",
                "Iceland", "Voff voff!",
                "Albania", "Ham!",
                "Algeria", "Ouaf ouaf!"
        );

        Map<String, String> cat = Map.of(
                "America", "Meow",
                "Germany", "Miauw!",
                "England", "mew mew",
                "Uruguay", "Miau Miau!",
                "Afrikaans", "Purr",
                "Korea", "Nyaong!",
                "Iceland", "Kurnau!",
                "Albania", "Miau",
                "Algeria", "Miaou!"
        );

        Map<String, String> chicken = Map.of(
                "America", "Cluck cluck",
                "Germany", "tock tock tock",
                "England", "Cluck Cluck",
                "Uruguay", "gut gut gdak",
                "Afrikaans", "kukeleku",
                "Korea", "ko-ko-ko",
                "Iceland", "Chuck-chuck!",
                "Albania", "Kotkot",
                "Algeria", "Cotcotcodet"
        );

        List<AnimalNoises> zoo = new ArrayList<>();
        zoo.add(new AnimalNoises("dog", dog));
        zoo.add(new AnimalNoises("cat", cat));
        zoo.add(new AnimalNoises("chicken", chicken));

        StringBuilder sb = new StringBuilder();
        String sound = "";
        for (int i = 0; i < zoo.size(); i++) {
            if (zoo.get(i).getAnimal().equals(animal)) {
                sound = zoo.get(i).getCountrySound(country);
            }
        }
        int animalIndex = zoo.indexOf(animal);

        sb.append(animal.substring(0, 1).toUpperCase() + animal.substring(1) + 's' + " in " + country + " say " + sound);

        return sb.toString();
    }

    public static void main(String[] args) {
        Pets test = new Pets();
        System.out.println(test.petSounds("dog", "Iceland"));
        //expect Dogs in Iceland say Voff voff!

        System.out.println(test.petSounds("cat", "Algeria"));
        //expect Cats in Algeria say Miaou!
    }
}
