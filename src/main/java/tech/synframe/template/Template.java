package tech.synframe.template;

import com.synload.framework.Log;
import com.synload.framework.modules.ModuleClass;
import com.synload.framework.modules.annotations.Module;
import com.synload.framework.modules.annotations.Module.LogLevel;

@Module(author = "Author Name", depend = { "" }, log = LogLevel.INFO, name = "Template", version = "1.0")
public class Template extends ModuleClass {
	@Override
	public void initialize() {
		Log.info("Loaded Template", Template.class);
	}
	@Override
	public void crossTalk(Object... obj) {
		
	}

}
