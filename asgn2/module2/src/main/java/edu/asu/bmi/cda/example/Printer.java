package edu.asu.bmi.cda.example;

import edu.asu.bmi.cda.data.Patient;

/**
 * Created by mhchowd1 on 2/4/2015.
 */
public class Printer {
    Patient myPatient = new Patient();
    public static void main(String[] args){
        Patient.Name = "Moinul Chowdhury";
        System.out.print(Patient.Name);
    }

}
