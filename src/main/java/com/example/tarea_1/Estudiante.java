package com.example.tarea_1;

/**
 * Se crea la clase padre estudiante, se observa el uso de clases.
 */
public class Estudiante {

    /**
     * Se crean los atributos de la clase estudiante.
     */
    private int carnet;
    private String Nombre_Apellidos;
    private String Correo;
    private int telefono;
    private String Nickname;
    private String TipoEstudiante;
    private Double NotaExamenes;
    private Double NotaQuices;
    private Double NotaTareas;
    private Double NotaP1;
    private Double NotaP2;
    private Double NotaP3;

    /**
     * Se define cada parametro de la clase para utilizarlos sin necesidad de definir en futuras clases hijas
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
    public Estudiante(int carnet, String Nombre_Apellidos, String Correo , int telefono, String Nickname, String TipoEstudiante,
                      Double NotaExamenes, Double NotaQuices, Double NotaTareas, Double NotaP1, Double NotaP2, Double NotaP3) {
        this.carnet = carnet;
        this.Nombre_Apellidos = Nombre_Apellidos;
        this.Correo = Correo;
        this.telefono = telefono;
        this.Nickname = Nickname;
        this.TipoEstudiante = TipoEstudiante;
        this.NotaExamenes = NotaExamenes;
        this.NotaQuices = NotaQuices;
        this.NotaTareas = NotaTareas;
        this.NotaP1 = NotaP1;
        this.NotaP2 = NotaP2;
        this.NotaP3 = NotaP3;
    }

    /**
     * Definicion de metodos de la clase padre, para poder retornar los datos asignados a cada estudiante.
     * @return
     */
    public int getCarnet() {
        return carnet;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getNombre_Apellidos() {
        return Nombre_Apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getNickname() {
        return Nickname;
    }

    public String getTipoEstudiante() {
        return TipoEstudiante;
    }

    public Double getNotaExamenes() {
        return NotaExamenes;
    }

    public Double getNotaQuices() {
        return NotaQuices;
    }

    public Double getNotaTareas() {
        return NotaTareas;
    }

    public Double getNotaP1() {
        return NotaP1;
    }

    public Double getNotaP2() {
        return NotaP2;
    }

    public Double getNotaP3() {
        return NotaP3;
    }

}
