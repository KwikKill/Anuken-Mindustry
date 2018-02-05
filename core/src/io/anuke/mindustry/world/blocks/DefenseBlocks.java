package io.anuke.mindustry.world.blocks;

import io.anuke.mindustry.graphics.Fx;
import io.anuke.mindustry.world.Block;
import io.anuke.mindustry.world.blocks.types.Wall;
import io.anuke.mindustry.world.blocks.types.Castlewall;
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
	castlewall1 = new Castlewall("castlewall1"){{
		health = 1000*wallHealthMultiplier;
	}},
	castlewall3 = new Castlewall("castlewall3"){{
		health = 1000*wallHealthMultiplier;
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
        incassablium = new Wall("incassablium"){{
	   	     health = 1000*25*wallHealthMultiplier;
                     width = height = 5;
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
		health = 900*wallHealthMultiplier;
	}},
	castlegate = new Door("castlegate"){{
		health = 90*12*wallHealthMultiplier;
		width = 3;
		height = 4;
	}},
	largedoor = new Door("door-large"){{
		openfx = Fx.dooropenlarge;
		closefx = Fx.doorcloselarge;
		health = 900*4*wallHealthMultiplier;
		width = height = 2;
	}};
}
