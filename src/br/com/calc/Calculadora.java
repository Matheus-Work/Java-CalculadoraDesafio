package br.com.calc;

public class Calculadora {

    private double resultado = 0;

    public Calculadora() {
        this.resultado = resultado;
    }
    public void getSomar(double... numeros){
        for (int i =0; i < numeros.length;i++) {
            this.resultado = this.resultado + numeros[i];
        }
        System.out.println("\nA soma desses números é: " + this.resultado);
    }
    public void getSubtrair(double... numeros){
        int a = numeros.length;
        if(a==1){
            this.resultado = numeros[0];
        }
        if(a==2){
            this.resultado= numeros[0]-numeros[1];
        }
        if(a==3){
            this.resultado= numeros[0]-numeros[1]-numeros[2];
        }
        if(a==4){
            this.resultado= numeros[0]-numeros[1]-numeros[2]-numeros[3];
        }
        System.out.println("\nA subtração desses números é: " + this.resultado);
    }
    public void getDividir(double... numeros){
        int a = numeros.length;
        if(a==1){
            this.resultado = numeros[0];
        }
        if(a==2){
            this.resultado= numeros[0]/numeros[1];
        }
        if(a==3){
            this.resultado= numeros[0]/numeros[1]/numeros[2];
        }
        if(a==4){
            this.resultado= numeros[0]/numeros[1]/numeros[2]/numeros[3];
        }
        System.out.println("\nA divisão desses números é: " + this.resultado);
    }
    public void getMultiplicar(double... numeros){
        int a = numeros.length;
            if(a==1){
                    this.resultado = numeros[0];
            }
            if(a==2){
                this.resultado= numeros[0]*numeros[1];
            }
             if(a==3){
                this.resultado= numeros[0]*numeros[1]*numeros[2];
            }
             if(a==4){
                this.resultado= numeros[0]*numeros[1]*numeros[2]*numeros[3];
            }
             if(a==5){
                this.resultado= numeros[0]*numeros[1]*numeros[2]*numeros[3]*numeros[4];
            }

        System.out.println("\nA multiplicação desses números é: " + this.resultado);
    }


}