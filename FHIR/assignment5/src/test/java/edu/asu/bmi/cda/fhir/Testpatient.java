package edu.asu.bmi.cda.fhir;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.hl7.fhir.model.Boolean;
import org.hl7.fhir.model.Code;
import org.hl7.fhir.model.CodeableConcept;
import org.hl7.fhir.model.Coding;
import org.hl7.fhir.model.DateTime;
import org.hl7.fhir.model.Identifier;
import org.hl7.fhir.model.Integer;
import org.hl7.fhir.model.Organization;
import org.hl7.fhir.model.Patient;
import org.hl7.fhir.model.Practitioner;
import org.hl7.fhir.model.ResourceReference;
import org.hl7.fhir.model.String;
import org.hl7.fhir.model.*;

public class Testpatient {

    @Test
    public void testPatientResource() throws ParseException {
        Boolean bool = new Boolean();
        bool.setValue(true);
        DateTime dateTime = new DateTime();
        Date date = new Date();
        dateTime.setValue(date);

        Patient patient = new Patient();
        patient.setActive(bool);
        patient.setDeceasedBoolean(bool);
        patient.setMultipleBirthBoolean(bool);
        patient.setBirthDate(dateTime);
        patient.setDeceasedDateTime(dateTime);

        System.out.println(patient.getActive().toString());
        System.out.println(patient.getDeceasedBoolean().toString());
        System.out.println(patient.getMultipleBirthBoolean().toString());
        System.out.println(patient.getBirthDate().toString());
        System.out.println(patient.getDeceasedDateTime().toString());

        assertEquals(patient.getActive(), bool);
        assertEquals(patient.getDeceasedBoolean(), bool);
        assertEquals(patient.getMultipleBirthBoolean(), bool);
        assertEquals(patient.getBirthDate(), dateTime);
        assertEquals(patient.getDeceasedDateTime(), dateTime);
    }
}