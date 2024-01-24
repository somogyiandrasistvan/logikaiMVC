package main;

import modell.Lada;
import nezett.CuiNezet;

public class LogikaiProgram {
    
    public static void main(String[] args) {
        CuiNezet nezet = new CuiNezet();
        nezet.feladatMegjelenito("Csak 1 igaz!");
        Lada l1 = new Lada("arany", "en vagyok a kincs!", false);
        Lada l2 = new Lada("ezüst", "nem, én vagyok a kincs!", true);
        Lada l3 = new Lada("bronz", "az arany hazudik!", false);
        Lada[] ladak = {l1, l2, l3};
        for (Lada lada : ladak) {
            String anyag = lada.getAnyag() + ": ";
            String felirat = lada.getFelirat();
            nezet.feladatMegjelenito(anyag + felirat);
        }
        
        int valasztas = nezet.valasztas("melyik?");
        Lada lada = ladak[valasztas];
        String str = "";
        if (lada.isKincs()) {
            str = "talált, a kincset a(z) ";
        } else {
            str = "nem talált, a kincset nem a(z) ";
        }
        nezet.eredmenyMegjelenito(str + lada.getAnyag() + "rejti");
    }
   
  
}
