package Entidades;

public class Casa {

    private int mtsCuadrados;
    private int cantidadCuartos;
    private int cantidadBanos;
    private String ubicacion;
    private int cuantosCarrosCochera;

    public int getMtsCuadrados() {
        return mtsCuadrados;
    }

    public void setMtsCuadrados(int mtsCuadrados) {
        this.mtsCuadrados = mtsCuadrados;
    }

    public int getCantidadCuartos() {
        return cantidadCuartos;
    }

    public void setCantidadCuartos(int cantidadCuartos) {
        this.cantidadCuartos = cantidadCuartos;
    }

    public int getCantidadBanos() {
        return cantidadBanos;
    }

    public void setCantidadBanos(int cantidadBanos) {
        this.cantidadBanos = cantidadBanos;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCuantosCarrosCochera() {
        return cuantosCarrosCochera;
    }

    public void setCuantosCarrosCochera(int cuantosCarrosCochera) {
        this.cuantosCarrosCochera = cuantosCarrosCochera;
    }

    @Override
    public String toString() {
        return "Esta ubicada en " +ubicacion + "\ntiene un total de " + cantidadBanos + " banos, " + cantidadCuartos + " cuartos, " + mtsCuadrados + " mts2, y posee cochera para" + cuantosCarrosCochera + " autos";
    }
}
