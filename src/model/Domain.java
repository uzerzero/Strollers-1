package model;

/**
 * Created by cactus on 21/02/14.
 */
public class Domain {
    private float _x, _y, _w, _h;

    public Domain(float x, float y, float w, float h) {
        _x = x;
        _y = y;
        _w = w;
        _h = h;
    }

    boolean isOutOfDomain(Vehicule v) {
        return v.get_posX() < _x || v.get_posX() > _x + _w||
                v.get_posY() < _y || v.get_posY() > _y + _h;
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
}
