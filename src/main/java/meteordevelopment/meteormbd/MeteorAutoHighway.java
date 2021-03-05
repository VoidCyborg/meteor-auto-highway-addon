package meteordevelopment.meteormbd;

import meteordevelopment.meteormbd.modules.AutoHighway;
import minegame159.meteorclient.MeteorAddon;
import minegame159.meteorclient.modules.Modules;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MeteorAutoHighway extends MeteorAddon {
	public static final Logger LOG = LogManager.getLogger();

	@Override
	public void onInitialize() {
		LOG.info("Initializing Meteor AutoHighway Addon");

		Modules.get().addModule(new AutoHighway());
	}
}
