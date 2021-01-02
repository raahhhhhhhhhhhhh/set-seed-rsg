package net.fiftyfivec3.ssg.mixin;

import net.fiftyfivec3.ssg.Mod;
import net.minecraft.client.gui.screen.world.MoreOptionsDialog;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(MoreOptionsDialog.class)
public class SetSeedMixin {
    @ModifyVariable(method="method_30511", at=@At("STORE"), ordinal=0)
    private String hackSeed(String seed) {
        return Mod.seed;
    }
}
