package br.com.sergipetec.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.sergipetec.model.Funcionario;
/**
 * Converter para selectOneMenu
 * @author pedro
 *
 */
@FacesConverter(value = "FuncionarioConverter")
public class FuncionarioConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		    if(arg2 != null && !arg2.isEmpty())
		    	return (Funcionario) arg1.getAttributes().get(arg2);
		    return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		    if (arg2 instanceof Funcionario) {
		    	Funcionario funcionario = (Funcionario) arg2;
		    	if(funcionario != null && funcionario.getId() != null){
		    		arg1.getAttributes().put(String.valueOf(funcionario.getId()), arg2);
		    		return String.valueOf(funcionario.getId());
		    	}
		    }
		    return "";
		}

}