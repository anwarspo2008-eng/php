public class client impliments comparable,clonable{
    private int num;
    private String emain,nom;


    public client (int num,String email ,String nom)throws NuminvalideException{
        if (num <= 0){
            throw new NuminvalideException("le nombre est invalide");
        }
        else{
            this.num = num;
            this.email = email;
            this.nom  = nom; 
        }
   }
   @Overide
   public boolean equals(Object o)
   {
        client c = client(o);
        return this.num == c.num;
   }
   @Overide 
   public string toString(){
        return "num: " +nom+ ", email:" +email+ ",nom:" +nom; 
   }
   @Overide 
   public CompareTo(Object obj){
        client c = client(obj);
        return Integer.compare(this.num ,c.num);
   }
   
}

class NuminvalideException extends Exception {
    public NuminvalideException(String message) {
        super(message);
    }
}