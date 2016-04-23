package tech.synframe.template.handlers.http;

import java.io.IOException;

import com.synload.framework.Log;
import com.synload.framework.http.HttpRequest;
import com.synload.framework.http.annotations.Get;
import com.synload.framework.http.annotations.MimeType;

/*
 * Class wrapping http response methods
 */
public class THtml {
	@Get(path = "/template") // HTTP get annotation ( registers as get request http://yoursite.com:8080/template )
	@MimeType(type = "text/html") // returns OK from server and the mimetype content type
	public void gHtml(HttpRequest hr){
		try {
			hr.getResponse().getWriter().print("Module template works!");
		} catch (IOException e) {
			Log.info(e.getMessage(), THtml.class);
		}
	}
}
