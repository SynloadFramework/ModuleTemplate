package tech.synframe.template.elements;

import java.io.UnsupportedEncodingException;
import java.util.List;

import com.synload.framework.handlers.Response;
import com.synload.framework.modules.ModuleLoader;
import com.synload.framework.ws.WSHandler;

public class TestElement extends Response {
	public TestElement(WSHandler user, List<String> templateCache){
		this.setTemplateId("template");
		if(!templateCache.contains(this.getTemplateId())){
			try {
				this.setTemplate(this.getTemplate(new String(ModuleLoader.resources.get("template").get("index.html"),"UTF-8")));
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		this.setParent("");
		this.setParentTemplate("wrapper");
		this.setAction("alone");
		this.setPageId("templateIndex");
		this.setPageTitle("Template Index");
	}
}
