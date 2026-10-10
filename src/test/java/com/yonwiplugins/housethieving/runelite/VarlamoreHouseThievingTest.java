package com.yonwiplugins.housethieving.runelite;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class VarlamoreHouseThievingTest {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		ExternalPluginManager.loadBuiltin(VarlamoreHouseThievingPlugin.class);
		RuneLite.main(args);
	}
}