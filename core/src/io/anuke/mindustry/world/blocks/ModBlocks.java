package io.anuke.mindustry.world.blocks;

import io.anuke.mindustry.graphics.Fx;
import io.anuke.mindustry.world.blocks.types.Wall;
import io.anuke.mindustry.world.blocks.types.defense.*;
import io.anuke.mindustry.world.Block;
import io.anuke.mindustry.world.blocks.types.distribution.*;

public class ModBlocks{
	
	static final int wallHealthMultiplier = 4;
	public static final Block
		
	omniconveyor = new Conveyor("omniconveyor"){{
		     health = 90;
	             speed = 0.15f;
        }},
	
	incassablium = new Wall("incassablium"){{
		     health = 1000*25*wallHealthMultiplier;
                     width = height = 5;

