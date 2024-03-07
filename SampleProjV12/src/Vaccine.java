
import com.mysql.jdbc.Blob;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Main
 */
public class Vaccine {
    private int finalID;
    private String finalNAME;
    private String finalADDRESS;
    private String finalCONTACT;
    private String finalAGE;
    private String finalGENDER;
    private String finalDOSE;
    private String finalBRAND;
    private String finalDATE;
   // private Blob finalIMAGE;

    public Vaccine(int finalID, String finalNAME, String finalADDRESS, String finalCONTACT, String finalAGE, String finalGENDER, String finalDOSE, String finalBRAND, String finalDATE/*, Blob finalIMAGE*/) {
        this.finalID = finalID;
        this.finalNAME = finalNAME;
        this.finalADDRESS = finalADDRESS;
        this.finalCONTACT = finalCONTACT;
        this.finalAGE = finalAGE;
        this.finalGENDER = finalGENDER;
        this.finalDOSE = finalDOSE;
        this.finalBRAND = finalBRAND;
        this.finalDATE = finalDATE;
       // this.finalIMAGE = finalIMAGE;
    }

    public int getFinalID() {
        return finalID;
    }

    public void setFinalID(int finalID) {
        this.finalID = finalID;
    }

    public String getFinalNAME() {
        return finalNAME;
    }

    public void setFinalNAME(String finalNAME) {
        this.finalNAME = finalNAME;
    }

    public String getFinalADDRESS() {
        return finalADDRESS;
    }

    public void setFinalADDRESS(String finalADDRESS) {
        this.finalADDRESS = finalADDRESS;
    }

    public String getFinalCONTACT() {
        return finalCONTACT;
    }

    public void setFinalCONTACT(String finalCONTACT) {
        this.finalCONTACT = finalCONTACT;
    }

    public String getFinalAGE() {
        return finalAGE;
    }

    public void setFinalAGE(String finalAGE) {
        this.finalAGE = finalAGE;
    }

    public String getFinalGENDER() {
        return finalGENDER;
    }

    public void setFinalGENDER(String finalGENDER) {
        this.finalGENDER = finalGENDER;
    }

    public String getFinalDOSE() {
        return finalDOSE;
    }

    public void setFinalDOSE(String finalDOSE) {
        this.finalDOSE = finalDOSE;
    }

    public String getFinalBRAND() {
        return finalBRAND;
    }

    public void setFinalBRAND(String finalBRAND) {
        this.finalBRAND = finalBRAND;
    }

    public String getFinalDATE() {
        return finalDATE;
    }

    public void setFinalDATE(String finalDATE) {
        this.finalDATE = finalDATE;
    }

   // public Blob getFinalIMAGE() {
     //   return finalIMAGE;
   // }

   // public void setFinalIMAGE(Blob finalIMAGE) {
      //  this.finalIMAGE = finalIMAGE;
 //  }
    
    
    
}
