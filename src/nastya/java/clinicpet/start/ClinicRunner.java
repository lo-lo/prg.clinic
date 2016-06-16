package nastya.java.clinicpet.start;

import com.sun.org.apache.xpath.internal.SourceTree;
import nastya.java.clinicpet.Interfaces.InterfaceClinic;
import nastya.java.clinicpet.clinic.ClinicPet;

import javax.sound.midi.Soundbank;

public class ClinicRunner {

    public static void main(String[] args) {

        System.out.println("Programm for Pet animals clinic");

        InterfaceClinic clinic = new ClinicPet("A happy Pet's!");
        if(clinic instanceof InterfaceClinic)
        {
            ((ClinicPet)clinic).addClient();
        }

        System.out.println("End of programm. ");


    }





}
