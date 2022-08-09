/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaheranca;

/**
 *
 * @author luisg
 */
public class Funcionario extends Pessoa {
    //atributos
    private String setor;
    private boolean trabalhando;
    
    //metodos
    public void mudarTrabalho(){
        this.trabalhando = ! this.trabalhando; // "!" <- inverso 
        
    }
    
    //getters and setters
    public String getSetor(){
        return setor;
    }
    public void setSetor(String setor){
        this.setor = setor;
    }
    
    public boolean setTrabalhando(){
        return trabalhando;
    }
    public void setTrabalhando(boolean trabalhando){
        this.trabalhando = trabalhando;
    }

   
}
