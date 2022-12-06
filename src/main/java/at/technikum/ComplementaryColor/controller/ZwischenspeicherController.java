package at.technikum.ComplementaryColor.controller;

import at.technikum.ComplementaryColor.service.ColorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZwischenspeicherController {

    ColorService colorService;

    ZwischenspeicherController(ColorService colorService){
        this.colorService=colorService;
    }

    @GetMapping("/api/complementary")
    public ResponseEntity<String> findBookById(@RequestParam String color) {

        String complementaryColor = colorService.getComplementaryColor(color);
        if(complementaryColor!=null){
            return ResponseEntity.ok(complementaryColor);  // return 200, with json body
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null); // return 404, with null body
        }

    }
}
