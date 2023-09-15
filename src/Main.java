// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[]args){
        //A) acelerador-->B) motor
//motor es observadr
        //acelerador es observado(sujeto)
        //motor observa --> acelerador observado y el sujeto(observavble)
        motor v6 = new motor();
        acelerador x = new acelerador();
        x.enlazarobervador(v6);
        x.pisaracelerador();
}
}