package asu.bmi.cda.api.impl;

/**
 * Created by mhchowd1 on 4/22/2015.
 */

import asu.bmi.cda.api.FHIRInterface;
import org.springframework.stereotype.Service;


@Service( "fhirService#default" )
public class DefaultFHIRService
        implements FHIRService
{
    public Patient getPatient( String pid ) {
        Patient pat = new Patient();
// assign id and some other fields
        return pat;
    }
}