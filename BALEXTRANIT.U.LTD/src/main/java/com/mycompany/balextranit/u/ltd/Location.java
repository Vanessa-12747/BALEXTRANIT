package com.mycompany.balextranit.u.ltd;

public class Location {
    private int x, y;

    public Location(int x, int y) {
        if (x < 0 || x > 100 || y < 0 || y > 100)
            throw new IllegalArgumentException("Coordinates must be between 0 and 100");
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
