package com.cice.empresa;

public class Director  extends  Gerente{

    private String matricula;



    public Director(double salario, String nombre, String fechaNacimiento, String departamento,String matricula) {
        super(salario, nombre, fechaNacimiento, departamento);
        this.matricula=matricula;
        this.incrementarSalario(1.10,100);

    }


    public String getCocheEmpresa() {
        return matricula;
    }

    public void setCocheEmpresa(String matricula) {
        this.matricula = matricula;
    }


    public void incrementarSalario(double incremento,double incentivo){
        setSalario(incrementarSalario(incremento)+incentivo);
    }
}
