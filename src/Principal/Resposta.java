/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author natha
 */
public class Resposta {
    public String textoResposta;
    public Boolean cadeiaAceita;

    public Resposta(String textoResposta, Boolean cadeiaAceita) {
        this.textoResposta = textoResposta;
        this.cadeiaAceita = cadeiaAceita;
    }

    @Override
    public String toString() {
        return "Resposta{" + "textoResposta=" + textoResposta + ", cadeiaAceita=" + cadeiaAceita + '}';
    }
}
