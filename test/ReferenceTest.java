/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author fagnernunes
 */
public class ReferenceTest {
    
    public ReferenceTest() {
    }

    @Test
    public void testSetAndGetAuthor()throws Exception {
         String autor = "Fagner Nunes";
         Reference r = new Reference();
         r.setAutor(autor);
         Assertions.assertEquals(autor,r.getAutor());
    }
     public void testSetAndGetYear()throws Exception {
         String Year = "2011";
         Reference r = new Reference();
         r.setYear(Year);
         Assertions.assertEquals(Year,r.getYear());
    }
     public void testSetAndGetId()throws Exception {
         int id = 1;
         Reference r = new Reference();
         r.setId(id);
         Assertions.assertEquals(id,r.getYear());
    }
    public void testSetAndGetTitle()throws Exception {
         String title = "test";
         Reference r = new Reference();
         r.setTitle(title);
         Assertions.assertEquals(title,r.getYear());
    }
    public void testSetAndGetPlace()throws Exception {
         String place = "Dublin";
         Reference r = new Reference();
         r.setPlace(place);
         Assertions.assertEquals(place,r.getYear());
    }
    
}
