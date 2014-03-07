package model;

import java.util.ArrayList;

/**
 * Created by cactus on 21/02/14.
 */
public class Domain {
    private float _x, _y, _w, _h;
    private ArrayList<Building> _buildings;

    public Domain(float x, float y, float w, float h) {
        _x = x;
        _y = y;
        _w = w;
        _h = h;

        _buildings = new ArrayList<Building>();
    }

    boolean isOutOfDomain(Vehicule v) {
        return v.get_posX() < _x || v.get_posX() > _x + _w||
                v.get_posY() < _y || v.get_posY() > _y + _h;
    }

    public void addBuilding(Building building) {
        _buildings.add(building);
    }

    void replaceVehiculeInside(Vehicule v) {
        if (v.get_posX() < _x)
            v.set_posX(_x);
        else if (v.get_posX() > _x + _w)
            v.set_posX(_x + _w);
        if (v.get_posY() < _y)
            v.set_posY(_y);
        else if (v.get_posY() > _y + _h)
            v.set_posY(_y + _h);

    }

    boolean isCollisionWithOneBuilding(Building b, Vehicule v) {
        return !(v.get_posX() < b.get_posX() || v.get_posX() > b.get_posX() + b.get_width() ||
                v.get_posY() < b.get_posY() || v.get_posY() > b.get_posY() + b.get_height());
    }

    boolean isCollisionWithBuildings(Vehicule v) {
        for (Building building : _buildings) {
            if (isCollisionWithOneBuilding(building, v))
                return true;
        }

        return false;
    }
}
