/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaheranca;

/**
 *
 * @author luisg
 */
public class Professor extends Pessoa {
    //atributos
    private String especialidade;
    private float salario;
    
    public void ReceberAum(float aum){
    this.salario = this.salario + aum;
    }
    
    //getters and setters
    public String getEspecilidade(){
        return especialidade;
    }
    public void setEspecilidade(String especialidade){
        this.especialidade = especialidade;
    }
    
    public float getSalario(){
        return salario;
    }
    public void setSalario(float salario){
        this.salario = salario;
    }
            
                       
            
            
            
}
