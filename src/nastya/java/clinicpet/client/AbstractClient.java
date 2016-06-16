package nastya.java.clinicpet.client;

import nastya.java.clinicpet.Interfaces.InterfaceClient;
import nastya.java.clinicpet.Interfaces.InterfaceAnimal;
import nastya.java.clinicpet.pet.Pet;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Клиент
 */

public abstract class AbstractClient implements InterfaceClient {

    private String name; // имя клиента
    private ArrayList<InterfaceAnimal> petList; //список питомцев

    public AbstractClient(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public ArrayList<InterfaceAnimal> getPetList() {
        return petList;
    }

    public void setPetList(ArrayList<InterfaceAnimal> petList) {
        this.petList = petList;
    }



   public void addPet(){

        Scanner reader2 = new Scanner(System.in);
        try{

            String addNewPet = "y";
            while(!addNewPet.equals("n")){
                System.out.print("Enter pet's name: ");
                String namepet = reader2.next();
                System.out.print("Enter pet: ");
                String petpet = reader2.next();
                InterfaceAnimal addpet = new Pet(namepet,petpet);
                System.out.print("Are you want to continue add pet?: y/n  ");
                addNewPet = reader2.next();
            }
        } finally {
            reader2.close();
        }

    }



}
