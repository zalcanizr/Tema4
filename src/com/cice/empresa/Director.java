package com.cice.empresa;

public class Director  extends  Gerente{

    private String matricula;



    public Director(double salario, String nombre, String fechaNacimiento, String departamento,String matricula) {
        super(salario, nombre, fechaNacimiento, departamento);
        this.matricula=matricula;
        this.incrementarSalario();

    }


    public String getCocheEmpresa() {
        return matricula;
    }

    public void setCocheEmpresa(String matricula) {
        this.matricula = matricula;
    }

    @Override
    protected void incrementarSalario(){
        setSalario(getSalario()*1.10+100);
    }
}
