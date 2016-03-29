package nar3k.FairyTail;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import nar3k.FairyTail.item.ItemMagicPickaxe;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = "ft", name = "Fairy Tail", version = "1.0")
public class FairyTail {
	
	public static Item itemBookOfGuilds;
	public static Item itemExplosiveLacrima;
	public static Item itemMusicaSword;
	public static Item itemGateOfTheWaterBearerKey;
	public static Item itemElectricLacrima;
	public static Block blockExplosiveLacrima;
	public static Item itemXBalls;
	public static Item itemMagicMetal;
	public static Item itemMagicPickaxe;
	public static Item itemMagicAxe;
	public static Item itemMagicShovel;
	public static Item itemMagicHoe;
	
	
	public static final Item.ToolMaterial MagicMetalToolMaterial = EnumHelper.addToolMaterial("MagicMetalToolMaterial", 5, 2000, 15.0F, 5.0F, 15);
	
	@EventHandler 
	public void preInit(FMLPreInitializationEvent event) {
		//Item/Block init and registering
		//config handling
		
		itemBookOfGuilds = new ItemBookOfGuilds().setUnlocalizedName("itemBookOfGuilds").setTextureName("ft:Book Of Guilds").setCreativeTab(tabFairyTail);
		GameRegistry.registerItem(itemBookOfGuilds, itemBookOfGuilds.getUnlocalizedName().substring(5));
		
		itemExplosiveLacrima = new ItemExplosiveLacrima().setUnlocalizedName("itemExplosiveLacrima").setTextureName("ft:Explosive Lacrima").setCreativeTab(tabFairyTail);
		blockExplosiveLacrima = new BlockExplosiveLacrima(Material.tnt).setBlockName("BlockExplosiveLacrima").setBlockTextureName("ft:Explosive Lacrima").setCreativeTab(tabFairyTail);
		
		GameRegistry.registerItem(itemExplosiveLacrima, itemExplosiveLacrima.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockExplosiveLacrima, blockExplosiveLacrima.getUnlocalizedName().substring(5));
		System.out.println(blockExplosiveLacrima.getUnlocalizedName().substring(5));
		
		itemMusicaSword = new ItemMusicaSword().setUnlocalizedName("itemMusicaSword").setTextureName("ft:Musica Sword").setCreativeTab(tabFairyTail);
		GameRegistry.registerItem(itemMusicaSword, itemMusicaSword.getUnlocalizedName().substring(5));
		
		itemGateOfTheWaterBearerKey = new ItemGateOfTheWaterBearerKey().setUnlocalizedName("itemGateOfTheWaterBearerKey").setTextureName("ft:Gate Of The Water Bearer Key").setCreativeTab(tabFairyTail);
		GameRegistry.registerItem(itemGateOfTheWaterBearerKey, itemGateOfTheWaterBearerKey.getUnlocalizedName().substring(5));
		
		itemElectricLacrima = new ItemElectricLacrima().setUnlocalizedName("itemElectricLacrima").setTextureName("ft:Electric Lacrima").setCreativeTab(tabFairyTail);
		GameRegistry.registerItem(itemElectricLacrima, itemElectricLacrima.getUnlocalizedName().substring(5));
		
		itemXBalls = new ItemFood(0, 0F, false).setUnlocalizedName("ItemXBalls").setTextureName("ft:XBalls").setCreativeTab(tabFairyTail);
		GameRegistry.registerItem(itemXBalls, itemXBalls.getUnlocalizedName().substring(5));
		
		itemMagicMetal = new ItemMagicMetal().setUnlocalizedName("itemMagicMetal").setTextureName("ft:Magic Metal").setCreativeTab(tabFairyTail);
		GameRegistry.registerItem(itemMagicMetal, itemMagicMetal.getUnlocalizedName().substring(5));
		
		itemMagicPickaxe = new ItemMagicPickaxe().setUnlocalizedName("itemMagicPickaxe");
		GameRegistry.registerItem(itemMagicPickaxe, itemMagicPickaxe.getUnlocalizedName().substring(5));
		
		itemMagicAxe = new ItemMagicPickaxe().setUnlocalizedName("itemMagicAxe");
		GameRegistry.registerItem(itemMagicAxe, itemMagicAxe.getUnlocalizedName().substring(5));
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		//Proxy, TileEntity, entity, GUI, and Packet Registering
		GameRegistry.addRecipe(new ItemStack(itemBookOfGuilds), new Object[]{"ppp","p p","ppp",'p',Items.paper});
		GameRegistry.addRecipe(new ItemStack(blockExplosiveLacrima), new Object []{"GGG","GTG","GGG", 'G',Blocks.glass_pane, 'T',Blocks.tnt});
		
		GameRegistry.addRecipe(new ItemStack(itemMusicaSword), new Object[]{" m ","imi","msm",'i',Items.iron_ingot, 's',Items.stick,'m',Items.diamond});
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	public static CreativeTabs tabFairyTail = new CreativeTabs("tabFairyTail"){
		@Override
		public Item getTabIconItem(){
			return new ItemStack(itemBookOfGuilds).getItem();
		}
	};
}
