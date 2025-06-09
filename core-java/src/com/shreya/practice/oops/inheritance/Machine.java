package com.shreya.practice.oops.inheritance;

public class Machine {
    String type;
    double cost;
    boolean isMaintenanceRequired;

    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.type = "Front Load";
        wm.cost = 30000;
        wm.isMaintenanceRequired = false;
        wm.loadType = "Automatic";
        wm.isSmart = true;
        wm.isWifiAvailable = true;
        wm.displayInfo();

        System.out.println("-------------------------------------------------------------------");

        DishWasher dishWasher = new DishWasher();
        dishWasher.type = "Kitchen Dishwasher";
        dishWasher.cost = 25000;
        dishWasher.isMaintenanceRequired = true;
        dishWasher.isSmart = true;
        dishWasher.isWifiAvailable = true;
        dishWasher.displayInfo();

        System.out.println("-------------------------------------------------------------------");

        CarWasher carWasher = new CarWasher();
        carWasher.type = "Pressure Car Washer";
        carWasher.cost = 18000;
        carWasher.isMaintenanceRequired = false;
        carWasher.isAutomatic = true;
        carWasher.isNozalRequired = true;
        carWasher.displayInfo();

        System.out.println("-------------------------------------------------------------------");

        BorewellMachine borewellMachine = new BorewellMachine();
        borewellMachine.type = "Drill Machine";
        borewellMachine.cost = 50000;
        borewellMachine.isMaintenanceRequired = true;
        borewellMachine.isManual = true;
        borewellMachine.areManualEffortRequired = false;
        borewellMachine.displayInfo();
    }

    public void displayInfo() {
        System.out.println("Type: " + type + ", Cost: " + cost + ", Maintenance: " + isMaintenanceRequired);
    }
}

class WashingMachine extends Machine {
    String loadType;
    boolean isSmart;
    boolean isWifiAvailable;

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("WashingMachine: LoadType=" + loadType + ", Smart=" + isSmart + ", Wifi=" + isWifiAvailable);
    }
}

class DishWasher extends Machine {
    boolean isSmart;
    boolean isWifiAvailable;

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("DishWasher: Smart=" + isSmart + ", Wifi=" + isWifiAvailable);
    }
}

class CarWasher extends Machine {
    boolean isNozalRequired;
    boolean isAutomatic;

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("CarWasher: Nozzle Required=" + isNozalRequired + ", Automatic=" + isAutomatic);
    }
}

class BorewellMachine extends Machine {
    boolean areManualEffortRequired;
    boolean isManual;

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("BorewellMachine: Manual=" + isManual + ", Manual Effort Required=" + areManualEffortRequired);
    }
}
