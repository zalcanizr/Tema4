package com.cice.empresa;

public class Empleado {


    private double  salario;
    private String  nombre;
    private String  fechaNacimiento;


    //constructores


    public Empleado() {
    }


    public Empleado(double salario, String nombre, String fechaNacimiento) {
        this.salario = salario;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }






    //getter y setter
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


}
