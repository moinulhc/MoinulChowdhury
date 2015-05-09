package edu.asu.bmi.cda.fhir;

import org.junit.Test;

import static org.junit.Assert.*;
import java.io.InputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import org.junit.Test;
//import org.hl7.fhir.model.Patient;
import org.hl7.fhir.model.*;

public class MyUnmarshaller {

    @Test
    public void testUnmarshaller() throws Exception {

        JAXBContext c = JAXBContext.newInstance(Patient.class.getPackage().getName());
        javax.xml.bind.Unmarshaller um = c.createUnmarshaller();
        InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("data/patient_example.xml");

        Patient patient = (Patient)um.unmarshal(is);

        System.out.println(patient.getManagingOrganization().getReference().getValue());
        System.out.println(patient.getBirthDate().getValue().toString());
        System.out.println(patient.getDeceasedBoolean().isValue());
        System.out.println(patient.getGender().getCodings().get(0).getSystem().getValue());
        System.out.println(patient.getGender().getCodings().get(0).getCode().getValue());
        System.out.println(patient.getGender().getCodings().get(0).getDisplay().getValue());
        System.out.println(patient.getNames().get(0).getGivens().get(0).getValue());
        System.out.println(patient.getNames().get(0).getGivens().get(1).getValue());
        System.out.println(patient.getNames().get(0).getFamilies().get(0).getValue());
        System.out.println(patient.getIdentifiers().get(0).getLabel().getValue());
        System.out.println(patient.getIdentifiers().get(0).getValue().getValue());
        System.out.println(patient.getTelecoms().get(0).getUse().getValue().toString());
        System.out.println(patient.getTelecoms().get(1).getSystem().getValue().toString());
        System.out.println(patient.getTelecoms().get(1).getValue().getValue());
        System.out.println(patient.getTelecoms().get(1).getUse().getValue().toString());

        is.close();

    }
}
