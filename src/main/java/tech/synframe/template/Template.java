package tech.synframe.template;

import com.synload.framework.Log;
import com.synload.framework.modules.ModuleClass;
import com.synload.framework.modules.annotations.Module;
import com.synload.framework.modules.annotations.Module.LogLevel;

/*
 * Module class (requires both the annotation and the extending of the class)
 */
@Module(author = "Author Name", depend = { "" }, log = LogLevel.INFO, name = "Template", version = "1.0")
public class Template extends ModuleClass {
	@Override
	public void initialize() {
		// Sent when the module is run (after module elements loaded)
		Log.info("Loaded Template", Template.class);
	}
	@Override
	public void crossTalk(Object... obj) {
		
	}

}
