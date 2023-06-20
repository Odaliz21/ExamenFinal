package ClasesObjeto;

public class Pago {
    private String Nombre;
    private float Matricula;
    private float PagoTotal;
    private float Marzo;
    private float Abril;
    private float Mayo;
    private float Junio;
    private float Julio;
    private float Agosto;
    private float Septiembre;                    
    private float Octubre;   
    private float Noviembre;
    private float Diciembre;
    
 public Pago(String Nombre, float Matricula, float PagoTotal, float Marzo, float Abril ,float Mayo,float Junio, float Julio ,float Agosto,float Septiembre, float Octubre ,float Noviembre, float Diciembre) {
      
      this.Matricula = Matricula;
       this.PagoTotal = PagoTotal;
      this. Marzo = Marzo;
       this. Abril = Abril;
      this. Mayo = Mayo;
       this. Junio = Junio;
     this. Julio = Julio;
      this. Agosto= Agosto;
    this. Septiembre = Septiembre;                    
       this.Octubre = Octubre;   
     this.Noviembre = Noviembre;
     this.Diciembre = Diciembre;
    }

    public float getMatricula() {
        return Matricula;
    }

    public void setMatricula(float Matricula) {
        this.Matricula = Matricula;
    }

    public float getPagoTotal() {
        return PagoTotal;
    }

    public void setPagoTotal(float PagoTotal) {
        this.PagoTotal = PagoTotal;
    } 
    
     public float getMarzo() {
        return Marzo;
    }

    public void setMarzo(float Marzo) {
        this.Marzo = Marzo;
    }
    
        public float getAbril() {
        return Abril;
    }

    public void setAbril(float Abril) {
        this.Abril = Abril;
    }
           public float getMayo() {
        return Mayo;
    }

    public void setMayo(float Mayo) {
        this.Mayo =Mayo;
    }
    
          public float getJunio() {
        return Junio;
    }

    public void setJunio(float Junio) {
        this.Junio =Junio;
    }
    
          public float getJulio() {
        return Julio;
    }

    public void setJulio(float Julio) {
        this.Julio =Julio;
    }
            public float getAgosto() {
        return Agosto;
    }

    public void setAgosto(float Agosto) {
        this.Agosto=Agosto;
    }
             public float getSeptiembre() {
        return Septiembre;
    }

    public void setSeptiembre(float Septiembre) {
        this.Septiembre=Septiembre;
    }
            public float getOctubre() {
        return Octubre;
    }

    public void setOctubre(float Octubre) {
        this.Octubre=Octubre;
    }
             public float getNoviembre() {
        return Noviembre;
    }

    public void setNoviembre(float Noviembre) {
        this.Noviembre=Noviembre;
    }
             public float getDiciembre() {
        return Diciembre;
    }

    public void setDiciembre(float Diciembre) {
        this.Diciembre=Diciembre;
    }

}
