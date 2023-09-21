import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

    class DatabaseTest {
        Database database;

        Superhero testman;
        Superhero hackerman;


        @BeforeEach
        void setup(){
            database = new Database();
            testman = new Superhero("","Test Testerson",
                    "Testing",2023,"No",10);
            hackerman = new Superhero("Hackerman","Hack Hackerson",
                    "Hacking",2023,"Yes",9999);
            database.addSuperhero(testman);
            database.addSuperhero(hackerman);
        }
        @Test
        void searchSuperheroNameTest() {
            ArrayList<Superhero> testerListExpected = new ArrayList<>(Arrays.asList(testman));
            String queryName = "Testeson";
            ArrayList<Superhero> testerListReturned = database.searchSuperheroName(queryName);
            assertEquals(testerListExpected,testerListReturned);
        }

        @Test
        void searchSuperheroRealNameTest() {
            ArrayList<Superhero> testerListExpected = new ArrayList<>(Arrays.asList(hackerman));
            String queryName = "Hackerson";
            ArrayList<Superhero> testerListReturned = database.searchSuperheroRealName(queryName);
            assertEquals(testerListExpected,testerListReturned);




    }


    }

