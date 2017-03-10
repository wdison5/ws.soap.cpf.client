/*
 * Projeto criado e mantido pela PRODESP.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.soap.cpf;

/**
 *
 * @author Jose Wdison de Souza <a>wdison@hotmail.com</a>
 */
public class WsSoapCpfClient {
    public static void main(String[] args) {
        try { // Call Web Service Operation
            ws.soap.cpf.WsSoapCpf_Service service = new ws.soap.cpf.WsSoapCpf_Service();
            ws.soap.cpf.WsSoapCpf port = service.getWsSoapCpfPort();
            java.lang.String cpf = "02694418325";
            ws.soap.cpf.Pessoa result = port.consulta(cpf);
            System.out.println("Result = "+result);
            System.out.println("cpf = "+result.getCpf());
            System.out.println("nome = "+result.getNome());
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
    }

}
