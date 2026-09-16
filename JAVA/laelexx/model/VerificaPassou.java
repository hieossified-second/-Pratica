package model;

public class VerificaPassou{
    public int nota1;
    public int nota2;
    public int nota3;
    
    public String media(int nota1, int nota2, int nota3){
        nota1 = this.nota1;
        nota2 = this.nota2;
        nota3 = this.nota3;

        int resultado = (nota1 + nota2 + nota3) / 3;

        String passou;
        if(resultado >= 6){
            return passou = "Passou" + ;
        }else {
           return passou = "Reprovou";
        }
    }
}
