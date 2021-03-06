package elec332.core.api.client.model;

import elec332.core.api.client.model.map.IBakedModelRotationMap;
import elec332.core.api.client.model.model.IQuadProvider;
import elec332.core.api.client.model.template.IModelTemplate;
import elec332.core.api.client.model.template.IQuadTemplate;
import elec332.core.api.client.model.template.IQuadTemplateSidedMap;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.block.model.ModelRotation;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by Elec332 on 29-10-2016.
 */
public interface IElecModelBakery {

    public IBakedModelRotationMap<IBakedModel> forTemplateRotation(IModelTemplate template);

    public IBakedModelRotationMap<IBakedModel> forTemplate(IModelTemplate template, boolean x, boolean y);

    public IBakedModel forTemplate(IModelTemplate template);

    public IBakedModel forTemplate(IModelTemplate template, ModelRotation rotation);

    public IBakedModel forTemplateOverrideQuads(IModelTemplate template, @Nullable IQuadTemplateSidedMap sidedQuads, @Nullable List<IQuadTemplate> generalQuads);

    public IBakedModel forTemplateOverrideQuads(IModelTemplate template, ModelRotation rotation, @Nullable IQuadTemplateSidedMap sidedQuads, @Nullable List<IQuadTemplate> generalQuads);

    public IBakedModel itemModelForTextures(TextureAtlasSprite... textures);

    public IBakedModel forQuadProvider(IModelTemplate template, final IQuadProvider quadProvider);

    public IBakedModel itemModelForTextures(IModelTemplate template, TextureAtlasSprite... textures);

    public ItemCameraTransforms getDefaultItemTransformation();

    public ItemCameraTransforms getDefaultBlockTransformation();

}
