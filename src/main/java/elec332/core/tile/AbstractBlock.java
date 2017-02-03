package elec332.core.tile;

import elec332.core.api.annotations.AbstractionMarker;
import elec332.abstraction.impl.MCAbstractedBlock;
import elec332.abstraction.object.IAbstractedBlock;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

/**
 * Created by Elec332 on 26-11-2016.
 */
@AbstractionMarker("getBockAbstraction")
public abstract class AbstractBlock extends MCAbstractedBlock implements IAbstractedBlock {

    public AbstractBlock(Material blockMaterialIn, MapColor blockMapColorIn) {
        super(blockMaterialIn, blockMapColorIn);
    }

    public AbstractBlock(Material materialIn) {
        super(materialIn);
    }

}
