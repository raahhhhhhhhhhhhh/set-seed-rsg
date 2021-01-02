package net.fiftyfivec3.ssg;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Mod implements ModInitializer {

	// change the value between the quotes for a custom set seed
	public final static String seed = "2195521955"; // <- here

	@Override
	public void onInitialize() {
		LogManager.getLogger("Set Seed Mod").warn("A mod to fix the world seed has been loaded");
	}
}
