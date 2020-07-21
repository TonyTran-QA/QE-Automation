package com.qa.utils.javaObject;

import java.util.GregorianCalendar;

public class RandomInfo {

    public static String randomHo() {
        String[] hoArray = {
                "NGUYEN",
                "TRAN",
                "LE",
                "PHAM",
                "PHAN",
                "VU",
                "DANG",
                "BUI",
                "DO",
                "HO",
                "NGO",
                "DUONG",
                "LY"
        };
        String ho = hoArray[1];
        String randomHo = hoArray[(int) Math.floor(Math.random() * hoArray.length)];
        return randomHo;
    }

    public static String randomTen() {
        String[] tenArray = {
                "LINH LAN",
                "TRUC QUYNH",
                "VAN ANH",
                "TU LINH",
                "NGOC NGA",
                "THU THUY",
                "VAN DAN",
                "MAI ANH",
                "THUY ANH",
                "HA BANG",
                "KHA HAN",
                "LOC NAM",
                "MAI HA",
                "MINH CHAU",
                "MINH NGUYET",
                "MY TAM",
                "NGOC BICH",
                "NGOC DIEP",
                "NGOC MAI",
                "TU QUYNH",
                "KHUYET NGUYET",
                "NHA PHUONG",
                "NHA QUYEN",
                "MY CHI",
                "PHUONG THAO",
                "QUE CHI",
                "QUYNH ANH",
                "QUYNH HUONG",
                "TU ANH",
                "TUE LAM",
                "TUYET BANG",
                "THANH TRUC",
                "THANH VAN",
                "THANH XUAN",
                "THAO CHI",
                "THIEN DAI",
                "THIEN HA",
                "THIEN NO",
                "THU HUONG",
                "THUC CU",
                "THUY CHI",
                "THUY TIEN",
                "TRAM ANH",
                "TRUC CHI",
                "TRUC LINH",
                "GIA BAO",
                "THIEN AN",
                "TRUNG DUNG",
                "HAI DANGg",
                "THANH DAT",
                "MANH HUNG",
                "TUAN KIET",
                "NGUYEN KHAI",
                "ANH KIET",
                "THANH LAM",
                "MINH NHAT",
                "THANH PHONG",
                "TIEN DAT",
                "HOAI BAO",
                "CHI HUY"
        };
        String randomTen = tenArray[(int) Math.floor(Math.random() * tenArray.length)];
        return randomTen;
    }

    public static String randomDOB() {
        GregorianCalendar gc = new GregorianCalendar();

        int year = randBetween(1970, 2000);

        gc.set(gc.YEAR, year);

        int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));

        gc.set(gc.DAY_OF_YEAR, dayOfYear);

        return gc.get(gc.DAY_OF_MONTH) + "-" + (gc.get(gc.MONTH) + 1) + "-" + gc.get(gc.YEAR);
    }

    public static int randBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }
}

