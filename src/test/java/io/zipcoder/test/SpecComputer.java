package io.zipcoder.test;
import io.zipcoder.Computer;
/**
 * Created by roberthitchens3 on 1/25/16.
 */
import org.junit.Test;
import static org.junit.Assert.*;
public class SpecComputer {
    Computer coms = new Computer();
    @Test
    public void testComGenChoice(){
        coms.genChoice(); //random choice
        assertNotNull("choice generated should not be null: ", coms.getChoice());
        coms.genChoice("PAPER");// non random choice
        assertNotNull("choice generated should not be null: ", coms.getChoice());
    }
}
