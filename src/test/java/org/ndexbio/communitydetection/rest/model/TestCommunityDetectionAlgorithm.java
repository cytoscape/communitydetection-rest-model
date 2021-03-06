package org.ndexbio.communitydetection.rest.model;

import java.util.HashSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author churas
 */
public class TestCommunityDetectionAlgorithm {
    
    @Test
    public void testGettersAndSetters(){
        CommunityDetectionAlgorithm cda = new CommunityDetectionAlgorithm();
        assertEquals(null, cda.getCustomParameters());
        assertEquals(null, cda.getDescription());
        assertEquals(null, cda.getName());
        assertEquals(null, cda.getDockerImage());
        assertEquals(null, cda.getInputDataFormat());
        assertEquals(null, cda.getOutputDataFormat());
        assertEquals(null, cda.getVersion());
        HashSet<CustomParameter> cParams = new HashSet<>();
        CustomParameter cp = new CustomParameter();
        cp.setName("x");
        cParams.add(cp);
        cda.setCustomParameters(cParams);
        cda.setDescription("desc");
        cda.setName("name");
        cda.setDockerImage("docker");
        cda.setInputDataFormat("input");
        cda.setOutputDataFormat("output");
        cda.setVersion("version");
        assertEquals("x", cda.getCustomParameters().iterator().next().getName());
        assertEquals("desc", cda.getDescription());
        assertEquals("name", cda.getName());
        
        assertEquals("docker", cda.getDockerImage());
        assertEquals("input", cda.getInputDataFormat());
        assertEquals("output", cda.getOutputDataFormat());
        assertEquals("version", cda.getVersion());
        
    }
}
