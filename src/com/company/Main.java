package com.company;

public class Main {

    public static void main(String[] args) {
	    Computers lenovoThinkpad = new Computers("Lenovo Thinkpad","Lenova",699.99f,true,87, "i7-9750H","MX-150","Intel Cannon Lake Z390 ",16, 1024);
	    System.out.println(lenovoThinkpad.toString());
	    HardDisks seagateBarracudaST500DM002 = new HardDisks("ST500DM002", "Seagate",50, false, 15, "3.5 Inch Pentru PC", 500, 7200, 16);
	    System.out.println(seagateBarracudaST500DM002.toString());
	    Processors ryzen5 = new Processors("Ryzen 5 1600X", "AMD", 150, true, 20, true, "AM4", 3.6f, 6,16);
	    System.out.println(ryzen5.toString());
    }
}
