package at.technikum.ComplementaryColor.unitTests;

import at.technikum.ComplementaryColor.service.ColorService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ComplementaryColorUnitTests{

    ColorService colorService = new ColorService();

    @Test
    public void testGetComplementaryColor(){
        assertEquals("orange",colorService.getComplementaryColor("blue"));
    }
}
