package edu.asu.bmi.cda.fhir;

import org.junit.Test;


        import static org.junit.Assert.*;

        import java.io.BufferedReader;
        import java.io.File;
        import java.io.FileInputStream;
        import java.io.FileOutputStream;
        import java.io.InputStream;
        import java.io.InputStreamReader;

        import javax.xml.bind.JAXBContext;
        import javax.xml.bind.Marshaller;
        import javax.xml.bind.Unmarshaller;

        import org.junit.Test;
        import org.hl7.fhir.model.Patient;
        import org.hl7.fhir.model.*;

public class MyMarshaller {

    @Test
    public void testMarshaller() throws Exception {

        JAXBContext context = JAXBContext.newInstance(Patient.class.getPackage().getName());
        Unmarshaller unmarshaller = context.createUnmarshaller();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("data/patient_example_input.xml");

        Patient patientInput = (Patient)unmarshaller.unmarshal(inputStream);

        FileOutputStream fileOutputStream = new FileOutputStream(new File("output/patient_example_output.xml"));
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(patientInput,fileOutputStream);
        marshaller.marshal(patientInput,System.out);

        inputStream.close();
        fileOutputStream.close();

        java.lang.String line1;
        java.lang.String line2;

        InputStream inputStream1 = Thread.currentThread().getContextClassLoader().getResourceAsStream("data/patient_example_input.xml");
        FileInputStream fileOutputStream2 = new FileInputStream("output/patient_example_output.xml");
        BufferedReader br1 = new BufferedReader(new InputStreamReader(inputStream1));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(fileOutputStream2));
        line1 = br1.readLine();
        line2 = br2.readLine();
        while((line1=br1.readLine()) != null | (line2=br2.readLine()) != null) {
            assertEquals(line1,line2);
        }

        inputStream1.close();
        fileOutputStream2.close();

    }
}

