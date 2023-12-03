package com.adozgen.sbdesignpatterns.builder.example1;

public class ComputerBuilder {
    public String HDD;
    public String RAM;
    public boolean isGraphicsCardEnabled;
    public boolean isBluetoothEnabled;

    public ComputerBuilder setHDD(String  HDD){
        this.HDD = HDD;
        return this;
    }

    public ComputerBuilder setRAM(String  RAM){
        this.RAM = RAM;
        return this;
    }

    public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled){
        this.isGraphicsCardEnabled = isGraphicsCardEnabled;
        return this;
    }

    public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled){
        this.isBluetoothEnabled = isBluetoothEnabled;
        return this;
    }


    public Computer build(){
        return new Computer(this);
    }
}
