/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_carlos.sanabria;

/**
 *
 * @author Carlos Sanabria
 */
public class Computadora {
    //atr
    private String Modelo,Tipo_Procesa,TarjetaG,SistemasO;
    private int NumeroS,CapiDisco,TPantalla,Tiempof,CapiBat,DuraBat;
    private boolean Tec=false;
    //Cons
public Computadora(){
    
}
    public Computadora(String Modelo, String Tipo_Procesa, String TarjetaG, String SistemasO, int NumeroS, int CapiDisco, int TPantalla, int Tiempof, int CapiBat, int DuraBat) {
        this.Modelo = Modelo;
        this.Tipo_Procesa = Tipo_Procesa;
        this.TarjetaG = TarjetaG;
        this.SistemasO = SistemasO;
        this.NumeroS = NumeroS;
        this.CapiDisco = CapiDisco;
        this.TPantalla = TPantalla;
        this.Tiempof = Tiempof;
        this.CapiBat = CapiBat;
        this.DuraBat = DuraBat;
    }
     public Computadora(String Modelo, String Tipo_Procesa, String TarjetaG, String SistemasO, int NumeroS, int CapiDisco, int TPantalla, int Tiempof, int CapiBat, int DuraBat,boolean t) {
        this.Modelo = Modelo;
        this.Tipo_Procesa = Tipo_Procesa;
        this.TarjetaG = TarjetaG;
        this.SistemasO = SistemasO;
        this.NumeroS = NumeroS;
        this.CapiDisco = CapiDisco;
        this.TPantalla = TPantalla;
        this.Tiempof = Tiempof;
        this.CapiBat = CapiBat;
        this.DuraBat = DuraBat;
        this.Tec=t;
    }
    //setyget

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getTipo_Procesa() {
        return Tipo_Procesa;
    }

    public void setTipo_Procesa(String Tipo_Procesa) {
        this.Tipo_Procesa = Tipo_Procesa;
    }

    public String getTarjetaG() {
        return TarjetaG;
    }

    public void setTarjetaG(String TarjetaG) {
        this.TarjetaG = TarjetaG;
    }

    public String getSistemasO() {
        return SistemasO;
    }

    public void setSistemasO(String SistemasO) {
        this.SistemasO = SistemasO;
    }

    public int getNumeroS() {
        return NumeroS;
    }

    public void setNumeroS(int NumeroS) {
        this.NumeroS = NumeroS;
    }

    public int getCapiDisco() {
        return CapiDisco;
    }

    public void setCapiDisco(int CapiDisco) {
        this.CapiDisco = CapiDisco;
    }

    public int getTPantalla() {
        return TPantalla;
    }

    public void setTPantalla(int TPantalla) {
        this.TPantalla = TPantalla;
    }

    public int getTiempof() {
        return Tiempof;
    }

    public void setTiempof(int Tiempof) {
        this.Tiempof = Tiempof;
    }

    public int getCapiBat() {
        return CapiBat;
    }

    public void setCapiBat(int CapiBat) {
        this.CapiBat = CapiBat;
    }

    public int getDuraBat() {
        return DuraBat;
    }

    public void setDuraBat(int DuraBat) {
        this.DuraBat = DuraBat;
    }

    public boolean isTec() {
        return Tec;
    }

    public void setTec(boolean Tec) {
        this.Tec = Tec;
    }
    public String returnS0N(){
        String r="";
        if(Tec==true){
            r+="Si";
        }else{
            r+="No";
        }
        return r;
    }

    @Override
    public String toString() {
        return "Modelo:" + Modelo +"\n"+ "Procesdor: " + Tipo_Procesa +"\n"+ "Tarjeta Grafico: " + TarjetaG +"\n"+ "Sistemas Operativo: " + SistemasO +"\n"+ "Numero de Serie: " + NumeroS +"\n"+ "Capacidad de Disco Duro: " + CapiDisco +" GB"+"\n"+ "Tamaño de Pantalla=" + TPantalla +"Pulgadas"+"\n"+ "Tiempo de fabricacion: " + Tiempof +"\n"+ "Capacidad de Bateria: " + CapiBat +" amh"+"\n"+ "Duracion de Bateria: " + DuraBat +" horas"+"\n"+ "Teclado numerico: " +returnS0N()+"\n";
    }
     
    
    
    
}
