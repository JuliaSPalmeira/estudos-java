package academy.devdojo.javacore.Minterfaces.dominio;

public interface DataLoader {
    public static  final int MAX_DATA_SIZE = 10;
    void load();
    default void checkPermission(){
        System.out.println("fazendo checagem de permissões");
    }

    public static void retriveMaxDataSize(){
        System.out.println("Dentro do retriveMaxDataSize na interface");
    }
}
