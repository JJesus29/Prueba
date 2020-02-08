
package Modelo;

public class Modelo {
    private int numeroUno;
    private int numeroDos;
    private int Resultado;

    public int getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroUno(int numeroUno) {
        this.numeroUno = numeroUno;
    }

    public int getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(int numeroDos) {
        this.numeroDos = numeroDos;
    }

    public int getResultado() {
        return Resultado;
    }

    public void setResultado(int Resultado) {
        this.Resultado = Resultado;
    }
    
    public int Multiplicar (){
        this.Resultado = this.numeroUno * this.numeroDos;
        return this.Resultado;
    }
}
