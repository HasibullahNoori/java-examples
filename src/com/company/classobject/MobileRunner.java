package com.company.classobject;

public class MobileRunner {

    public static void main(String[] args) {

        Mobile mbl=new Mobile();
        mbl.color="black";
        mbl.mobileName="Samsung";
        mbl.model="Note10";
        mbl.price=1000;
        mbl.year=2021;
        System.out.println(mbl);
        System.out.println(mbl.getprice());
        mbl.printMobileColor(mbl.mobileName);
        Mobile mbl1=new Mobile("Iphone","Orange",2021,"ProMax1",1200);
        System.out.println(mbl1);
        System.out.println(mbl1.getprice());
        mbl1.printMobileColor(mbl1.mobileName);
    }
}
