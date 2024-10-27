package Iphone;

public class ReprodutorMusical extends Tela{

    private String nomeMusica;
    private Boolean tocando;


    public void tocar(){
        tocando = true;
        System.out.println("Tocando música: " + this.getNomeMusica());
    }

    public void pausar(){
        tocando = false;
        System.out.println("Reprodução pausada!");
    }

    public void selecionarMusica(String p){
        System.out.println("iniciando reprodução da música: " + this.getNomeMusica());
        if (tocando == false){
            tocando = true;
        }
    }



    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public Boolean getTocando() {
        return tocando;
    }

    public void setTocando(Boolean tocando) {
        this.tocando = tocando;
    }


 
}
