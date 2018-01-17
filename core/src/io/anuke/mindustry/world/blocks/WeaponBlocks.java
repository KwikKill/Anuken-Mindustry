package io.anuke.mindustry.world.blocks;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Vector2;

import io.anuke.mindustry.Vars;
import io.anuke.mindustry.entities.BulletType;
import io.anuke.mindustry.entities.effect.TeslaOrb;
import io.anuke.mindustry.graphics.Fx;
import io.anuke.mindustry.resource.Item;
import io.anuke.mindustry.world.Block;
import io.anuke.mindustry.world.Tile;
import io.anuke.mindustry.world.blocks.types.defense.LaserTurret;
import io.anuke.mindustry.world.blocks.types.defense.PowerTurret;
import io.anuke.mindustry.world.blocks.types.defense.Turret;
import io.anuke.ucore.core.Effects;
import io.anuke.ucore.util.Angles;
import io.anuke.ucore.util.Mathf;

public class WeaponBlocks{
	public static Block
	
	turret = new Turret("turret"){
		{
			range = 500;
			reload = 1f;
			bullet = BulletType.stone;
			health = 50;
			ammo = Item.stone;
		}
	},
	
	doubleturret = new Turret("doubleturret"){
		{
			range = 500;
			reload = 1f;
			bullet = BulletType.stone;
			ammo = Item.stone;
			health = 55;
			health = 50;
		}
		
		@Override
		protected void shoot(Tile tile){
			TurretEntity entity = tile.entity();
			
			Angles.vector.set(4, -2).rotate(entity.rotation);
			bullet(tile, entity.rotation);
				
			Angles.vector.set(4, 2).rotate(entity.rotation);
			bullet(tile, entity.rotation);
		}
	},
	
	machineturret = new Turret("machineturret"){
		{
			range = 500;
			reload = 1f;
			bullet = BulletType.iron;
			ammo = Item.iron;
			health = 65;
		}
	},
	
	shotgunturret = new Turret("shotgunturret"){
		{
			range = 500;
			reload = 1f;
			bullet = BulletType.iron;
			ammo = Item.iron;
			health = 70;
			shots = 100;
			inaccuracy = 0f;
			shotDelayScale = 0.7f;
		}
	},
	
	flameturret = new Turret("flameturret"){
		{
			range = 500f;
			reload = 1f;
			bullet = BulletType.flame;
			ammo = Item.coal;
			health = 90;
		}
	},
	
	sniperturret = new Turret("sniperturret"){
		{
			shootsound = "railgun";
			range = 500;
			reload = 1f;
			bullet = BulletType.sniper;
			ammo = Item.steel;
			health = 70;
			shootEffect = Fx.railshot;
		}
	},
	
	mortarturret = new Turret("mortarturret"){
		{
			shootsound = "bigshot";
			rotatespeed = 0.2f;
			range = 500;
			reload = 1f;
			bullet = BulletType.flak;
			shots = 100;
			inaccuracy = 1f;
			ammo = Item.coal;
			ammoMultiplier = 100;
			health = 110;
			shootEffect = Fx.mortarshot;
			shootShake = 2f;
		}
	},
	
	laserturret = new LaserTurret("laserturret"){
		{
			shootsound = "laser";
			beamColor = Color.SKY;
			range = 500;
			reload = 1f;
			damage = 500;
			health = 110;
			powerUsed = 0.2f;
		}
	},
	
	teslaturret = new PowerTurret("waveturret"){
		{
			shootsound = "tesla";
			range = 500;
			reload = 1f;
			bullet = BulletType.shell;
			health = 140;
		}
		
		@Override
		public void shoot(Tile tile){
			TurretEntity entity = tile.entity();
			Angles.translation(entity.rotation, 4);

			new TeslaOrb(tile.worldx() + Angles.x(), tile.worldy() + Angles.y(), 
					range, (int)(9*Vars.multiplier)).add();
		}
	},
		
	plasmaturret = new Turret("plasmaturret"){
		{
			shootsound = "flame2";
			inaccuracy = 1f;
			range = 500f;
			reload = 1f;
			bullet = BulletType.plasmaflame;
			ammo = Item.coal;
			health = 180;
			ammoMultiplier = 100;
		}
	},
	
	chainturret = new Turret("chainturret"){
		{
			shootsound = "bigshot";
			inaccuracy = 1f;
			range = 500f;
			reload = 1f;
			bullet = BulletType.chain;
			ammo = Item.uranium;
			health = 430;
			width = height = 2;
			shootCone = 9f;
			ammoMultiplier = 100;
			shots = 100;
			shootEffect = Fx.chainshot;
		}

		@Override
		protected void shoot(Tile tile){
			TurretEntity entity = tile.entity();
			Vector2 offset = getPlaceOffset();
			
			float len = 8;
			float space = 3.5f;
			
			for(int i = -1; i < 1; i ++){
				Angles.vector.set(len, Mathf.sign(i) * space).rotate(entity.rotation);
				bullet(tile, entity.rotation);
				Effects.effect(shootEffect, tile.worldx() + Angles.x() + offset.x, 
						tile.worldy()+ Angles.y() + offset.y, entity.rotation);
			}
			
			Effects.shake(1f, 1f, tile.worldx(), tile.worldy());
		}
	},
	
	titanturret = new Turret("titancannon"){
		{
			shootsound = "blast";
			range = 500f;
			reload = 1f;
			bullet = BulletType.titanshell;
			ammo = Item.uranium;
			health = 800;
			ammoMultiplier = 100;
			width = height = 3;
			rotatespeed = 0f;
			shootCone = 9f;
			shootEffect = Fx.titanshot;
			shootShake = 3f;
		}
	};
}
