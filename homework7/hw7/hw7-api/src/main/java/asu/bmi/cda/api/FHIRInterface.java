package asu.bmi.cda.api;

/**
 * Created by mhchowd1 on 4/22/2015.
 */

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path( "FHIRService" )
public interface FHIRService
{
    @Path( "Patient/{pid}" )
    @GET
    @Produces( { "application/xml" } )
    Patient getPatient( @PathParam( "pid" ) String pid );
}