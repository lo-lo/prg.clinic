package nastya.java.clinicpet.clinic;

import nastya.java.clinicpet.Interfaces.InterfaceClient;
import nastya.java.clinicpet.Interfaces.InterfaceClinic;
import nastya.java.clinicpet.client.AbstractClient;
import nastya.java.clinicpet.client.Client;
import nastya.java.clinicpet.pet.Pet;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class AbstractClinic implements InterfaceClinic{

    // конструктор класса

    public AbstractClinic(String name) {
        this.name = name;
    }

    private String name; // наименование клиники
    private ArrayList<InterfaceClient> clientList; //список клиентов

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ArrayList<InterfaceClient> getClientList() {
        return clientList;
    }

    public void setClientList(ArrayList<InterfaceClient> clientList) {
        this.clientList = clientList;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void addClient() {

        Scanner reader1 = new Scanner(System.in);
        try {

            String addNewClient = "y";
            while (!addNewClient.equals("n"))

            {
                System.out.print("Enter client's name: ");
                String nameclient = reader1.next();
                InterfaceClient addclient = new Client(nameclient);
                if (addclient instanceof Client)                    // низходящее приведение
                {
                    ((Client) addclient).addPet();
                }

                System.out.print("Are you want to continue add new client?: y/n  ");
                addNewClient = reader1.next();

            }
        } finally{
                reader1.close();
        }


    }


    protected void delClient(){
        System.out.println("Enter client's name for dell it:");



    }

    protected void changeClient(){
        System.out.println("Enter client's name for change it:");

    }

    protected void findClient(){
        System.out.println("Enter client's name for find it:");

    }


}
