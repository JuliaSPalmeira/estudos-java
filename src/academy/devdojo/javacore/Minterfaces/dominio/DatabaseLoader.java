package academy.devdojo.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados");
    }

    @Override
    public void checkPermission() {
        DataLoader.super.checkPermission();
        System.out.println("checking permission in a database");
    }

   public static void retriveMaxDataSize(){
       System.out.println("Dentro do retriveMaxDataSize na classe datatbaseloader");
   }
}
