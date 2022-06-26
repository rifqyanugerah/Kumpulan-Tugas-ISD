package com.tugas2;

import java.util.ArrayList;
import java.util.Collections;

public class TokoAbc {
    private ArrayList<Atk> listAtk = new ArrayList<>();
    private ArrayList<Bag> listBag = new ArrayList<>();

    public void addAtk(Atk atk) {
        listAtk.add(atk);
        Collections.sort(listAtk);
    }

    public void addBag(Bag bag) {
        listBag.add(bag);
        Collections.sort(listBag);
    }

    public void remove(String code) {
        if (code.contains("A") || code.contains("B")) {
            for (Atk atk : listAtk) {
                if (atk.getKdBarang().equals(code)) {
                    listAtk.remove(atk);
                    return;
                }
            }
        } else if (code.contains("C")) {
            for (Bag bag : listBag) {
                if (bag.getKdBarang().equals(code)) {
                    listBag.remove(bag);
                    return;
                }
            }
        }
    }

    public void editAtk(String code, Atk newAtk) {
        for (int i = 0; i < listAtk.size(); i++) {
            if (listAtk.get(i).getKdBarang().equals(code)) {
                listAtk.set(i, newAtk);
            }
        }
    }

    public void editBag(String code, Bag newBag) {
        for (int i = 0; i < listBag.size(); i++) {
            if (listBag.get(i).getKdBarang().equals(code)) {
                listBag.set(i, newBag);
            }
        }
    }

    public void displayAtk() {
        for (Atk atk : listAtk) {
            System.out.println(atk);
        }
    }

    public void displayBag() {
        for (Bag bag : listBag) {
            System.out.println(bag);
        }
    }
}