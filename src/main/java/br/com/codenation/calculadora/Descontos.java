package br.com.codenation.calculadora;


public class Descontos {

    private Double DescontoInssSalarioBaixo = 0.08,
            DescontoInssSalarioMedio = 0.09,
            DescontoInssSalarioAlto = 0.11,
            DescontoIrrfSalarioMedio = 0.075,
            DescontoIrrfSalarioAlto = 0.15;

    public double calcularIrrf(Double salario)



    { if (salario < 3000.00) { salario=salario;}
        else if ((salario > 3000.00) && (salario < 6000.00)) {salario=AplicaDesconto(salario,getDescontoIrrfSalarioMedio());}
        else {salario=AplicaDesconto(salario, getDescontoIrrfSalarioAlto());}
        return salario;}
    public double calcularInss(double salario)
    {if (salario<= 1500.00) {salario=AplicaDesconto(salario,getDescontoInssSalarioBaixo());}
    else if ((salario>1500.00) && (salario<= 4000.00)) {salario=AplicaDesconto(salario, getDescontoInssSalarioMedio());}
        else {salario=AplicaDesconto(salario, getDescontoInssSalarioAlto());}
        return salario;}
    private double AplicaDesconto(Double salario, Double desconto) {
        salario=(salario - (desconto * salario));
        return salario;}
    public Double getDescontoInssSalarioBaixo() {
        return DescontoInssSalarioBaixo;}

    public void setDescontoInssSalarioBaixo(Double descontoInssSalarioBaixo) {
        DescontoInssSalarioBaixo = descontoInssSalarioBaixo;
    }

    public Double getDescontoInssSalarioMedio() {
        return DescontoInssSalarioMedio;
    }

    public void setDescontoInssSalarioMedio(Double descontoInssSalarioMedio) {
        DescontoInssSalarioMedio = descontoInssSalarioMedio;
    }

    public Double getDescontoInssSalarioAlto() {
        return DescontoInssSalarioAlto;
    }

    public void setDescontoInssSalarioAlto(Double descontoInssSalarioAlto) {
        DescontoInssSalarioAlto = descontoInssSalarioAlto;
    }

    public Double getDescontoIrrfSalarioMedio() {
        return DescontoIrrfSalarioMedio;
    }

    public void setDescontoIrrfSalarioMedio(Double descontoIrrfSalarioMedio) {
        DescontoIrrfSalarioMedio = descontoIrrfSalarioMedio;
    }

    public Double getDescontoIrrfSalarioAlto() {
        return DescontoIrrfSalarioAlto;
    }

    public void setDescontoIrrfSalarioAlto(Double descontoIrrfSalarioAlto) {
        DescontoIrrfSalarioAlto = descontoIrrfSalarioAlto;
    }
}

