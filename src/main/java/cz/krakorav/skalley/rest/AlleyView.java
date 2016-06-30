package cz.krakorav.skalley.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Provides data about skittle alleys.
 */

@Path("alleys")
public class AlleyView {

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> getAllAlleys(){
        List<String> SampleStrings = new ArrayList<>();
        SampleStrings.add("FirstString");
        SampleStrings.add("SecondString");
        SampleStrings.add("ThirdString");

        return SampleStrings;
    }
}
