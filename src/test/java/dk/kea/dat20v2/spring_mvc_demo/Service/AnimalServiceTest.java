package dk.kea.dat20v2.spring_mvc_demo.Service;

import dk.kea.dat20v2.spring_mvc_demo.Model.Animal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//fortæl Spring at der skal laves dependency injection
@SpringBootTest
class AnimalServiceTest {
    @Autowired
    AnimalService animalService;

    @BeforeEach
    void SetUp(){
        //Arrange
        //lav rutine, der reinitialiserer databasen
    }

    @Test
    void readAll() {
        //Act
        List<Animal> animalList;
        //læs fra service
        animalList = animalService.readAll();
        long antal = animalList.size();

        //Assert
        //db initialiseret med 4 dyr, så der skal returneres 4
        assertEquals(antal, 4);
    }

    @Test
    void create() {
    }

    @Test
    void update() {
    }

    @Test
    void read() {
    }

    @Test
    void delete() {
    }
}