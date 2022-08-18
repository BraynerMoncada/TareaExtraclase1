package com.example.tarea_1;

/**
 * @author Brayner Moncada
 * Se crea una clase hija(EstudianteTipoB) basandose en una clase padre(Estudiante), por lo que se puede evidenciar el
 * uso de herencia.
 * */
public class EstudianteTipoB extends Estudiante {


    /**
     * Se crea el método constructor con todos los parametros heredados de la clase padre.
     * @param carnet
     * @param Nombre_Apellidos
     * @param Correo
     * @param telefono
     * @param Nickname
     * @param TipoEstudiante
     * @param NotaExamenes
     * @param NotaQuices
     * @param NotaTareas
     * @param NotaP1
     * @param NotaP2
     * @param NotaP3
     */
    public EstudianteTipoB(int carnet, String Nombre_Apellidos, String Correo , int telefono,String Nickname,String TipoEstudiante,
                           Double NotaExamenes, Double NotaQuices, Double NotaTareas, Double NotaP1, Double NotaP2, Double NotaP3){
        super(carnet,Nombre_Apellidos,Correo,telefono,Nickname,TipoEstudiante,NotaExamenes,NotaQuices,NotaTareas, NotaP1,NotaP2,NotaP3);

    }

    /**
     * Se crea un metodo para mostrar todos los datos generados de cada estudiante.
     */
    public void mostrarDatos2(){
        System.out.println("Carnet: " + getCarnet() +
                "\nNombre: " + getNombre_Apellidos() +
                "\nCorreo: " + getCorreo() +
                "\nTelefono: " + getTelefono() +
                "\nNickName: " + getNickname() +
                "\nTipoEstudiante: " + getTipoEstudiante() +
                "\nNotaExamenes: " + getNotaExamenes() +
                "\nNotaQuices: " + getNotaQuices() +
                "\nNotaTareas: " + getNotaTareas() +
                "\nNota Proyecto 1: " + getNotaP1() +
                "\nNota Proyecto 2: " + getNotaP2() +
                "\nNota Proyecto 3: " + getNotaP3());

    }
}
