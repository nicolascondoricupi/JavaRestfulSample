package pe.edu.utp.javarestfulsample.models.pe.edu.utp.javarestfulsample;

import pe.edu.utp.javarestfulsample.models.SampleClass;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.ArrayList;
import java.util.List;

@Path("/samples")
public class SamplesResource {
    @GET

    public List<SampleClass> getSamples(){
        List<SampleClass> samples = new ArrayList<>();

        for (int i = 0; i< 10; i++)
            samples.add(new SampleClass("John","Doe"));
        return samples;
    }
}
