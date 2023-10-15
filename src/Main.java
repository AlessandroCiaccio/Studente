public class Main {
    public static void main(String[] args){
        Studente studente1=new Studente("Alessandro","Scrofani", 1);

        studente1.setNome("Francesco");
        studente1.setCognome("Viscuso");
        studente1.setIdentificativo(4);

        System.out.println(studente1.getNome());
        System.out.println(studente1.getCognome());
        System.out.println(studente1.getIdentificativo());

        System.out.println(studente1);
    }
}