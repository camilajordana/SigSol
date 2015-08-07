/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

import br.edu.ifrn.jdbc.modelo.Pessoa;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author maryna
 */
public class LoginForm extends ActionForm {
    private Pessoa pessoa = new Pessoa();
    public Pessoa getFuncionario() {
    return this.pessoa;
}
    @Override
    public void reset(ActionMapping map, HttpServletRequest req) {
    this.pessoa = new Pessoa();
}
}
