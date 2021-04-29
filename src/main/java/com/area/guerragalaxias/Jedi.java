package com.area.guerragalaxias;

/**
 *
 * @author Ordinador
 */
public class Jedi {
    //El ámbit per defecte en java es de package
    String nombre;
    String colorSableLuz;
    
    //ambit nom_classe (parametres)
    //En el constructor inicialitzem els atributs del objecte del tipu Jedi
    //Aquest constructor es cridarà quan es realitza un new de la classe Jedi
    public Jedi(String nombre, String colorSableLuz){
        this.nombre = nombre;
        this.colorSableLuz = colorSableLuz;
    }
    
    //Method d'abjecte
    public void mostrar(){
        System.out.println("Soy un Jedi, mi nombre es " + this.nombre +
                " y el color de mi sable de luz es " + this.colorSableLuz);
    }
    
}
