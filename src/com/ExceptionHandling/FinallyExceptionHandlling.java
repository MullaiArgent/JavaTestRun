package com.ExceptionHandling;
class Server{
    private static boolean connection = false;
    public void isConnectionIsOpen(){
        if (connection){
            System.out.println("Connection is Open");
        }else{
            System.out.println("Connection is Close");
        }
    }
    public void openTheConnection(){
        connection = true;
    }
    public void closeTheConnection(){
        connection = false;
    }
}
public class FinallyExceptionHandlling {
    public static void main(String[] args) {
        Server server = new Server();
        server.isConnectionIsOpen();
        try{
            server.openTheConnection();
            int var = 23; // works
            System.out.println("Var= "+var+" is declared and the connection is Opened"); // works
            server.closeTheConnection();
        }catch (Exception e){
            System.out.println("Something went wrong\nFailed to open the connection");
        }finally {
            server.closeTheConnection();
        }

        System.out.println("\nMiddle Report");
        server.isConnectionIsOpen();

        try{
            server.openTheConnection();
            int e = 10/0; // works
            server.closeTheConnection();
        }catch (Exception e){
            System.out.println("Failed to Close the Connection");
        }finally {
            server.closeTheConnection();
        }

        System.out.println("\nFinal Report");
        server.isConnectionIsOpen();
    }
}
