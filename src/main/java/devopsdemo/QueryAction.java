package devopsdemo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class QueryAction extends ActionSupport {
	public String findAction() throws Exception {
		Dao dao = new Dao();
		List<Users> list = dao.find();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("querylist", list);
		return "queryuser";
	}
}
