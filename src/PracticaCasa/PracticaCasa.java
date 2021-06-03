package PracticaCasa;

import Entidades.Casa;

public class PracticaCasa {

    public static void main(String[] args) {
        Casa casa = new Casa();
        casa.setCantidadBanos(3);
        casa.setCantidadCuartos(4);
        casa.setCuantosCarrosCochera(2);
        casa.setMtsCuadrados(250);
        casa.setUbicacion("Heredia");
        System.out.println(casa.toString());
        
        Casa casa1 = new Casa();
        casa1.setCantidadBanos(1);
        casa1.setCantidadCuartos(2);
        casa1.setCuantosCarrosCochera(0);
        casa1.setMtsCuadrados(75);
        casa1.setUbicacion("SJ");
        System.out.println(casa1.toString());
        
        Casa casa2 = new Casa();
        casa2.setCantidadBanos(2);
        casa2.setCantidadCuartos(3);
        casa2.setCuantosCarrosCochera(1);
        casa2.setMtsCuadrados(180);
        casa2.setUbicacion("Alajuela");
        System.out.println(casa2.toString());
        
        Casa casa3 = new Casa();
        casa3.setCantidadBanos(2);
        casa3.setCantidadCuartos(5);
        casa3.setCuantosCarrosCochera(3);
        casa3.setMtsCuadrados(210);
        casa3.setUbicacion("Cartago");
        System.out.println(casa3.toString());
    }

}
