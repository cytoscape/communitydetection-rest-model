package org.ndexbio.communitydetection.rest.model;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author churas
 */
public class TestTask {
    
    @Test
    public void testGettersAndSetters(){
        Task t = new Task();
        assertEquals(null, t.getId());
        t.setId("hi");
        assertEquals("hi", t.getId());        
    }
    
}
