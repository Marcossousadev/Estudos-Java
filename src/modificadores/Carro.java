package modificadores;
// não posso declarar modificador de acesso private para a classe raiz do arquivo java
// mas se eu não declarar a o modificador de acesso para a classe
// ele aplica default por padrão
// todo mundo que tiver dentro do mesmo pacote dessa classe, vai conseguir acessa-lá, mas quem tiver fora do pacote, não vai poder acessa-lá
 public class Carro {

     public static void main(String[] args) {
         System.out.println("teste");
     }
    // atributos
    String modelo;
    public Carro(String modelo) {
        this.modelo = modelo; // o this acessa a instância desse objeto
    }
    // métodos
    // método acesível em qualquer instância, pois é público
    public String acelerar() {
     return "Acelerando " + this.modelo;
    }
    protected void buzinar() {
        System.out.println("tuutuu...");
    }
}


 class Moto {
     // classe acessível apenas dentro desse package
     String modelo;
     Boolean isGasoline;
     public Moto (String modelo, Boolean isGasoline) {
         this.modelo = modelo;
         this.isGasoline = isGasoline;
     }
     private void acelerar() {
         System.out.println("Acelerando...");
     }

     public void can_speed() {
         if(isGasoline){
             this.acelerar();
         }
         else {
             System.out.println("Não há gasolina, não se pode acelerar!");
         }
     }

     protected void buzinar(){
         System.out.println("biiiiiiiiiii...");
     }
}

class Rodas {
    public Rodas() {
         Moto moto = new Moto("Cb300f", true);
        //  moto.acelerar(); // não consigo chamar esse método, pois ele é private, só pode ser acessado dentro da classe
         moto.can_speed(); // exemplo de que uma classe com um método privado pode executar dentro dela esse método
         moto.buzinar();   // consigo acessar, pois é protected, no mesmo arquivo, consigo acessa-lá
    }
}

