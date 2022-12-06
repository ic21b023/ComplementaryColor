package at.technikum.ComplementaryColor.service;


import at.technikum.ComplementaryColor.dto.ColorRepository;
import org.springframework.stereotype.Service;

@Service
public class ColorService {

    ColorRepository colorRepository = new ColorRepository();

    public String getComplementaryColor(String color) {
        return colorRepository.getComplementaryColor(color);
    }
}
