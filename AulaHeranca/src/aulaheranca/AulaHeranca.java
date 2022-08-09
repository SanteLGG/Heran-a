/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulaheranca;

/**
 *
 * @author luisg
 */
public class AulaHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // programa principal
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Sante");
        p1.setIdade(22);
        p1.setSexo("M");
        
        p2.setNome("Adriana");
        p2.setIdade(23);
        p2.setSexo("F");
        p2.setCurso("Arquitetura");
        p2.setMatri(1234);
        
        p3.setNome("Paulo");
        p3.setIdade(25);
        p3.setSexo("M");
        p3.setEspecilidade("T.I.");
        p3.setSalario(1235.6f);
        
        p4.setNome("Leo");
        p4.setIdade(22);
        p4.setSexo("M");
        p4.setSetor("FrontEnd");
        p4.setTrabalhando(true);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
    
}
