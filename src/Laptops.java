public class Laptops {
    Laptop lap1;
    Laptop lap2;
    Laptop lap3;
    Laptop lap4;
    Laptop lap5;
    Laptop lap6;
    Laptop lap7;

    Laptops() {
        this.lap1 = new Laptop("Acer One");
        lap1.setPrice(150000.50);
        lap1.setCPUFrequency(2.7);
        lap1.setSSD(512);
        lap1.setHDD(1024);
        this.lap2 = new Laptop("Acer Two");
        lap2.setPrice(75200.50);
        lap2.setCPUFrequency(2.5);
        lap2.setSSD(512);
        lap2.setHDD(0);
        this.lap3 = new Laptop("Asus ROG");
        lap3.setPrice(250000.70);
        lap3.setCPUFrequency(3.5);
        lap3.setSSD(256);
        lap3.setHDD(512);
        this.lap4 = new Laptop("Asus Vivo");
        lap4.setPrice(53020.10);
        lap4.setCPUFrequency(2.4);
        lap4.setSSD(0);
        lap4.setHDD(512);
        this.lap5 = new Laptop("HP Note");
        lap5.setPrice(150801.58);
        lap5.setCPUFrequency(3.1);
        lap5.setSSD(512);
        lap5.setHDD(0);
        this.lap6 = new Laptop("Lenovo IdeaPad");
        lap6.setPrice(12000.00);
        lap6.setCPUFrequency(1.7);
        lap6.setSSD(0);
        lap6.setHDD(256);
        this.lap7 = new Laptop("Lenovo ThinkPad");
        lap7.setPrice(385000.00);
        lap7.setCPUFrequency(3.8);
        lap7.setSSD(1024);
        lap7.setHDD(2048);
    }
}
