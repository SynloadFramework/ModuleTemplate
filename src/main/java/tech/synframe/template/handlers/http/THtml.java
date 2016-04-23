package tech.synframe.template.handlers.http;

import java.io.IOException;

import com.synload.framework.Log;
import com.synload.framework.http.HttpRequest;
import com.synload.framework.http.annotations.Get;
import com.synload.framework.http.annotations.MimeType;

public class THtml {
	@Get(path = "/template")
	@MimeType(type = "text/html")
	public void gHtml(HttpRequest hr){
		try {
			hr.getResponse().getWriter().print("Module template works!");
		} catch (IOException e) {
			Log.info(e.getMessage(), THtml.class);
		}
	}
}
