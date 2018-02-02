package io.anuke.mindustry.world.blocks;

import io.anuke.mindustry.graphics.Fx;
import io.anuke.mindustry.resource.Item;
import io.anuke.mindustry.resource.Liquid;
import io.anuke.mindustry.world.Block;
import io.anuke.mindustry.world.blocks.types.defense.CoreBlock;
import io.anuke.mindustry.world.blocks.types.production.*;

public class ProductionBlocks{
	public static final Block
	
	core = new CoreBlock("core"){},
        
	pump = new Pump("pump"){},
	
	fluxpump = new Pump("fluxpump"){
		{
			pumpAmount = 3f;
		}
	},
	
	smelter = new Smelter("smelter"){
		{
			health = 70;
			inputs = new Item[]{Item.iron};
			fuel = Item.coal;
			result = Item.steel;
			craftTime = 1f;
		}
	},
	
	crucible = new Smelter("crucible"){
		{
			health = 90;
			inputs = new Item[]{Item.titanium, Item.steel};
			fuel = Item.coal;
			result = Item.dirium;
			burnDuration = 40f;
			craftTime = 1f;
		}
	},
	
	coalpurifier = new LiquidCrafter("coalpurifier"){
		{
			input = Item.stone;
			inputAmount = 5;
			inputLiquid = Liquid.water;
			liquidAmount = 2f;
			liquidCapacity = 1000f;
			output = Item.coal;
			health = 50;
			purifyTime = 1;
		}
	},
	
	titaniumpurifier = new LiquidCrafter("titaniumpurifier"){
		{
			input = Item.iron;
			inputAmount = 6;
			inputLiquid = Liquid.water;
			liquidAmount = 1f;
			liquidCapacity = 1000f;
			purifyTime = 1;
			output = Item.titanium;
			health = 70;
		}
	},
	
	oilrefinery = new LiquidCrafter("oilrefinery"){
		{
			inputLiquid = Liquid.oil;
			liquidAmount = 1f;
			liquidCapacity = 1000f;
			purifyTime = 1;
			output = Item.coal;
			health = 80;
			craftEffect = Fx.purifyoil;
		}
	},
	
	stoneformer = new LiquidCrafter("stoneformer"){
		{
			input = null;
			inputLiquid = Liquid.lava;
			liquidAmount = 1f;
			liquidCapacity = 1000f;
			purifyTime = 1;
			output = Item.stone;
			health = 80;
			craftEffect = Fx.purifystone;
		}
	},
	
	lavasmelter = new LiquidCrafter("lavasmelter"){
		{
			input = Item.iron;
			inputAmount = 1;
			inputLiquid = Liquid.lava;
			liquidAmount = 1f;
			liquidCapacity = 1000f;
			purifyTime = 1;
			output = Item.steel;
			health = 80;
			craftEffect = Fx.purifystone;
		}
	},

	siliconextractor = new LiquidCrafter("siliconextractor"){
		{
			input = Item.sand;
			inputAmount = 5;
			inputLiquid = Liquid.water;
			liquidAmount = 1f;
			output = Item.sand;
			health = 50;
			purifyTime = 1;
		}
	},
	dirtdrill = new Drill("dirtdrill"){
		{
			resource = Blocks.dirt;
			result = Item.dirt;
			time = 1;
		}
	},
	
	stonedrill = new Drill("stonedrill"){
		{
			resource = Blocks.stone;
			result = Item.stone;
			time = 1;
		}
	},
	
	irondrill = new Drill("irondrill"){
		{
			resource = Blocks.iron;
			result = Item.iron;
			time = 1;
		}
	},
	
	coaldrill = new Drill("coaldrill"){
		{
			resource = Blocks.coal;
			result = Item.coal;
			time = 1;
		}
	},
	
	uraniumdrill = new Drill("uraniumdrill"){
		{
			resource = Blocks.uranium;
			result = Item.uranium;
			time = 1;
		}
	},
	
	titaniumdrill = new Drill("titaniumdrill"){
		{
			resource = Blocks.titanium;
			result = Item.titanium;
			time = 1;
		}
	},
	
	omnidrill = new Omnidrill("omnidrill"){
		{
			time = 1;
		}
	},
	coalgenerator = new ItemPowerGenerator("coalgenerator"){
		{
			generateItem = Item.coal;
			powerOutput = 100f;
			powerCapacity = 1000f;
		}
	},
	thermalgenerator = new LiquidPowerGenerator("thermalgenerator"){
		{
			generateLiquid = Liquid.lava;
			maxLiquidGenerate = 0.5f;
			powerPerLiquid = 100f;
			powerCapacity = 1000f;
			generateEffect = Fx.redgeneratespark;
		}
	},
	combustiongenerator = new LiquidPowerGenerator("combustiongenerator"){
		{
			generateLiquid = Liquid.oil;
			maxLiquidGenerate = 100f;
			powerPerLiquid = 10000f;
			powerCapacity = 10000f;
		}
	},
	rtgenerator = new ItemPowerGenerator("rtgenerator"){
		{
			generateItem = Item.uranium;
			powerCapacity = 100000f;
			powerOutput = 10000f;
			itemDuration = 1f;
		}
	},
	nuclearReactor = new NuclearReactor("nuclearreactor"){
		{
			width = 3;
			height = 3;
			health = 600;
			breaktime *= 2.3f;
		}
	},
	weaponFactory = new WeaponFactory("weaponfactory"){
		{
			width = height = 2;
			health = 250;
		}
	};
}
