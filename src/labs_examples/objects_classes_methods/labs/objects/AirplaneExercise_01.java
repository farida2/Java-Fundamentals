package labs_examples.objects_classes_methods.labs.objects;

//Created by Farida-Belhous -04/17/2020
/*
Exercise_01
Following the example in CarExample.java, please use Object Composition to model an Airplane class.
The Airplane class must be composed of at least 4 other classes (as well as any primitive types you'd like).
The Airplane class itself should have a fuel capacity (double) variable, as well as a currentFuelLevel variable.
We'll use these a bit later.
 */
/*
Exercise_04
Building off the previous classes we created in Exercise_01

1) Create a toString() method in each POJO. You can do this by holding down the Control key and hitting
enter at the same time. If you see a small menu choose toString() and generate from there. Otherwise you can
select "Code" from the top most navbar of IntelliJ and then select "Generate" and choose toString();

2) In the main() method you created in the controller classes demonstrate creating a number of Objects using a variety
of constructors that you created in the previous exercise.

3) After creating these objects, print the status of these objects. For example:
System.out.println(cardObj.toString())

 */

public class AirplaneExercise_01 {
    public static void main(String[] args) {
        ElectronicStabilityProtection esp = new ElectronicStabilityProtection(true);

        RemoteDigitalAudioPanel remoteDigitalAudioPanel = new RemoteDigitalAudioPanel("GMA36");

        AirplaneMakeModel makeModel = new AirplaneMakeModel("CESSNA TTX 240");

        double fuelCapacity = 48.0 ;

        double currentFuelLevel = 23.0 ;
        
        Airplane myAirplane = new Airplane(esp, remoteDigitalAudioPanel, makeModel, fuelCapacity, currentFuelLevel);
        System.out.println("myAirplane.toString() = " + myAirplane.toString());

    }
}

class ElectronicStabilityProtection {
    boolean has;

    public ElectronicStabilityProtection(boolean has) {
        this.has = has;
    }

    @Override
    public String toString() {
        return "ElectronicStabilityProtection{" +
                "has=" + has +
                '}';
    }
}

class RemoteDigitalAudioPanel {
    String RDA;

    public RemoteDigitalAudioPanel(String RDA) {
        this.RDA = RDA;
    }

    @Override
    public String toString() {
        return "RemoteDigitalAudioPanel{" +
                "RDA='" + RDA + '\'' +
                '}';
    }
}
class AirplaneMakeModel {

    String makeModel;

    public AirplaneMakeModel(String makeModel){

        this.makeModel = makeModel;

    }

    @Override
    public String toString() {
        return "AirplaneMakeModel{" +
                "makeModel='" + makeModel + '\'' +
                '}';
    }
}


class Airplane {
    ElectronicStabilityProtection itHas;

    AirplaneMakeModel airplaneMakeModel;

    RemoteDigitalAudioPanel RDAP;

    double fuelCapacity;

    double currentFuelLevel;

    public Airplane(ElectronicStabilityProtection itHas, RemoteDigitalAudioPanel RDAP,
                    AirplaneMakeModel airplaneMakeModel,  double fuelCapacity, double currentFuelLevel){
        this.itHas = itHas;

        this.RDAP = RDAP;

        this.airplaneMakeModel = airplaneMakeModel;

        this.fuelCapacity = fuelCapacity;

        this.currentFuelLevel = currentFuelLevel;

    }

    @Override
    public String toString() {
        return "Airplane{" +"ESP="+ itHas.toString() + "Remote Digital Audio Panel = " + RDAP.toString()+
                "Airplane Make and Model=" + airplaneMakeModel.toString() +
                ",\n fuel capacity='" + fuelCapacity + '\'' +
                ",\n current fuel level='" + currentFuelLevel + '\'' +
                '}';
    }


    // setters and getters
    public ElectronicStabilityProtection getItHas() {
        return itHas;
    }

    public void setItHas(ElectronicStabilityProtection itHas) {
        this.itHas = itHas;
    }

    public AirplaneMakeModel getAirplaneMakeModel() {
        return airplaneMakeModel;
    }

    public void setAirplaneMakeModel(AirplaneMakeModel airplaneMakeModel) {
        this.airplaneMakeModel = airplaneMakeModel;
    }

    public RemoteDigitalAudioPanel getRDAP() {
        return RDAP;
    }

    public void setRDAP(RemoteDigitalAudioPanel RDAP) {
        this.RDAP = RDAP;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }


    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }
}



