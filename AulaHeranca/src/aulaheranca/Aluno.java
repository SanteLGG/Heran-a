/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaheranca;

/**
 *
 * @author luisg
 */
public class Aluno extends Pessoa{
    //atributos
    private int matri;
    private String curso;
    
    public void cancelarMatri(){
        System.out.println("Matricula será cancelada");
    }
    
    //getters and setters
    public int getMatri(){
        return matri;
    }
    public void setMatri(int matri){
        this.matri = matri;
    }
    
    public String curso(){
        return curso;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
}
