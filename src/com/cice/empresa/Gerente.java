package com.cice.empresa;

public class Gerente extends  Empleado{

    private String departamento;


    public Gerente(double salario, String nombre, String fechaNacimiento, String departamento) {
        super(salario, nombre, fechaNacimiento);
        this.departamento = departamento;
        this.incrementarSalario(1.05);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double incrementarSalario(double incremento){
        double salarioIncrementado= this.getSalario()*incremento;
        this.setSalario(salarioIncrementado);
        return salarioIncrementado;
    }

    public void incrementarSalarioOpcionB(double salario){
        this.setSalario(salario*1.05);
    }


}
