package com.tugas2;

public class Main {

    public static void main(String[] args) {

        TokoAbc toko = new TokoAbc();

        Atk spidol = new Atk("A001", "Alat Tulis Kantor", "Spidol Snowman Board Marker Hitam", 5);
        Atk gunting = new Atk("A002", "Alat Tulis Kantor", "Gunting", 6);
        Atk penggaris = new Atk("A003", "Alat Tulis Kantor", "Penggaris", 10);
        Atk bukuTulisB5 = new Atk("B001", "Alat Tulis Kantor", "Buku Tulis B5", 12);
        Atk kertasHVS = new Atk("B002", "Alat Tulis Kantor", "Kertas HVS A4", 8);

        Bag ransel = new Bag("C001", "Tas", "Tas Ransel", 11);
        Bag pencilCase = new Bag("C002", "Tas", "Pencil Case", 7);
        Bag pouch = new Bag("C003", "Tas", "Pouch Kecil", 13);
        Bag bingkaiFoto = new Bag("C004", "Lain-lain", "Bingkai Foto 6R", 20);
        Bag canvas = new Bag("C005", "Lain-lain", "Canvas", 10);

        //Atk input
        toko.addAtk(spidol);
        toko.addAtk(gunting);
        toko.addAtk(penggaris);
        toko.addAtk(bukuTulisB5);
        toko.addAtk(kertasHVS);

        //Bag input
        toko.addBag(ransel);
        toko.addBag(pencilCase);
        toko.addBag(pouch);
        toko.addBag(bingkaiFoto);
        toko.addBag(canvas);

        toko.editAtk("A003", new Atk("A003", "Alat Tulis Kantor", "Sticky Note", 7));

        toko.editBag("C004", new Bag("C004", "Tas", "Totebag", 4));

        toko.remove("A002");

        toko.remove("C003");

        toko.displayAtk();

        toko.displayBag();
    }
}
