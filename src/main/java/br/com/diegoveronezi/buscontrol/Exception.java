package br.com.diegoveronezi.buscontrol;

public class Exception extends RuntimeException{
    private String msg;

    public Exception(String msg){
        super(msg);
        this.msg = msg;
    }

    public String imprimirMsgErro(){
        return msg;
    }

}
