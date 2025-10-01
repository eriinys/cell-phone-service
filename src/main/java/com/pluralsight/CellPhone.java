package com.pluralsight;

public class CellPhone {
    //private
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private  String owner;

    //parameterless constructor`
    public CellPhone() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    public CellPhone (String owner, String phoneNumber) {
        this.owner = owner;
        this.phoneNumber = phoneNumber ;
    }
    //ADDING THE DIAL METHOD
    public void dial (CellPhone targetPhone) {
        String caller = (this.owner != null && !this.owner.isBlank())
                ? this.owner + "'s phone"
                : this.phoneNumber;
        String receiver = (targetPhone.getOwner() != null && !targetPhone.getOwner().isBlank())
                ? targetPhone.getOwner() + "'s phone"
                : targetPhone.getPhoneNumber();
        System.out.printf("\n%s is calling %s%n", caller, receiver);
    }

    //region getters
    public int getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getPhoneNumber() {
        return  phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    //endregion

}


