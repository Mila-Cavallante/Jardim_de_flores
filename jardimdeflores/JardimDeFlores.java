//System.out.println("Aula do dia 25/08!");
package jardimdeflores;

/**
 *
 * @author camil
 */
public class JardimDeFlores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Petalas
        Petala p1=new Petala();
        p1.setCorPetala("Amarelo");
              
        Petala p2=new Petala();
        p2.setCorPetala("Vemelho");
        
        Petala p3=new Petala();
        p3.setCorPetala("Azul");
       
        Petala p4=new Petala();
        p4.setCorPetala("Roxo");
        
        Petala p5=new Petala();
        p5.setCorPetala("Verde");
       
        Petala p6=new Petala();
        p6.setCorPetala("Branco");
        
        Petala p7=new Petala();
        p7.setCorPetala("Preto");
       
        Petala p8=new Petala();
        p8.setCorPetala("Rosa");
       
        //flores
        Flor margarida=new Flor();
        margarida.setPetala1(p1);
        margarida.setPetala2(p2);
        
        Flor girassol = new Flor();
        girassol.setPetala1(p3);
        girassol.setPetala2(p4);
        
        Flor tulipa = new Flor();
        tulipa.setPetala1(p5);
        tulipa.setPetala2(p6);
        
        Flor hortencia = new Flor();
        hortencia.setPetala1(p7);
        hortencia.setPetala2(p8);
        
        //jardins
        Jardim jardim_leste = new Jardim();
        jardim_leste.setFlor1(margarida);
        jardim_leste.setFlor2(girassol);

        Jardim jardim_oeste = new Jardim();
        jardim_oeste.setFlor1(tulipa);
        jardim_oeste.setFlor2(hortencia);
        //Petala petalaAtual = margarida.getPetala1();
        
        //praça
        Pracinha praca_central = new Pracinha();
        praca_central.setjardim1(jardim_leste);
        praca_central.setjardim2(jardim_oeste);        
         
        
        //Apresentação
        System.out.println("Na praça Central existe o jardim leste com a flor Margarida na cor " 
                + praca_central.getjardim1().getflor1().getPetala1().getCorPetala() + " e na cor " 
                +praca_central.getjardim1().getflor1().getPetala2().getCorPetala()
                );
        System.out.println("Na praça Central existe o jardim leste com a flor Girassol na cor " 
                + praca_central.getjardim1().getflor2().getPetala1().getCorPetala() + " e na cor " 
                + praca_central.getjardim1().getflor2().getPetala2().getCorPetala());
        
        System.out.println("Na praça Central existe o jardim oeste com a flor Tulipa na cor " 
                + praca_central.getjardim2().getflor1().getPetala1().getCorPetala() + " e na cor " 
                + praca_central.getjardim2().getflor1().getPetala2().getCorPetala());
        
        System.out.println("Na praça Central existe o jardim oeste com a flor Hortência na cor " 
                + praca_central.getjardim2().getflor2().getPetala1().getCorPetala() + " e na cor " 
                + praca_central.getjardim2().getflor2().getPetala2().getCorPetala());
       
    }//FIM MAIN  
    
}//Fim CLASS PRINCIPAL 
