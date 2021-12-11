package jardimdeflores;

public class Flor {
    Petala petala1;
    Petala petala2;
    
    public void setPetala1(Petala petala) {
        this.petala1 = petala;        
    }
    
    /*public boolean temPetala1(){
        if(petala1 == null){
            return false;
        }    
            return true;
    }*/
    
    public Petala getPetala1(){
        return petala1;
    }
    
     public void setPetala2(Petala petala) {
        this.petala2 = petala;        
    }
    
    /*public boolean temPetala2(){
        if(petala2 == null){
            return false;
        }    
            return true;
    }*/
    public Petala getPetala2(){
        return petala2;
    }
}
