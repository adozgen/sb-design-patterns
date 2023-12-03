package com.adozgen.sbdesignpatterns.builder.example1;

import lombok.Data;


@Data
public class Computer {
    private String HDD;
	private String RAM;
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;

	public Computer(ComputerBuilder builder) {
        this.HDD=builder.HDD;
        this.RAM=builder.RAM;
        this.isGraphicsCardEnabled=builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled=builder.isBluetoothEnabled;
    }

}
