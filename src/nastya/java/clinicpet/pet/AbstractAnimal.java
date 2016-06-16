package nastya.java.clinicpet.pet;

import nastya.java.clinicpet.Interfaces.InterfaceAnimal;

/**
 *
 */
public abstract class AbstractAnimal implements InterfaceAnimal {

    // конструктор класса

    public AbstractAnimal(final String name, final String pet){
        this.name = name;
        this.pet = pet;
    }

    public void setName(String name) {
        this.name = name;
    }

    private  String name;

    public void setPet(String pet) {
        this.pet = pet;
    }

    //private InterfaceAnimal pet;
    private String pet;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPet() {
        return pet;
    }

}
