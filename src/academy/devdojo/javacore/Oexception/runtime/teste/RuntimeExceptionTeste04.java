package academy.devdojo.javacore.Oexception.runtime.teste;

public class RuntimeExceptionTeste03 {
    public static void main(String[] args) {
        abreConexao();
    }
       private static String abreConexao() {
           try {
               System.out.println("Abrindo Arquivo");
               System.out.println("escrevendo dados no arquivo");
               return "conexão aberta";
           } catch (Exception e) {
               e.printStackTrace();
           } finally {
               System.out.println("fechando recurso liberado pelo so");
           }
           return null;
       }

    private static void abreConexao2() {
        try {
            System.out.println("Abrindo Arquivo");
            System.out.println("escrevendo dados no arquivo");
        } finally {
            System.out.println("fechando recurso liberado pelo so");
        }
        // caso especifico n da pra fazer nada com a exeção e tratar de alguma forma e fechar a conexão

    }
}
