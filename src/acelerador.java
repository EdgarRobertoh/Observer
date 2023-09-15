import java.util.ArrayList;

public class acelerador implements sujetoobservable{
    private ArrayList<observador>observadores;
    public acelerador(){
        observadores=new ArrayList<observador>();
    }
    public void pisaracelerador (){
        notificar();
    }
    public void enlazarobervador(observador a){observadores.add(a);};

    @Override
    public void notificar() {
        for (observador a : observadores) {
            a.update();
        }
    }

}
