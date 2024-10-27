package Iphone;


public class NavegadorInternet extends Tela{
    private String url;
    private int abas;


    public NavegadorInternet(){
        abas = 1;
    }

    public void exibirPagina(String url){
        System.out.println("Abrindo a página: " + this.getUrl());
    }

    public void adicionarNovaAba(){
        abas++;
        System.out.println("Nova Aba sendo aberta.");
    }

    public void atualizaPagina(){

    }



    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getAbas() {
        return abas;
    }

    public void setAbas(int abas) {
        this.abas = abas;
    }
    



    

}
