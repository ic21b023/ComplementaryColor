package at.technikum.ComplementaryColor.dto;

import java.util.HashMap;

public class ColorRepository {

    HashMap<String,String> colorRepository = new HashMap<>();

    public ColorRepository(){
        colorRepository.put("red","green");
        colorRepository.put("orange","blue");
        colorRepository.put("yellow","purple");
        colorRepository.put("green","red");
        colorRepository.put("blue","orange");
        colorRepository.put("red","green");
    }

    public String getComplementaryColor(String color) {
        return colorRepository.get(color);
    }
}
