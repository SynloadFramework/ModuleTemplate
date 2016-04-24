package tech.synframe.template.handlers.http;

import java.io.IOException;

import com.synload.framework.Log;
import com.synload.framework.http.HttpRequest;
import com.synload.framework.http.annotations.Get;
import com.synload.framework.http.annotations.MimeType;
import com.synload.framework.http.annotations.Post;

/*
 * Class wrapping http response methods
 */
public class THtml {
	@Get("/template") // HTTP get annotation ( registers as get request http://yoursite.com:8080/template )
	@MimeType("text/html") // returns OK from server and the mimetype content type
	public void gHtml(HttpRequest hr){
		hr.getResponse().setContentLength("Template is working".length());
		try {
			hr.getResponse().getOutputStream().write("Template is working".getBytes("UTF-8"));
		} catch (IOException e) {
			Log.info(e.getMessage(), THtml.class);
		}
	}
}
