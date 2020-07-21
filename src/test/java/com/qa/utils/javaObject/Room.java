package com.qa.utils.javaObject;

public class Room {
    int roomNumber;
    int adutls;
    int child;

    public Room( int adutls, int child) {
        this.adutls = adutls;
        this.child = child;
    }

    public int getAdutls() {
        return adutls;
    }

    public void setAdutls(int adutls) {
        this.adutls = adutls;
    }

    public int getChild() {
        return child;
    }

    public void setChild(int child) {
        this.child = child;
    }
}
