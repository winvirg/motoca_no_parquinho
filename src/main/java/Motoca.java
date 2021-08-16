public class Motoca {
    
	private int potencia;
	private int tempo;
	private int idade;
	private String nome="";
	private boolean temMotorista=false;
	private String buzina="";
	
    public Motoca(int potencia){
    	this.potencia = potencia;
    }

    public Pessoa getPessoa() {
        return null;
    }

    public int getTempo() {
        return tempo;
    }

    public int getPotencia() {
        return potencia;
    }

    public boolean subir(Pessoa pessoa){
        if(temMotorista) {
        	return false;
        }else {
        	temMotorista=true;
        	this.nome=pessoa.getNome();
        	this.idade=pessoa.getIdade();
        	return true;
        }
    }

    public boolean descer(){
        if(!temMotorista) {
        	return false;
        }else {
        	this.tempo=0;
        	this.idade=0;
        	this.nome="";
        	temMotorista=false;
        	return true;
        }
    }

    public void colocarTempo(int tempo){
    	this.tempo+=tempo;
    }

    public boolean dirigir(int tempo){
            if(temMotorista) {
	    		if(this.idade<11&&this.tempo>0&&this.tempo>tempo) {
		            this.tempo-=tempo;
		           	return true;
	    		}else {
	    			this.tempo=0;
	    			System.out.println("entrou");
	    			return false;
	            }
            }else return false;
    }

    public String buzinar(){
    	if(!temMotorista) {
    		buzina="";
    		return buzina;
    	}else {
	    	buzina+="P";
	        for(int i = 0; i< potencia;i++) {
	        	buzina+="e";
	        }
	        buzina+="m";
	        return buzina;
    	}
    }
}
