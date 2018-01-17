package io.anuke.mindustry.world.blocks;

import io.anuke.mindustry.graphics.Fx;
import io.anuke.mindustry.world.Block;
import io.anuke.mindustry.world.blocks.types.Wall;
import io.anuke.mindustry.world.blocks.types.defense.*;

public class DefenseBlocks{
	static final int wallHealthMultiplier = 4;
	
	public static final Block

	stonewall = new Wall("stonewall"){{
		health = 500*wallHealthMultiplier;
	}},

	ironwall = new Wall("ironwall"){{
		health = 800*wallHealthMultiplier;
	}},

	steelwall = new Wall("steelwall"){{
		health = 1100*wallHealthMultiplier;
	}},

	titaniumwall = new Wall("titaniumwall"){{
		health = 1500*wallHealthMultiplier;
	}},
	diriumwall = new Wall("duriumwall"){{
		health = 1900*wallHealthMultiplier;
	}},
	compositewall = new Wall("compositewall"){{
		health = 2700*wallHealthMultiplier;
	}},
	steelwalllarge = new Wall("steelwall-large"){{
		health = 1100*4*wallHealthMultiplier;
		width = height = 2;
	}},
	titaniumwalllarge = new Wall("titaniumwall-large"){{
		health = 1500*4*wallHealthMultiplier;
		width = height = 2;
	}},
	diriumwalllarge = new Wall("duriumwall-large"){{
		health = 1900*4*wallHealthMultiplier;
		width = height = 2;
	}},
	titaniumshieldwall = new ShieldedWallBlock("titaniumshieldwall"){{
		health = 1500*wallHealthMultiplier;
	}},

	repairturret = new RepairTurret("repairturret"){
		{
			range = 300;
			reload = 1f;
			health = 600;
			powerUsed = 0f;
		}
	},

	megarepairturret = new RepairTurret("megarepairturret"){
		{
			range = 500;
      		reload = 1f;
			health = 900;
			powerUsed = 0f;
		}
	},

	shieldgenerator = new ShieldBlock("shieldgenerator"){
		{
			health = 1000*wallHealthMultiplier;
		}
	},
	door = new Door("door"){{
		health = 9000*wallHealthMultiplier;
	}},
	largedoor = new Door("door-large"){{
		openfx = Fx.dooropenlarge;
		closefx = Fx.doorcloselarge;
		health = 9000*4*wallHealthMultiplier;
		width = height = 2;
	}};
}
