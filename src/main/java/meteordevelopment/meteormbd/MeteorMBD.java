package meteordevelopment.meteormbd;

import minegame159.meteorclient.MeteorApi;
import minegame159.meteorclient.modules.Modules;
import minegame159.meteorclient.modules.misc.AutoMountBypassDupe;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MeteorMBD implements MeteorApi {
	public static final Logger LOG = LogManager.getLogger();

	@Override
	public void onInitialize() {
		LOG.info("Initializing Meteor MBD Addon");

		Modules.get().addModule(new AutoMountBypassDupe());
	}
}
