package Iphone;

public class Tela {

    private float toucheixox, toucheixoy;
    private Boolean clicado;

    public void clicar(){
        if(this.getToucheixox() >= 1.0 && this.getToucheixox() <= 1.5 && getToucheixoy() >= 1.0 && getToucheixoy() <= 1.5){
            System.out.println("Abrindo telefone");
            
        } else if (this.getToucheixox() >= 2.0 && this.getToucheixox() <= 2.5 && getToucheixoy() >= 1.0 && getToucheixoy() <= 1.5){
            System.out.println("Abrindo Navegador de Internet");

        } else if (this.getToucheixox() >= 3.0 && this.getToucheixox() <= 3.5 && getToucheixoy() >= 1.0 && getToucheixoy() <= 1.5){
            System.out.println("Abrindo Reprodutor de Música");
        }
    }


    public float getToucheixox() {
        return toucheixox;
    }


    public void setToucheixox(float toucheixox) {
        this.toucheixox = toucheixox;
    }


    public float getToucheixoy() {
        return toucheixoy;
    }


    public void setToucheixoy(float toucheixoy) {
        this.toucheixoy = toucheixoy;
    }


    public Boolean getClicado() {
        return clicado;
    }


    public void setClicado(Boolean clicado) {
        this.clicado = clicado;
    }

}
