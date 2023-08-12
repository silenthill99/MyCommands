package fr.silenthill99.mycommands.data.recipes;

import fr.silenthill99.mycommands.ModItems;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.data.CookingRecipeBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Consumer;

public class RecipeGenerator extends RecipeProvider
{
    public RecipeGenerator(DataGenerator p_i48262_1_)
    {
        super(p_i48262_1_);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer)
    {
        CookingRecipeBuilder.smelting(Ingredient.of(Items.EMERALD), ModItems.TEST.get(), 0.15f, 200)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(Items.EMERALD))
                .save(consumer);
    }
}
